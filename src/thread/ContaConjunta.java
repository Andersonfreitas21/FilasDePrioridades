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
public class ContaConjunta {

    private int saldo = 100;

    public int getSaldo() {
        return saldo;
    }

    public synchronized void sacar(int valor, String cliente) {
        if (saldo >= valor) {
            int saldoOriginal = saldo;
            System.out.println(cliente + " vai sacar .");
            System.out.println(cliente + " esperando .");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ContaConjunta.class.getName()).log(Level.SEVERE, null, ex);
            }
            saldo -= valor;
            String msg = cliente + " sacou " + valor + "[Saldo anterior = " + saldoOriginal + ", Saldo final = " + saldo + "]";
            System.out.println(msg);
            
        } else {
            System.out.println("Saldo insuficiente para : " + cliente);
        }
    }
}
