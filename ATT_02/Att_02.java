package Java_criacao_app.Atividade_orientada_objetos_01.ATT_01.ATT_02;
import java.util.Scanner;
public class Att_02 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Att_02_Cachorro cachorro = new Att_02_Cachorro();
        System.out.println("Digite o nome do cachorro");
        cachorro.nome= sc.nextLine();

        System.out.println("Digite a raça do cachorro");
        cachorro.raca=sc.nextLine();

        System.out.println("Digite a idade do cachorro");
        cachorro.idade=sc.nextInt();

        cachorro.latir();
    }
}
