package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.inerfaceService.IpersonaService;
import com.example.demo.interfaces.Ipersona;
import com.example.demo.modelo.persona;

@Service
public class PersonaService implements IpersonaService{

	@Autowired
	private Ipersona data;
	
	@Override
	public List<persona> listar() {
		return (List<persona>)data.findAll();
	}

	@Override
	public Optional<persona> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(persona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
