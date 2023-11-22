package com.joao.Lombok.PrjLombok.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao.Lombok.PrjLombok.entities.Usuario;

public interface UsuarioRepositorio extends  JpaRepository<Usuario, Long>{

}
