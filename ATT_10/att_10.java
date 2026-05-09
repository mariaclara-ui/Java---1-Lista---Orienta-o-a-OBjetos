package Java_criacao_app.Atividade_orientada_objetos_01.ATT_01.ATT_10;

import java.util.Scanner;

public class att_10 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        att_10_termometro termometro = new att_10_termometro();
        System.out.println("Digite a temperatura em celsius");
        termometro.tempeCelcios= sc.nextDouble();

        termometro.ConvertendoFahrenheit();

        termometro.ConvertendoKelvin();

    }
}
