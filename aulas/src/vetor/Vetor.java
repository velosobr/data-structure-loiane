package vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = -1;
    }

    public void adiciona(String valor) throws Exception {
        if (tamanho < elementos.length) {
            elementos[tamanho + 1] = valor;
            tamanho++;
        } else throw new Exception("vetor já cheio");
    }

    public String buscaElemento(int pos) {
        if (!(pos >= 0 && pos <= tamanho)) {
            throw new IllegalArgumentException("posicao inválida");

        } return elementos[pos];
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public String[] getElementos() {
        return this.elementos;
    }

    //  aula 04;
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho]);
        }
        s.append("]");
        return s.toString();
    }
}