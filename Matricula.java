import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Matricula {
    Scanner sc = new Scanner(System.in);
    int id ;
    int idAluno;
    int IdSala;
    LocalDateTime dataHora;
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");

    public void  DigitarId(){
        System.out.println("Digite o id:");
        id = sc.nextInt();
    }
    public void  DigitarIdAluno(){
        System.out.println("Digite o id do aluno:");
        id = sc.nextInt();
    }
    public void  DigitarIdSala(){
        System.out.println("Digite o id da Sala:");
        id = sc.nextInt();
    }
    public void  DigitarDataHora(){
        System.out.println("Data atual gerando automático");
        dataHora = LocalDateTime.now();
        
    }

    public void executarId(){
        System.out.println("O seu id é: "+ id);
    }
    public void executarIdAluno(){
        System.out.println("O id do aluno é: "+ idAluno);
    }
    public void executarIdSala(){
        System.out.println("O id da sala é: "+ IdSala);
    }
    public void executarDataHora(){
        System.out.println("A data é: "+ dataHora.format(formato));
    }







}
