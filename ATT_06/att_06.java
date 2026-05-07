package exercicio_orientado_objeto.ATT_06;
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
             aluno.nota= sc.nextInt();
        }

    }
}
