public class Album {
    private String nombre;
    private Artista artista;
    private Integer año;

    public Album(String nombre, Artista artista, Integer año) {
        this.nombre = nombre;
        this.artista = artista;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

}
