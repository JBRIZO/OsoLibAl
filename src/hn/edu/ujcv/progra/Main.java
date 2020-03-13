package hn.edu.ujcv.progra;


public class Main {

    public static void main(String[] args)
    {
      OVecR2 a = new OVecR2(1,2);
      OVecR2 b = new OVecR2(2,2);
      System.out.println(a.suma(b));
      OMat3x3 a1 = new OMat3x3(1,2,3,4,5,6,7,8,9);
        System.out.println(a1.rotacionX(25));
    }
}
