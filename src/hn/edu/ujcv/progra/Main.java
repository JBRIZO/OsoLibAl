package hn.edu.ujcv.progra;


public class Main {

    public static void main(String[] args)
    {
       OMat3x3 a = new OMat3x3(1,2,3,4,5,6,7,8,9);
       OMat2x2 b = new OMat2x2(1,1,1,1);
        System.out.println(a.transpuesta());
    }
}
