package com.example.demo.inerfaceService;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.persona;

public interface IpersonaService {
	public List<persona>listar();
	public Optional<persona>listarId(int id);
	public int save(persona p);
	public void delete(int id);
}
