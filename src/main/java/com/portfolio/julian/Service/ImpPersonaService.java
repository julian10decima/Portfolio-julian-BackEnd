package com.portfolio.julian.Service;

import com.portfolio.julian.Entity.Persona;
import com.portfolio.julian.Repository.IPersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;
    
        public List<Persona> list(){
        return ipersonaRepository.findAll(); // buscara todo lo de Persona y armara una lista
    }
    
    public Optional<Persona> getOne(int id){
        return ipersonaRepository.findById(id);       // Buscara una Persona por el id
    }
    
    public Optional<Persona> getByNombre(String nombre){
        return ipersonaRepository.findByNombre(nombre);         // Buscara una Persona por el nombre
    }
    
    public void save(Persona persona){
        ipersonaRepository.save(persona);       //traera un objeto para Guardar
    }
    
    public void delete(int id){
        ipersonaRepository.deleteById(id);   //busca el objeto por id y lo borra
    }
    
    public boolean existsById(int id){
        return ipersonaRepository.existsById(id); // Para saber si existe la Persona que busco por Id. Devolvera True o False
    }
    
    public boolean existsByNombre(String nombre){
        return ipersonaRepository.existsByNombre(nombre); // Para saber si existe la Persona que busco por Nombre. Devolvera True o False
    }
}
