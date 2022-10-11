package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ConsultaService;

@RestController
@RequestMapping("/api/orden")
@CrossOrigin(origins = "*")
public class ConsultaController {
	@Autowired
	private ConsultaService consulta01;
	@GetMapping("/ciudad")
	public List<Map<String, Object>> readAll2(){
		return consulta01.readAll2();
	}
	@GetMapping("/region")
	public List<Map<String, Object>> readAll3(){
		return consulta01.readAll3();
	}

}
