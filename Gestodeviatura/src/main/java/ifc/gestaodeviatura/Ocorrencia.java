/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.gestaodeviatura;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Ocorrencia {

    private String identOcorrencia;
    private String tipo;
    private Date data;
    private double hora;
    private String local;
    private String status;
    private String descricao;
    private String sinistro;
    private String propriedade;
    private boolean viaturaSemOcorrencia;
    
    public String getIdentOcorrencia() {
        return identOcorrencia;
    }

    public void setIdentOcorrencia(String _identOcorrencia) {
        this.identOcorrencia = _identOcorrencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String _tipo) {
        this.tipo = _tipo;

    }

    public Date getData() {
        return data;
    }

    public void setData(Date _data) {
        this.data = _data;
        
    }
    
     public double getHora() {
        return hora;
    }

    public void setHora(double _hora) {
        this.hora = _hora;

    }
    
    public String getLocal() {
        return local;
    }

    public void setLocal(String _local) {
        this.local = _local;

    }
    
      public String getStatus() {
        return status;
    }

    public void setStatus(String _status) {
        this.status = _status;

    }
    
     public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String _descricao) {
        this.descricao = _descricao;

    }
    
     public String getSinistro() {
        return sinistro;
    }

    public void setSinistro(String _sinistro) {
        this.sinistro = _sinistro;

    }
    
     public String getPropriedade() {
        return propriedade;
    }

    public void setPropriedade(String _propriedade) {
        this.propriedade = _propriedade;

    }
    
    
    
      public boolean viaturaSemOcorrencia() {
        if (viaturaSemOcorrencia == true) {
            return true;
        } else {
            return false;
        }
    }

}


