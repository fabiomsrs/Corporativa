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
    private ClassificacaoLike classificacao;
    private Usuario usuarioCriador;

    public ClassificacaoLike getClassificao() {
        return classificacao;
    }

    public void setClassificao(ClassificacaoLike classificacao) {
        this.classificacao = classificacao;
    }

    public Usuario getUsuarioCriador() {
        return usuarioCriador;
    }

    public void setUsuarioCriador(Usuario usuarioCriador) {
        this.usuarioCriador = usuarioCriador;
    }
}
