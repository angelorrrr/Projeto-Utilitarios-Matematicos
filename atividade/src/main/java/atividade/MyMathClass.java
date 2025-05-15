package atividade;
public class MyMathClass {
    public static double PI;
    static{
        Figura figura = Figura.RPOLTEG;
        double n = 1000000000;
        double l = 1/n;
        double diam = 2*figura.get(n, l);
        double per = l*n;
        PI = per/diam;
    }
}
