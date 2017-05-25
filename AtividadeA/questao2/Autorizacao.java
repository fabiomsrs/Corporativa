/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package questao2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabrício
 */
public class Autorizacao {
    private String classificacao;
    private List<Permissao> permissoes = new ArrayList<>();

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public List<Permissao> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<Permissao> permissoes) {
        this.permissoes = permissoes;
    }
    
}
