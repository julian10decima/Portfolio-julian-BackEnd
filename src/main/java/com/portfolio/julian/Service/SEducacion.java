
package com.portfolio.julian.Service;

import com.portfolio.julian.Entity.Educacion;
import com.portfolio.julian.Repository.REducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional // para Mantener la persistencia de datos tanto aqui como en la Base de datos
public class SEducacion {
    @Autowired
    REducacion rEducacion;
    
    public List<Educacion> list(){
        return rEducacion.findAll(); // buscara todo lo de experiencia y armara una lista
    }
    
    public Optional<Educacion> getOne(int id){
        return rEducacion.findById(id);  // Buscara una experiencia por el id
    }
    
    public Optional<Educacion> getByNombreEdu(String nombreEdu){
        return rEducacion.findByNombreEdu(nombreEdu);  // Buscara una experiencia por el nombre
    }
    
    public void save(Educacion edu){
        rEducacion.save(edu);   //traera un objeto para Guardar
    }
    
    public void delete(int id){
        rEducacion.deleteById(id);   //busca el objeto por id y lo borra
    }
    
    public boolean existsById(int id){
        return rEducacion.existsById(id); // Para saber si existe la experiencia que busco por Id. Devolvera True o False
    }
    
    public boolean existsByNombreEdu(String nombreEdu){
        return rEducacion.existsByNombreEdu(nombreEdu); // Para saber si existe la experiencia que busco por Nombre. Devolvera True o False
    }
}
