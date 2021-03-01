package controller;

import controllerhelper.ConsultaPHelper;
import java.util.ArrayList;
import model.Intervalo;
import model.Participante;
import model.Salas;
import modelDAO.IntervaloDAO;
import modelDAO.ParticipanteDAO;
import modelDAO.SalasDAO;
import view.ConsultaParticipantes;
import view.Pessoa;

public class ConsultaPController {
    
    private final ConsultaParticipantes view;
    private final ConsultaPHelper helper;
    
    public ConsultaPController(ConsultaParticipantes view) {
        this.view = view;
        this.helper = new ConsultaPHelper(view);
    }
    
    public void atualizarTabela() {
        
        ParticipanteDAO participanteDAO = new ParticipanteDAO();
        ArrayList<Participante> participantes = participanteDAO.selectAll();
        
        helper.preencherTabela(participantes);
        
    }
    
    public void navegarParaConsultaPessoa(String id) {
        Pessoa consultaPessoa = new Pessoa(id);
        consultaPessoa.setVisible(true);
    }
    
    public void atualizarSala(){
        
        SalasDAO salaDAO = new SalasDAO();
        ArrayList<Salas> salas = salaDAO.selectAll();
        
        helper.preencherSalas(salas);
    }
    
    public void atualizarIntervalo() {
        
        IntervaloDAO intervaloDAO2 = new IntervaloDAO();
        ArrayList<Intervalo> intervalos2 = intervaloDAO2.selectAll();
        
        helper.preencherIntervalos(intervalos2);
    }
    
    public void cadastrar() {
        Participante participante = helper.obterModelo();
        new ParticipanteDAO().insert(participante);
        
        atualizarTabela();
        helper.limpartTela();
    }
}