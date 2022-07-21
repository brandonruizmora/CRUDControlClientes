package mx.com.crud.ControlClientes.dao;

import mx.com.crud.ControlClientes.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Persona, Long> {
}
