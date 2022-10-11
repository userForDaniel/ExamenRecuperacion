package com.example.demo.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.Operaciones;
import com.example.demo.DaoImpl.ConsultaDaoImpl;
import com.example.demo.Entity.Consulta01;

@Service
public class ConsultaService implements Operaciones<Consulta01>{
	@Autowired
	private ConsultaDaoImpl DAO;

	@Override
	public int create(Consulta01 t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Consulta01 t, int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Consulta01 read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Consulta01> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return DAO.readAll2();
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return DAO.readAll3();
	}

	@Override
	public List<Map<String, Object>> readAll4() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll5() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
