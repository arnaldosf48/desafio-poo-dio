import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        BootCamp bootCampo = new BootCamp();
        bootCampo.setNome("Bootcamp java developer");
        bootCampo.setDescricao("Descricao do bootcamp java developper");
        bootCampo.getConteudos().add(curso1);
        bootCampo.getConteudos().add(curso2);
        bootCampo.getConteudos().add(mentoria1);

        Dev camila = new Dev();
        camila.setNome("Camila");
        camila.inscreverBootcamp(bootCampo);

        System.out.println("Conteudos inscritos: " + camila.getConteudosInscritos());
        camila.progredir();
        System.out.println("Conteudos Concluidos: " + camila.getConteudosConcluidos());
        System.out.println("Conteudos inscritos: " + camila.getConteudosInscritos());
        System.out.println("XP de: " + camila.getNome() + " xp: " + camila.calcularTotalXP() );

        Dev arnaldo = new Dev();
        arnaldo.setNome("Arnaldo");

        arnaldo.inscreverBootcamp(bootCampo);
        System.out.println("Conteudos inscritos: " + arnaldo.getConteudosInscritos());
        arnaldo.progredir();
        arnaldo.progredir();
        arnaldo.progredir();
        System.out.println("Conteudos Concluidos: " + arnaldo.getConteudosConcluidos());
        System.out.println("Conteudos inscritos: " + arnaldo.getConteudosInscritos());
        System.out.println("XP de: " + arnaldo.getNome() + " xp: " + arnaldo.calcularTotalXP() );






    }

}