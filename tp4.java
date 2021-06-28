package com.calc.calcula;

public class Main
{
public static void main(String[] args) {
Calcula c = new Calcula();
   System.out.println("Calculando a divisão certa");
System.out.println(c.calcula(4,2));
System.out.println("\nCalculando a divisão errada");
System.out.println(c.calcula(4,0));
System.out.println("\nResulto Zero");
System.out.println(c.calcula(0, 2));
int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
System.out.println("\nArray vazia");
for(int i=0;i<10;i++){
   System.out.print(c.getArrayA()[i] + " ");    
}
c.setArrayA(myIntArray);
System.out.println("\n\nArray preenchida");
for(int i=0;i<10;i++){
   System.out.print(c.getArrayA()[i] + " ");
}
c.setArrayANaPosicao(100000, 4);
System.out.println("\n\n Numero da Array Trocado");
for(int i=0;i<10;i++){
   System.out.print(c.getArrayA()[i] + " ");
}
}
}

class Calcula
{
    private int[] arrayA = new int[10];
    private int[] arrayB = new int[10];
   
    public int[] getArrayA(){
        return arrayA;
    }
   
    public int[] getArrayB(){
        return arrayB;
    }
   
    public void setArrayA(int[] newArray){
        arrayA = newArray;
    }
   
    public void setArrayB(int[] newArray){
        arrayB = newArray;
    }
   
    public void setArrayANaPosicao(int valor, int posicao){
        if (posicao<10)arrayA[posicao] = valor;
    }
   
    public void setArrayBNaPosicao(int valor, int posicao){
        if (posicao<10)arrayB[posicao] = valor;
    }
   
    public int calcula(int a, int b){
        try{
        if(a/b == 0) {
        throw new ExcecaoDivisaoResultadoZero(a, b);
        }
            return a/b;
        }
        catch (ArithmeticException | ExcecaoDivisaoResultadoZero e) {
        System.out.println("Aconteceu Algum Erro");
        return -1;
    }
    }
    public class ExcecaoDivisaoResultadoZero extends Exception {
   
    private int a;
    private int b;
   
    public ExcecaoDivisaoResultadoZero(int a, int b) {
    super();
    this.a = a;
    this.b = b;
    }
    @Override
    public String toString() {
    return "resultado de " + a + "/" + b + " é zero" ;
    }
    }
    }



