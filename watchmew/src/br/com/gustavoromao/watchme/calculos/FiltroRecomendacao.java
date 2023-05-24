package br.com.gustavoromao.watchme.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Todo mundo está adorando esse!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Bastante gente curte!");
        } else {
            System.out.println("Coloque para assistir depois!");
        }
    }
}
