package org.aguzman.springcloud.msvc.cursos.services;

import org.aguzman.springcloud.msvc.cursos.models.Usuario;
import org.aguzman.springcloud.msvc.cursos.models.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService {
    List<Curso> listar();
    Optional<Curso> porId(Long id);


    Optional<Curso> porIdConUsuarios(Long id);
    Curso guardar(Curso curso);
    void eliminar(Long id);

    void eliminarCursoUsuarioPorId(Long id);



    //metodos que se comunican al msvc-usuarios por medio de la clase de Feign
    //se usa para asignar un alumno al curso
    Optional<Usuario> asignarUsuario(Usuario usuario, Long cursoId);

    //se usa para crear un usuario y luego asignarlo al curso
    Optional<Usuario> crearUsuario(Usuario usuario, Long cursoId);

    //se usa para desasignar el usuario al curso
    Optional<Usuario> eliminarUsuario(Usuario usuario, Long cursoId);
}
