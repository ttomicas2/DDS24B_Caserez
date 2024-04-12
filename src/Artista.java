public class Artista {
    private String nombre;
    private Album album;

    public Artista(String nombre, Album album) {
        this.nombre = nombre;
        this.album = album;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
