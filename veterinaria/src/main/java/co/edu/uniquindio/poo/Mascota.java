package co.edu.uniquindio.poo;

public record Mascota(String id, String nombre, String especie, String raza, byte edad, String genero, String color, byte peso) {
    public Mascota{
        assert id != null;
        assert nombre != null;
        assert especie != null;
        assert raza != null;
        assert genero != null;
        assert color != null; 
        assert id != "";
        assert nombre != "";
        assert especie != "";
        assert raza != "";
        assert genero != "";
        assert color != "";
        assert (byte) edad >= (byte) 0;
        assert (byte) peso >= (byte) 0;
    }
}
