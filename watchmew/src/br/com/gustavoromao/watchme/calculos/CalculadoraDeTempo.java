package br.com.gustavoromao.watchme.calculos;

import br.com.gustavoromao.watchme.modelos.Filme;
import br.com.gustavoromao.watchme.modelos.Serie;
import br.com.gustavoromao.watchme.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando...: " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
