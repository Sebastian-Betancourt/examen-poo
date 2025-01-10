package mipracticabasica;
import java.util.Scanner;
public class Persona {
    //Atributos
    int edad;

    //constructor
    public Persona (int edad){
        this.edad = edad;
    }

    public void imprimirEdad(){
        System.out.println("La edad de la persona es: "+edad);
    }
    public void verificarMayorDeEdad(){
        System.out.println("Si la persona es mayor de edad (True), Si la persona es menor de edad (false)");
        if(edad>=18){
            System.out.println("True");

        } else {
            System.out.println("False");
        }
    }
    public void mostrarResultado(){
        imprimirEdad();
        verificarMayorDeEdad();
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su año de nacimiento: ");
        int anio = scanner.nextInt();
        int edad = 2024-anio;
        Persona persona = new Persona(edad);
        persona.mostrarResultado();

    }
}
