package Java_criacao_app.Atividade_orientada_objetos_01.ATT_01.ATT_08;

public class att_08_Funcionario {
    public String nome;
    public String sobrenome;
    public double salarioMensal = 2000;
    public double salarioatual;
    void darAumento(double porcentagem){

        salarioatual = salarioMensal + (salarioMensal*10/100);
        System.out.println("O salário com o aumento será de "+salarioatual);
    }

}
