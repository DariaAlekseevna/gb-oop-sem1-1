package org.example;


public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(1.0, 2.0, 3.0);
        System.out.println(vector);
        Vector vector2 = new Vector(3.0, 4.0, 5.0);
        System.out.println(vector.vectorlenght());
        System.out.println(vector.scalar(vector2));
        System.out.println(vector.product(vector2));
        System.out.println(vector.cos(vector2));
        System.out.println(vector.summa(vector2));
        System.out.println(vector.differ(vector2));
    }
}