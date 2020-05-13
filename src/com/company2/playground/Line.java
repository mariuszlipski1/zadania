package com.company2.playground;

public class Line {
    private Point start;
    private Point end;

    public Line(Point start1, Point end2){
         start = start1;
         end = end2;
    }

    public void setStart(Point point){
        if(point.x > 0 && point.y > 0){
            start = point;
        }
    }

    @Override
    public String toString() {
        return "Line"+hashCode()+"{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
