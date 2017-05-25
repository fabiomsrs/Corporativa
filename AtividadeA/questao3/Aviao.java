/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questao3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabrício
 */
public class Aviao {
    
    private int id;
    private int capacidade;
    private List<Usuario> usuarios = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public boolean addUsuario(Usuario usuario){
        if(this.capacidade <= this.usuarios.size())
            this.usuarios.add(usuario);
        else
            return false;
        
        return true;
    }
}
    

