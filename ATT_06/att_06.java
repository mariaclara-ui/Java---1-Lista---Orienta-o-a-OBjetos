package Java_criacao_app.Atividade_orientada_objetos_01.ATT_01.ATT_06;
import java.util.Scanner;
public class att_06 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        att_06_aluno aluno=new att_06_aluno();
        System.out.println("Digite o nome do aluno ");
        aluno.nome=sc.nextLine();

        System.out.println("Digite o número da matricula");
        aluno.matricula=sc.nextInt();

        for (int contagem=0; contagem< 3; contagem++) {
            System.out.println("Digite as notas");
            aluno.nota= sc.nextDouble();
            aluno.notas.add(aluno.nota);
        }
        aluno.calcularMedia();

        System.out.println("A média das notas será "+aluno.media);

        aluno.verificarSituacao();

    }
}
