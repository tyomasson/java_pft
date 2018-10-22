package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("xyz");
        hello("Alex");


        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(5, 7);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());

        Triangle t = new Triangle(5, 6);
        System.out.println("Square of triangle is " + t.a + " and " + t.h + " is " + t.area());

        RadiusTriangle rt = new RadiusTriangle(6, 7, 7, 6);
        System.out.println("Square of triangle  is " + rt.a + " and " + rt.b + " is " + rt.area());

    }

    public static void hello(String somebody) {

        System.out.println("Hello, " + somebody + "!");

    }


}


