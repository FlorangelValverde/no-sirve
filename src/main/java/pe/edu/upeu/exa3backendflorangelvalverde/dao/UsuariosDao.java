package pe.edu.upeu.exa3backendflorangelvalverde.dao;

import java.util.Map;

import pe.edu.upeu.exa3backendflorangelvalverde.entity.Usuarios;



public interface UsuariosDao {
	Usuarios validarUsuario(String nomuser);
	Map<String, Object> datosUsuario(String username);
}
