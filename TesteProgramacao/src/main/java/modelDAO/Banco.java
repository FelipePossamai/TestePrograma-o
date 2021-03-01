package modelDAO;


import java.util.ArrayList;
import model.ConsultaP;
import model.Intervalo;
import model.Salas;
import model.Participante;
import model.Usuario;

public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Participante> participante;
    public static ArrayList<Salas> salas;
    public static ArrayList<Intervalo> intervalos;
    public static ArrayList<ConsultaP> consultaP;
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<>();
        participante = new ArrayList<>();
        salas = new ArrayList<>();
        intervalos = new ArrayList<>();
        consultaP = new ArrayList<>();
        
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "admin", "12345");
        
        Participante participante1 = new Participante (1, "Felipe", "Santos");
        Participante participante2 = new Participante (2, "Maria Rita", "Pley");
        Participante participante3 = new Participante (3, "Leonardo", "Brovigo");
        Participante participante4 = new Participante (4, "Vinicius", "Barbosa");
        Participante participante5 = new Participante (5, "Gabriel", "Silva");
        Participante participante6 = new Participante (6, "Daniel", "Lopes");
        Participante participante7 = new Participante (7, "Thiago", "Aventura");
        Participante participante8 = new Participante (8, "Alfonso", "Padinha");
        Participante participante9 = new Participante (9, "Rafael", "Lanches");
        Participante participante10 = new Participante (10, "Ricardo", "Moraes");
        
        Salas espacoEvento1 = new Salas(1, "Sala A1", 16);
        Salas espacoEvento2 = new Salas(2, "Sala A2", 15);
        
        Intervalo espacoIntervalo1 = new Intervalo(1, "Cafézinho1");
        Intervalo espacoIntervalo2 = new Intervalo(2, "Cafézinho2");
        
        participante1.addSalas(espacoEvento1);
        participante1.addSalas(espacoEvento2);
        participante2.addSalas(espacoEvento1);
        participante2.addSalas(espacoEvento2);
        participante3.addSalas(espacoEvento1);
        participante3.addSalas(espacoEvento2);
        participante4.addSalas(espacoEvento1);
        participante4.addSalas(espacoEvento2);
        participante5.addSalas(espacoEvento1);
        participante5.addSalas(espacoEvento2);
        participante6.addSalas(espacoEvento2);
        participante6.addSalas(espacoEvento1);
        participante7.addSalas(espacoEvento2);
        participante7.addSalas(espacoEvento1);
        participante8.addSalas(espacoEvento2);
        participante8.addSalas(espacoEvento1);
        participante9.addSalas(espacoEvento2);
        participante9.addSalas(espacoEvento1);
        participante10.addSalas(espacoEvento2);
        participante10.addSalas(espacoEvento1);
        
        participante1.addIntervalos(espacoIntervalo1);
        participante1.addIntervalos(espacoIntervalo2);
        participante2.addIntervalos(espacoIntervalo1);
        participante2.addIntervalos(espacoIntervalo2);
        participante3.addIntervalos(espacoIntervalo1);
        participante3.addIntervalos(espacoIntervalo2);
        participante4.addIntervalos(espacoIntervalo1);
        participante4.addIntervalos(espacoIntervalo2);
        participante5.addIntervalos(espacoIntervalo1);
        participante5.addIntervalos(espacoIntervalo2);
        participante6.addIntervalos(espacoIntervalo2);
        participante6.addIntervalos(espacoIntervalo1);
        participante7.addIntervalos(espacoIntervalo2);
        participante7.addIntervalos(espacoIntervalo1);
        participante8.addIntervalos(espacoIntervalo2);
        participante8.addIntervalos(espacoIntervalo1);
        participante9.addIntervalos(espacoIntervalo2);
        participante9.addIntervalos(espacoIntervalo1);
        participante10.addIntervalos(espacoIntervalo2);
        participante10.addIntervalos(espacoIntervalo1);
        
        //ConsultaS consultaS1 = new ConsultaS(1, espacoEvento1, espacoEvento1)
        //ConsultaP consultaP1 = new ConsultaP(1, participante1);
        //ConsultaP consultaP2 = new ConsultaP(2, participante2, participante2, espacoEvento1, espacoCafe1);
       // ConsultaP consultaP3 = new ConsultaP(3, participante3, participante3, espacoEvento1, espacoCafe2);
       // ConsultaP consultaP4 = new ConsultaP(4, participante4, participante4, espacoEvento2, espacoCafe2);
        //ConsultaP consultaP5 = new ConsultaP(5, participante5, participante5, espacoEvento2, espacoCafe2);
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        
        salas.add(espacoEvento1);
        salas.add(espacoEvento2);
        
        intervalos.add(espacoIntervalo1);
        intervalos.add(espacoIntervalo2);
        
        participante.add(participante1);
        participante.add(participante2);
        participante.add(participante3);
        participante.add(participante4);
        participante.add(participante5);
        participante.add(participante6);
        participante.add(participante7);
        participante.add(participante8);
        participante.add(participante9);
        participante.add(participante10);
        
        
        
        //consultaS.add(consultaS1);
        
        //consultaP.add(consultaP1);
       // consultaP.add(consultaP2);
       // consultaP.add(consultaP3);
       // consultaP.add(consultaP4);
       // consultaP.add(consultaP5);
        
        
    
    }
    
}
