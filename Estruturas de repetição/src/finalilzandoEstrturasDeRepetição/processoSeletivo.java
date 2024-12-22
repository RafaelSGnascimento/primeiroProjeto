package finalilzandoEstrturasDeRepetição;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contraproposta!");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos!");
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Candidato 1", "Candidato 2", "Candidato 3", "Candidato 4", "Candidato 5", "Candidato 6", "Candidato 7", "Candidato 8", "Candidato 9", "Candidato 10"};
        List<String> candidatosSelecionados = new ArrayList<>();
        int contadorCandidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        System.out.println("Iniciando processo seletivo...\n");

        while (contadorCandidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou um salário de " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                candidatosSelecionados.add(candidato);
                contadorCandidatosSelecionados++;
                System.out.println("O candidato " + candidato + " foi selecionado.");
            } else {
                System.out.println("O candidato " + candidato + " não atende aos requisitos salariais.");
            }

            candidatoAtual++;
        }

        System.out.println("\nProcesso seletivo finalizado.");
        System.out.println("Total de candidatos selecionados: " + contadorCandidatosSelecionados);

        imprimirSelecionados(candidatosSelecionados);
    }

    static void imprimirSelecionados(List<String> candidatosSelecionados) {
        System.out.println("\nCandidatos Selecionados:");
        for (String candidato : candidatosSelecionados) {
            System.out.println(candidato);
        }

        System.out.println("Contactando candidatos selecionados!");
        for (String candidato : candidatosSelecionados){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 0;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            }else
                System.out.println("contato realizado com sucesso!");
        }while(continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa!");
        }else
            System.out.println("Não foi possivel realizar o contato com o candidato " + candidato + " no numero maximo de tentativas " + tentativasRealizadas + " realizadas!");
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
}
