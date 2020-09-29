/*
A idéia é simular um caixa eletrônico, onde informamos o valor do saque e, a partir daí,
começamos a dividir este valor pelo maior valor de cédula até chegar no menor valor de cédula

como fazemos isso? através de divisões e restos (ou multiplicações e subtrações)


576 / 100
 76     5   

 76 / 50
 26    1

 26 / 20
  6    1
  
  6 / 10
  6    0

  6 / 5
  1   1

  1 / 2
  1   0

  1 / 1
  0   1 
*/

import java.util.Scanner;
public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor, q100, q50, q20, q10, q5, q2, q1, resto;


        // primeira coisa - ler o valor
        valor = teclado.nextInt();

        q100  = valor / 100;  // aqui eu obtenho a quantidade de cédulas de R$ 100,00
        // quanto sobrou?
        resto = valor % 100; // isso pode tb ser substituido como: resto = valor - q100 * 100;

        q50   = resto / 50;
        // quanto sobrou?
        resto = resto % 50;

        q20   = resto / 20;
        resto = resto % 20;

        q10   = resto / 10;
        resto = resto % 10;

        q5    = resto / 5;
        resto = resto % 5;

        q2    = resto / 2;
        q1    = resto % 2;

        // saída
        System.out.println(valor);
        System.out.println(q100 + " nota(s) de R$ 100,00");
        System.out.println(q50  + " nota(s) de R$ 50,00");
        System.out.println(q20  + " nota(s) de R$ 20,00");
        System.out.println(q10  + " nota(s) de R$ 10,00");
        System.out.println(q5   + " nota(s) de R$ 5,00");
        System.out.println(q2   + " nota(s) de R$ 2,00");
        System.out.println(q1   + " nota(s) de R$ 1,00"); 
    }
}