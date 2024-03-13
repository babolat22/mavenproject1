/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author juanj
 */
public class Participante {
    private int nroParticipante;    
    private String nombre;

    public Participante(int id, String nombre) {
        this.nroParticipante = id;
        this.nombre = nombre;
    }

  
    public void Mostrar() {
         System.out.println("Participante id=" + nroParticipante + ", nombre=" + nombre);
    }
        
}
