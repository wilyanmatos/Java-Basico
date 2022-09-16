import java.util.Arrays;
time: 12:03
public class Vetores_06 {
    public static void main (String[] args){
        // Arrays com Strings
        String[] letras = new String[5];
        letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "D";
        letras[4] = "E";
        System.out.println(letras);

        for (int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
        }

        String[] letras_02 = {"A", "B", "C", "D", "F"};
        System.out.println(Arrays.toString(letras));
        for (int i = 0; i < letras_02.length; i++){
            System.out.println(letras_02[i]);
        }

        // Arrays com Numeros
        int[] numeros = {1, 2, 3, 4, 5, 6};
        int maior = 0;
        int menor = 0;
        int valor = 0;
        for(int i = 0; i < numeros.length; i++){
            valor = numeros[i];
            if (valor > maior) {
                maior = valor;
            }if (menor < maior) {
                menor = maior;
            }
            System.out.printf("O maior número é %s e o menor é %s.%n", maior, menor);

        }
    }
}
