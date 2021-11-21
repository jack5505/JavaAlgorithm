package com.company.lambda;

import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

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

    public static IntFunction<IntFunction<IntUnaryOperator>> carry(){
        return x -> y -> z -> sum(x,y,z);
    }

    public static void main(String[] args) {
       IntBinaryOperator intBinaryOperator = binaryOperator(1);
       int suma = intBinaryOperator.applyAsInt(15,25);
        System.out.println(suma);

        IntUnaryOperator apply = carry().apply(15).apply(57);
        int x = apply.applyAsInt(15);
        int y = apply.applyAsInt(20);
        System.out.println(x + " " + y);
    }
}
