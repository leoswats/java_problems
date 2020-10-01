import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int comb, qtAlcool, qtGasolina, qtDiesel;

        qtAlcool   = 0;
        qtGasolina = 0;
        qtDiesel   = 0;
        do{
            comb = teclado.nextInt();
            switch(comb){
                case 1:
                    qtAlcool++;
                    break;
                case 2:
                    qtGasolina++;
                    break;
                case 3:
                    qtDiesel++;
                    break;
            }
        } while (comb != 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+qtAlcool);
        System.out.println("Gasolina: "+qtGasolina);
        System.out.println("Diesel: "+qtDiesel);
    }
}