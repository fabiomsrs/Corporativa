/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Resposta {
    String Conteudo;
    Calendar data;
    Usuario usuarioCriador;
    List<Like> likes;

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(Like like) {
        this.likes.add(like);
    }

    public String getConteudo() {
        return Conteudo;
    }

    public void setConteudo(String Conteudo) {
        this.Conteudo = Conteudo;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Usuario getUsuarioCriador() {
        return usuarioCriador;
    }

    public void setUsuarioCriador(Usuario usuarioCriador) {
        this.usuarioCriador = usuarioCriador;
    }
}
