/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic.misiontic.ciclo3.EjemploSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alejandro
 */
@RestController
@slf4j
public class ControladorInicio {
    @GetMapping("/")
    
    public String inicio(){
    return "Este es el inicio";
    }
}
