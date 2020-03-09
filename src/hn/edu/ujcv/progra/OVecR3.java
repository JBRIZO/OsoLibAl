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

    public OVecR3 prodCruz(OVecR3 b)
    {
        double i, j, k;
        i = (this.y * b.z) - (this.z * b.y);
        j = -((this.x * b.z) - (this.z * b.x));
        k =  (this.x * b.y) - (this.y * b.x);
        return new OVecR3(i,j,k);
    }

    public double prodPunto(OVecR3 b){
        //TODO: implementar
        return 0.0f;
    }

    public double magnitud(){
        //TODO: implementar
        return 0.0f;
    }

    @Override
    public String toString(){
        return "i: " + getX() + " j: " + getY() + " k: " + getZ();
    }


}
