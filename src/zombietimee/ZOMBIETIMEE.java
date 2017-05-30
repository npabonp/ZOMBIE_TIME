/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombietimee;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class ZOMBIETIMEE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setTitle("ZOMBIE TIME");
        frame.setSize(800, 530);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setNivel(1);
    }

}
