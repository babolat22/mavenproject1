/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author juanj
 */
public class Triatleta extends Participante implements Nadador, Corredor, Ciclista{
     double tiempoTotal;
     double resistencia;
     int velocidad;
     int fuerza;
     int postura; // 1,2, 3

    public Triatleta(int id, String nombre, double resistencia, int velocidad, int fuerza, int postura) {
        super(id, nombre);
        tiempoTotal = 0.0;
        this.resistencia = resistencia;
        this.velocidad = velocidad;
        this.fuerza = fuerza;
        this.postura = postura;
    }

    @Override
    public double calcularPotencia(){
        return fuerza* velocidad;
    }

     @Override
    public double Correr() {
        sumarTiempos();
        return resistencia;
    }
     @Override
    public void Pedalear(Bicicleta bici) {
        sumarTiempos();
        System.out.println("pedaleo con rodado "+ bici.getRodado() + " en postura "+ postura);
    }

    @Override
    public void Nadar() {
        sumarTiempos();
        System.out.println("Tramo de nado " +  estilo);
    }

    public void sumarTiempos(){
        double etapa = (Math.random()*30+1);
        System.out.println("Tiempo de etapa: " + etapa);
        tiempoTotal += etapa;
    }
    
    public void verTiempoTotal() {
        System.out.println("Tiempo Final >>> " + tiempoTotal);
    }
    
     @Override
    public void Mostrar() {
        super.Mostrar();
        System.out.println("Datos: " +
                "resistencia=" + resistencia +
                ", velocidad=" + velocidad + 
                ", fuerza=" + fuerza + 
                ", postura=" + postura); 
    }
    
}
