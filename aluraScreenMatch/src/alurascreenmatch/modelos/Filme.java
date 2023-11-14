/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alurascreenmatch.modelos;

/**
 *
 * @author gabal
 */
public class Filme extends Titulo {
    private String diretor;

    public Filme(String diretor, String nome, int anoDeLancamento, boolean incluidoNoPlano, double somaDasAvaliacoes, int totalDeAvaliacoes, int duracaoEmMinutos) {
        super(nome, anoDeLancamento, incluidoNoPlano, somaDasAvaliacoes, totalDeAvaliacoes, duracaoEmMinutos);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
   
}
