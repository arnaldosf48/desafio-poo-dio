import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descricao do curso");
        curso1.setCargoHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javaScript");
        curso2.setDescricao("Descricao do curso");
        curso2.setCargoHoraria(10);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria do java");
        mentoria1.setDescricao(" descricao mentoria");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);


    }
}