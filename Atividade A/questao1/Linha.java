/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package questao1;

import java.util.List;

/**
 *
 * @author Fabrício
 */
public class Linha {
    private String nome;
    private List<Onibus> listaOnibus;
    private List<Parada> paradas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Onibus> getListaOnibus() {
        return listaOnibus;
    }

    public void setListaOnibus(List<Onibus> listaOnibus) {
        this.listaOnibus = listaOnibus;
    }

    public List<Parada> getParadas() {
        return paradas;
    }

    public void setParadas(List<Parada> paradas) {
        this.paradas = paradas;
    }
    
    
}
