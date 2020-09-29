import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hI, mI, hF, mF, dH, dM, total, tempoI, tempoF;

        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        tempoI = hI * 60 + mI; // converto a hora inicial para minutos
        tempoF = hF * 60 + mF; // converto a hora final para minutos tb (facilita a conta)

        total = tempoF - tempoI;

        if (total <= 0){
            total  = total + 24*60;  // ou total = total + 1440;
        }  

        dH = total/60;
        dM = total % 60;

        System.out.println("O JOGO DUROU "+dH+" HORA(S) E "+dM+" MINUTO(S)");
    }
}