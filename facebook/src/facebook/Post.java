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
public class Post {
    Usuario usuarioCriador;
    Calendar data;
    String conteudo;
    List<Like> likes;

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(Like like) {
        this.likes.add(like);
    }
    List<Comentario> comentarios;        

    public Usuario getUsuarioCriador() {
        return usuarioCriador;
    }

    public void setUsuarioCriador(Usuario usuarioCriador) {
        this.usuarioCriador = usuarioCriador;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(Comentario comentario) {
        
        this.comentarios.add(comentario);
    }

    
    
}
