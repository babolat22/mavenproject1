package competencia;

public class Inscripciones {

    public static void main(String[] args) {
       
       
        Carrera triatlon = new Carrera("Larga", "Cross");
        Triatleta tri1 = new Triatleta(51, "Juan",0.4,1,10,3);
        Triatleta tri2 = new Triatleta(60, "Mariela",0.6,1,4,1);
        Triatleta tri3 = new Triatleta(77, "Cristy",0.5,3,6,2);
        
        triatlon.agregarAtleta(tri1);
         triatlon.agregarAtleta(tri2);
          triatlon.agregarAtleta(tri3);
          
        System.out.println("Bienvenidos al TRIATLON!\n" + triatlon.Mostrar());
        
                
        System.out.println("\nAtletas:\n");
       
        for (Triatleta atleta : triatlon.getAtletas()) {
            atleta.Mostrar();
        }
        tri1.Correr();
        tri1.Nadar();
        tri1.Pedalear(new Bicicleta(1545,29));
        tri1.calcularPotencia();
        
        tri1.verTiempoTotal();
    }
}
