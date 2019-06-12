package edmt.dev.myutils;

/**
 * Created by reale on 12/7/2017.
 */

public class MyMath {

    public static int Plus(int a,int b)
    {
        return a+b;
    }

    public static int Minus(int a,int b)
    {
        return a-b;
    }

    public static int Times(int a,int b)
    {
        return a*b;
    }

    public static float Div(int a,int b)
    {
       if( b == 0)
           throw  new IllegalArgumentException("Div by Zero error");
       else
           return a/b;
    }
}
