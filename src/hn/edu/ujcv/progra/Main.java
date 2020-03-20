package hn.edu.ujcv.progra;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LectorTeclado lector = new LectorTeclado();
        Scanner sc = new Scanner(System.in);

        System.out.println("                        Calculadora de Algebra Lineal");
        System.out.println("********************************************************************************");
        System.out.println("¿Que operacion desea realizar?");
        System.out.println("1. Vectores");
        System.out.println("2. Matrices");
        System.out.println("3. Vectores con matrices");
        System.out.println("4. Salir");
        System.out.println("********************************************************************************");
        System.out.println("Seleccione una opcion.");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                {
                System.out.println("                                Vectores");
                System.out.println("***********************************************************************************");
                System.out.println("1. Vector en R2");
                System.out.println("2. Vector en R3");
                System.out.println("3. Vector en R4");
                System.out.println("***********************************************************************************");
                System.out.println("Seleccione una opcion.");
                int opcionB = sc.nextInt();
                switch(opcionB)
                {
                    case 1:
                        System.out.println("                             Vector en R2");
                        System.out.println("***********************************************************************************");
                        System.out.println("1. Suma de dos vectores");
                        System.out.println("2. Resta de dos vectores");
                        System.out.println("3. Producto Punto");
                        System.out.println("4. Magnitud");
                        System.out.println("***********************************************************************************");
                        int opcionC = sc.nextInt();
                        switch(opcionC)
                        {
                            case 1:

                                System.out.println("Ingrese el valor de i del vector A");
                                int Ax = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector A");
                                int Ay = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OVecR2 a = new OVecR2(Ax,Ay);
                                System.out.println("Ingrese el valor de i del vector B");
                                int Bx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector B");
                                int By = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OVecR2 b = new OVecR2(Bx,By);
                                System.out.println("La suma de los dos vectores es:");
                                System.out.println(a.suma(b));
                                break;

                            case 2:

                                System.out.println("Ingrese el valor de i del vector A");
                                int Cx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector A");
                                int Cy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OVecR2 c = new OVecR2(Cx,Cy);
                                System.out.println("Ingrese el valor de i del vector B");
                                int Dx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector B");
                                int Dy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OVecR2 d = new OVecR2(Dx,Dy);
                                System.out.println(c.suma(d));
                                break;

                            case 3:
                                System.out.println("Ingrese el valor de i del vector A");
                                int Ex = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector A");
                                int Ey = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OVecR2 e = new OVecR2(Ex,Ey);
                                System.out.println("Ingrese el valor de i del vector B");
                                int Fx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector B");
                                int Fy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OVecR2 f = new OVecR2(Fx,Fy);
                                System.out.println(e.prodPunto(f));
                                break;

                            case 4:
                                System.out.println("Ingrese el valor de i del vector ");
                                int Gx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector ");
                                int Gy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OVecR2 g = new OVecR2(Gx,Gy);
                                System.out.println(g.magnitud());
                                break;
                            }
                    case 2:

                            System.out.println("                             Vector en R3");
                            System.out.println("***********************************************************************************");
                            System.out.println("1. Suma de dos vectores");
                            System.out.println("2. Resta de dos vectores");
                            System.out.println("3. Producto Punto");
                            System.out.println("4. Magnitud");
                            System.out.println("5. Producto cruz");
                            System.out.println("***********************************************************************************");
                        int opcionD = sc.nextInt();
                        switch(opcionD)
                        {
                            case 1:

                                System.out.println("Ingrese el valor de i del vector A");
                                int Ax = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector A");
                                int Ay = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector A");
                                int Az = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR3 a = new OVecR3(Ax,Ay,Az);
                                System.out.println("Ingrese el valor de i del vector B");
                                int Bx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector B");
                                int By = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector A");
                                int Bz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR3 b = new OVecR3(Bx,By,Bz);
                                System.out.println("La suma de los dos vectores es:");
                                System.out.println(a.suma(b));
                                break;

                            case 2:

                                System.out.println("Ingrese el valor de i del vector A");
                                int Cx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector A");
                                int Cy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector A");
                                int Cz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR3 c = new OVecR3(Cx,Cy,Cz);
                                System.out.println("Ingrese el valor de i del vector B");
                                int Dx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector B");
                                int Dy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector A");
                                int Dz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR3 d = new OVecR3(Dx,Dy,Dz);
                                System.out.println(c.resta(d));
                                break;

                            case 3:
                                System.out.println("Ingrese el valor de i del vector A");
                                int Ex = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector A");
                                int Ey = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector A");
                                int Ez = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR3 e = new OVecR3(Ex,Ey,Ez);
                                System.out.println("Ingrese el valor de i del vector B");
                                int Fx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector B");
                                int Fy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector A");
                                int Fz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR3 f = new OVecR3(Fx,Fy,Fz);
                                System.out.println(e.prodPunto(f));
                                break;

                            case 4:
                                System.out.println("Ingrese el valor de i del vector ");
                                int Gx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector ");
                                int Gy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OVecR2 g = new OVecR2(Gx,Gy);
                                System.out.println(g.magnitud());
                                break;
                        }



                }


                break;
            }
            case 2:
                System.out.println("heabf");
                break;
        }
            }
        }
