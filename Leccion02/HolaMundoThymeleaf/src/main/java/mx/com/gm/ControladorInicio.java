package mx.com.gm;

import java.util.Arrays;
import java.util.HashSet;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  ///
@Slf4j /// para el manejo del login 

public class ControladorInicio {

    @Value("${index.saludo}") /// para enviar lo que tenemos en application propiedades busca esa llame de manera automatica y toma el valro 
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model) {
        var mensaje = "mensaje con thymeleaf";

        var persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("figueria");
        persona.setEmail("carlos_mdq6@gmail.com");
        persona.setTelefono("2233445566");

        var persona2 = new Persona();
        persona2.setNombre("Josefina");
        persona2.setApellido("Gomez");
        persona2.setEmail("joseFina@gmail.com");
        persona2.setTelefono("1231445566");

        
        //// DOS FORMAS DE ARMAR LISTAS 
  /*      var personas = new ArrayList(); /// usamos var para la inferencia tipos 
        personas.add(persona);
        personas.add(persona);
*/
        var personas = Arrays.asList(persona,persona2);
        
        log.info("Ejecutando el controlador Spring MVC");

        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        ///model.addAttribute("persona", persona);
        model.addAttribute("personas",personas);

        return "Index";
    }
}
