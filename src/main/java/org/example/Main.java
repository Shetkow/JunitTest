package org.example;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 3);
        int b = calc.minus.apply(4, 2);
        int c = calc.devide.apply(a, b);// Происходит ошибка деления на 0
        calc.println.accept(c);
    }
}
