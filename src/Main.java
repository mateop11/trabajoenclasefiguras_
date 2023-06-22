import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado:");
        double lado = sc.nextDouble();

        Cuadrado cuadrado = new Cuadrado(lado);
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

        Triangulo triangulo = new Triangulo();
        System.out.println("Ingrese los puntos para el triángulo:");
        for (int i = 0; i < 3; i++) {
            triangulo.ingresarPuntos();
        }
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
    }
}