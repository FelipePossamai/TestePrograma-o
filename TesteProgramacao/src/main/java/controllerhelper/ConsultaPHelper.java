package controllerhelper;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Intervalo;
import model.Participante;
import model.Salas;
import view.ConsultaParticipantes;

public class ConsultaPHelper {
    
    private final ConsultaParticipantes view;
    
    public ConsultaPHelper(ConsultaParticipantes view) {
    this.view = view;
    }
    
    public void preencherTabela(ArrayList<Participante> participantes) {
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableConsultaP().getModel();
        tableModel.setNumRows(0);
        
        for (Participante participante : participantes) {
            
            tableModel.addRow(new Object[]{
             
                participante.getId(),
                participante.getNome(),
                participante.getSobrenome(),
                participante.getSalas().get(0).getNome(),
                participante.getIntervalos().get(0).getNome(),
                participante.getSalas().get(1).getNome(),
                participante.getIntervalos().get(1).getNome()
            });
            
        }
    } 

    public void preencherSalas(ArrayList<Salas> salas) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getComboBoxEtapa1().getModel();
        DefaultComboBoxModel comboBoxModel2 = (DefaultComboBoxModel) view.getComboBoxEtapa2().getModel();
        
        for (Salas sala : salas) {
            
            comboBoxModel.addElement(sala);
            comboBoxModel2.addElement(sala);
            
        }
    
    }

    public void preencherIntervalos(ArrayList<Intervalo> intervalos2) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getComboBoxIntervalo1().getModel();
        DefaultComboBoxModel comboBoxModel2 = (DefaultComboBoxModel) view.getComboBoxIntervalo2().getModel();
        
        for (Intervalo intervalo : intervalos2) {
            
            comboBoxModel.addElement(intervalo);
            comboBoxModel2.addElement(intervalo);
            
        }
        
    }
    
    public Salas obterSala1() {
        return (Salas) view.getComboBoxEtapa1().getSelectedItem();
    }

    public Salas obterSala2() {
        return (Salas) view.getComboBoxEtapa2().getSelectedItem();
    }
    
    public Intervalo obterIntervalo1() {
        return (Intervalo) view.getComboBoxIntervalo1().getSelectedItem();
    }
    
    public Intervalo obterIntervalo2() {
        return (Intervalo) view.getComboBoxIntervalo2().getSelectedItem();
    }
    
    public Participante obterModelo() {
       
        String nome =  view.getTextNome().getText();
        String sobrenome = view.getTextSobrenome().getText();
        Salas sala1 = obterSala1();
        Intervalo intervalo1 = obterIntervalo1();
        Salas sala2 = obterSala2();
        Intervalo intervalo2 = obterIntervalo2();
        ArrayList<Salas> salas = new ArrayList<>();
        salas.add(sala1);
        salas.add(sala2);
        ArrayList<Intervalo> intervalos = new ArrayList<>();
        intervalos.add(intervalo1);
        intervalos.add(intervalo2);
        
        Participante participante = new Participante(0, nome, sobrenome, salas, intervalos);
            
        return participante;
    }
    
    public void limpartTela() {
        view.getTextNome().setText("");
        view.getTextSobrenome().setText("");
    }
}