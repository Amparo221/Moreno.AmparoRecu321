package recuperatorioparcial1;

public class Construcciones extends Hallazgos implements Restaurable{

    private String tipo;
    private Epoca epoca;

    public Construcciones(String tipo, Epoca epoca, String sitio, Integer Fecha, Integer estado, Integer Id) {
        super(sitio, Fecha, estado, Id);
        this.tipo = tipo;
        this.epoca = epoca;
    }

    public Epoca getEpoca() {
        return epoca;
    }

    public boolean esDe(Epoca tipo) {
        return tipo == this.epoca;
    }

    @Override
    public void restaurar() {
        System.out.println("Se restaurara la construccion.");
    }
}
