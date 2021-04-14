package com.epam.projects.first;

import com.epam.projects.*;

public class SwapFractionalWhole {

    public static void main(String[] args) {

        InputStreamReader reader = new InputStreamReader(System.in);
        Double number = ParseNumber.getDouble(reader);
        String[] arrays = number.toString().split("\\.");
        System.out.println(Double.parseDouble(arrays[1] + "." + arrays[0]));
    }
}
