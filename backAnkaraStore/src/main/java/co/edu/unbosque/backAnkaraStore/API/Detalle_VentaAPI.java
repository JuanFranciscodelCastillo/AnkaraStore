package co.edu.unbosque.backAnkaraStore.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.backAnkaraStore.DAO.Detalle_VentaDAO;
import co.edu.unbosque.backAnkaraStore.model.Detalle_Venta;

@RestController
@RequestMapping("/Detalle_Venta")

public class Detalle_VentaAPI {

	@Autowired
	private Detalle_VentaDAO detalle_ventaDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Detalle_Venta detalle_venta) {
		detalle_ventaDAO.save(detalle_venta);
	}
	
	
}
