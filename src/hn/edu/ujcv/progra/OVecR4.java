package hn.edu.ujcv.progra;
import java.lang.Math.*;

public class OVecR4 {
    // miembros
    private double x;
    private double y;
    private double z;
    private double t;

    // constructores
    public OVecR4() {
    }

    public OVecR4(OVecR4 a) {
    }

    public OVecR4(double x, double y, double z, double t) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.t = t;
    }

    // accesoras y mutadoras
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    // metodos

    public OVecR4 suma(OVecR4 b) {
        return new OVecR4(this.x + b.x, this.y + b.y, this.z + b.z, this.t + b.t);
    }

    public OVecR4 resta(OVecR4 b) {
        return new OVecR4(this.x - b.x, this.y - b.y, this.z - b.z, this.t - b.t);
    }

    public double prodPunto(OVecR4 b) {
        double respuesta;
        respuesta = (this.x * b.x) + (this.y * b.y) + (this.z * b.z) + (this.t * b.t);
        return respuesta;
    }

    public double magnitud()
    {
        double respuesta;
        respuesta = Math.sqrt( Math.pow(this.x,2) + Math.pow(this.y,2) + Math.pow(this.z,2) + Math.pow(this.t,2));
        return respuesta;
    }
}
