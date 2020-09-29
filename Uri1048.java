import java.util.Scanner;
public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario, reajuste;
        int    percentual;

        salario = teclado.nextDouble();
        if (salario <= 400){
            percentual = 15;
        } 
        else if (salario <= 800){
            percentual = 12;
        }
        else if (salario <= 1200){
            percentual = 10;
        }
        else if (salario <= 2000){
            percentual = 7;
        }
        else {
            percentual = 4;
        }

        reajuste = salario * percentual / 100;
        salario = salario + reajuste;
        System.out.printf("Novo salario: %.2f\n",salario);
        System.out.printf("Reajuste ganho: %.2f\n",reajuste);
        System.out.println("Em percentual: "+percentual+" %");

    }
}