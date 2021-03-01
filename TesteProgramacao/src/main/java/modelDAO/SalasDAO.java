package modelDAO;

import java.util.ArrayList;
import model.Salas;

public class SalasDAO {
    
    /**
     * Insere um agendamento dentro do banco de dados
     * @param sala exige que seja passado um objeto do tipo agendamento
     */
    public void insert(Salas sala){
          
        if(sala.getId() == 0){
            sala.setId(proximoId());
            Banco.salas.add(sala);
        }
        
        
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param sala
     * @return 
     */
    public boolean update(Salas sala){
        
        for (int i = 0; i < Banco.salas.size(); i++) {
            if(idSaoIguais(Banco.salas.get(i),sala)){
                Banco.salas.set(i, sala);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do agendamento passado
     * @param sala
     * @return 
     */
    public boolean delete(Salas sala){
        for (Salas salasLista : Banco.salas) {
            if(idSaoIguais(salasLista,sala)){
                Banco.salas.remove(salasLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os agendamentos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Salas> selectAll(){
        return Banco.salas;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param sala
     * @param salaAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Salas sala, Salas salaAComparar) {
        return sala.getId() ==  salaAComparar.getId();
    }
    
    private int proximoId(){
        
        int maiorId = 0;
        
        for (Salas sala : Banco.salas) {           
           int id = sala.getId();
            
            if(maiorId < id){
                maiorId = id;
            }
            
        }
        
        return maiorId + 1;
    }
}
