/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;

/**
 *
 * @author aluno
 */
public class Perfil {
    private Object usuario;// esse objeto pode ser um grupo ou um usuario
    private LinhaDoTempo linha;
    
    public Object getUsuario() {
        return usuario;
    }

    public void setUsuario(Object usuario) {
        this.usuario = usuario;
    }

    public LinhaDoTempo getLinha() {
        return linha;
    }

    public void setLinha(LinhaDoTempo linha) {
        this.linha = linha;
    }
}
