package com.company;

import java.math.MathContext;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        System.out.println("Min: " + Integer.MIN_VALUE);
        System.out.println("Max: " + Integer.MAX_VALUE);
        System.out.println("Byte Min: " + Byte.MIN_VALUE);
        System.out.println("Byte Max: " + Byte.MAX_VALUE);
        System.out.println("Character Min: " + Character.MIN_VALUE);
        System.out.println("Character Max: " + Character.MAX_VALUE);
        System.out.println("Short Max: " + Short.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        Vector<Integer> v = new Vector<>();
        v.add(1_2);
        byte b = (byte) -654;
        System.out.println(b);
        char c = 9300;
        char c1 = '\u1500';
        System.out.println("char " + c + c1);
    }
}
