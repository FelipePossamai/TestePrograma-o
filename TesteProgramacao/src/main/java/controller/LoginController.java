package controller;

import controllerhelper.LoginHelper;
import model.Usuario;
import modelDAO.UsuarioDAO;
import view.Login;
import view.MenuPrincipal;

public class LoginController {
    
    private final Login view;
    private final LoginHelper helper;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema() {
        
        Usuario usuario = helper.obterModelo();
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorUsuarioESenha(usuario);
        
        if(usuarioAutenticado != null) {
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        } else {
            view.exibeMensagem("Usuário ou senha Inválidos");
        }
   }
}
