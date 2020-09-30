import java.util.Scanner;
public class TesteDaTabuadaV3{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int num, contador;
        num = teclado.nextInt();
        // para contador iniciando em 1 até 10, incrementando de 1 em 1, faça
        for (contador=1 ; contador<=10 ; contador = contador+1 ){
            System.out.println(num + " x "+ contador + " = "+ (num*contador));
        }     
    }
}