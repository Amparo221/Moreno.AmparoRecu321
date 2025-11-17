package recuperatorioparcial1;

import java.util.ArrayList;
import java.util.List;

public class InstitutoNacionalArqueologia {

    private List<Hallazgos> hallazgos;
    private List<Construcciones> construccionesFiltradas;

     public InstitutoNacionalArqueologia() {
        this.hallazgos = new ArrayList<>();
        this.construccionesFiltradas = new ArrayList<>();
    }

    public void agregarHallazgo(Hallazgos nuevoHallazgo) {
    for (Hallazgos hallazgo : hallazgos) {
        if (hallazgo.getSitio().equals(nuevoHallazgo.getSitio())  
                && hallazgo.getFecha().equals(nuevoHallazgo.getFecha())) {
            throw new HallazgoDuplicadoException(nuevoHallazgo.getSitio(), nuevoHallazgo.getFecha());
        }
    }
    hallazgos.add(nuevoHallazgo);
    System.out.println("Hallazgo agregado exitosamente: " + nuevoHallazgo.getSitio());
}

    public void mostrarHallazgos() {
        System.out.printf("Hallazgos registrados\n");
        if (hallazgos.isEmpty()) {
            System.out.println("No hay hallazgos registrados.");
            return;
        }

        for (int i = 0; i < hallazgos.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, hallazgos.get(i));
        }
    }

    public void ejecutarAnalisis() {
        System.out.println("Ejecutando analisis en el laboratorio");

        for (Hallazgos hallazgo : hallazgos) {
            if (hallazgo instanceof Analizable) {
                Analizable analizable = (Analizable) hallazgo;
                analizable.analizar();
            } else {
                System.out.println("No puede analizarse");
            }
        }
    }

    public void ejecutarRestauracion() {
        for (Hallazgos hallazgo : hallazgos) {
            if (hallazgo instanceof Restaurable) {
                if (hallazgo instanceof Restaurable) {
                    Restaurable restaurable = (Restaurable) hallazgo;
                    restaurable.restaurar();
                } else {
                    System.out.println("No puede restaurarse: " + hallazgo.getClass().getSimpleName());
                }
            }
        }
    }

    public void filtrarConstruccionesPorEpoca(Epoca epoca) {
        construccionesFiltradas = new ArrayList<>();

        for (Hallazgos hallazgo : hallazgos) {
            if (hallazgo instanceof Construcciones) {
                Construcciones construccion = (Construcciones) hallazgo;
                if (construccion.esDe(epoca)) {
                    construccionesFiltradas.add(construccion);
                }
            }
        }

        System.out.printf("Construcciones de epoca %s \n", epoca);

        if (construccionesFiltradas.isEmpty()) {
            System.out.println("No hay construcciones de esa epoca.");
        } else {
            for (int i = 0; i < construccionesFiltradas.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, construccionesFiltradas.get(i));
            }
        }
    }
    
    public void mostrarHallazgosPorEstado(int estadoDesde, int estadoHasta) {
    
    
    System.out.println("Hallazgos con estado de conservacion:\n");
    
    boolean hayResultados = false;
    for (Hallazgos hallazgo : hallazgos) {
        if (hallazgo.getEstado() >= estadoDesde && hallazgo.getEstado() <= estadoHasta) {
            System.out.println(hallazgo);
            hayResultados = true;
        }
    }
    
    if (!hayResultados) {
        System.out.println("No hay hallazgos en ese rango de estado de conservación.");
    }
}
    
    
    
}
