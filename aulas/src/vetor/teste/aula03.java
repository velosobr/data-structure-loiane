package vetor.teste;

import vetor.Vetor;

public class aula03 {

    public static void main(String[] args) {

//        adiciona vetor com capacidade para 10 elementos
        Vetor vetor = new Vetor(10);

        try {
            vetor.adiciona("Curso");
            vetor.adiciona("Estrutura de dados");

            System.out.println("O tamanho do vetor eh: " + (vetor.getTamanho() + 1));
            System.out.println(vetor.toString());

            int elementoIgual = 2;
            System.out.println("O elemento " + elementoIgual + " eh igual a: " + vetor.buscaElemento(elementoIgual - 1));

//aula 06 - usando if em modo ternário

            String elementoExiste = "aurso";
            System.out.println("O elemento " + elementoExiste + ((vetor.verificaSeExiste(elementoExiste)) ? " existe" : " não existe"));

        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }
}
