package com.company2;

import com.company2.playground.Line;
import com.company2.playground.Point;

public class Main {

    public static void main(String[] args) {
        Line line = new Line(new Point(8,11), new Point(4,5));
        System.out.println(line);

        line.setStart(new Point(7,17));

        System.out.println(line);
    }
}
