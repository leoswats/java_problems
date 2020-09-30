import java.util.Scanner;
public class LeiturasInfinitas{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor;

        do{
            System.out.println("Digite um valor: ");
            valor = teclado.nextInt();
            System.out.println("   --- digitou: "+valor);
        } while (valor > 0);
        System.out.println("Fim do programa!");
    }
}