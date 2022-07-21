package mx.com.crud.ControlClientes.service;

import mx.com.crud.ControlClientes.domain.Persona;

import java.util.List;

public interface IPersonaServicio {

    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);

}
