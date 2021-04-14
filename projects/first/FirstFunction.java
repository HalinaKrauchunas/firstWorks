package com.epam.projects.first;

import com.epam.projects.*;

import static com.epam.projects.MethodsForFunctions.*;

public class FirstFunction {

    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(System.in);
        Double number1 = ParseNumber.getDouble(reader);
        Double number2 = ParseNumber.getDouble(reader);
        Double number3 = ParseNumber.getDouble(reader);
        System.out.println("The result of this function = " + resultFunctionFirst(number1, number2, number3));
    }
}
