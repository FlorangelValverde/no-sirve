package pe.edu.upeu.exa3backendflorangelvalverde.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.exa3backendflorangelvalverde.entity.Roles;


public interface RolesService {
	int create(Roles r);
	int update(Roles r);
	int update(int id);
	int delete(int id);
	List<Map<String, Object>> read(int id);
	List<Map<String, Object>> readAll();

}