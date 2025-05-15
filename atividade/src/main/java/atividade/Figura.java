package atividade;
public enum Figura {
    CIRCLE(v->java.lang.Math.PI*v[0]*v[0]),
    RECT(v->v[0]*v[1]),
    ELIPSE(v->v[0]*v[1]*java.lang.Math.PI),
    TRAPEZIO(v->(v[0]+v[1])*v[2]/2),
    POLREG(
        v->{
            double n = v[0];
            double si = (n-2)*Math.PI;
            double ai = si/(2*n);
            double b = v[1];
            double h = java.lang.Math.tan(ai)*b/2;
            double aT = n*(b*h/2);
            return aT;
        }
    ),
    RPOLTEG(
        v->{
            double n = v[0];
            double si = (n-2)*Math.PI;
            double ai = si/(2*n);
            double b = v[1];
            return java.lang.Math.tan(ai)*b/2;
        }
    );
    Figura(Area area){
        this.area = area;
    }
    Area area;
    public double get(double... args){
        return area.get(args);
    }
}
