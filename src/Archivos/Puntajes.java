/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.*;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import zombietimee.NewJFrame;
import Zombie1.Zombie;
import java.util.TreeMap;

/**
 *
 * @author javier
 */
public class Puntajes {

    private TreeMap<Double, Jugador> jugadores;
    private double colisionesTotales = 100;
    int numJugadores;
    String inf = "";

    public Puntajes() {
        this.jugadores = new TreeMap<>();
    }

    public String getInf() {
        return inf;
    }

    public void setInf(String inf) {
        this.inf = inf;
    }
    
    public void asignarPuntaje(String nombre) {
        Zombie1.Zombie z1 = new Zombie1.Zombie();
        Zombie2.Zombie z2 = new Zombie2.Zombie();
        Zombie3.Zombie z3 = new Zombie3.Zombie();

        colisionesTotales -= z1.getColisiones() + z2.getColisiones() + z3.getColisiones();
        colisionesTotales += z2.getPoderes();

        Jugador jugador = new Jugador();
        jugador.setNombre(nombre);
        jugador.setMaxPuntaje(colisionesTotales);
        jugadores.put(jugador.getMaxPuntaje(), jugador);
    }

    public TreeMap<Double, Jugador> seleccionarPuntajeMax() {
        return this.jugadores;
    }

    public void imprimir() {
        
        for (Double clave :seleccionarPuntajeMax().keySet()) {
            Jugador jM = seleccionarPuntajeMax().get(clave);
            inf += jM.getNombre() + " " + jM.getMaxPuntaje()+"\n";
        }

    }

    public void escribirPuntajes(File f) throws IOException {
        PrintStream out = new PrintStream(f);
        for (Jugador j : jugadores.values()) {
            System.out.println(j.getNombre() + " " + j.getMaxPuntaje());
            System.out.println("sfxbdgb");
        }
    }

    public void leerPuntajes(File f) throws FileNotFoundException {

        Scanner leer = new Scanner(f);
        while (leer.hasNext()) {
            String nombreJ = leer.next();
            double puntajeJ = leer.nextDouble();
            Jugador jugador = new Jugador();
            jugador.setNombre(nombreJ);
            jugador.setMaxPuntaje(puntajeJ);
            numJugadores ++;
        }
        
    }
}
