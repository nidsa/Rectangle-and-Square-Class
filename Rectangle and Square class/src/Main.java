public class Main {

    public static void main(String[] args) {
        double l=25;
        double w=10;
        double side=15;
        Rectangle rectangle =new Rectangle(w,l);
        System.out.println("Area of Rectangle:"+rectangle.getArea());
        System.out.println("Perimeter of Rectangle:"+rectangle.getPerimeter());

        Square square=new Square(side);
        System.out.println("Area of Square:"+square.getArea());
        System.out.println("Perimeter of Square:"+square.getPerimeter());

    }
}
