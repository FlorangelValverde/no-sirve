package pe.edu.upeu.exa3backendflorangelvalverde.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import pe.edu.upeu.exa3backendflorangelvalverde.dao.RolesDao;
import pe.edu.upeu.exa3backendflorangelvalverde.dao.UsuariosDao;
import pe.edu.upeu.exa3backendflorangelvalverde.entity.Usuarios;


@Service("userService")
public class UsuarioService implements UserDetailsService{
	Gson g = new Gson();
	   @Autowired
		private UsuariosDao usuariosDao;
	   @Autowired
		private RolesDao rolesDao;
	   
		@Override
		@Transactional(readOnly = true)
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {		
			Usuarios usuarios = usuariosDao.validarUsuario(username);
			System.out.println(g.toJson(usuarios.getUsername()));
			//System.out.println(g.toJson(rolDao.buscarRolUser(usuario.getIdusuario())));
			UserDetails details = new User(usuarios.getUsername(),usuarios.getPassword(),rolesDao.buscarRolUser(usuarios.getIdusuario()));
			//System.out.println("hola: "+g.toJson(details));
			return details;
		}
}
