public class Normal extends Popularidad{
    private int cantRepro;
    private static int cantMax = 1000;
    public Normal(){
        cantRepro = 0;
    }

    public void actEstado(Cancion c){
        cantRepro++;
        if (cantRepro>cantMax){
            //(setPopularidad(new Auge());
        }
    }

    @Override
    protected String icono() {
        return icono.MUSICALNOTEXTO();
    }
    protected string leyenda ( Cancion c){
        return c.getAlbum().get
    }
}
