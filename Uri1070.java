import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X, inicio;

        X = teclado.nextInt();
        if (X %2 == 0){
            inicio = X + 1; // se X for par, o início é o próximo numero (imediatamete um impar)
        }
        else{
            inicio = X;
        }
        // preciso imprimir 6 numeros
        for (int cont=1; cont<=6; cont++){
            System.out.println(inicio);
            inicio = inicio + 2;
        }
    }
}