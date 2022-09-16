public class Laços_de_Repetição {
    public static void main(String[] args){
        // Variavel i receber 1, precisando ser menor ou igual a 10, caso não for adicione mais 1

        for (int i = 1; i <= 10; i += 1){
            int num = 1;
            int valor = i * (num + 1);
            System.out.printf("%s x %s = %s%n", num + 1, i, valor);
        }
    }
}
