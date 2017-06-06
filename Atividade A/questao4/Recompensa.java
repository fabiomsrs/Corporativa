/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package questao4;

/**
 *
 * @author Fabrício
 */
public class Recompensa {
    private boolean resgatada;
    private String nome;
    private String descricao;

    public boolean isResgatada() {
        return resgatada;
    }

    public void setResgatada(boolean resgatada) {
        this.resgatada = resgatada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
