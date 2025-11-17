package recuperatorioparcial1;

public class Fosiles extends Hallazgos implements Analizable{

    private String especie;
    private Boolean completo;

    public Fosiles(String especie, Boolean completo, String sitio, Integer Fecha, Integer estado, Integer Id) {
        super(sitio, Fecha, estado, Id);
        this.especie = especie;
        this.completo = completo;
    }

  
    
    
    @Override
    public void analizar() {
        System.out.println("Se llevara el fosil al laboratorio para analizarlo.");
    }
}
