package mx.com.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.dao.PersonaDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  ///
@Slf4j /// para el manejo del login 

public class ControladorInicio {
    
    @AutoWired
    private PersonaDao personaDao;

    @GetMapping("/")
    public String inicio(Model model) {
                
        log.info("Ejecutando el controlador Spring MVC");

        ///model.addAttribute("personas",personas);

        return "Index";
    }
}
