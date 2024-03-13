package competencia;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author juanj
 */
public class Carrera {
    private LocalDate fecha;
    private String distancia; // Larga o Corta
    private String circuito;  // carretera o cross

    public LocalDate getFecha() {
        return fecha;
    }
    private final ArrayList<Triatleta> atletas = new ArrayList<>();
    
    public Carrera(String distancia, String circuito) {
        fecha = LocalDate.of(2024,12,3);
        this.distancia= distancia;
        this.circuito = circuito;
    }
    
    public void agregarAtleta(Triatleta atleta) {
        atletas.add(atleta);
    }

    public ArrayList<Triatleta> getAtletas() {
        return atletas;
    }

    public String Mostrar() {
        return  "fecha: "+ fecha + " Distancia: " + distancia + " Circuito: " + circuito;
    }
}
