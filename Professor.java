import java.util.Scanner;
public class Professor {
    Scanner sc = new Scanner(System.in);
    int id;
    String nomeCompleto;
    String endereco;
    String graduacao;

    public void DigitarId(){
        System.out.println("Digite seu id: ");
        id = sc.nextInt();

    }
    public void DigitarNomeCompleto(){
        System.out.println("Digite seu nome completo: ");
        nomeCompleto = sc.next();
    }
    public void DigitarEndereco(){
        System.out.println("Digite o seu endereço: ");
        endereco = sc.next();
    }
    public void DigitarGraduacao(){
        System.out.println("Digite s sua graduação: ");
        graduacao = sc.next();
    }

    public void exibirId(){
        System.out.println("O seu id é: "+ id);
    }
    public void exibirNomeCompleto(){
        System.out.println("Seu nome completo é: "+ nomeCompleto);
    }
    public void exibirEndereco(){
        System.out.println("Seu endereço é: "+ endereco);
    }
    public void exibirGraduacao(){
        System.out.println("Sua graduação é: "+ graduacao);
    }
}
