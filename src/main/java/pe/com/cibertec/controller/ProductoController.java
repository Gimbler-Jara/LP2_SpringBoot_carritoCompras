package pe.com.cibertec.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import pe.com.cibertec.model.entity.ProductoEntity;
import pe.com.cibertec.model.entity.UsuarioEntity;
import pe.com.cibertec.service.ProductoService;
import pe.com.cibertec.service.UsuarioService;

@Controller
@RequiredArgsConstructor
public class ProductoController {

	private final ProductoService productoService;
	private final UsuarioService usuarioService;

	@GetMapping("/menu")
	public String mostrarMenu(Model model, HttpSession session) {
		if (session.getAttribute("usuario") == null) {
			return "redirect:/";
		}

		String correoSesion = session.getAttribute("usuario").toString();
		UsuarioEntity usuarioEncontrado = usuarioService.buscarUsuarioPorCorreo(correoSesion);
		model.addAttribute("foto", usuarioEncontrado.getUrlImagen());

		List<ProductoEntity> listaProductos = productoService.buscarTodosProductos();
		model.addAttribute("productos", listaProductos);

		return "menu";
	}
}
