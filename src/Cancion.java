import java.time.LocalDate;
import java.util.Date;

public class Cancion {
    private String tittulo;
    private Popularidad popularidad;
    private Album album;
    private Integer likes;
    private Integer dislikes;
    private Integer reproducciones;
    private LocalDate ultReproduccion;

    public Cancion(String tittulo, Popularidad popularidad, Album album, Integer likes, Integer dislikes, Integer reproducciones, LocalDate ultReproduccion) {
        this.tittulo = tittulo;
        this.popularidad = popularidad;
        this.album = album;
        this.likes = likes;
        this.dislikes = dislikes;
        this.reproducciones = reproducciones;
        this.ultReproduccion = ultReproduccion;
    }

    public String getTittulo() {
        return tittulo;
    }

    public void setTittulo(String tittulo) {
        this.tittulo = tittulo;
    }

    public Popularidad getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(Popularidad popularidad) {
        this.popularidad = popularidad;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getDislikes() {
        return dislikes;
    }

    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
    }

    public Integer getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(Integer reproducciones) {
        this.reproducciones = reproducciones;
    }

    public Date getUltReproduccion() {
        return ultReproduccion;
    }

    public void setUltReproduccion(LocalDate ultReproduccion) {
        this.ultReproduccion = ultReproduccion;
    }
    public void reproducir(){
        reproducciones++;
        popularidad.actEstado();
        ultReproduccion(LocalDate.now());

    }

    public void detalleCancion() {
        popularidad.detalleCancion(this);
    }
}
