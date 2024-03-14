import java.util.Scanner;
public class Aluno {
    Scanner sc = new Scanner(System.in);
    int id;
    String nome;

    String nomeMae;

    String enderecoCompleto;
    int telefone;




    public void DigitarId(){
        System.out.println("Digite o id do aluno:");
        id = sc.nextInt();
    }

    public void DigitarNome(){
        System.out.println("Digite o nome do aluno:");
        nome = sc.next();
    }

    public void DigitarnomeMae(){
        System.out.println("Digite o nome da mae ");
        nomeMae= sc.next();
    }

    public void DigitarenderecoCompleto(){
        System.out.println("Digite o endereço");
        enderecoCompleto = sc.next();
    }
    public void DigitarTelefone(){
        System.out.println("Digite o telefone ");
        telefone = sc.nextInt();
    }

    public void exibirId(){
        System.out.println("O id do aluno é: "+ id );

    }

    public void exibirNome(){
        System.out.println("O id do nome é: "+ nome  );

    }
    public void exibirNomeMae(){
        System.out.println("O nome da mãe é: "+ nomeMae  );

    }
    public void exibirEndereco(){
        System.out.println("O seu endereço é: "+  enderecoCompleto );

    }
    public void exibirTelefone(){
        System.out.println("O seu telefone é: "+ telefone);
    }

}
