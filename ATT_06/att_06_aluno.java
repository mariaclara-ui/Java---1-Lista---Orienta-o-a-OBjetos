package Java_criacao_app.Atividade_orientada_objetos_01.ATT_01.ATT_06;
import java.util.ArrayList;
public class att_06_aluno {
    public String nome;
    public int matricula;
    double nota;
    double media=0;
    ArrayList<Double> notas = new ArrayList<>();


    void calcularMedia() {
        double soma=0;
      for (double nota : notas){
          soma += nota;
      }
       media=soma/notas.size();
    }

    void verificarSituacao() {
        if (media>=7){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}