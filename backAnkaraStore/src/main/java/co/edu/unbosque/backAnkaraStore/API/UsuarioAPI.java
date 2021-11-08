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

import co.edu.unbosque.backAnkaraStore.DAO.UsuariosDAO;
import co.edu.unbosque.backAnkaraStore.model.Usuarios;

@RestController //Representa el objeto tipo Rest
@RequestMapping("usuarios")
public class UsuarioAPI {
	
	@Autowired //Inyecta la dependencia de todos los metodos del JPA a la variable usuarioDAO
	private UsuariosDAO usuariosDao;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Usuarios usuarios) {
		usuariosDao.save(usuarios);
	}
	
	@GetMapping("/listar")
	public List<Usuarios> listar(){
		return usuariosDao.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		usuariosDao.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Usuarios usuarios) {
		usuariosDao.save(usuarios);
	}

}
