package com.company.lambda;

import java.util.function.IntBinaryOperator;

/**
 * @author Sabirov Jakhongir
 */
public class Java8Lambda {
    public static int sum(int x, int y, int z){
        return (x + y + z);
    };

    public static IntBinaryOperator binaryOperator(int x){
        return (z, y) -> sum(x,y,z);
    };

    public static void main(String[] args) {
       IntBinaryOperator intBinaryOperator = binaryOperator(1);
       int suma = intBinaryOperator.applyAsInt(15,25);
        System.out.println(suma);
    }
}
