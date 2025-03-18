package com.test;

@FunctionalInterface
public interface FunctionInterface1
{
    public void add();

    default void sub()
    {
        div();
        System.out.println("Functional Interface1 default method");
    }

    public static void multi()
    {
        System.out.println("static utility method");
    }

    private void div()
    {
        multi();
        System.out.println("private method");
    }
}
