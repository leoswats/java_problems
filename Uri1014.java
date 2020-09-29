import java.util.Scanner;
public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        // aqui vou declarar as variáveis
        int   X;     // representando a distancia
        float Y;     // representando o consumo
        float media; // representando a média de consumo

        // entrada
        X = teclado.nextInt(); // espera o usuário digitar um valor inteiro
        Y = teclado.nextFloat(); // espera o usuário digitar um valor real (com vírgula)

        // processamento
        media = X / Y;

        // saída
        System.out.printf("%.3f km/l\n", media);  


    }
}