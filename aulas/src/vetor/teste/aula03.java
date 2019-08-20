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

            int i = 2;

            System.out.println("O elemento "+ i +" eh igual a: "+vetor.buscaElemento(i-1));

        } catch (Exception e) {

            System.out.println(e.getCause());
        }



    }
}
