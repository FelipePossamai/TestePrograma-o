/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.util.ArrayList;
import model.Intervalo;

/**
 *
 * @author Felipe
 */
public class IntervaloDAO {
    
    /**
     * Insere um agendamento dentro do banco de dados
     * @param intervalo exige que seja passado um objeto do tipo agendamento
     */
    public void insert(Intervalo intervalo){
          
        if(intervalo.getId() == 0){
            intervalo.setId(proximoId());
            Banco.intervalos.add(intervalo);
        }
        
        
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param intervalo
     * @return 
     */
    public boolean update(Intervalo intervalo){
        
        for (int i = 0; i < Banco.intervalos.size(); i++) {
            if(idSaoIguais(Banco.intervalos.get(i),intervalo)){
                Banco.intervalos.set(i, intervalo);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do agendamento passado
     * @param intervalo
     * @return 
     */
    public boolean delete(Intervalo intervalo){
        for (Intervalo intervaloLista : Banco.intervalos) {
            if(idSaoIguais(intervaloLista,intervalo)){
                Banco.intervalos.remove(intervaloLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os agendamentos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Intervalo> selectAll(){
        return Banco.intervalos;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param intervalo
     * @param intervaloAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Intervalo intervalo, Intervalo intervaloAComparar) {
        return intervalo.getId() ==  intervaloAComparar.getId();
    }
    
    private int proximoId(){
        
        int maiorId = 0;
        
        for (Intervalo intervalo : Banco.intervalos) {           
           int id = intervalo.getId();
            
            if(maiorId < id){
                maiorId = id;
            }
            
        }
        
        return maiorId + 1;
    }
}
