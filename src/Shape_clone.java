import java.awt.*;
import java.util.Hashtable;
public abstract class Shape_clone implements Cloneable{
        private String id;
        protected String type;

        abstract void draw ();

        public String getType () {
            return type;
        }

        public String getId () {
            return id;
        }

        public void setId (String id){
            this.id = id;
        }

        public Object clone () {
            Object clone = null;

            try {
                clone = super.clone();

            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

            return clone;
        }
    }
    class Rectangle_a extends Shape_clone {

        public Rectangle_a() {
        }

        @Override
        public void draw() {
            System.out.println("Inside Rectangle:draw() method.");
        }
    }
    class Square_a extends Shape_clone {

        public Square_a(){
            type = "Square";
        }

        @Override
        public void draw() {
            System.out.println("Inside Square:draw() method.");
        }
    }
    class Circle_a extends Shape_clone {

        public Circle_a(){
            type = "Circle";
        }

        @Override
        public void draw() {
            System.out.println("Inside Circle:draw() method.");
        }
    }
    class ShapeCache {

        private static Hashtable<Object, Shape_clone> shapeMap  = new Hashtable<Object, Shape_clone>();

        public static Shape getShape(String shapeId) {
            Shape_clone cachedShape = shapeMap.get(shapeId);
            return (Shape) ((Shape_clone) cachedShape).clone();
        }
        public static void loadCache() {
            Circle_a circle = new Circle_a();
            circle.setId("1");
            shapeMap.put(circle.getId(),circle);

            Square_a square = new Square_a();
            square.setId("2");
            shapeMap.put(square.getId(),square);

            Rectangle_a rectangle = new Rectangle_a();
            rectangle.setId("3");
            shapeMap.put(rectangle.getId(), rectangle);
        }
    }
    class PrototypePatternDemo {
        public static void main(String[] args) {
            ShapeCache.loadCache();

            Shape clonedShape = ShapeCache.getShape("1");
            System.out.println("Shape : " + clonedShape.getType());

            Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
            System.out.println("Shape : " + clonedShape2.getType());

            Shape clonedShape3 = ShapeCache.getShape("3");
            System.out.println("Shape : " + clonedShape3.getType());
        }

    }