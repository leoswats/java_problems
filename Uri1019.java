import java.util.Scanner;
public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tempo;
        int h, m, s;
        int resto;

        tempo = teclado.nextInt();
        h = tempo / 3600;

        resto = tempo % 3600;

        m = resto / 60;
        s = resto % 60;
        System.out.println(h+":"+m+":"+s);
    }
}