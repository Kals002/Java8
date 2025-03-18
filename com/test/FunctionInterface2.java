package com.test;

@FunctionalInterface
public interface FunctionInterface2
{
    public void add();

   default void sub()
   {
       FunctionInterface1.multi();
       System.out.println("FunctionInterface2 default method");
   }

}
