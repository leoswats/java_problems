import java.util.Scanner;

public class TesteDaTabuada{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero da tabuada");
        int num = teclado.nextInt();
        int contador;

        contador = 1;  // posicao inicial
        while (contador <= 10) { // enquanto a condição for verdadeira (contador <= 10)
            System.out.println(num + " x " +contador + " = " + (num*contador));
            contador = contador + 1;
        }

        System.out.println("------- Fim da tabuada!!!!");
    }
}