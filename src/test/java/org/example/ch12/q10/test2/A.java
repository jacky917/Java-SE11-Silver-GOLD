package org.example.ch12.q10.test2;

public interface A {
    default void x() {
        System.out.println("Interface A calls function x");
    }
}
