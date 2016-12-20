package psp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import psp.pojo.Usuario;
import psp.repositorio.RepositorioUsuarios;

@Controller
@RequestMapping("/home")
public class LoginController {
	
	RepositorioUsuarios bd;
	
	@GetMapping("/newUser")
	public String loguear( Model model){
		Usuario user = new Usuario();
		model.addAttribute("usuario", user );
		
		return "form"; //Esto invoca al form.jsp
		
	}
	
	@PostMapping("/addUser")
	public String anyadirUsuario(@ModelAttribute("usuario")Usuario user , Model model){
		
		bd.save(user);
		
		return "redirect:/list"; //Esto invoca al view.jsp
		
	}
	
	@GetMapping("/list")
	public String mostrarUsuarios(Model model){
		
		model.addAttribute("listaUsuarios", bd.findAll());
		
		return "view"; //Esto invoca al view.jsp
		
	}

}
