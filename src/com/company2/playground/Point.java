package com.company2.playground;

public class Point {

    final int x ;
    final int y ;
    private  static int  h=5;

    public Point(int numberX, int numberY){
        x = numberX;
        y = numberY;
    }

    @Override
    public String toString() {
        return "Point"+hashCode()+"{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
