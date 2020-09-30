import java.util.Scanner;
public class Exercicio20{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        char   sexo;
        double altura, pesoIdeal;

        System.out.print("Digite o sexo da pessoa (M-m/F-f) :");
        sexo = teclado.nextLine().charAt(0); // como não tem nextChar no scanner, lemos a linha toda (com nextLine) e selecionamos a 1a letra (posicao 0)
        System.out.print("Digite a altura em metros:");
        altura = teclado.nextDouble();

        switch(sexo){
            case 'M':   // para tipos CHAR, uso aspas simples
            case 'm':
                pesoIdeal = (72.7 * altura) - 58;
                System.out.printf("Seu peso ideal masculino é de %.1f\n", pesoIdeal);
                break;
            case 'F':
            case 'f':
                pesoIdeal = (62.1 * altura) - 44.7;
                System.out.printf("Seu peso ideal feminino é de %.1f\n",pesoIdeal);
                break;
            default:
                System.out.println("Valor inválido para sexo do indivíduo");
        }



    }
}