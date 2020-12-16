package pe.edu.upeu.exa3backendflorangelvalverde.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.exa3backendflorangelvalverde.entity.Acceso;



public interface AccesoDao {
	int create(Acceso a);
	int update(Acceso a);
	int update(int id);
	int delete(int id);
	List<Map<String, Object>> read(int id);
	List<Map<String, Object>> readAll();
}
