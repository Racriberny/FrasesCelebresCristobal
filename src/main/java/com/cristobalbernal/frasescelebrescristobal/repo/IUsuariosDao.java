package com.cristobalbernal.frasescelebrescristobal.repo;

import com.cristobalbernal.frasescelebrescristobal.controllers.UsuarioController;
import com.cristobalbernal.frasescelebrescristobal.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IUsuariosDao extends JpaRepository<Usuario,Integer> {
    @Query(value="SELECT * FROM usuario ORDER BY usuario.id LIMIT 4 OFFSET ?1", nativeQuery = true)
    List<Usuario> getUsersLimit(int offset);
}
