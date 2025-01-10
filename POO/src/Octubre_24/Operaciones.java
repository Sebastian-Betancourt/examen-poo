package Octubre_24;
class Operaciones{
    //Atributos
    double num1;
    double num2;
    double suma;

    // constructor
    public Operaciones (double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double Sumar (){
        return num1+num2;
    }
    public double Restar (){
        return num1-num2;
    }
    public void imprimir (){
        System.out.print("LA SUMA DESDE EL METODO PERSONALIZADO ES: "+Sumar());
        System.out.print("LA RESTA DESDE EL METODO PERSONALIZADO ES: "+Restar());

    }
}



