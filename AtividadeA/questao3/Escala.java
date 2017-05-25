/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questao3;

import java.util.List;

/**
 *
 * @author Fabrício
 */
public class Escala {
    private String nome;
    private List<Aeroporto> aeroportos;    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aeroporto> getAeroportos() {
        return aeroportos;
    }

    public void setAeroportos(List<Aeroporto> aeroportos) {
        this.aeroportos = aeroportos;
    }
}
