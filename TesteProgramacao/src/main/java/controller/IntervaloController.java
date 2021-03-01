package controller;

import controllerhelper.ConsultaIntervaloHelper;
import java.util.ArrayList;
import model.Intervalo;
import modelDAO.IntervaloDAO;
import view.ConsultaCafe;

public class IntervaloController {
    
    private final ConsultaCafe view;
    private final ConsultaIntervaloHelper helper;
    
    public IntervaloController(ConsultaCafe view) {
        this.view = view;
        this.helper = new ConsultaIntervaloHelper(view);
    }
    
    public void atualizarTabela() {
        
        IntervaloDAO intervaloDAO = new IntervaloDAO();
        ArrayList<Intervalo> intervalos = intervaloDAO.selectAll();
        
        helper.preencherTabela(intervalos);
    }
    
    public void cadastrar() {
        
        Intervalo intervalo = helper.obterModelo();
        new IntervaloDAO().insert(intervalo);
        
        atualizarTabela();
        helper.limpartTela();
    }
}
