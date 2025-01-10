package Practica2;

public class ClaseNotas {
    //Atributos
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    //constructor
    public ClaseNotas (double nota1, double nota2,double nota3, double nota4){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    //calcular_promedios
    public void promedio1 (){
        double calificacion = ((nota1+nota2)/2);
    }
    public void promedio2 (){
        double calificacion2 = ((nota3+nota4)/2);
    }

}

