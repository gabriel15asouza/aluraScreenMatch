/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alurascreenmatch.modelos;

/**
 *
 * @author gabal
 */
public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    public Serie(int temporadas, int episodiosPorTemporada, boolean ativa, int minutosPorEpisodio, String nome, int anoDeLancamento, boolean incluidoNoPlano, double somaDasAvaliacoes, int totalDeAvaliacoes, int duracaoEmMinutos) {
        super(nome, anoDeLancamento, incluidoNoPlano, somaDasAvaliacoes, totalDeAvaliacoes, duracaoEmMinutos);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.ativa = ativa;
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
    
    @Override
    public int getDuracaoEmMinutos(){
        return temporadas*episodiosPorTemporada*minutosPorEpisodio;
    }
    
}
