import java.util.Scanner;
public class SalaAula {
    Scanner sc = new Scanner(System.in);
    int idSala;
    int idAluno;



    public void DigitarIdSala(){
        System.out.println("Digite o id da sala:");
        idSala = sc.nextInt();
    }
    public void DigitarIdAluno(){
        System.out.println("Digite o id do aluno:");
        idAluno = sc.nextInt();
    }
    public void executarIdSala(){
        System.out.println("o id da sala é: "+ idSala);
    }


    public void executarIdAluno(){
        System.out.println("o id do aluno é: "+ idAluno);
    }
    
}
