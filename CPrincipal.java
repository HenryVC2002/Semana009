package CPrincipal;

import CSemana009.CLeer;
import Matematicas.CMatematicas;

public class CPrincipal {
    
    static CMatematicas rectangulo = new CMatematicas();
    static CMatematicas areatriangulo = new CMatematicas();
    static CMatematicas division = new CMatematicas();
    static CMatematicas esfera = new CMatematicas();
    static CMatematicas triangulo = new CMatematicas();
    
    public static void main(String[] args) {
        int num1, num2, a, b, x, y;
        double num = 0;
        double radius;

        // Leer dimensiones del rectángulo
        num1 = CLeer.LeerNumero1();
        num2 = CLeer.LeerNumero2();
        rectangulo.setNum1(num1);
        rectangulo.setNum2(num2);

        // Leer base y altura para el área del triángulo
        x = (int) CLeer.LeerNum1();
        y = (int) CLeer.LeerNum2();
        areatriangulo.setx(x);
        areatriangulo.sety(y);       
        
        // Leer la división
        a = CLeer.LeerDiv1();
        b = CLeer.LeerDiv2();
        division.setA(a);
        division.setB(b);

        // Leer radio de la esfera
        radius = CLeer.LeerRadius();
        esfera.setRadius(radius);

        // Leer lados del triángulo
        a = CLeer.LeerLado1();
        b = CLeer.LeerLado2();
        triangulo.setA(a);
        triangulo.setB(b);

        // Mostrar resultados
        mostrar();
    }
    
    public static void mostrar() {
        System.out.println("Área del rectángulo: " + rectangulo.AreaRectangulo());
        System.out.println("Área del triángulo es: " + areatriangulo.AreaTriangulo());
        System.out.println("La división de los números es: " + division.Division());
        System.out.println("Volumen de la esfera: " + esfera.VolumenEsfera());
        System.out.println("Hipotenusa del triángulo: " + triangulo.Hipotenusa());
    }
}