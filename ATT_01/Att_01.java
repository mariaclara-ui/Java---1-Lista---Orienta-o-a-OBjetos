package Java_criacao_app.Atividade_orientada_objetos_01.ATT_01.ATT_01;

import java.util.Scanner;
public class Att_01 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Att_01_Lampada lampada = new Att_01_Lampada();
        System.out.println("A lapada está ligada?");

        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("sim")){
            System.out.println("Lampada acessa");
        }
        else {
            System.out.println("Lampada desligada");
        }
    }
}
