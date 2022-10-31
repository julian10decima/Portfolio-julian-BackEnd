
package com.portfolio.julian.Service;

import com.portfolio.julian.Entity.Proyecto;
import com.portfolio.julian.Repository.RProyecto;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    @Autowired
    RProyecto rProyecto;
    
    public List<Proyecto> list(){
        return rProyecto.findAll(); // buscara todo lo de Proyecto y armara una lista
    }
    
    public Optional<Proyecto> getOne(int id){
        return rProyecto.findById(id);  // Buscara una Proyecto por el id
    }
    
    public Optional<Proyecto> getByNombreP(String nombreP){
        return rProyecto.findByNombreP(nombreP);  // Buscara una Proyecto por el nombre
    }
    
    public void save(Proyecto proyec){
        rProyecto.save(proyec);   //traera un objeto para Guardar
    }
    
    public void delete(int id){
        rProyecto.deleteById(id);   //busca el objeto por id y lo borra
    }
    
    public boolean existsById(int id){
        return rProyecto.existsById(id); // Para saber si existe la Proyecto que busco por Id. Devolvera True o False
    }
    
    public boolean existsByNombreP(String nombreP){
        return rProyecto.existsByNombreP(nombreP); // Para saber si existe la Proyecto que busco por Nombre. Devolvera True o False
    }
}
