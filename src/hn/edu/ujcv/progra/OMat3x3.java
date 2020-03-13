package hn.edu.ujcv.progra;
import java.lang.Math.*;

public class OMat3x3
{
    // miembros
    private double m11, m12, m13;
    private double m21, m22, m23;
    private double m31, m32, m33;


    // constructores
    public OMat3x3(){}

    public OMat3x3(double m11, double m12, double m13,
                   double m21, double m22, double m23,
                   double m31, double m32, double m33)
    {
        this.m11 = m11;
        this.m12 = m12;
        this.m13 = m13;
        this.m21 = m21;
        this.m22 = m22;
        this.m23 = m23;
        this.m31 = m31;
        this.m32 = m32;
        this.m33 = m33;
    }

    public  OMat3x3 (OMat3x3 a){}

    // accesoras y mutadoras
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
    // metodos

    public OMat3x3 transpuesta(){
        return new OMat3x3(this.m11,this.m21,this.m31,
                           this.m12,this.m22,this.m32,
                           this.m13,this.m23,this.m33);
    }

    public OMat3x3 inversa()
    {
        double r11, r12, r13;
        double r21, r22, r23;
        double r31, r32, r33;
        double det;
        OMat3x3 a = new OMat3x3();
        a = this.transpuesta();
        det = this.determinante();

        OMat2x2 d11 = new OMat2x2(this.m22,this.m32,this.m23,this.m33);
        OMat2x2 d12 = new OMat2x2(this.m12,this.m32,this.m13,this.m33);
        OMat2x2 d13 = new OMat2x2(this.m12,this.m22,this.m13,this.m23);
        OMat2x2 d21 = new OMat2x2(this.m21,this.m31,this.m23,this.m33);
        OMat2x2 d22 = new OMat2x2(this.m11,this.m31,this.m13,this.m33);
        OMat2x2 d23 = new OMat2x2(this.m11,this.m21,this.m13,this.m23);
        OMat2x2 d31 = new OMat2x2(this.m21,this.m31,this.m22,this.m32);
        OMat2x2 d32 = new OMat2x2(this.m11,this.m31,this.m12,this.m32);
        OMat2x2 d33 = new OMat2x2(this.m11,this.m21,this.m12,this.m22);
        r11  =  Math.pow(-1,2) * d11.determinante();
        r12  =  Math.pow(-1,3) * d12.determinante();
        r13  =  Math.pow(-1,4) * d13.determinante();
        r21  =  Math.pow(-1,3) * d21.determinante();
        r22  =  Math.pow(-1,4) * d22.determinante();
        r23  =  Math.pow(-1,5) * d23.determinante();
        r31  =  Math.pow(-1,4) * d31.determinante();
        r32  =  Math.pow(-1,5) * d32.determinante();
        r33  =  Math.pow(-1,6) * d33.determinante();
        return new OMat3x3(r11/det,r12/det,r13/det,
                           r21/det,r22/det,r23/det,
                           r31/det,r32/det,r33/det);
    }
    public OMat3x3 suma(OMat3x3 b)
    {
        double r11, r12, r13;
        double r21, r22, r23;
        double r31, r32, r33;
        r11 = this.m11 + b.m11;
        r12 = this.m12 + b.m12;
        r13 = this.m13 + b.m13;
        r21 = this.m21 + b.m21;
        r22 = this.m22 + b.m22;
        r23 = this.m23 + b.m23;
        r31 = this.m31 + b.m31;
        r32 = this.m32 + b.m32;
        r33 = this.m33 + b.m33;
        return new OMat3x3(r11, r12, r13,
                           r21, r22, r23,
                           r31, r32, r33);
    }

    public OMat3x3 resta(OMat3x3 b){
        double r11, r12, r13;
        double r21, r22, r23;
        double r31, r32, r33;
        r11 = this.m11 - b.m11;
        r12 = this.m12 - b.m12;
        r13 = this.m13 - b.m13;
        r21 = this.m21 - b.m21;
        r22 = this.m22 - b.m22;
        r23 = this.m23 - b.m23;
        r31 = this.m31 - b.m31;
        r32 = this.m32 - b.m32;
        r33 = this.m33 - b.m33;
        return new OMat3x3(r11, r12, r13,
                           r21, r22, r23,
                           r31, r32, r33);
    }

    public OMat3x3 multiplicacion(OMat3x3 b)
    {
        double r11, r12, r13;
        double r21, r22, r23;
        double r31, r32, r33;
        r11   =  (this.m11 * b.m11) + (this.m12 * b.m21) + (this.m13 * b.m31);
        r12   =  (this.m11 * b.m12) + (this.m12 * b.m22) + (this.m13 * b.m32);
        r13   =  (this.m11 * b.m13) + (this.m12 * b.m23) + (this.m13 * b.m33);
        r21   =  (this.m21 * b.m11) + (this.m22 * b.m21) + (this.m23 * b.m31);
        r22   =  (this.m21 * b.m12) + (this.m22 * b.m22) + (this.m23 * b.m32);
        r23   =  (this.m21 * b.m13) + (this.m22 * b.m23) + (this.m23 * b.m33);
        r31   =  (this.m31 * b.m11) + (this.m32 * b.m21) + (this.m33 * b.m31);
        r32   =  (this.m31 * b.m12) + (this.m32 * b.m22) + (this.m33 * b.m32);
        r33   =  (this.m31 * b.m13) + (this.m32 * b.m23) + (this.m33 * b.m33);
        return new OMat3x3(r11, r12, r13,
                           r21, r22, r23,
                           r31, r32, r33);
    }

    public double determinante()
    {
        double respuesta;
        respuesta = (this.m11*this.m22*this.m33) + (this.m12*this.m23*this.m31) + (this.m13*this.m21*this.m32) - (this.m31*this.m22*this.m13) - (this.m32*this.m23*this.m11) - (this.m33*this.m21*this.m12);

        return respuesta;
    }

    // Metodos de la clase.
    public static OMat3x3 rotacionX(double alpha)
    {
        double  r22,r23,
                r32,r33;
        r22 = Math.cos(alpha);
        r23 = -Math.sin(alpha);
        r32 = Math.sin(alpha);
        r33 = Math.cos(alpha);
        return new OMat3x3(1,0,0,
                           0, r22, r23,
                           0, r32 , r33);
    }

    public static OMat3x3 rotacionY(double alpha)
    {
        double r11,r13;
        double r31,r33;
        r11 = Math.cos(alpha);
        r13 = Math.sin(alpha);
        r31 = -Math.sin(alpha);
        r33 = Math.cos(alpha);

        return new OMat3x3();
    }

    public static OMat3x3 rotacionZ(double alpha)
    {
        double r11,r12;
        double r21,r22;
        r11 = Math.cos(alpha);
        r12 = Math.sin(alpha);
        r21 = -Math.sin(alpha);
        r22 = Math.cos(alpha);
        return new OMat3x3(r11,r12,0,r21,r22,0,0,0,1);
    }

    public static OMat3x3 identidad(){
        return new OMat3x3(1, 0, 0,
                           0, 1, 0,
                           0, 0, 1);
    }

    @Override
    public String toString()
    {
        return "[ "+getM11()+"      "+getM12()+"     "+getM13()+" ]\n[ "+getM21()+"      "+getM22()+"     "+getM23()+ " ]\n[ "+getM31()+"      "+getM32()+"     "+getM33()+" ]";
    }



}
