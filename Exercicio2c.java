import java.util.Scanner;
public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double area, base, altura;
        // entrada:
        System.out.println("Digite a base do triangulo");
        base = teclado.nextDouble();
        System.out.println("Digite a altura do triangulo");
        altura = teclado.nextDouble();

        // processamento
        area = base * altura / 2.0;

        // saida
        System.out.println("A area do triangulo vale = "+area);
    }

}