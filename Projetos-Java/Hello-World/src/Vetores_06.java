import java.sql.SQLOutput;
import java.util.Arrays;
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
        int[] numeros = {10, 5, -1, 42, 19, 1};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;
        for(int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            } else {
                menor = numeros[i];
            }
            media += numeros[i];
        }
        int totalMedia = (media / numeros.length) ;
        System.out.printf("maior: %s%n" , maior);
        System.out.printf("menor: %s%n", menor);
        System.out.printf("A média desses valores são %s.%n ", totalMedia);


    }
}
