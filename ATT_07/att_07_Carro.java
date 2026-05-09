package Java_criacao_app.Atividade_orientada_objetos_01.ATT_01.ATT_07;

public class att_07_Carro {
    public String modelo;
    public String marca;
    public double velocidadeAtual;
    public String decisao;

    void acelerar(){
        velocidadeAtual+=10;
        System.out.println("A velocidade atual será "+velocidadeAtual);

    }

    void frear(){
      velocidadeAtual-=10;
        System.out.println("A velocidade atual será "+velocidadeAtual);
    }
}



