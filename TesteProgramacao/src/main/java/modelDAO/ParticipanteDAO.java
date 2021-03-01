package modelDAO;

import java.util.ArrayList;
import model.Participante;

public class ParticipanteDAO {
    
    /**
     * Insere um agendamento dentro do banco de dados
     * @param participante exige que seja passado um objeto do tipo agendamento
     */
    public void insert(Participante participante){
          
        if(participante.getId() == 0){
            participante.setId(proximoId());
            Banco.participante.add(participante);
        }
        
        
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param participante
     * @return 
     */
    public boolean update(Participante participante){
        
        for (int i = 0; i < Banco.participante.size(); i++) {
            if(idSaoIguais(Banco.participante.get(i),participante)){
                Banco.participante.set(i, participante);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do agendamento passado
     * @param participante
     * @return 
     */
    public boolean delete(Participante participante){
        for (Participante participanteLista : Banco.participante) {
            if(idSaoIguais(participanteLista,participante)){
                Banco.participante.remove(participanteLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os agendamentos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Participante> selectAll(){
        return Banco.participante;
    }
    
    public Participante selectById(String id) {
        for (Participante participante : Banco.participante) {
            if (participante.id == Integer.parseInt(id)) {
                return participante;
            }
        }
        return null;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param participante
     * @param participanteAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Participante participante, Participante participanteAComparar) {
        return participante.getId() ==  participanteAComparar.getId();
    }
    
    private int proximoId(){
        
        int maiorId = 0;
        
        for (Participante participante : Banco.participante) {           
           int id = participante.getId();
            
            if(maiorId < id){
                maiorId = id;
            }
            
        }
        
        return maiorId + 1;
    } 
}
