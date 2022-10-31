
package com.portfolio.julian.Service;

import com.portfolio.julian.Entity.Experiencia;
import com.portfolio.julian.Repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional // para Mantener la persistencia de datos tanto aqui como en la Base de datos
public class SExperiencia {
    @Autowired
    RExperiencia rExperiencia;
    
    public List<Experiencia> list(){
        return rExperiencia.findAll(); // buscara todo lo de experiencia y armara una lista
    }
    
    public Optional<Experiencia> getOne(int id){
        return rExperiencia.findById(id);       // Buscara una experiencia por el id
    }
    
    public Optional<Experiencia> getByNombreE(String nombreE){
        return rExperiencia.findByNombreE(nombreE);         // Buscara una experiencia por el nombre
    }
    
    public void save(Experiencia expe){
        rExperiencia.save(expe);       //traera un objeto para Guardar
    }
    
    public void delete(int id){
        rExperiencia.deleteById(id);   //busca el objeto por id y lo borra
    }
    
    public boolean existsById(int id){
        return rExperiencia.existsById(id); // Para saber si existe la experiencia que busco por Id. Devolvera True o False
    }
    
    public boolean existsByNombreE(String nombreE){
        return rExperiencia.existsByNombreE(nombreE); // Para saber si existe la experiencia que busco por Nombre. Devolvera True o False
    }
}
