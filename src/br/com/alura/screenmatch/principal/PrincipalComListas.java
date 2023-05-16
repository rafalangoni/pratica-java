package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);

        Filme filmeDoRafael = new Filme("Coração Valente", 1995);
        filmeDoRafael.avalia(10);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(7);

        Serie lost = new Serie("Lost", 2000);
        lost.avalia(8);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoRafael);
        lista.add(lost);

        lista.forEach(item -> {
            if (item instanceof Filme filme) {
                System.out.println("Titulo: " + item.getNome());
                System.out.println("Classificação: " + filme.getClassificacao());
                System.out.println("=======");
            }
            System.out.println("Titulo: " + item.getNome());
        });

//        for (Titulo item: lista) {
//            System.out.println("Título: " + item.getNome());
//        }

    }
}
