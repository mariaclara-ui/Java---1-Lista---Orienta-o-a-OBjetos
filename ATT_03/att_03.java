package exercicio_orientado_objeto.ATT_03;

import java.util.Scanner;
public class att_03 {
    static void main() {
        Scanner sc=new Scanner(System.in);

        att_03_Retangulo retangulo =new att_03_Retangulo();
        System.out.println("Digite a base do retangulo");
        retangulo.base= sc.nextDouble();

        System.out.println("Digite a altura do retangulo");
        retangulo.altura= sc.nextDouble();

        retangulo.calcularArea();
        System.out.println("A área do retangulo será "+retangulo.area);
    }
}
