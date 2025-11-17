package recuperatorioparcial1;

public class Herramientas  extends Hallazgos implements Analizable{

    private String material;
    private String uso;

    public Herramientas(String material, String uso, String sitio, Integer Fecha, Integer estado, Integer Id) {
        super(sitio, Fecha, estado, Id);
        this.material = material;
        this.uso = uso;
    }

   
   @Override
    public void analizar() {
        System.out.println("Se llevara a la herramienta al laboratorio para analizarla.");
    }
    
}
