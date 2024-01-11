public class Main {

    public static void main(String[] args) {
        double l=25;
        double w=10;
        double side=15;
        Rectangle r =new Rectangle(w,l);
        System.out.println("Area of Rectangle:"+r.getArea());
        System.out.println("Perimeter of Rectangle:"+r.getPerimeter());

        Square s=new Square(side);
        System.out.println("Area of Square:"+s.getArea());
        System.out.println("Perimeter of Square:"+s.getPerimeter());

    }
}
