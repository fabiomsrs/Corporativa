/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package questao4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabrício
 */
public class Fidelidade {
    private String Classificao;
    private List<Ponto> pontos = new ArrayList<>();
    private List<Recompensa> recompensas = new ArrayList<>();

    public String getClassificao() {
        return Classificao;
    }

    public void setClassificao(String Classificao) {
        this.Classificao = Classificao;
    }

    public List<Ponto> getPontos() {
        return pontos;
    }

    public void setPontos(List<Ponto> pontos) {
        this.pontos = pontos;
    }

    public List<Recompensa> getRecompensas() {
        return recompensas;
    }

    public void setRecompensas(List<Recompensa> recompensas) {
        this.recompensas = recompensas;
    }
    
    
}
