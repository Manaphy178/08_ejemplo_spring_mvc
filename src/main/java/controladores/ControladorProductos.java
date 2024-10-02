package controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorProductos {

	@RequestMapping("obtenerProductos")
	public String obtenerProductos() {
		System.out.println("Se ejecuta el metodo obtenerProductos del ControladorProductos");
		return "WEB-INF/jsps/productos.jsp";// indicamos la vista a devolver al usuario
	}
}
