package atividade.utility;

import atividade.entity.Figura;

public class MyMathClass {
    public static double PI;
    public static double E;
    public static double PHI;
    static{
        Figura figura = Figura.RPOLTEG;
        double n = 2000000000;
        double l = 1/n;
        double diam = 2*figura.get(n, l);
        double per = l*n;
        PI = per/diam;
    }
    static{
        E = calculateE();
        PHI = (-1+Math.pow(5, 0.5))/2;
    }
    private static double calculateE(){
        double k = 2000000000;
        double b = 1+(1/k);
        return Math.pow(b, k);
    }
}
