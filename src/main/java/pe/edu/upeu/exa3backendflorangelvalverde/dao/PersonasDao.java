package pe.edu.upeu.exa3backendflorangelvalverde.dao;

import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;

import pe.edu.upeu.exa3backendflorangelvalverde.entity.Personas;

public interface PersonasDao {
	int create(Personas p);
	int update(Personas p);
	int update(int id);
	int delete(int id);
	List<Personas> readHola(int id);
	List<Map<String, Object>> read(int id);
	List<Map<String, Object>> readAll();
	List<GrantedAuthority> buscarRolUser(int iduser);
	void convertitMap(Map<String, Object> map);
	
}
