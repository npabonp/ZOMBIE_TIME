/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombietimee;

import Zombie1.Nivel1;
import Zombie2.Nivel2;
import Zombie3.Nivel3;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class Frame extends JFrame{
    
    public void setNivel(int nivel) {
        this.removeAll();
        switch (nivel) {
            case 1: {
                this.add(Nivel1.getInstance());
                break;
            }
            case 2: {
                this.add(Nivel2.getInstance());
                break;
            }
            case 3: {
                this.add(Nivel3.getInstance());
                break;
            }
        }this.repaint();

    }
}
