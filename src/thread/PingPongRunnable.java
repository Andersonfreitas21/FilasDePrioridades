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
public class PingPongRunnable implements Runnable{
    
    String palavra;
    long tempo;
    
    public PingPongRunnable( String palavra,long tempo ){
        this.palavra = palavra;
        this.tempo = tempo;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print(palavra + " ");
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(PingPongRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public static void main (String []args){
        Runnable ping = new PingPongRunnable("Ping",1500);
        Runnable pong = new PingPongRunnable("Pong",2000);
        
        new Thread(ping,"Ping").start();
        new Thread(pong,"Pong").start();
    }

    
    
}
