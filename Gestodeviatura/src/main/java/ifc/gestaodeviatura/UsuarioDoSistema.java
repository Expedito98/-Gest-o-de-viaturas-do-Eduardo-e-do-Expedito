/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.gestaodeviatura;

/**
 *
 * @author aluno
 */
public class UsuarioDoSistema {

    private String identUsuario;
    private String login;
    private String senha;
    private String perfil;

    public String getIdentUsuario() {
        return identUsuario;
    }

    public void setIdentUsuario(String _identUsuario) {
        this.identUsuario = _identUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String _login) {
        this.login = _login;
    }

    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String _senha){
        this.senha = _senha;
        
    }
    
    public String getperfil(){
        return perfil;
    }
    
    public void setPerfil(String _perfil){
            this.perfil = _perfil;
        
    }
    
    
    
}
