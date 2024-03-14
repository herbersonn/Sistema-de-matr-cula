public class MatriculaAluno {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        System.out.println("Sobre Aluno");
        aluno.DigitarId();
        aluno.DigitarnomeMae();
        aluno.DigitarenderecoCompleto();
        aluno.DigitarTelefone();


        aluno.exibirId();
        aluno.exibirNomeMae();
        aluno.exibirEndereco();
        aluno.exibirTelefone();

        System.out.println(" ");

        Professor pedro = new Professor();
        System.out.println("Sobre Professor");
        pedro.DigitarId();
        pedro.DigitarNomeCompleto();
        pedro.DigitarEndereco();
        pedro.DigitarGraduacao();

        pedro.exibirId();
        pedro.exibirNomeCompleto();
        pedro.exibirEndereco();
        pedro.exibirGraduacao();

        System.out.println(" ");

        SalaAula segundoA = new SalaAula();
        System.out.println("Sobre SalaAula");
        segundoA.DigitarIdSala();
        segundoA.DigitarIdAluno();

        segundoA.executarIdSala();
        segundoA.executarIdAluno();

        System.out.println(" ");

        Matricula matri1 = new Matricula();
        System.out.println("Sobre Matrí4564cula");
        matri1.DigitarId();
        matri1.DigitarIdAluno();
        matri1.DigitarIdSala();
        matri1.DigitarDataHora();

        matri1.executarId();
        matri1.executarIdAluno();
        matri1.executarIdSala();
        matri1.executarDataHora();

        
    }
}
