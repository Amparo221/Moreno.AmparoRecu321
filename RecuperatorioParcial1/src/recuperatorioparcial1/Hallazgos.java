package recuperatorioparcial1;

abstract class Hallazgos {
    
    private String sitio;
    private Integer fecha;
    private Integer estado;
    private Integer id;
    private static int contadorId = 50000;

    public Hallazgos(String sitio, Integer Fecha, Integer estado, Integer Id) {
        if (estado < 1 || estado > 10) {
            throw new IllegalArgumentException("El estado debe ser un valor entre 1 y 10");
        }
        
        this.sitio = sitio;
        this.fecha = Fecha;
        this.estado = estado;
        this.id = contadorId++;;
        
    }

    public String getSitio() {
        return sitio;
    }

    public Integer getFecha() {
        return fecha;
    }

    public Integer getEstado() {
        return estado;
    }

    
    
}
