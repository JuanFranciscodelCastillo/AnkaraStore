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

import co.edu.unbosque.backAnkaraStore.DAO.ClientesDAO;
import co.edu.unbosque.backAnkaraStore.model.Clientes;


@RestController //Representa el objeto tipo Rest
@RequestMapping("clientes")

public class ClientesAPI {

	@Autowired //Inyecta la dependencia de todos los metodos del JPA a la variable clientesDAO
	private ClientesDAO clientesDao;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Clientes clientes) {
		clientesDao.save(clientes);
	}
	
	@GetMapping("/listar")
	public List<Clientes> listar(){
		return clientesDao.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		clientesDao.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Clientes clientes) {
		clientesDao.save(clientes);
	}

}
