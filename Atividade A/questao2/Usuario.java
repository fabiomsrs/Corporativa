/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package questao2;

/**
 *
 * @author Fabrício
 */
public class Usuario {
    private int id;
    private String nome;
    private String passwd;
    private Autorizacao autorizacao;

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

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Autorizacao getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(Autorizacao autorizacao) {
        this.autorizacao = autorizacao;
    }
    
}
