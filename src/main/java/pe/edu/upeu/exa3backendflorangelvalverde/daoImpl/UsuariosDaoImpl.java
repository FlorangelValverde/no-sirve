package pe.edu.upeu.exa3backendflorangelvalverde.daoImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;

import pe.edu.upeu.exa3backendflorangelvalverde.dao.UsuariosDao;
import pe.edu.upeu.exa3backendflorangelvalverde.entity.Usuarios;


@Repository
public class UsuariosDaoImpl implements UsuariosDao {
	Gson g = new Gson();
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Usuarios validarUsuario(String nomuser) {
		String SQL = "select * from usuarios where username=?";
		Usuarios usuarios = jdbcTemplate.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuarios>(Usuarios.class));
		System.out.println("Prueba: "+g.toJson(usuarios));
		return usuarios;
	}

	@Override
	public Map<String, Object> datosUsuario(String username) {
		String SQL = "SELECT u.idusuario, r.nombre, p.nombres, u.username FROM personas p " + 
				"INNER JOIN usuarios u ON u.idpersona = p.idpersona " + 
				"INNER JOIN usuarios_roles ur ON u.idusuario = ur.idusuario " + 
				"INNER JOIN roles r ON r.idrol=ur.idrol "+
				"where u.username = ?";
		Map<String, Object> map= jdbcTemplate.queryForMap(SQL, username);
		return map;
	}

}
