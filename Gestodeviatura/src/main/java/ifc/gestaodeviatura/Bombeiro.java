/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.gestaodeviatura;

/**
 *
 * @author aluno
 */
public class Bombeiro extends Equipe{
    
    private String identBombeiro;
    private String nome;
    private String nomeDeGuerra;
    private String patente;
    private int matricula;
    private String contato;

    public String getIdentBombeiro() {
        return identBombeiro;
    }

    public void setIdentBombeiro(String identBombeiro) {
        this.identBombeiro = identBombeiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDeGuerra() {
        return nomeDeGuerra;
    }

    public void setNomeDeGuerra(String nomeDeGuerra) {
        this.nomeDeGuerra = nomeDeGuerra;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

}
