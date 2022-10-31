
package com.portfolio.julian.Security.Service;

import com.portfolio.julian.Security.Entity.Rol;
import com.portfolio.julian.Security.Enums.RolNombre;
import com.portfolio.julian.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional     // Si una operacion falla hace un rolback para que no impacta en la base de datos o que se mantenga en un estado anterior
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre); 
    }
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
