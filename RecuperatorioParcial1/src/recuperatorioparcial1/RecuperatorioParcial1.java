package recuperatorioparcial1;

public class RecuperatorioParcial1 {

    public static void main(String[] args) {

        InstitutoNacionalArqueologia instituto = new InstitutoNacionalArqueologia();

        System.out.println("Instituto Nacional de Arqueologia");
        System.out.println("=".repeat(40));

        try {

           System.out.println("\n--- REGISTRANDO HALLAZGOS ---");
            instituto.agregarHallazgo(
                    new Fosiles("Tyrannosaurus Rex", true, "Patagonia", 2024, 7, null));
            instituto.agregarHallazgo(
                    new Herramientas("Piedra", "Caza", "Puna", 2024, 5, null));
            instituto.agregarHallazgo(
                    new Construcciones("Templo", Epoca.PRECOLOMBINA, "Machu Picchu", 2023, 3, null));
            instituto.agregarHallazgo(
                    new Construcciones("Vivienda", Epoca.COLONIAL, "Centro Historico", 2024, 6, null));
            instituto.agregarHallazgo(
                    new Fosiles("Mamut", false, "Siberia", 2024, 8, null));
            
        

        } catch (HallazgoDuplicadoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n" + "=".repeat(40));
        instituto.mostrarHallazgos();

        System.out.println("\n" + "=".repeat(40));
        instituto.ejecutarAnalisis();

        System.out.println("\n" + "=".repeat(40));
        instituto.ejecutarRestauracion();

        System.out.println("\n" + "=".repeat(40));
        instituto.filtrarConstruccionesPorEpoca(Epoca.PRECOLOMBINA);

        System.out.println("\n" + "=".repeat(40));
        instituto.filtrarConstruccionesPorEpoca(Epoca.COLONIAL);

        System.out.println("\n" + "=".repeat(40));
        instituto.mostrarHallazgosPorEstado(4, 7);

        System.out.println("\n" + "=".repeat(40));
        instituto.mostrarHallazgosPorEstado(8, 10);
    }

}


