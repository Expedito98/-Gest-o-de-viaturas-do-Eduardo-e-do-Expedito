/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.List;

/**
 *
 * @author aluno
 */
public class Equipe {
    
      private String identEquipe;
    private List<Bombeiro> bombeiros;

    public String getIdentEquipe() {
        return identEquipe;
    }

    public void setIdentEquipe(String identEquipe) {
        this.identEquipe = identEquipe;
    }

    public List<Bombeiro> getBombeiros() {
        return bombeiros;
    }

    public void setBombeiros(List<Bombeiro> bombeiros) {
        this.bombeiros = bombeiros;
    }
  
}
