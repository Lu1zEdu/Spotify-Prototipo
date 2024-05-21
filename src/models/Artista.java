package models;

public class Artista extends Usuario {
    private String nome;
    private String genero;
    private int anoLancamento;

    public Artista(String nome, String genero, int anoLancamento) {
        this.nome = nome;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    public Artista(String login, String senha, String nome, String genero, int anoLancamento) {
        super(login, senha);
        this.nome = nome;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", anoLancamento=" + anoLancamento +
                "} " + super.toString();
    }
}
