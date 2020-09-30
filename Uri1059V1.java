public class Uri1059V1{
    public static void main(String args[]){

        // valor = valor + 1
        // valor += 1
        // valor++

        // para valor de 1    ate 100       de 1 em 1
        for (int valor = 1; valor <= 100; valor = valor + 1){
            if (valor % 2 == 0){
                System.out.println(valor);
            }
        }
    }
}