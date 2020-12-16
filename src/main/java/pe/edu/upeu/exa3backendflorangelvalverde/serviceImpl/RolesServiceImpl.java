package pe.edu.upeu.exa3backendflorangelvalverde.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.exa3backendflorangelvalverde.dao.RolesDao;
import pe.edu.upeu.exa3backendflorangelvalverde.entity.Roles;
import pe.edu.upeu.exa3backendflorangelvalverde.service.RolesService;


@Service
public class RolesServiceImpl implements RolesService {
@Autowired
	private RolesDao rolesDao;
	@Override
	public int create(Roles r) {
		// TODO Auto-generated method stub
		return rolesDao.create(r);
	}

	@Override
	public int update(Roles r) {
		// TODO Auto-generated method stub
		return rolesDao.update(r);
	}

	@Override
	public int update(int id) {
		// TODO Auto-generated method stub
		return rolesDao.update(id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return rolesDao.delete(id);
	}

	@Override
	public List<Map<String, Object>> read(int id) {
		// TODO Auto-generated method stub
		return rolesDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return rolesDao.readAll();
	}

}
