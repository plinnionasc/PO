package exemploclassearraylist;

import java.util.ArrayList;

public class RevistaCientifica<Edicao> {
    private String titulo;
    private long issn;
    private String periodicidade;
    private Edicao edicao;


    public RevistaCientifica(String titulo, long issn, String periodicidade) {
        this.titulo = titulo;
        this.issn = issn;
        this.periodicidade = periodicidade;
    }

    public void adicionaEdicao(Edicao edicao) {
        this.edicao = edicao;
    }

}

import java.util.ArrayList;

public class Main {
    public static <Edicao, Artigo> void main(String[] args) {

        ArrayList<Artigo> artigos = new ArrayList<>();

        Edicao edicao = new Edicao(1, 1, "2023-10-26", 1000);


    }
}
