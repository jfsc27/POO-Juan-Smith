package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Consultorio {
    private final String nombre;
    private final Collection <Mascota> listaMascota;
    private final Collection <Mascota> listaMascotaMayor;

    public Consultorio (String nombre){
        this.nombre = nombre;
        assert nombre != null :"El nombre no puede ser";
        this.listaMascota = new LinkedList<Mascota>();
        this.listaMascotaMayor = new LinkedList<Mascota>();
    }

    public String getNombre (){
        return nombre;
    }

    public Collection <Mascota> getListaMascota (){
        return Collections.unmodifiableCollection(listaMascota);
    }

    public Collection <Mascota> getListaMascotaMayor (){
        return Collections.unmodifiableCollection(listaMascotaMayor);
    }

    public void registrarMascota (Mascota mascota){
        assert verificarId (mascota.id()) == false : "No se permite una mascota con el mismo id";
        listaMascota.add (mascota);
    }

    private boolean verificarId (String id){
        boolean existeMascota = false;
        for (Mascota mascota : listaMascota){
            if (mascota.id().equals(id)){
                existeMascota = true;
            } 
        }
        return existeMascota;
    }

    public void registrarMascotaMayor (Mascota mascota){
        assert verificarEdad (mascota.edad()) == false : "La mascota debe de ser mayor a 10 años para pertenecer a esta lista";
        listaMascotaMayor.add (mascota);
    }

    private boolean verificarEdad (byte edad){
        boolean mascotaMayor = false;
        for (Mascota mascota : listaMascotaMayor){
            if (mascota.edad()> (byte) 10){
                mascotaMayor = true;
            } 
        }
        return mascotaMayor;

}
}
