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
public class Usuario {
    private int id;
    private String nome;
    private Fidelidade fidelidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fidelidade getFidelidade() {
        return fidelidade;
    }

    public void setFidelidade(Fidelidade fidelidade) {
        this.fidelidade = fidelidade;
    }
}
