package Java_criacao_app.Atividade_orientada_objetos_01.ATT_01.ATT_07;

import java.util.Scanner;

public class att_07 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        att_07_Carro carro= new  att_07_Carro();
        System.out.println("Digite o modelo do carro");
        carro.modelo= sc.nextLine();

        System.out.println("Digite a marca do carro");
        carro.marca= sc.nextLine();

        System.out.println("Digite a velocidade atual do carro");
        carro.velocidadeAtual= sc.nextDouble();
        sc.nextLine();

        System.out.println("Você deseja acelerar ou frear o carro?");
        carro.decisao= sc.nextLine();

        if (carro.decisao.equalsIgnoreCase("acelerar")){
            carro.acelerar();

        }
        else if(carro.decisao.equalsIgnoreCase("frear")){
            carro.frear();
        }
    }
}
