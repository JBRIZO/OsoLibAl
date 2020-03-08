package hn.edu.ujcv.progra;


public class Main {

    public static void main(String[] args)
    {
        OMat2x2 a = new OMat2x2(1,2,3,4);
        OMat2x2 b = new OMat2x2(1,1,1,1);
        System.out.println(a.rot(30));
    }
}
