package controllerhelper;

import model.Usuario;
import view.Login;

public class LoginHelper {
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo() {
        
        String usuario = view.getTextUsuario().getText();
        String senha = view.getPassSenha().getText();
        Usuario modelo = new Usuario(0, usuario, senha);
        return modelo;
    }
    
    public void setarModelo(Usuario modelo) {
        String usuario = modelo.getUsuario();
        String senha = modelo.getSenha();
        
        view.getTextUsuario().setText(usuario);
        view.getPassSenha().setText(senha);
    }
    
    public void limparTela() {
        view.getTextUsuario().setText("");
        view.getPassSenha().setText("");
    }
}
