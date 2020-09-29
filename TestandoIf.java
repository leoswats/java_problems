import java.util.Scanner;
public class TestandoIf{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float n1, n2, media;
        System.out.print("Digite a N1: ");
        n1 = teclado.nextFloat();
        System.out.print("Digite a N2: ");
        n2 = teclado.nextFloat();

        media = (n1 + n2)/2;

        System.out.println("Media do aluno = "+media);

        if ( media >= 9 && media <= 10 ){
            System.out.println("Aprovado com conceito A");
        }
        else if (media >= 8 && media < 9){
            System.out.println("Aprovado com conceito B");
        }
        else if (media >= 6 && media < 8){
            System.out.println("Aprovado com conceito C");
        }
        else if (media >= 3 && media < 6){
            System.out.println("Em Exame");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}