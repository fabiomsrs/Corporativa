/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;

/**
 *
 * @author SEMF
 */
public enum ClassificacaoLike {
    LIKE ("gostei"),
    LOVE ("adorei"),
    HAHA ("sorriso"),
    WOW ("surpreso"),
    SAD ("triste"),
    ANGRY ("raiva");
    
    private String classificacao;
    
    ClassificacaoLike(String classificacao){
        this.classificacao = classificacao;
    }
    
    public String getClassificacaoLike(){
        return this.classificacao;
    }
    
}
