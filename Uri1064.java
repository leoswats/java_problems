/*
    Pergunta 1: sei ler 6 valores?
            R: sei ler 1, então, se eu souber contar até 6, posso repetir a leitura do valor 6 vezes


*/
import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float valor;
        float somatoria, media;
        int   numPositivos;
        numPositivos = 0;  // aqui eu quero contar quantos dos valores digitados são positivos
        somatoria    = 0;  // aqui eu vou acumular a somatória dos valores positivos digitados

        // aqui este bloco eu conto até 6
        for (int contador = 1; contador <= 6; contador++){
            valor = teclado.nextFloat();
            if (valor > 0){
                numPositivos++;
                somatoria = somatoria + valor;
            }
        }   
        System.out.println(numPositivos+" valores positivos");
        media = somatoria / numPositivos;
        System.out.printf("%.1f\n",media);
    }
    
}