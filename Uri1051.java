import java.util.Scanner;
public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario, imposto;
        salario = teclado.nextDouble();

        if (salario <= 2000.0){
            System.out.println("Isento");
        }
        else if (salario <= 3000.0){
            imposto = (salario - 2000.0) * 0.08;
            System.out.printf("R$ %.2f\n",imposto); 
        }
        else if (salario <= 4500.0){
            imposto = (salario - 3000.0)*0.18 + 80.0; // os 80,00 representam 8% da faixa entre 2000 e 3000
            System.out.printf("R$ %.2f\n",imposto);
        }
        else{
            imposto = (salario - 4500.0)*0.28 + 270.0 + 80.0;// 270 pelos 18% em cima de 1500 (de 3000 a 4500) e 80 da faixa anterior
            System.out.printf("R$ %.2f\n",imposto);
        }
    }
}