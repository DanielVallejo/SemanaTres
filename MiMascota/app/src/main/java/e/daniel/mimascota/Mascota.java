package e.daniel.mimascota;

public class Mascota {
    private String nombre;
    private String valor;
    private int foto;

    public Mascota(int foto, String nombre, String valor) {
        this.foto = foto;
        this.nombre = nombre;
        this.valor = valor;
         }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
