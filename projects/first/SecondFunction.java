package com.epam.projects.first;

import com.epam.projects.*;

import static com.epam.projects.MethodsForFunctions.*;
import static com.epam.projects.ParseNumber.*;

public class SecondFunction {

    public static void main(String[] args) {

        InputStreamReader reader = new InputStreamReader(System.in);

        Double number1 = getDouble(reader);
        Double number2 = getDouble(reader);
        Double number3 = getDouble(reader);
        System.out.println("The result of this expression = " + resultFunctionSecond(number1, number2, number3));
    }
}
