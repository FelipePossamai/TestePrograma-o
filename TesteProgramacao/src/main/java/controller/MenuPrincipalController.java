package controller;

import view.ConsultaParticipantes;
import view.ConsultaSalas;
import view.ConsultaCafe;
import view.MenuPrincipal;

public class MenuPrincipalController {

    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void navegarParaConsultaParticipantes() {
        
        ConsultaParticipantes consultaParticipante = new ConsultaParticipantes();
        consultaParticipante.setVisible(true);
        
    }
    public void navegarParaConsultaSalas() {
        
        ConsultaSalas consultaS = new ConsultaSalas();
        consultaS.setVisible(true);
    }
    
    public void navegarParaConsultaIntervalos() {
        
        ConsultaCafe espacoCafe = new ConsultaCafe();
        espacoCafe.setVisible(true);
    }
}
