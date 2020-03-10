package hn.edu.ujcv.progra;

public class OMat4x4 {
    // miembros
    private double m11, m12, m13, m14;
    private double m21, m22, m23, m24;
    private double m31, m32, m33, m34;
    private double m41, m42, m43, m44;


    // constructores
    public OMat4x4(){}

    public OMat4x4(double m11, double m12, double m13, double m14,
                   double m21, double m22, double m23, double m24,
                   double m31, double m32, double m33, double m34,
                   double m41, double m42, double m43, double m44)
    {
        this.m11 = m11;
        this.m12 = m12;
        this.m13 = m13;
        this.m14 = m14;
        this.m21 = m21;
        this.m22 = m22;
        this.m23 = m23;
        this.m24 = m24;
        this.m31 = m31;
        this.m32 = m32;
        this.m33 = m33;
        this.m34 = m34;
        this.m41 = m41;
        this.m42 = m42;
        this.m43 = m43;
        this.m44 = m44;
    }

    public OMat4x4(OMat4x4 a){}


    public double getM11()
    {
        return m11;
    }
    public void setM11(double m11)
    {
        this.m11 = m11;
    }

    public double getM12()
    {
        return m12;
    }
    public void setM12(double m12)
    {
        this.m12 = m12;
    }

    public double getM13()
    {
        return m13;
    }
    public void setM13(double m13)
    {
        this.m13 = m13;
    }

    public  double getM14() { return m14; }
    public void setM14(double m14) { this.m14 = m14; }

    public double getM21()
    {
        return m21;
    }
    public void setM21(double m21)
    {
        this.m21 = m21;
    }

    public double getM22()
    {
        return m22;
    }
    public void setM22(double m22)
    {
        this.m22 = m22;
    }

    public double getM23()
    {
        return m23;
    }
    public void setM23(double m23)
    {
        this.m23 = m23;
    }

    public double getM24() { return m24; }
    public void setM24(double m24) { this.m24 = m24; }

    public double getM31()
    {
        return m31;
    }
    public void setM31(double m31)
    {
        this.m31 = m31;
    }

    public double getM32()
    {
        return m32;
    }
    public void setM32(double m32)
    {
        this.m32 = m32;
    }

    public double getM33()
    {
        return m33;
    }
    public void setM33(double m33)
    {
        this.m33 = m33;
    }

    public double getM34() { return m34; }
    public void setM34(double m34) { this.m34 = m34; }

    public double getM41() { return m41; }
    public void setM41(double m41) { this.m41 = m41; }

    public double getM42() { return m42; }
    public void setM42(double m42) { this.m42 = m42; }

    public double getM43() { return m43; }
    public void setM43(double m43) { this.m43 = m43; }

    public double getM44() { return m44; }
    public void setM44(double m44) { this.m44 = m44; }
    // metodos

    public OMat4x4 transpuesta()
    {
        return new OMat4x4(this.m11,this.m21,this.m31,this.m41,
                           this.m12,this.m22,this.m32,this.m42,
                           this.m13,this.m23,this.m33,this.m43,
                           this.m14,this.m24,this.m34,this.m44);
    }

    public OMat4x4 inversa(){
        //TODO: implementar
        return new OMat4x4();
    }
    public OMat4x4 suma(OMat4x4 b){
        //TODO: implementar
        return new OMat4x4();
    }

    public OMat4x4 resta(OMat4x4 b){
        //TODO: implementar
        return new OMat4x4();
    }

    public OMat4x4 mult(OMat4x4 b){
        //TODO: implementar
        //    m11  m12
        //    m21  m22
        //
        //
        //  m11   =  a.m11 * b.m11 + a.m12 * b.m21
        //  m12   =  a.m11 * b.m12 + a.m12 * b.m22
        //
        return new OMat4x4();
    }

    public double determinante(){
        //TODO: implementar
        return 0.0f;
    }

    // Metodos de la clase.
    public static OMat4x4 rotX(double alpha){


        return new OMat4x4();
    }

    public static OMat4x4 rotY(double alpha){


        return new OMat4x4();
    }

    public static OMat4x4 rotZ(double alpha){


        return new OMat4x4();
    }

    public static OMat4x4 rotW(double alpha){

        return new OMat4x4();
    }

    public static OMat4x4 identidad(){


        //TODO: implementar
        return new OMat4x4();
    }

    // constructores
}
