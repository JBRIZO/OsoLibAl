package hn.edu.ujcv.progra;


public class Main {

    public static void main(String[] args)
    {
      OMat4x4 a = new OMat4x4(0,4,-2,4,-6,2,10,0,5,8,-5,2,0,-2,1,0);
      OMat4x4 b = new OMat4x4(16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1);
        System.out.println(a.determinante());
    }
}
