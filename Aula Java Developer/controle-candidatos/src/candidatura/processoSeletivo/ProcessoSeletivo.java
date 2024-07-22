package candidatura.processoSeletivo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "MERCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuaTentando = !atendeu;
            if(continuaTentando){
                tentativasRealizadas++;
            }else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        }while(continuaTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVAS");
        }else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MAXIMO TENTATIVAS " + tentativasRealizadas);
        }

    }

    public static boolean atender() {
        return new Random().nextInt(3) == 1;
//
    }

    /*-------------------------------------------------------------------------------------------------------*/
    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "MERCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Imprimento a lista de candidatos informando o indice do elemento");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de nº " + (i + 1) + " é " + candidatos[i]);
        }
        System.out.println("Forma abreviada de interação for each");


        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    /*---------------------------------------------------------------------------------------------------------------------*/

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MERCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;


        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato " + candidato + " Solicitou este valor de salario %.2f\n", salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.printf("%s foi selecionado para a vaga\n", candidato);
                candidatosSelecionados++;

            } else {
                System.out.print("NÃO FOI SELECIONADO\n");
            }

            System.out.println();
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
/*--------------------------------------------------------------------------------------------------------------------*/
//    static void analizarCandidato(double salarioPretendito) {
//        double salarioBase = 2000.0;
//        if (salarioBase > salarioPretendito) {
//            System.out.println("LIGAR PARA O CANDIDATO");
//
//        } else if (salarioBase == salarioPretendito) {
//            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
//
//        } else {
//            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
//        }
//    }

