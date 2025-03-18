package com.test;

public class FunctionalImpl implements FunctionInterface1, FunctionInterface2
{
    @Override
    public void add()
    {
        System.out.println("Add impl");
    }

    @Override
    public void sub()
    {
        System.out.println("sub impl");
        FunctionInterface1.super.sub();
        FunctionInterface2.super.sub();
    }

    public static void main(String[] args)
    {
        FunctionalImpl obj = new FunctionalImpl();
        obj.sub();
    }
}
