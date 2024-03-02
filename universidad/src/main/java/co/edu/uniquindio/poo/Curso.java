package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Curso {
    private final String nombre;
    private final Collection<Estudiante> listaEstudiante;

    public Curso (String nombre){
        this.nombre = nombre;
        this.listaEstudiante = new LinkedList<Estudiante>();
    }

    public String getNombre (){
        return nombre;
    }

    public Collection <Estudiante> getListaEstudiante (){
        return Collections.unmodifiableCollection(listaEstudiante);
    }

    public void registrarEstudiante (Estudiante estudiante){
        assert verificarNumeroIdentificacion (estudiante.numeroIdentificacion()) == false : "Ya existe un estudiante con ese numero de identificacion";
        listaEstudiante.add (estudiante);
    }

    private boolean verificarNumeroIdentificacion (String numeroIdentificacion){
        boolean existeEstudiante = false;
        for (Estudiante estudiante : listaEstudiante){
            if (estudiante.numeroIdentificacion().equals(numeroIdentificacion)){
                existeEstudiante = true;
            }
        }
        return existeEstudiante;
    }
    
}
