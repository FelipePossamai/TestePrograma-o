package controller;

import controllerhelper.SalasHelper;
import java.util.ArrayList;
import model.Salas;
import modelDAO.SalasDAO;
import view.ConsultaSalas;

public class SalasController {
    
    private final ConsultaSalas view;
    private final SalasHelper helper;
    
    public SalasController(ConsultaSalas view) {
        this.view = view;
        this.helper = new SalasHelper(view);
    }
    
    public void atualizarTabela() {
        
        SalasDAO salasDAO = new SalasDAO();
        ArrayList<Salas> sala = salasDAO.selectAll();
        
        helper.preencherTabela(sala);
    }
    
    public void cadastrar() {
        
        Salas sala = helper.obterModelo();
        new SalasDAO().insert(sala);
        
        atualizarTabela();
        helper.limpartTela();
    }
}
