package exercicio_orientado_objeto.ATT_09.applications;

import exercicio_orientado_objeto.ATT_09.entities.Agenda;
public class att_09 {

   static void main(String[] args) {

        Agenda agenda = new Agenda();

        agenda.AdicionarContatos();

       System.out.println("Os nomes dos contatos serão:");
        agenda.ListarContato();

    }
}