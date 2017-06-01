/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;

import java.util.List;

/**
 *
 * @author aluno
 */
public class Usuario {
    String nome;
    String email;
    List<Usuario> amizades;
    LinhaDoTempo linha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Usuario> getAmizades() {
        return amizades;
    }

    public void setAmizades(List<Usuario> amizades) {
        this.amizades = amizades;
    }

    public LinhaDoTempo getLinha() {
        return linha;
    }

    public void setLinha(LinhaDoTempo linha) {
        this.linha = linha;
    }
    
    //acoes usuarios
    
    public void criarPost(String conteudo){
        Post post = new Post();
        post.setUsuarioCriador(this);
        post.setConteudo(conteudo);
    }
    
    public void solicitarAmizade(Usuario usuario){
        this.amizades.add(usuario);
    }
    
    public void comentar(Post post, Comentario comentario){
        post.setComentarios(comentario);
    }
    
    public void responderComentario(Comentario comentario, Resposta resposta){
        comentario.setRespostas(resposta);
    }
    
    public void darLike(Post liked){
        Like like = new Like();
        like.setUsuarioCriador(this);
        liked.setLikes(like);
    }
    
    public void darLike(Comentario liked){
        Like like = new Like();
        like.setUsuarioCriador(this);
        liked.setLikes(like);
    }
    public void darLike(Resposta liked){
        Like like = new Like();
        like.setUsuarioCriador(this);
        liked.setLikes(like);
    }
    
}
