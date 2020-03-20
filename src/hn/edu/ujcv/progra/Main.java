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
        switch (opcion)
        {
            case 1:
                System.out.println("                                Vectores");
                System.out.println("***********************************************************************************");
                System.out.println("1. Vector en R2");
                System.out.println("2. Vector en R3");
                System.out.println("3. Vector en R4");
                System.out.println("***********************************************************************************");
                System.out.println("Seleccione una opcion.");
                int opcionB = sc.nextInt();
                switch (opcionB) {
                    case 1:
                        System.out.println("                             Vector en R2");
                        System.out.println("***********************************************************************************");
                        System.out.println("1. Suma de dos vectores");
                        System.out.println("2. Resta de dos vectores");
                        System.out.println("3. Producto Punto");
                        System.out.println("4. Magnitud");
                        System.out.println("5. Salir");
                        System.out.println("***********************************************************************************");
                        System.out.println(" ");
                        int opcionC = sc.nextInt();
                        switch (opcionC)
                        {
                            case 1:

                                System.out.println("Ingrese el valor de i del vector A");
                                int Ax = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector A");
                                int Ay = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OVecR2 a = new OVecR2(Ax, Ay);
                                System.out.println("Ingrese el valor de i del vector B");
                                int Bx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector B");
                                int By = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OVecR2 b = new OVecR2(Bx, By);
                                System.out.println("La suma de los dos vectores es:");
                                System.out.println(a.suma(b));
                                break;

                            case 2:

                                System.out.println("Ingrese el valor de i del vector A");
                                int Cx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector A");
                                int Cy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OVecR2 c = new OVecR2(Cx, Cy);
                                System.out.println("Ingrese el valor de i del vector B");
                                int Dx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector B");
                                int Dy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OVecR2 d = new OVecR2(Dx, Dy);
                                System.out.println(c.suma(d));
                                break;

                            case 3:
                                System.out.println("Ingrese el valor de i del vector A");
                                int Ex = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector A");
                                int Ey = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OVecR2 e = new OVecR2(Ex, Ey);
                                System.out.println("Ingrese el valor de i del vector B");
                                int Fx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector B");
                                int Fy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OVecR2 f = new OVecR2(Fx, Fy);
                                System.out.println(e.prodPunto(f));
                                break;

                            case 4:
                                System.out.println("Ingrese el valor de i del vector ");
                                int Gx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector ");
                                int Gy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                OVecR2 g = new OVecR2(Gx, Gy);
                                System.out.println(g.magnitud());
                                break;

                            case 5:
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
                        System.out.println("6. Salir");
                        System.out.println("***********************************************************************************");
                        System.out.println(" ");
                        int opcionD = sc.nextInt();
                        switch (opcionD) {
                            case 1:

                                System.out.println("Ingrese el valor de i del vector A");
                                int Ax = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector A");
                                int Ay = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector A");
                                int Az = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR3 a = new OVecR3(Ax, Ay, Az);
                                System.out.println("Ingrese el valor de i del vector B");
                                int Bx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector B");
                                int By = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector B");
                                int Bz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR3 b = new OVecR3(Bx, By, Bz);
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
                                OVecR3 c = new OVecR3(Cx, Cy, Cz);
                                System.out.println("Ingrese el valor de i del vector B");
                                int Dx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector B");
                                int Dy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector B");
                                int Dz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR3 d = new OVecR3(Dx, Dy, Dz);
                                System.out.println(c.resta(d));
                                break;

                            case 3:
                                System.out.println("Ingrese el valor de i del vector A");
                                int Ex = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector A");
                                int Ey = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector A");
                                int Ez = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR3 e = new OVecR3(Ex, Ey, Ez);
                                System.out.println("Ingrese el valor de i del vector B");
                                int Fx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector B");
                                int Fy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector B");
                                int Fz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR3 f = new OVecR3(Fx, Fy, Fz);
                                System.out.println(e.prodPunto(f));
                                break;

                            case 4:
                                System.out.println("Ingrese el valor de i del vector ");
                                int Gx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector ");
                                int Gy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector A");
                                int Gz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR3 g = new OVecR3(Gx, Gy, Gz);
                                System.out.println(g.magnitud());
                                break;
                            case 5:
                                System.out.println("Ingrese el valor de i del vector A");
                                int Hx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector A");
                                int Hy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector A");
                                int Hz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR3 h = new OVecR3(Hx, Hy, Hz);
                                System.out.println("Ingrese el valor de i del vector B");
                                int Ix = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector B");
                                int Iy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector B");
                                int Iz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR3 i = new OVecR3(Ix, Iy, Iz);
                                System.out.println(h.prodCruz(i));
                                break;
                            case 6:
                                break;

                        }
                    case 3:
                        System.out.println("                             Vector en R4");
                        System.out.println("***********************************************************************************");
                        System.out.println("1. Suma de dos vectores");
                        System.out.println("2. Resta de dos vectores");
                        System.out.println("3. Producto Punto");
                        System.out.println("4. Magnitud");
                        System.out.println("5. Salir");
                        System.out.println("***********************************************************************************");
                        System.out.println(" ");
                        int opcionE = sc.nextInt();
                        switch (opcionE) {
                            case 1:

                                System.out.println("Ingrese el valor de i del vector A");
                                int Ax = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector A");
                                int Ay = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector A");
                                int Az = lector.obtenerEnteroValidado("Ingrese numero valido");
                                System.out.println("Ingrese el valor de t del vector A");
                                int At = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR4 a = new OVecR4(Ax, Ay, Az, At);
                                System.out.println("Ingrese el valor de i del vector B");
                                int Bx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector B");
                                int By = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector B");
                                int Bz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                System.out.println("Ingrese el valor de t del vector B");
                                int Bt = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR4 b = new OVecR4(Bx, By, Bz, Bt);
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
                                System.out.println("Ingrese el valor de t del vector A");
                                int Ct = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR4 c = new OVecR4(Cx, Cy, Cz, Ct);
                                System.out.println("Ingrese el valor de i del vector B");
                                int Dx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector B");
                                int Dy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector B");
                                int Dz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                System.out.println("Ingrese el valor de t del vector B");
                                int Dt = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR4 d = new OVecR4(Dx, Dy, Dz, Dt);
                                System.out.println("La suma de los dos vectores es:");
                                System.out.println(c.resta(d));
                                break;

                            case 3:

                                System.out.println("Ingrese el valor de i del vector A");
                                int Ex = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector A");
                                int Ey = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector A");
                                int Ez = lector.obtenerEnteroValidado("Ingrese numero valido");
                                System.out.println("Ingrese el valor de t del vector A");
                                int Et = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR4 e = new OVecR4(Ex, Ey, Ez, Et);
                                System.out.println("Ingrese el valor de i del vector B");
                                int Fx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector B");
                                int Fy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector B");
                                int Fz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                System.out.println("Ingrese el valor de t del vector B");
                                int Ft = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR4 f = new OVecR4(Fx, Fy, Fz, Ft);
                                System.out.println("La suma de los dos vectores es:");
                                System.out.println(e.prodPunto(f));
                                break;

                            case 4:
                                System.out.println("Ingrese el valor de i del vector ");
                                int Gx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese el valor de j del vector ");
                                int Gy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                System.out.println("Ingrese al valor de k del vector A");
                                int Gz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                System.out.println("Ingrese el valor de t del vector");
                                int Gt = lector.obtenerEnteroValidado("Ingrese numero valido");
                                OVecR4 g = new OVecR4(Gx, Gy, Gz, Gt);
                                System.out.println(g.magnitud());
                                break;
                            case 5:
                                break;
                        }
                }
        case 2:
            System.out.println("                             Matrices");
            System.out.println("***********************************************************************************");
            System.out.println("1. Matriz de 2x2");
            System.out.println("2. Matriz de 3x3");
            System.out.println("3. Matriz de 4x4");
            System.out.println("4. Salir");
            System.out.println("***********************************************************************************");
            System.out.println("Seleccione una opcion.");
            int opcionC = sc.nextInt();
            switch(opcionC)
            {
                case 1:
                    System.out.println("                             Matriz de 2x2");
                    System.out.println("***********************************************************************************");
                    System.out.println("1. Suma de dos matrices");
                    System.out.println("2. Resta de dos matrices");
                    System.out.println("3. Multipicacion de dos matrices");
                    System.out.println("4. Transpuesta de la matriz");
                    System.out.println("5. Inversa de la matriz");
                    System.out.println("6. Determinante de la matriz");
                    System.out.println("7. Rotacion de la matriz");
                    System.out.println("8. Matriz Identidad");
                    System.out.println("9. Salir");
                    System.out.println("***********************************************************************************");
                    System.out.println(" ");
                    int opcionD = sc.nextInt();
                    switch (opcionD)
                    {
                        case 1:
                            System.out.println("Ingrese el valor de A11");
                            int a11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A12");
                            int a12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A21");
                            int a21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A22");
                            int a22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            OMat2x2 a = new OMat2x2(a11,a12,a21,a22);
                            System.out.println("Ingrese el valor de A11");
                            int b11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A12");
                            int b12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A21");
                            int b21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A22");
                            int b22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            OMat2x2 b = new OMat2x2(b11,b12,b21,b22);
                            System.out.println(a.suma(b));
                            break;
                        case 2:
                            System.out.println("Ingrese el valor de A11");
                            int c11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A12");
                            int c12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A21");
                            int c21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A22");
                            int c22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            OMat2x2 c = new OMat2x2(c11,c12,c21,c22);
                            System.out.println("Ingrese el valor de A11");
                            int d11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A12");
                            int d12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A21");
                            int d21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A22");
                            int d22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            OMat2x2 d = new OMat2x2(d11,d12,d21,d22);
                            System.out.println(c.resta(d));
                            break;
                        case 3:
                            System.out.println("Ingrese el valor de A11");
                            int e11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A12");
                            int e12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A21");
                            int e21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A22");
                            int e22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            OMat2x2 e = new OMat2x2(e11,e12,e21,e22);
                            System.out.println("Ingrese el valor de A11");
                            int f11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A12");
                            int f12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A21");
                            int f21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A22");
                            int f22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            OMat2x2 f = new OMat2x2(f11,f12,f21,f22);
                            System.out.println(e.multiplicacion(f));
                            break;
                        case 4:
                            System.out.println("Ingrese el valor de A11");
                            int g11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A12");
                            int g12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A21");
                            int g21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A22");
                            int g22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            OMat2x2 g = new OMat2x2(g11,g12,g21,g22);
                            System.out.println(g.transpuesta());
                            break;
                        case 5:
                            System.out.println("Ingrese el valor de A11");
                            int h11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A12");
                            int h12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A21");
                            int h21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A22");
                            int h22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            OMat2x2 h = new OMat2x2(h11,h12,h21,h22);
                            System.out.println(h.inversa());
                            break;
                        case 6:
                            System.out.println("Ingrese el valor de A11");
                            int i11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A12");
                            int i12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A21");
                            int i21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A22");
                            int i22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            OMat2x2 i = new OMat2x2(i11,i12,i21,i22);
                            System.out.println(i.determinante());
                            break;
                        case 7:
                            System.out.println("Ingrese el valor de A11");
                            int j11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A12");
                            int j12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A21");
                            int j21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println("Ingrese el valor de A22");
                            int j22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            OMat2x2 j = new OMat2x2(j11,j12,j21,j22);
                            int alpha = lector.obtenerEnteroValidado("Ingrese un numero valido");
                            System.out.println(j.rotacion(alpha));
                            break;
                        case 8:
                            OMat2x2 ident = new OMat2x2();
                            System.out.println(ident.identidad());
                            break;
                        case 9:
                            break;

                    }
                case 2:
                    System.out.println("                             Matriz de 3x3");
                    System.out.println("***********************************************************************************");
                    System.out.println("1. Suma de dos matrices");
                    System.out.println("2. Resta de dos matrices");
                    System.out.println("3. Multipicacion de dos matrices");
                    System.out.println("4. Transpuesta de la matriz");
                    System.out.println("5. Inversa de la matriz");
                    System.out.println("6. Determinante de la matriz");
                    System.out.println("7. Rotacion de la matriz en X");
                    System.out.println("8. Rotacion de la matriz en Y");
                    System.out.println("9. Rotacion de la matriz en Z");
                    System.out.println("10. Matriz Identidad");
                    System.out.println("11. Salir");
                    System.out.println("***********************************************************************************");
                    System.out.println(" ");
                    int opcionE = sc.nextInt();
                    switch (opcionE)
                    {

                    }

            }


                }
        }

    }

