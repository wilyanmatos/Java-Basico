import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class Manipulação_de_String_e_Dados_04 {
    public static void main (String[] args){
        /*String nome = "Wilson da Motoca";
        String outroNome = "Wilson da motoca";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());
        System.out.println("O nome da String são totalmente iguais: " + nome.equals(outroNome));
        System.out.println("São Iguais parcialmente: " + nome.equalsIgnoreCase(outroNome));*/

        String nome = "Wilson";
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        /*Locale brasil = new Locale("pt", "BR");*/
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil));
        String DiaDaSeman = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String Saudacao;
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.getHour());
        int HoraAtual = agora.getHour();
        if (HoraAtual > 0 && HoraAtual <= 12){
            Saudacao = "Bom dia.";
        }else if(HoraAtual > 12 && HoraAtual <= 18){
            Saudacao = "Boa tarde.";
        }else if(HoraAtual > 18 && HoraAtual <= 24){
            Saudacao = "Boa Noite.";
        }else{
            Saudacao = "{ERRO} - Dia";
        }
        System.out.println("Olá " + nome + ". Hoje é " + DiaDaSeman + ". " + Saudacao );
        System.out.println("Agora são " + HoraAtual + ":" + agora.getMinute() + " Horas");
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, DiaDaSeman, Saudacao);

    }
}
