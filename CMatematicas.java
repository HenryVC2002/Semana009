package Matematicas;

public class CMatematicas {
    
    private int num1;
    private int num2;
    private int x;
    private int y;
    private int a;
    private int b;
    private double radius;
 
    public float AreaRectangulo() {
        return num1 * num2;
    }
    
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public float AreaTriangulo() {
        return x * y / 2;
    }
    
    public void setx(int x) {
        this.x = x;
    }
    
    public void sety(int y) {
        this.y = y;
    }
    
    public int Division() {
        return a / b;
    }
    
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double VolumenEsfera() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double Hipotenusa() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
