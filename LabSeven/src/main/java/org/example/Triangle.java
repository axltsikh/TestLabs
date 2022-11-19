package org.example;

public class Triangle {
    public static boolean checkTriangle(double first,double second,double third){
        return first+second>third && first+third>second && second+third>first;
    }
}
