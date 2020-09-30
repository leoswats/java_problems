import java.util.Scanner;

public class TesteDaTabuadaV2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int num, contador;

        System.out.println("Digite o numero da tabuada");
        num = teclado.nextInt();
        contador = 11;
        do{ // faça
            System.out.println(num + " x "+contador+" = "+(num*contador));
            contador = contador + 1;
        } while(contador <= 10);  // enquanto a condição for verdadeira
    }
}