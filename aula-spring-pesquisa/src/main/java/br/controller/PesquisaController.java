package br.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pesquisas")
public class PesquisaController {
    
 

    @GetMapping("/nova-pesquisa")
    public String carregaFormulario(){
    return "form-pesquisa";
 }
}