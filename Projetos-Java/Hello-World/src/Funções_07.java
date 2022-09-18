public class Funções_07 {
    public static void main (String[] args){
        String nome = "Wilson";
        saudacao(nome);
        int result = soma(2, 3);
        System.out.println(result);

    }
    public static void saudacao(String nome){
        System.out.println(nome + ", Dos papoco");
    }

    public static int soma(int a, int b){
        return a + b;
    }

}
