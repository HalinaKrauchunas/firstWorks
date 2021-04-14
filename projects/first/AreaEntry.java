package com.epam.projects.first;

import com.epam.projects.*;

import static com.epam.projects.MethodsForFunctions.*;

public class AreaEntry {

    public static void main(String[] args) {

        InputStreamReader reader = new InputStreamReader(System.in);
        System.out.println("Specify the x-coordinate of the point");
        double pointX = ParseNumber.getDouble(reader);
        System.out.println("Specify the y-coordinate of the point");
        double pointY = ParseNumber.getDouble(reader);

        double maxX = 4.0, maxY = 4.0;
        double minX = -4.0, minY = -4.0;
        belongPointArea(pointX, pointY, maxX, maxY, minX, minY);
    }
}
