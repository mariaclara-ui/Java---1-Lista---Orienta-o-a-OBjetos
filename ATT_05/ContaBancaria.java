package exercicio_orientado_objeto.ATT_05;

public class ContaBancaria { public String titular;
    public Double saldo;
    public String Decisao;


    void depositar(double valor) {
        saldo += valor;
        System.out.println("Qual valor deseja depositar?" + valor);
    }

    void sacar ( double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado: R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente");

        }
    }

}


