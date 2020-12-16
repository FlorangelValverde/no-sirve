package pe.edu.upeu.exa3backendflorangelvalverde.dao;

import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;

import pe.edu.upeu.exa3backendflorangelvalverde.entity.Roles;



public interface RolesDao {
	int create(Roles r);
	int update(Roles r);
	int update(int id);
	int delete(int id);
	List<Roles> readHola(int id);
	List<Map<String, Object>> read(int id);
	List<Map<String, Object>> readAll();
	List<GrantedAuthority> buscarRolUser(int iduser);
	void convertitMap(Map<String, Object> map);

}