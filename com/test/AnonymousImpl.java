package com.test;

public class AnonymousImpl
{
    public static void main(String[] args)
    {
        AnonymousInterface anonymousInterface = new AnonymousInterface()
        {
            @Override
            public void add(int a, int b)
            {
                System.out.println(a + b);
            }

            @Override
            public void sub(int a, int b)
            {
                System.out.println(a-b);
            }
        };

        anonymousInterface.add(3, 4);
        anonymousInterface.sub(5, 2);
    }
}
