package ru.stqa.pft.sandbox;

public class RadiusTriangle {

    public double a;
    public double b;
    public double c;
    public double r;

    public RadiusTriangle(double r, double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.r = r;

    }

    public double area(){
        return this.r * (this.a + this.b + this.c) / 2.0;
    }

}
