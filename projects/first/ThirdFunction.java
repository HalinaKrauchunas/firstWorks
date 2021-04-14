package com.epam.projects.first;

import com.epam.projects.*;

import static com.epam.projects.MethodsForFunctions.*;
import static com.epam.projects.ParseNumber.*;

public class ThirdFunction {

    public static void main(String[] args) {

        InputStreamReader reader = new InputStreamReader(System.in);

        Double number1 = getDouble(reader);
        Double number2 = getDouble(reader);
        System.out.println("The result of this expression = " + resultFunctionThird(number1, number2));
    }
}
