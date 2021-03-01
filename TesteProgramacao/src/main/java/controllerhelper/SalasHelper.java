package controllerhelper;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import view.ConsultaSalas;
import model.Salas;

public class SalasHelper {
    
    private final ConsultaSalas view;
    
    public SalasHelper(ConsultaSalas view) {
    this.view = view;
    }

    public void preencherTabela(ArrayList<Salas> sala) {
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableConsultaS().getModel();
        tableModel.setNumRows(0);
        
        for (Salas salas : sala) {
           
            tableModel.addRow(new Object[]{
                
                salas.getId(),
                salas.getNome(),
                salas.getLotacao()
            });
        }
    }
    
    public Salas obterModelo() {
        
        
        String sala = view.getTextSala().getText();
        String lotacao = view.getTextLotacao().getText();
        
        Salas salas = new Salas(0, sala, Float.parseFloat(lotacao));
        return salas;
    }
    
    public void limpartTela() {
        view.getTextSala().setText("");
        view.getTextLotacao().setText("");
    }
}