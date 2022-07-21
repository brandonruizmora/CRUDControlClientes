package mx.com.crud.ControlClientes.web;

import lombok.extern.slf4j.Slf4j;
import lombok.var;
import mx.com.crud.ControlClientes.domain.Persona;
import mx.com.crud.ControlClientes.service.IPersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private IPersonaServicio iPersonaServicio;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ejecutando inicio");
        var personas = iPersonaServicio.listarPersonas();
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Persona persona) {
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(Persona persona) {
        iPersonaServicio.guardar(persona);
        return "redirect:/";
    }

}
