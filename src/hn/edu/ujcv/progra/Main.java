package hn.edu.ujcv.progra;


public class Main {

    public static void main(String[] args)
    {
        OMat2x2 a = new OMat2x2(1,2,3,4);
        OMat2x2 b = new OMat2x2(1,1,1,1);
        OVecR2 a1 = new OVecR2(1,2);
        OVecR2 a2 = new OVecR2(1,2);
        System.out.println(a1.suma(a2));
        System.out.println(a.rotacion(30));
    }
}
