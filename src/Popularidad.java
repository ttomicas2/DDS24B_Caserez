public abstract class Popularidad {
    public abstract void actEstado();
    public String detalleCancion(Cancion c){
        String detalle = "";
        detalle += this.icono();
        detalle += "-";
        detalle += this.leyenda(c);
        return detalle;
    }
    protected abstract String icono();
    protected abstract String leyenda(Cancion c);
}
