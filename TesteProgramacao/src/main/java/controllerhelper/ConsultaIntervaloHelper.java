package controllerhelper;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Intervalo;
import view.ConsultaCafe;

public class ConsultaIntervaloHelper {
    
    private final ConsultaCafe view;
    
    public ConsultaIntervaloHelper(ConsultaCafe view) {
    this.view = view;
    }
    
    public void preencherTabela(ArrayList<Intervalo> intervalos) {
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableCafe().getModel();
        tableModel.setNumRows(0);
        
        for (Intervalo intervalo : intervalos) {
            
            tableModel.addRow(new Object[]{
            
                intervalo.getId(),
                intervalo.getNome()
            });
        }
    }
    
    public void preencherIntervalos(ArrayList<Intervalo> intervalos2) {
        
    
                
    }

    public Intervalo obterModelo() {
        
        String sala = view.getTextCafe().getText();
        
        Intervalo intervalo = new Intervalo(0, sala);
        return intervalo;
    }

    public void limpartTela() {
        
        view.getTextCafe().setText("");
    }
}
