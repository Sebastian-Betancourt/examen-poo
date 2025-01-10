package Practica2;

public class ClasePersona {
    //atributos
    String nombre1;
    int edad1;
    String telefono1;
    String nombre2;
    int edad2;
    String telefono2;
    //constructor
    public ClasePersona (String nombre1, int edad1, String telefono1,String nombre2, int edad2, String telefono2){
        this.edad1 = edad1;
        this.nombre1 = nombre1;
        this.telefono1 = telefono1;
        this.edad2 = edad2;
        this.nombre2 = nombre2;
        this.telefono2 = telefono2;
    }
    public void Imprimir1 (){
        System.out.println("El/la estudiante: "+nombre1);
        System.out.println("Edad: "+edad1);
        System.out.println("Télefono: "+telefono1);}


    public void Imprimir2 () {
        System.out.println("El/la estudiante: " + nombre2);
        System.out.println("Edad: " + edad2);
        System.out.println("Télefono: " + telefono2);
    }
}
