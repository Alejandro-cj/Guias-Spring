
package mintic.misiontic.ciclo3.EjemploSpring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;
import mintic.misiontic.ciclo3.EjemploSpring.modelo.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 *
 * @author Alejandro
 */

@Controller
@Slf4j
public class ControladorInicio {
    @Value("$(index.mensaje)")
    String dato;
    @GetMapping("/")
    
    public String inicio(Model modelo){
        String mensaje ="saludo desde Spring MVC con paso de informacion";
        modelo.addAttribute("mesaje", mensaje);
        modelo.addAttribute("dato", dato);
        Usuario u = new Usuario();
        u.setCedula("1234");
        u.setClave("Abecd");
        u.setNombre("JOHN CARLOS ARRIETA ARRIETA");
        u.setEmail("jarrieta@gmail.com");

        log.info("ejecutando el controlador inicio MVP");
    return "index";
    }
}
