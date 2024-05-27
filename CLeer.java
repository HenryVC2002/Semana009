package CSemana009;

import java.util.Scanner;

public class CLeer {
    
    public static int LeerNumero1() {
        int num1;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese la altura del rectángulo: ");
            num1 = teclado.nextInt();
        } while (num1 < 0);
        return num1;
    }

    public static int LeerNumero2() {
        int num2;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese la base del rectángulo: ");
            num2 = teclado.nextInt();
        } while (num2 < 0);
        return num2;
    }

    public static float LeerNum1(){
        int x;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese la base del triangulo: ");
            x = teclado.nextInt();
        } while (x < 0);
        return x;
    }
    
    public static float LeerNum2(){
        int y;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese la altura del triangulo: ");
            y = teclado.nextInt();
        } while (y < 0);
        return y;
    }
    
    public static int LeerDiv1() {
        int a;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese el primer número a dividir: ");
            a = teclado.nextInt();
        } while (a < 0);
        return a;
    }
    
    public static int LeerDiv2() {
        int b;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese el segundo número a dividir: ");
            b = teclado.nextInt();
        } while (b <= 0);  // Asegúrate de que b no sea cero
        return b;
    }

    public static double LeerRadius() {
        double radius;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese el radio de la esfera: ");
            radius = teclado.nextDouble();
        } while (radius < 0);
        return radius;
    }

    public static int LeerLado1() {
        int a;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese el primer lado del triángulo: ");
            a = teclado.nextInt();
        } while (a < 0);
        return a;
    }

    public static int LeerLado2() {
        int b;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese el segundo lado del triángulo: ");
            b = teclado.nextInt();
        } while (b < 0);
        return b;
    }
}
