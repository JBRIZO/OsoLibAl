package hn.edu.ujcv.progra;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        LectorTeclado lector = new LectorTeclado();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while (!salir)
        {

            System.out.println("                        Calculadora de Algebra Lineal");
            System.out.println("********************************************************************************");
            System.out.println("¿Que operacion desea realizar?");
            System.out.println("1. Vectores");
            System.out.println("2. Matrices");
            System.out.println("3. Vectores con matrices");
            System.out.println("4. Salir");
            System.out.println("********************************************************************************");
                try {
                    System.out.println("Seleccione una opcion.");
                    int opcion = sc.nextInt();
                    switch (opcion)
                    {
                        case 1:
                            boolean salir2 = false;
                            while(!salir2)
                            {


                                System.out.println("                                Vectores");
                                System.out.println("***********************************************************************************");
                                System.out.println("1. Vector en R2");
                                System.out.println("2. Vector en R3");
                                System.out.println("3. Vector en R4");
                                System.out.println("4. Regresar al menu principal");
                                System.out.println("***********************************************************************************");
                            try {
                                System.out.println("Seleccione una opcion.");
                                int opcionB = sc.nextInt();
                                switch (opcionB) {

                                    case 1:
                                        boolean salirA = false;
                                        while(!salirA) {
                                            System.out.println("                             Vector en R2");
                                            System.out.println("***********************************************************************************");
                                            System.out.println("1. Suma de dos vectores");
                                            System.out.println("2. Resta de dos vectores");
                                            System.out.println("3. Producto Punto");
                                            System.out.println("4. Magnitud");
                                            System.out.println("5. Regresar al menu principal");
                                            System.out.println("***********************************************************************************");
                                            System.out.println(" ");
                                            try {
                                                System.out.println("Elija una opcion");

                                            int opcionC = sc.nextInt();
                                            switch (opcionC) {
                                                case 1:

                                                    System.out.println("Ingrese el valor de i del vector A");
                                                    double Ax = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector A");
                                                    double Ay = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    OVecR2 a = new OVecR2(Ax, Ay);
                                                    System.out.println("Ingrese el valor de i del vector B");
                                                    double Bx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector B");
                                                    double By = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    OVecR2 b = new OVecR2(Bx, By);
                                                    System.out.println("La suma de los dos vectores es:");
                                                    System.out.println(a.suma(b));
                                                    break;

                                                case 2:

                                                    System.out.println("Ingrese el valor de i del vector A");
                                                    double Cx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector A");
                                                    double Cy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    OVecR2 c = new OVecR2(Cx, Cy);
                                                    System.out.println("Ingrese el valor de i del vector B");
                                                    double Dx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector B");
                                                    double Dy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    OVecR2 d = new OVecR2(Dx, Dy);
                                                    System.out.println(c.suma(d));
                                                    break;

                                                case 3:
                                                    System.out.println("Ingrese el valor de i del vector A");
                                                    double Ex = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector A");
                                                    double Ey = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    OVecR2 e = new OVecR2(Ex, Ey);
                                                    System.out.println("Ingrese el valor de i del vector B");
                                                    double Fx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector B");
                                                    double Fy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    OVecR2 f = new OVecR2(Fx, Fy);
                                                    System.out.println(e.prodPunto(f));
                                                    break;

                                                case 4:
                                                    System.out.println("Ingrese el valor de i del vector ");
                                                    double Gx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector ");
                                                    double Gy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    OVecR2 g = new OVecR2(Gx, Gy);
                                                    System.out.println(g.magnitud());
                                                    break;

                                                case 5:
                                                    salirA = true;
                                                    break;

                                                default:
                                                    System.out.println("Ingrese un numero valido");
                                            }
                                        }catch (InputMismatchException e){
                                                System.out.println("Debes insertar un numero");
                                                sc.next();
                                            }
                                        }
                                        break;

                                    case 2:
                                        boolean salirB = false;
                                        while(!salirB) {
                                            System.out.println("                             Vector en R3");
                                            System.out.println("***********************************************************************************");
                                            System.out.println("1. Suma de dos vectores");
                                            System.out.println("2. Resta de dos vectores");
                                            System.out.println("3. Producto Punto");
                                            System.out.println("4. Magnitud");
                                            System.out.println("5. Producto cruz");
                                            System.out.println("6. Regresar ");
                                            System.out.println("***********************************************************************************");
                                            System.out.println(" ");
                                            try {
                                                System.out.println("Elija una opcion");

                                            int opcionD = sc.nextInt();
                                            switch (opcionD) {
                                                case 1:

                                                    System.out.println("Ingrese el valor de i del vector A");
                                                    double Ax = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector A");
                                                    double Ay = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese al valor de k del vector A");
                                                    double Az = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    OVecR3 a = new OVecR3(Ax, Ay, Az);
                                                    System.out.println("Ingrese el valor de i del vector B");
                                                    double Bx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector B");
                                                    double By = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese al valor de k del vector B");
                                                    double Bz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    OVecR3 b = new OVecR3(Bx, By, Bz);
                                                    System.out.println("La suma de los dos vectores es:");
                                                    System.out.println(a.suma(b));
                                                    break;

                                                case 2:

                                                    System.out.println("Ingrese el valor de i del vector A");
                                                    double Cx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector A");
                                                    double Cy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese al valor de k del vector A");
                                                    double Cz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    OVecR3 c = new OVecR3(Cx, Cy, Cz);
                                                    System.out.println("Ingrese el valor de i del vector B");
                                                    double Dx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector B");
                                                    double Dy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese al valor de k del vector B");
                                                    double Dz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    OVecR3 d = new OVecR3(Dx, Dy, Dz);
                                                    System.out.println(c.resta(d));
                                                    break;

                                                case 3:
                                                    System.out.println("Ingrese el valor de i del vector A");
                                                    double Ex = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector A");
                                                    double Ey = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese al valor de k del vector A");
                                                    double Ez = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    OVecR3 e = new OVecR3(Ex, Ey, Ez);
                                                    System.out.println("Ingrese el valor de i del vector B");
                                                    double Fx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector B");
                                                    double Fy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese al valor de k del vector B");
                                                    double Fz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    OVecR3 f = new OVecR3(Fx, Fy, Fz);
                                                    System.out.println(e.prodPunto(f));
                                                    break;

                                                case 4:
                                                    System.out.println("Ingrese el valor de i del vector ");
                                                    double Gx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector ");
                                                    double Gy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese al valor de k del vector A");
                                                    double Gz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    OVecR3 g = new OVecR3(Gx, Gy, Gz);
                                                    System.out.println(g.magnitud());
                                                    break;

                                                case 5:
                                                    System.out.println("Ingrese el valor de i del vector A");
                                                    double Hx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector A");
                                                    double Hy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese al valor de k del vector A");
                                                    double Hz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    OVecR3 h = new OVecR3(Hx, Hy, Hz);
                                                    System.out.println("Ingrese el valor de i del vector B");
                                                    double Ix = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector B");
                                                    double Iy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese al valor de k del vector B");
                                                    double Iz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    OVecR3 i = new OVecR3(Ix, Iy, Iz);
                                                    System.out.println(h.prodCruz(i));
                                                    break;

                                                case 6:
                                                    salirB = true;
                                                    break;

                                                default:
                                                    System.out.println("Ingrese un numero valido");

                                            }
                                        }catch (InputMismatchException e){
                                                System.out.println("Debes insertar un numero");
                                                sc.next();
                                            }
                                        }
                                        break;

                                    case 3:
                                        boolean salirC = false;
                                        while(!salirC) {
                                            System.out.println("                             Vector en R4");
                                            System.out.println("***********************************************************************************");
                                            System.out.println("1. Suma de dos vectores");
                                            System.out.println("2. Resta de dos vectores");
                                            System.out.println("3. Producto Punto");
                                            System.out.println("4. Magnitud");
                                            System.out.println("5. Regresar ");
                                            System.out.println("***********************************************************************************");
                                            System.out.println(" ");
                                            try {
                                                System.out.println("Elija una opcion");

                                            int opcionE = sc.nextInt();
                                            switch (opcionE) {
                                                case 1:

                                                    System.out.println("Ingrese el valor de i del vector A");
                                                    double Ax = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector A");
                                                    double Ay = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese al valor de k del vector A");
                                                    double Az = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    System.out.println("Ingrese el valor de t del vector A");
                                                    double At = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    OVecR4 a = new OVecR4(Ax, Ay, Az, At);
                                                    System.out.println("Ingrese el valor de i del vector B");
                                                    double Bx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector B");
                                                    double By = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese al valor de k del vector B");
                                                    double Bz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    System.out.println("Ingrese el valor de t del vector B");
                                                    double Bt = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    OVecR4 b = new OVecR4(Bx, By, Bz, Bt);
                                                    System.out.println("La suma de los dos vectores es:");
                                                    System.out.println(a.suma(b));
                                                    break;

                                                case 2:

                                                    System.out.println("Ingrese el valor de i del vector A");
                                                    double Cx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector A");
                                                    double Cy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese al valor de k del vector A");
                                                    double Cz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    System.out.println("Ingrese el valor de t del vector A");
                                                    double Ct = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    OVecR4 c = new OVecR4(Cx, Cy, Cz, Ct);
                                                    System.out.println("Ingrese el valor de i del vector B");
                                                    double Dx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector B");
                                                    double Dy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese al valor de k del vector B");
                                                    double Dz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    System.out.println("Ingrese el valor de t del vector B");
                                                    double Dt = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    OVecR4 d = new OVecR4(Dx, Dy, Dz, Dt);
                                                    System.out.println("La suma de los dos vectores es:");
                                                    System.out.println(c.resta(d));
                                                    break;

                                                case 3:

                                                    System.out.println("Ingrese el valor de i del vector A");
                                                    double Ex = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector A");
                                                    double Ey = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese al valor de k del vector A");
                                                    double Ez = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    System.out.println("Ingrese el valor de t del vector A");
                                                    double Et = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    OVecR4 e = new OVecR4(Ex, Ey, Ez, Et);
                                                    System.out.println("Ingrese el valor de i del vector B");
                                                    double Fx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector B");
                                                    double Fy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese al valor de k del vector B");
                                                    double Fz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    System.out.println("Ingrese el valor de t del vector B");
                                                    double Ft = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    OVecR4 f = new OVecR4(Fx, Fy, Fz, Ft);
                                                    System.out.println("La suma de los dos vectores es:");
                                                    System.out.println(e.prodPunto(f));
                                                    break;

                                                case 4:
                                                    System.out.println("Ingrese el valor de i del vector ");
                                                    double Gx = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese el valor de j del vector ");
                                                    double Gy = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                    System.out.println("Ingrese al valor de k del vector A");
                                                    double Gz = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    System.out.println("Ingrese el valor de t del vector");
                                                    double Gt = lector.obtenerEnteroValidado("Ingrese numero valido");
                                                    OVecR4 g = new OVecR4(Gx, Gy, Gz, Gt);
                                                    System.out.println(g.magnitud());
                                                    break;

                                                case 5:
                                                    salirC = true;
                                                    break;

                                                default:
                                                    System.out.println("Ingrese un numero valido");
                                            }
                                        }catch(InputMismatchException e){
                                                System.out.println("Debes insertar un numero");
                                                sc.next();
                                            }
                                        }
                                        break;

                                    case 4:
                                        salir2 = true;
                                        break;

                                    default:
                                        System.out.println("Ingrese un numero valido");
                                }
                            }catch(InputMismatchException e)
                            {
                                System.out.println("Debes insertar un número");
                                sc.next();
                            }
                            }
                        break;
                        case 2:
                            boolean salir3 = false;
                            while(!salir3)
                            {
                                System.out.println("                             Matrices");
                                System.out.println("***********************************************************************************");
                                System.out.println("1. Matriz de 2x2");
                                System.out.println("2. Matriz de 3x3");
                                System.out.println("3. Matriz de 4x4");
                                System.out.println("4. Regresar al menu principal");
                                System.out.println("***********************************************************************************");
                                try {
                                    System.out.println("Seleccione una opcion.");
                                    int opcionC = sc.nextInt();
                                    switch (opcionC) {
                                        case 1:
                                            boolean salirD = false;
                                            while(!salirD) {
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
                                                System.out.println("9. Regresar ");
                                                System.out.println("***********************************************************************************");
                                                System.out.println(" ");
                                                try {
                                                    System.out.println("Elija una opcion");

                                                int opcionD = sc.nextInt();
                                                switch (opcionD) {
                                                    case 1:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double a11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double a12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double a21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double a22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat2x2 a = new OMat2x2(a11, a12, a21, a22);
                                                        System.out.println(" ");
                                                        System.out.println("Ingrese el valor de B11");
                                                        double b11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B12");
                                                        double b12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B21");
                                                        double b21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B22");
                                                        double b22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat2x2 b = new OMat2x2(b11, b12, b21, b22);
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(a.suma(b));
                                                        break;

                                                    case 2:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double c11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double c12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double c21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double c22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat2x2 c = new OMat2x2(c11, c12, c21, c22);
                                                        System.out.println(" ");
                                                        System.out.println("Ingrese el valor de B11");
                                                        double d11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B12");
                                                        double d12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B21");
                                                        double d21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B22");
                                                        double d22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat2x2 d = new OMat2x2(d11, d12, d21, d22);
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(c.resta(d));
                                                        break;

                                                    case 3:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double e11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double e12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double e21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double e22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat2x2 e = new OMat2x2(e11, e12, e21, e22);
                                                        System.out.println("Ingrese el valor de B11");
                                                        double f11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B12");
                                                        double f12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B21");
                                                        double f21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B22");
                                                        double f22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat2x2 f = new OMat2x2(f11, f12, f21, f22);
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(e.multiplicacion(f));
                                                        break;

                                                    case 4:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double g11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double g12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double g21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double g22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat2x2 g = new OMat2x2(g11, g12, g21, g22);
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(g.transpuesta());
                                                        break;

                                                    case 5:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double h11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double h12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double h21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double h22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat2x2 h = new OMat2x2(h11, h12, h21, h22);
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(h.inversa());
                                                        break;

                                                    case 6:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double i11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double i12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double i21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double i22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat2x2 i = new OMat2x2(i11, i12, i21, i22);
                                                        System.out.println("El determinante es:");
                                                        System.out.println(i.determinante());
                                                        break;

                                                    case 7:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double j11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double j12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double j21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double j22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat2x2 j = new OMat2x2(j11, j12, j21, j22);
                                                        System.out.println("Ingrese el valor de alpha");
                                                        double alpha = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(j.rotacion(alpha));
                                                        break;

                                                    case 8:
                                                        OMat2x2 ident = new OMat2x2();
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(ident.identidad());

                                                        break;

                                                    case 9:
                                                        salirD = true;
                                                        break;
                                                    default:
                                                        System.out.println("Ingrese un numero valido");

                                                }
                                            }catch (InputMismatchException e){
                                                    System.out.println("Debes insertar un numero");
                                                    sc.next();
                                                }
                                            }
                                        break;

                                        case 2:
                                            boolean salirE = false;
                                            while(!salirE) {
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
                                                System.out.println("11. Regresar");
                                                System.out.println("***********************************************************************************");
                                                System.out.println(" ");
                                                try {
                                                    System.out.println("Elija una opcion");

                                                int opcionE = sc.nextInt();
                                                switch (opcionE) {
                                                    case 1:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double a11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double a12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A13");
                                                        double a13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double a21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double a22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A23");
                                                        double a23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A31");
                                                        double a31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A32");
                                                        double a32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A33");
                                                        double a33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat3x3 a = new OMat3x3(a11, a12, a13, a21, a22, a23, a31, a32, a33);
                                                        System.out.println("Ingrese el valor de B11");
                                                        double b11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B12");
                                                        double b12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B13");
                                                        double b13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B21");
                                                        double b21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B22");
                                                        double b22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B23");
                                                        double b23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B31");
                                                        double b31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B32");
                                                        double b32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B33");
                                                        double b33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat3x3 b = new OMat3x3(b11, b12, b13, b21, b22, b23, b31, b32, b33);
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(a.suma(b));
                                                        break;

                                                    case 2:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double c11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double c12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A13");
                                                        double c13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double c21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double c22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A23");
                                                        double c23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A31");
                                                        double c31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A32");
                                                        double c32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A33");
                                                        double c33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat3x3 c = new OMat3x3(c11, c12, c13, c21, c22, c23, c31, c32, c33);
                                                        System.out.println("Ingrese el valor de B11");
                                                        double d11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B12");
                                                        double d12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B13");
                                                        double d13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B21");
                                                        double d21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B22");
                                                        double d22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B23");
                                                        double d23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B31");
                                                        double d31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B32");
                                                        double d32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B33");
                                                        double d33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat3x3 d = new OMat3x3(d11, d12, d13, d21, d22, d23, d31, d32, d33);
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(c.resta(d));
                                                        break;

                                                    case 3:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double e11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double e12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A13");
                                                        double e13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double e21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double e22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A23");
                                                        double e23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A31");
                                                        double e31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A32");
                                                        double e32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A33");
                                                        double e33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat3x3 e = new OMat3x3(e11, e12, e13, e21, e22, e23, e31, e32, e33);
                                                        System.out.println("Ingrese el valor de B11");
                                                        double f11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B12");
                                                        double f12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B13");
                                                        double f13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B21");
                                                        double f21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B22");
                                                        double f22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B23");
                                                        double f23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B31");
                                                        double f31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B32");
                                                        double f32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B33");
                                                        double f33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat3x3 f = new OMat3x3(f11, f12, f13, f21, f22, f23, f31, f32, f33);
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(e.multiplicacion(f));
                                                        break;

                                                    case 4:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double g11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double g12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A13");
                                                        double g13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double g21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double g22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A23");
                                                        double g23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A31");
                                                        double g31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A32");
                                                        double g32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A33");
                                                        double g33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat3x3 g = new OMat3x3(g11, g12, g13, g21, g22, g23, g31, g32, g33);
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(g.transpuesta());
                                                        break;

                                                    case 5:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double h11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double h12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A13");
                                                        double h13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double h21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double h22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A23");
                                                        double h23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A31");
                                                        double h31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A32");
                                                        double h32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A33");
                                                        double h33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat3x3 h = new OMat3x3(h11, h12, h13, h21, h22, h23, h31, h32, h33);
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(h.inversa());
                                                        break;

                                                    case 6:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double i11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double i12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A13");
                                                        double i13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double i21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double i22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A23");
                                                        double i23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A31");
                                                        double i31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A32");
                                                        double i32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A33");
                                                        double i33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat3x3 i = new OMat3x3(i11, i12, i13, i21, i22, i23, i31, i32, i33);
                                                        System.out.println("El determinante es:");
                                                        System.out.println(i.determinante());
                                                        break;

                                                    case 7:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double j11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double j12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A13");
                                                        double j13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double j21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double j22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A23");
                                                        double j23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A31");
                                                        double j31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A32");
                                                        double j32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A33");
                                                        double j33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat3x3 j = new OMat3x3(j11, j12, j13, j21, j22, j23, j31, j32, j33);
                                                        System.out.println("Ingrese el valor de alpha");
                                                        double alphaX = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(j.rotacionX(alphaX));
                                                        break;

                                                    case 8:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double k11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double k12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A13");
                                                        double k13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double k21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double k22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A23");
                                                        double k23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A31");
                                                        double k31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A32");
                                                        double k32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A33");
                                                        double k33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat3x3 k = new OMat3x3(k11, k12, k13, k21, k22, k23, k31, k32, k33);
                                                        System.out.println("Ingrese el valor de alpha");
                                                        double alphaY = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(k.rotacionY(alphaY));
                                                        break;

                                                    case 9:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double l11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double l12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A13");
                                                        double l13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double l21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double l22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A23");
                                                        double l23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A31");
                                                        double l31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A32");
                                                        double l32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A33");
                                                        double l33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat3x3 l = new OMat3x3(l11, l12, l13, l21, l22, l23, l31, l32, l33);
                                                        System.out.println("Ingrese el valor de alpha");
                                                        double alphaZ = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(l.rotacionZ(alphaZ));
                                                        break;

                                                    case 10:
                                                        OMat3x3 iden = new OMat3x3();
                                                        System.out.println(iden.identidad());
                                                        break;

                                                    case 11:
                                                        salirE = true;
                                                        break;

                                                    default:
                                                        System.out.println("Ingrese un numero valido");
                                                }
                                            }catch (InputMismatchException e){
                                                    System.out.println("Debes insertar un numero");
                                                    sc.next();
                                                }
                                            }
                                        break;

                                        case 3:
                                            boolean salirF = false;
                                            while(!salirF) {
                                                System.out.println("                             Matriz de 4x4");
                                                System.out.println("***********************************************************************************");
                                                System.out.println("1. Suma de dos matrices");
                                                System.out.println("2. Resta de dos matrices");
                                                System.out.println("3. Multiplicacion de dos matrices");
                                                System.out.println("4. Transpuesta de la matriz");
                                                System.out.println("5. Inversa de la matriz");
                                                System.out.println("6. Determinante de la matriz");
                                                System.out.println("7. Rotacion de la matriz en X");
                                                System.out.println("8. Rotacion de la matriz en Y");
                                                System.out.println("9. Rotacion de la matriz en Z");
                                                System.out.println("10. Matriz Identidad");
                                                System.out.println("11. Regresar ");
                                                System.out.println("***********************************************************************************");
                                                System.out.println(" ");
                                                try {
                                                    System.out.println("Elija una opcion");

                                                int opcionF = sc.nextInt();
                                                switch (opcionF) {
                                                    case 1:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double a11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double a12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A13");
                                                        double a13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A14");
                                                        double a14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double a21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double a22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A23");
                                                        double a23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A24");
                                                        double a24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A31");
                                                        double a31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A32");
                                                        double a32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A33");
                                                        double a33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A34");
                                                        double a34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el calor de A41");
                                                        double a41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A42");
                                                        double a42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A43");
                                                        double a43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A44");
                                                        double a44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat4x4 a = new OMat4x4(a11, a12, a13, a14, a21, a22, a23, a24, a31, a32, a33, a34, a41, a42, a43, a44);
                                                        System.out.println("Ingrese el valor de B11");
                                                        double b11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B12");
                                                        double b12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B13");
                                                        double b13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B14");
                                                        double b14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B21");
                                                        double b21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B22");
                                                        double b22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B23");
                                                        double b23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B24");
                                                        double b24 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B31");
                                                        double b31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B32");
                                                        double b32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B33");
                                                        double b33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B34");
                                                        double b34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B41");
                                                        double b41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B42");
                                                        double b42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B43");
                                                        double b43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B44");
                                                        double b44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat4x4 b = new OMat4x4(b11, b12, b13, b14, b21, b22, b23, b24, b31, b32, b33, b34, b41, b42, b43, b44);
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(a.suma(b));
                                                        break;

                                                    case 2:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double c11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double c12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A13");
                                                        double c13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A14");
                                                        double c14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double c21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double c22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A23");
                                                        double c23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A24");
                                                        double c24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A31");
                                                        double c31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A32");
                                                        double c32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A33");
                                                        double c33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A34");
                                                        double c34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el calor de A41");
                                                        double c41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A42");
                                                        double c42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A43");
                                                        double c43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A44");
                                                        double c44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat4x4 c = new OMat4x4(c11, c12, c13, c14, c21, c22, c23, c24, c31, c32, c33, c34, c41, c42, c43, c44);
                                                        System.out.println("Ingrese el valor de B11");
                                                        double d11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B12");
                                                        double d12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B13");
                                                        double d13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B14");
                                                        double d14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B21");
                                                        double d21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B22");
                                                        double d22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B23");
                                                        double d23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B24");
                                                        double d24 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B31");
                                                        double d31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B32");
                                                        double d32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B33");
                                                        double d33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B34");
                                                        double d34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B41");
                                                        double d41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B42");
                                                        double d42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B43");
                                                        double d43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B44");
                                                        double d44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat4x4 d = new OMat4x4(d11, d12, d13, d14, d21, d22, d23, d24, d31, d32, d33, d34, d41, d42, d43, d44);
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(c.resta(d));
                                                        break;

                                                    case 3:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double e11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double e12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A13");
                                                        double e13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A14");
                                                        double e14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double e21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double e22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A23");
                                                        double e23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A24");
                                                        double e24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A31");
                                                        double e31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A32");
                                                        double e32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A33");
                                                        double e33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A34");
                                                        double e34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el calor de A41");
                                                        double e41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A42");
                                                        double e42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A43");
                                                        double e43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A44");
                                                        double e44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat4x4 e = new OMat4x4(e11, e12, e13, e14, e21, e22, e23, e24, e31, e32, e33, e34, e41, e42, e43, e44);
                                                        System.out.println("Ingrese el valor de B11");
                                                        double f11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B12");
                                                        double f12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B13");
                                                        double f13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B14");
                                                        double f14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B21");
                                                        double f21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B22");
                                                        double f22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B23");
                                                        double f23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B24");
                                                        double f24 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B31");
                                                        double f31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B32");
                                                        double f32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B33");
                                                        double f33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B34");
                                                        double f34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B41");
                                                        double f41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B42");
                                                        double f42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B43");
                                                        double f43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de B44");
                                                        double f44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat4x4 f = new OMat4x4(f11, f12, f13, f14, f21, f22, f23, f24, f31, f32, f33, f34, f41, f42, f43, f44);
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(e.mult(f));
                                                        break;

                                                    case 4:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double g11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double g12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A13");
                                                        double g13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A14");
                                                        double g14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double g21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double g22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A23");
                                                        double g23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A24");
                                                        double g24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A31");
                                                        double g31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A32");
                                                        double g32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A33");
                                                        double g33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A34");
                                                        double g34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el calor de A41");
                                                        double g41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A42");
                                                        double g42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A43");
                                                        double g43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A44");
                                                        double g44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat4x4 g = new OMat4x4(g11, g12, g13, g14, g21, g22, g23, g24, g31, g32, g33, g34, g41, g42, g43, g44);
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(g.transpuesta());
                                                        break;

                                                    case 5:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double h11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double h12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A13");
                                                        double h13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A14");
                                                        double h14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double h21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double h22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A23");
                                                        double h23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A24");
                                                        double h24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A31");
                                                        double h31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A32");
                                                        double h32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A33");
                                                        double h33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A34");
                                                        double h34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el calor de A41");
                                                        double h41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A42");
                                                        double h42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A43");
                                                        double h43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A44");
                                                        double h44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat4x4 h = new OMat4x4(h11, h12, h13, h14, h21, h22, h23, h24, h31, h32, h33, h34, h41, h42, h43, h44);
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(h.inversa());
                                                        break;

                                                    case 6:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double i11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double i12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A13");
                                                        double i13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A14");
                                                        double i14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double i21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double i22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A23");
                                                        double i23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A24");
                                                        double i24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A31");
                                                        double i31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A32");
                                                        double i32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A33");
                                                        double i33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A34");
                                                        double i34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el calor de A41");
                                                        double i41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A42");
                                                        double i42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A43");
                                                        double i43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A44");
                                                        double i44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat4x4 i = new OMat4x4(i11, i12, i13, i14, i21, i22, i23, i24, i31, i32, i33, i34, i41, i42, i43, i44);
                                                        System.out.println("El determinante es:");
                                                        System.out.println(i.determinante());
                                                        break;

                                                    case 7:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double j11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double j12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A13");
                                                        double j13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A14");
                                                        double j14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double j21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double j22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A23");
                                                        double j23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A24");
                                                        double j24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A31");
                                                        double j31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A32");
                                                        double j32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A33");
                                                        double j33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A34");
                                                        double j34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el calor de A41");
                                                        double j41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A42");
                                                        double j42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A43");
                                                        double j43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A44");
                                                        double j44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat4x4 j = new OMat4x4(j11, j12, j13, j14, j21, j22, j23, j24, j31, j32, j33, j34, j41, j42, j43, j44);
                                                        System.out.println("Ingrese el valor de alpha");
                                                        double alphaX = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(j.rotX(alphaX));
                                                        break;

                                                    case 8:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double k11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double k12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A13");
                                                        double k13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A14");
                                                        double k14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double k21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double k22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A23");
                                                        double k23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A24");
                                                        double k24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A31");
                                                        double k31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A32");
                                                        double k32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A33");
                                                        double k33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A34");
                                                        double k34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el calor de A41");
                                                        double k41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A42");
                                                        double k42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A43");
                                                        double k43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A44");
                                                        double k44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat4x4 k = new OMat4x4(k11, k12, k13, k14, k21, k22, k23, k24, k31, k32, k33, k34, k41, k42, k43, k44);
                                                        System.out.println("Ingrese el valor de alpha");
                                                        double alphaY = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(k.rotY(alphaY));
                                                        break;

                                                    case 9:
                                                        System.out.println("Ingrese el valor de A11");
                                                        double l11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A12");
                                                        double l12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A13");
                                                        double l13 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A14");
                                                        double l14 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A21");
                                                        double l21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A22");
                                                        double l22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A23");
                                                        double l23 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A24");
                                                        double l24 = lector.obtenerEnteroValidado(" Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A31");
                                                        double l31 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A32");
                                                        double l32 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A33");
                                                        double l33 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A34");
                                                        double l34 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el calor de A41");
                                                        double l41 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A42");
                                                        double l42 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A43");
                                                        double l43 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("Ingrese el valor de A44");
                                                        double l44 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        OMat4x4 l = new OMat4x4(l11, l12, l13, l14, l21, l22, l23, l24, l31, l32, l33, l34, l41, l42, l43, l44);
                                                        System.out.println("Ingrese el valor de alpha");
                                                        double alphaZ = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(l.rotZ(alphaZ));
                                                        break;

                                                    case 10:
                                                        OMat4x4 iden = new OMat4x4();
                                                        System.out.println("La matriz resultantes es:");
                                                        System.out.println(iden.identidad());
                                                        break;

                                                    case 11:
                                                        salirF = true;
                                                        break;

                                                    default:
                                                        System.out.println("Ingrese un numero valido.");
                                                }
                                            }catch(InputMismatchException e){
                                                    System.out.println("Debes insertar un numero");
                                                    sc.next();
                                                }
                                            }
                                        break;

                                        case 4:
                                            salir3 = true;
                                        break;

                                        default:
                                            System.out.println("Ingrese un numero valido");
                                    }
                                }catch (InputMismatchException e)
                                {
                                    System.out.println("Debes insertar un número");
                                    sc.next();
                                }
                            }
                        break;


                        case 3:
                            boolean salir4 = false;
                            while(!salir4)
                            {
                                System.out.println("                                Vectores y matrices");
                                System.out.println("***********************************************************************************");
                                System.out.println("1. Multiplicar vector en R2 por matriz  2x2");
                                System.out.println("2. Regresar al menu principal");
                                System.out.println("***********************************************************************************");
                                try {
                                    System.out.println("Seleccione una opcion.");
                                    int opcionD = sc.nextInt();
                                    switch (opcionD)
                                    {
                                        case 1:
                                            System.out.println("Ingrese el valor de i para el vector");
                                            double vecI = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                            System.out.println("Ingrese el valor de j para el vector");
                                            double vecJ = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                            OVecR2 vec = new OVecR2(vecI, vecJ);
                                            System.out.println("Ingrese la matriz");
                                            System.out.println("Ingrese el valor de A11");
                                            double a11 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                            System.out.println("Ingrese el valor de A12");
                                            double a12 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                            System.out.println("Ingrese el valor de A21");
                                            double a21 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                            System.out.println("Ingrese el valor de A22");
                                            double a22 = lector.obtenerEnteroValidado("Ingrese un numero valido");
                                            OMat2x2 a = new OMat2x2(a11, a12, a21, a22);
                                            System.out.println("El vector resultante es:");
                                            System.out.println(a.mult(vec));
                                        break;

                                        case 2:
                                            salir4 = true;
                                        break;
                                    }
                                }catch(InputMismatchException e)
                                {
                                    System.out.println("Debes insertar un número");
                                    sc.next();
                                }
                            }
                    break;

                    case 4:
                        salir = true;
                    break;

                    default:
                        System.out.println("Ingrese un numero valido");
                    }
                } catch (InputMismatchException e)
                {
                    System.out.println("Debes insertar un número");
                    sc.next();
                }
        }
    }
}


