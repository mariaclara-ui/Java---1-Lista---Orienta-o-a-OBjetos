package exercicio_orientado_objeto.ATT_05;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaBancaria Aplicativo = new ContaBancaria();

        System.out.println("Digite o nome do titular:");
        Aplicativo.titular = sc.nextLine();


        System.out.println("Digite o saldo inicial:");
        Aplicativo.saldo = sc.nextDouble();
        Aplicativo.Decisao = sc.nextLine();


        System.out.println("Deseja sacar ou depositar?");
        Aplicativo.Decisao = sc.nextLine();

        if (Aplicativo.Decisao.equalsIgnoreCase("depositar")) {

            System.out.println("Digite o valor para depósito:");
            double valor = sc.nextDouble();

            Aplicativo.depositar(valor);

        } else if (Aplicativo.Decisao.equalsIgnoreCase("sacar")) {

            System.out.println("Digite o valor para saque:");
            double valor = sc.nextDouble();

            Aplicativo.sacar(valor);

        } else {
            System.out.println("Opção inválida.");
        }

        System.out.println("Titular: " + Aplicativo.titular);
        System.out.println("Saldo final: R$ " + Aplicativo.saldo);
    }
}


