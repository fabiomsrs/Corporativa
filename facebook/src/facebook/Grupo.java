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
public class Grupo {
    List<Usuario> usuarios;
    LinhaDoTempo linha;

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public LinhaDoTempo getLinha() {
        return linha;
    }

    public void setLinha(LinhaDoTempo linha) {
        this.linha = linha;
    }
    
}
