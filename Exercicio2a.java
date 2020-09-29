import java.util.Scanner;
public class Exercicio2a{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        // defino as variaveis que preciso
        float lado, area;

        // passo 1 - entrada
        System.out.println("Digite o valor do LADO:");
        lado = teclado.nextFloat();

        // passo 2 - processamento
        area = lado * lado;

        // passo 3 - saída
        System.out.println("Valor da área = "+area);
    }
}