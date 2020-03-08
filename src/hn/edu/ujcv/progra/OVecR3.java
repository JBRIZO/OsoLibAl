package hn.edu.ujcv.progra;

public class OVecR3 {

    // miembros
    private double x;
    private double y;
    private double z;
    // constructores
    public OVecR3(){}

    public OVecR3(OVecR3 a){}

    public OVecR3(double x, double y,double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // accesoras y mutadoras
    public double getX()
    {
        return x;
    }
    public void setX(double x)
    {
        this.x = x;
    }
    public double getY()
    {
        return y;
    }
    public void setY(double y)
    {
        this.y = y;
    }

    public double getZ()
    {
        return z;
    }

    public void setZ(double z)
    {
        this.z = z;
    }
    //metodos
    public OVecR3 suma(OVecR3 b){

        return new OVecR3(this.x + b.x, this.y + b.y, this.z + b.z);
    }

    public OVecR3 resta(OVecR3 b){
        return new OVecR3(this.x - b.x, this.y - b.y, this.z - b.z);
    }

    public OVecR3 prodCruz(OVecR3 b){
        //
        //  x  y  z
        //  x1 y1 z1       i = y * z1 - z * y1;
        //                 j = - ();
        //                 k = ;
        //
        return new OVecR3();
    }

    public double prodPunto(OVecR3 b){
        //TODO: implementar
        return 0.0f;
    }

    public double magnitud(){
        //TODO: implementar
        return 0.0f;
    }

    // metodos


}
