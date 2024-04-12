public class Icono {
    public static Icono MusicaLNote = new Icono(new int[]{0xD8C, 0xDF85});
    public static Icono Rocket = new Icono(new int []{0xd83D,0XDE80});
    public static Icono Fire = new Icono(new int[]{0xD83D, 0Xdd25});

    private int [] internalEncoding;
    Icono(int[]internalEncoding){
        this.internalEncoding = internalEncoding;
    }

    public String texto(){
        return new String(internalEncoding,0, internalEncoding.length);
    }
    public static void main (String []args){
        System.out.println(Icono.MusicaLNote.texto());
        System.out.println(Icono.Rocket.texto());
        System.out.println(Icono.Fire.texto());
    }
}
