package modelDAO;

import java.util.ArrayList;
import model.ConsultaP;

public class ConsultaPDAO {
    
    /**
     * Insere um agendamento dentro do banco de dados
     * @param consultaP exige que seja passado um objeto do tipo agendamento
     */
    public void insert(ConsultaP consultaP){
          
        if(consultaP.getId() == 0){
            consultaP.setId(proximoId());
            Banco.consultaP.add(consultaP);
        }
        
        
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param consultaP
     * @return 
     */
    public boolean update(ConsultaP consultaP){
        
        for (int i = 0; i < Banco.consultaP.size(); i++) {
            if(idSaoIguais(Banco.consultaP.get(i),consultaP)){
                Banco.consultaP.set(i, consultaP);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do agendamento passado
     * @param consultaP
     * @return 
     */
    public boolean delete(ConsultaP consultaP){
        for (ConsultaP consultaPLista : Banco.consultaP) {
            if(idSaoIguais(consultaPLista,consultaP)){
                Banco.consultaP.remove(consultaPLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os agendamentos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<ConsultaP> selectAll(){
        return Banco.consultaP;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param consultaP
     * @param consultaPAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(ConsultaP consultaP, ConsultaP consultaPAComparar) {
        return consultaP.getId() ==  consultaPAComparar.getId();
    }
    
    private int proximoId(){
        
        int maiorId = 0;
        
        for (ConsultaP consultaP : Banco.consultaP) {           
           int id = consultaP.getId();
            
            if(maiorId < id){
                maiorId = id;
            }
            
        }
        
        return maiorId + 1;
    }
    
}
