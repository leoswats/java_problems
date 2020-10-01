import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt();

        for (int numero = 1; numero <= 4 * N; numero++){
            if (numero % 4 != 0){  // quem não é divisível por 4, mostro o número
                System.out.print(numero+" ");
            }
            else{                // o número divisível por 4, eu troco pelo "PUM" e pulo linha
                System.out.println("PUM");
            }
        }
    }
}