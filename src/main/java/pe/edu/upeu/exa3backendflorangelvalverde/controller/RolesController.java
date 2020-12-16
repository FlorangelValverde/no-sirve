package pe.edu.upeu.exa3backendflorangelvalverde.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.exa3backendflorangelvalverde.entity.Roles;
import pe.edu.upeu.exa3backendflorangelvalverde.service.RolesService;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/roles")
public class RolesController {
	@Autowired
	private RolesService rolesService;

	@GetMapping("/all")
	public List<Map<String, Object>> readAll(){
		return rolesService.readAll();
	}
	@GetMapping("/{id}")
	public List<Map<String, Object>> read(@PathVariable int id ) {
		try {
			 return rolesService.read(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			return null;
		}
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id ) {
		return rolesService.delete(id);
	}
	//PostMapping permite registrar un nuevo rol
	@PostMapping("/add")
	public int create(@RequestBody Roles r) {
		System.out.println("Crear: "+r.getNombre());
		return rolesService.create(r);
	}
	//PutMappin permite modificar rol
	@PutMapping("/update/{id}")
	public int edit(@RequestBody Roles r, @PathVariable int id) {
		//Map<String, Object> map = rolService.read(id);
		System.out.println(r.getNombre());
		Roles roles = new Roles();
		roles.setIdrol(id);;
		roles.setNombre(r.getNombre());	 	
		return rolesService.update(r);
	}
	@PutMapping("/update/logica/{id}")
	public int edit(@PathVariable int id) {
		System.out.println(id);
		return rolesService.update(id);
	}
	}


