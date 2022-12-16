/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Puntos {
    
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    
    @Override
    public String toString() {
        return "Puntos{" + "x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + '}';
    }
    
    public Puntos crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del punto p1(x1, y1)");
        int X1 = leer.nextInt();
        int Y1 = leer.nextInt();
        System.out.println("Ingrese las coordenadas del punto p2(x2, y2)");
        int X2 = leer.nextInt();
        int Y2 = leer.nextInt();
                
        return new Puntos(X1, Y1, X2, Y2);
    }
    
    public double calcularDistancia(Puntos p){
        double distancia;
        distancia = Math.sqrt(Math.pow((p.getX2() - p.getX1()), 2) + Math.pow((p.getY2()-p.getY1()), 2));
        
        return distancia;
    }
}
