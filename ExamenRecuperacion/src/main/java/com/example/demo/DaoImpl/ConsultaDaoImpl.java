package com.example.demo.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.Dao.Operaciones;
import com.example.demo.Entity.Consulta01;
@Component
public class ConsultaDaoImpl implements Operaciones<Consulta01>{
	@Autowired 
	private JdbcTemplate jdbcTemplate;

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
		return jdbcTemplate.queryForList("select o.City as ciudad , count(*) as orden from customers as o group by City;");
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("select t.TerritoryDescription as territorio, count(*) as clientes  from territories T inner join employeeterritories e on\r\n"
				+ "                e.TerritoryID = T.TerritoryID inner join employees en on\r\n"
				+ "                e.EmployeeID = en.EmployeeID inner join orders o on \r\n"
				+ "                o.EmployeeID = en.EmployeeID inner join customers cus on \r\n"
				+ "                o.CustomerID = cus.CustomerID group by t.TerritoryDescription;");
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
