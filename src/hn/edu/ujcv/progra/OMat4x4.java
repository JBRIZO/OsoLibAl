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
    public OMat4x4 suma(OMat4x4 b)
    {
        double r11, r12, r13, r14;
        double r21, r22, r23, r24;
        double r31, r32, r33, r34;
        double r41, r42, r43, r44;
        r11 = this.m11 + b.m11;
        r12 = this.m12 + b.m12;
        r13 = this.m13 + b.m13;
        r14 = this.m14 + b.m14;
        r21 = this.m21 + b.m21;
        r22 = this.m22 + b.m22;
        r23 = this.m23 + b.m23;
        r24 = this.m24 + b.m24;
        r31 = this.m31 + b.m31;
        r32 = this.m32 + b.m32;
        r33 = this.m33 + b.m33;
        r34 = this.m34 + b.m34;
        r41 = this.m41 + b.m41;
        r42 = this.m42 + b.m42;
        r43 = this.m43 + b.m43;
        r44 = this.m44 + b.m44;
        return new OMat4x4(r11,r12,r13,r14,
                           r21,r22,r23,r24,
                           r31,r32,r33,r34,
                           r41,r42,r43,r44);
    }

    public OMat4x4 resta(OMat4x4 b)
    {
        double r11, r12, r13, r14;
        double r21, r22, r23, r24;
        double r31, r32, r33, r34;
        double r41, r42, r43, r44;
        r11 = this.m11 - b.m11;
        r12 = this.m12 - b.m12;
        r13 = this.m13 - b.m13;
        r14 = this.m14 - b.m14;
        r21 = this.m21 - b.m21;
        r22 = this.m22 - b.m22;
        r23 = this.m23 - b.m23;
        r24 = this.m24 - b.m24;
        r31 = this.m31 - b.m31;
        r32 = this.m32 - b.m32;
        r33 = this.m33 - b.m33;
        r34 = this.m34 - b.m34;
        r41 = this.m41 - b.m41;
        r42 = this.m42 - b.m42;
        r43 = this.m43 - b.m43;
        r44 = this.m44 - b.m44;
        return new OMat4x4(r11,r12,r13,r14,
                           r21,r22,r23,r24,
                           r31,r32,r33,r34,
                           r41,r42,r43,r44);
    }

    public OMat4x4 mult(OMat4x4 b){
        double r11, r12, r13, r14;
        double r21, r22, r23, r24;
        double r31, r32, r33, r34;
        double r41, r42, r43, r44;
        r11   =  (this.m11 * b.m11) + (this.m12 * b.m21) + (this.m13 * b.m31) + (this.m14 * b.m41);
        r12   =  (this.m11 * b.m12) + (this.m12 * b.m22) + (this.m13 * b.m32) + (this.m14 * b.m42);
        r13   =  (this.m11 * b.m13) + (this.m12 * b.m23) + (this.m13 * b.m33) + (this.m14 * b.m43);
        r14   =  (this.m11 * b.m14) + (this.m12 * b.m24) + (this.m13 * b.m34) + (this.m14 * b.m44);
        r21   =  (this.m21 * b.m11) + (this.m22 * b.m21) + (this.m23 * b.m31) + (this.m24 * b.m41);
        r22   =  (this.m21 * b.m12) + (this.m22 * b.m22) + (this.m23 * b.m32) + (this.m24 * b.m42);
        r23   =  (this.m21 * b.m13) + (this.m22 * b.m23) + (this.m23 * b.m33) + (this.m24 * b.m43);
        r24   =  (this.m21 * b.m14) + (this.m22 * b.m24) + (this.m23 * b.m34) + (this.m24 * b.m44);
        r31   =  (this.m31 * b.m11) + (this.m32 * b.m21) + (this.m33 * b.m31) + (this.m34 * b.m41);
        r32   =  (this.m31 * b.m12) + (this.m32 * b.m22) + (this.m33 * b.m32) + (this.m34 * b.m42);
        r33   =  (this.m31 * b.m13) + (this.m32 * b.m23) + (this.m33 * b.m33) + (this.m34 * b.m43);
        r34   =  (this.m31 * b.m14) + (this.m32 * b.m24) + (this.m33 * b.m34) + (this.m34 * b.m44);
        r41   =  (this.m41 * b.m11) + (this.m42 * b.m21) + (this.m43 * b.m31) + (this.m44 * b.m41);
        r42   =  (this.m41 * b.m12) + (this.m42 * b.m22) + (this.m43 * b.m32) + (this.m44 * b.m42);
        r43   =  (this.m41 * b.m13) + (this.m42 * b.m23) + (this.m43 * b.m33) + (this.m44 * b.m43);
        r44   =  (this.m41 * b.m14) + (this.m42 * b.m24) + (this.m43 * b.m34) + (this.m44 * b.m44);
        return new OMat4x4(r11,r12,r13,r14,
                           r21,r22,r23,r24,
                           r31,r32,r33,r34,
                           r41,r42,r43,r44);
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

    @Override
    public String toString()
    {
        return "[ "+getM11()+"      "+getM12()+"     "+getM13()+"     "+getM14()+ " ]\n[ "+getM21()+"      "+getM22()+"     "+getM23()+"     "+getM24()+ " ]\n[ "+getM31()+"      "+getM32()+"     "+getM33()+"     "+getM34()+" ]\n[ "+getM41()+"      "+getM42()+"     "+getM43()+"     "+getM44()+" ]";
    }
}
