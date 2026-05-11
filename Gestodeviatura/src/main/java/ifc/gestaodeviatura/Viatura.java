/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author aluno
 */
public class Viatura {

    private String identificacao;
    private String tipo;
    private String prefixo;
    private String placa;
    private String modelo;
    private String status;
    private String anoDeFabricacao;
    private int quilometragemAtual;
    private String localizacao;
    private boolean identPlacaJaCadast;

    

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String _identificacao) {
        this.identificacao = _identificacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String _tipo) {
        this.tipo = _tipo;

    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String _prefixo) {
        this.prefixo = _prefixo;

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String _placa) {
        this.placa = _placa;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String _modelo) {
        this.modelo = _modelo;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String _status) {
        this.status = _status;

    }

    public String getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(String _anoDeFabricacao) {
        this.anoDeFabricacao = _anoDeFabricacao;

    }

    public int getQuilometragemAtual() {
        return quilometragemAtual;
    }

    public void setQuilometragemAtual(int _quilometragemAtual) {
        this.quilometragemAtual = _quilometragemAtual;

    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String _localizacao) {
        this.localizacao = _localizacao;

    }

    public boolean identPlacaJaCadast() {
        if (identPlacaJaCadast == true) {
            return true;
        } else {
            return false;
        }
    }
    
     
              
    public void cadatrarViatura(){
    }
    public void conultarViatura(){
    }
    public void atuaçizarViatura(){
    }
   public void excluirViatura(){
   }  
}
