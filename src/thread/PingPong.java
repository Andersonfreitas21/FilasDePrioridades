/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Programador-03
 */
public class PingPong extends Thread{
    
    String palavra;
    long tempo;
    
    public PingPong( String palavra,long tempo ){
        this.palavra = palavra;
        this.tempo = tempo;
    }
    
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.print(palavra + " ");
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(PingPong.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void main (String []args){
        new PingPong("Ping",1500).start();
        new PingPong("Pong",2000).start();
    }
    
}
