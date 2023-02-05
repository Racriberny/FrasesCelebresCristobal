package com.cristobalbernal.frasescelebrescristobal.controllers;
import com.cristobalbernal.frasescelebrescristobal.models.Usuario;
import com.cristobalbernal.frasescelebrescristobal.repo.IUsuariosDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

public class RestControllerAPI {
    @Autowired
    IUsuariosDao ur;


}
