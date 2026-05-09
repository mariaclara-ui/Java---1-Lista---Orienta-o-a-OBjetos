package Java_criacao_app.Atividade_orientada_objetos_01.ATT_01.ATT_08;

import java.util.Scanner;

public class att_08 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        att_08_Funcionario funcionario = new att_08_Funcionario();
        System.out.println("Digite o seu primeiro nome");
        funcionario.nome= sc.nextLine();

        System.out.println("Digite o seu sobre nome");
        funcionario.sobrenome=sc.nextLine();

        funcionario.darAumento(10);
    }
}
