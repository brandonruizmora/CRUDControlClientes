package mx.com.crud.ControlClientes.web;

import lombok.extern.slf4j.Slf4j;
import lombok.var;
import mx.com.crud.ControlClientes.dao.IPersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private IPersonaDao iPersonaDao;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ejecutando inicio");
        var personas = iPersonaDao.findAll();
        model.addAttribute("personas", personas);
        return "index";
    }

}
