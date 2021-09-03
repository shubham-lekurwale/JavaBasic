package com.java.operator.bitwise.or;

public class Or {

    public static void main(String[] args) {
        int a = 15;
        byte bit = 3;
        System.out.println("Main value: " + a);

        // This operator is a unary operator, denoted by ‘~’.
        // It returns the one’s complement representation of the input value,
        // i.e, with all bits inverted, which means it makes every 0 to 1, and every 1 to 0.
        System.out.println("Unary Bitwise Complement: " + (~ a));

        System.out.println("Signed Right Shift: " + (a >> bit));
        System.out.println("Signed Left Shift: " + (a << bit));
        System.out.println("UnSigned Right Shift: " + (a >>> bit));
    }
}
