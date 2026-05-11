package exercicio_orientado_objeto.ATT_09.entities;


public class Agenda {

    Contato[] contato = new Contato[5];

    public  void AdicionarContatos(){
        contato[0] = new Contato();
        contato[0].nome="Maria";

        contato[1] = new Contato();
        contato[1].nome="Emilly";

        contato[2] = new Contato();
        contato[2].nome="Yasmin";

        contato[3] = new Contato();
        contato[3].nome="Katarina";

        contato[4] = new Contato();
        contato[4].nome="Luana";
    }
    public void ListarContato(){
        for (int contagem=0;contagem<contato.length;contagem++){

            System.out.println(contato[contagem].nome);

        }
    }
}

