package com.metodos.licencias.service;

import com.metodos.licencias.DTO.UsuarioDTO;
import com.metodos.licencias.logic.Rol;
import com.metodos.licencias.logic.TipoDocumento;
import com.metodos.licencias.logic.Usuario;
import com.metodos.licencias.repository.UsuarioRepository;
import jakarta.persistence.criteria.Predicate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service

public class UsuarioService {

    @Autowired
    private UsuarioRepository uRepository;

    public boolean usuarioExistente(String nombreUsuario) throws Exception{

        try {

            Usuario user = uRepository.findFirstByNombreUsuario(nombreUsuario);
            return (user != null);

        } catch (Exception e) {
            throw new Exception("Error en la base de datos, vuelva a intentarlo");
        }        
    };

    public void guardarUsuario(UsuarioDTO usuario) throws Exception{

        //El save tambien se usa para actualizar.

        try {
            uRepository.save(crearUsuario(usuario));
        } catch (Exception e) {
            throw new Exception("Error en la base de datos al intentar guardar el usuario");
        }

    }
    
      private Usuario crearUsuario(UsuarioDTO usuario){        
        return new Usuario(usuario.getUsuario(),usuario.getContrasenia(),stringToTipoDocumento(usuario.getTipoDocumento()),usuario.getNroDocumento(),Rol.ADMINISTRATIVO);
    }
      

    private TipoDocumento stringToTipoDocumento(String string){
        return TipoDocumento.valueOf(string);
    }

    private Rol stringToRol(String string){
        return Rol.valueOf(string);
    }  
      
    public boolean dniExistente (String nroDocumento, String tipoDocumento) throws Exception {
        try {

            Usuario user = uRepository.findFirstByTipoDocumentoAndNroDocumento(stringToTipoDocumento(tipoDocumento),nroDocumento);
            return (user != null);

        } catch (Exception e) {
            throw new Exception("Error en la base de datos, vuelva a intentarlo");
        }    
    }

    public List<UsuarioDTO> busquedaFiltrosUsuario(String nombreUsuario, String rol, String tipoDocumento, String numDocumento){
        List<Usuario> usuariosEncontrados = uRepository.findAll(search(nombreUsuario, rol, tipoDocumento, numDocumento));
        return ListaUsuariosADTO(usuariosEncontrados);
    }

    private List<UsuarioDTO> ListaUsuariosADTO(List<Usuario> usuariosEncontrados) {

        List<UsuarioDTO> usuarioDTOs = new ArrayList();
        for (Usuario usuario : usuariosEncontrados) {
            usuarioDTOs.add(crearUsuarioDto(usuario));
        }

        return usuarioDTOs;
    }

    private UsuarioDTO crearUsuarioDto(Usuario usuario){
        return new UsuarioDTO(usuario.getTipoDocumento().toString(), usuario.getNroDocumento(), usuario.getNombreUsuario(), usuario.getContrasenia(), usuario.getRol().toString());
    }

    private Usuario buscarUsuarioDocumento(String numDoc){
        return uRepository.findFirstByNroDocumento(numDoc);
    }

    private Specification<Usuario> search(String usuario, String rol, String tipoDoc, String numeroDoc) {
        
        return (root, query, criteriaBuilder) -> {
            
            List<Predicate> predicates = new ArrayList<>();

            if (usuario != null && !usuario.isEmpty()) {
                predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get("nombreUsuario")), "%" + usuario.toLowerCase() + "%"));
            }
            if (rol != null && !rol.isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("rol"), rol));
            }
            if (tipoDoc != null && !tipoDoc.isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("tipoDocumento"), tipoDoc));
            }
            if (numeroDoc != null && !numeroDoc.isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("nroDocumento"), numeroDoc));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
    
    public UsuarioDTO buscarUsuario(String nombreUsuario){
        Usuario user = uRepository.findFirstByNombreUsuario(nombreUsuario);
        return crearUsuarioDto(user);
    }
    
    public void actualizarUsuario(UsuarioDTO usuario) throws Exception {

        try{
            Usuario usuarioEncontrado = uRepository.findByNombreUsuario(usuario.getUsuario());
            usuarioEncontrado.setContrasenia(usuario.getContrasenia());
            usuarioEncontrado.setNroDocumento(usuario.getNroDocumento());
            usuarioEncontrado.setRol(stringToRol(usuario.getRol()));
            usuarioEncontrado.setTipoDocumento(stringToTipoDocumento(usuario.getTipoDocumento()));
            uRepository.save(usuarioEncontrado);
        }catch(Exception e){
            throw new Exception("Problemas al intentar guardar el usuario");
        }
        
    }
    
    public Usuario validarContrasenia(String nombreUsuario, String contrasenia){
        return uRepository.findFirstByNombreUsuarioAndContrasenia(nombreUsuario, contrasenia);
    }

    public void editarUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario = buscarUsuarioDocumento(usuarioDTO.getNroDocumento());
        if (usuario != null) {
            usuario.setContrasenia(usuarioDTO.getContrasenia());
            usuario.setNombreUsuario(usuarioDTO.getUsuario());
            usuario.setRol(Rol.valueOf(usuarioDTO.getRol()));
            try {
                uRepository.save(usuario);
            } catch (Exception e) {
                throw e;
            }
        } else {
            System.out.println("Usuario no encontrado en la base de datos");
        }

    }
    
    public void eliminarUsuario(UsuarioDTO usuarioDTO){
     
        Usuario usuario = new Usuario();
        usuario = buscarUsuarioDocumento(usuarioDTO.getNroDocumento());

        if (usuario != null) {
            try {
                uRepository.delete(usuario);
            } catch (Exception e) {
                throw e;
            }
        } else {
            System.out.println("Usuario no encontrado en la base de datos");
        }
    }
    
}
