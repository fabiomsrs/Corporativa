/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facebook;

/**
 *
 * @author Fabrício
 */
public class Like {
    private String classificao;
    private Usuario usuarioCriador;

    public String getClassificao() {
        return classificao;
    }

    public void setClassificao(String classificao) {
        this.classificao = classificao;
    }

    public Usuario getUsuarioCriador() {
        return usuarioCriador;
    }

    public void setUsuarioCriador(Usuario usuarioCriador) {
        this.usuarioCriador = usuarioCriador;
    }
}
