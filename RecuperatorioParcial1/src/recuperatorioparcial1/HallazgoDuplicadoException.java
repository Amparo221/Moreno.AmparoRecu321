package recuperatorioparcial1;


public class HallazgoDuplicadoException extends RuntimeException {
    public HallazgoDuplicadoException(String sitio, Integer fecha) {
        super(String.format("Hallazgo duplicado en sitio '%s' con fecha '%s'", sitio, fecha));
    }
    
    public HallazgoDuplicadoException(String mensaje) {
        super(mensaje);
    }
}
