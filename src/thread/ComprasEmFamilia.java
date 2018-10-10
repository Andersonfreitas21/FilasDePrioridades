/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author Programador-03
 */
public class ComprasEmFamilia implements Runnable {

    ContaConjunta conta = new ContaConjunta();
    
    @Override
    public void run() {
        String cliente = Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {
            conta.sacar(20, cliente);
            if (conta.getSaldo() < 0) {
                System.out.println("Estourou!");
            }
        }
    }
    
    public static void main(String[] args){
        ComprasEmFamilia irAsCompras = new ComprasEmFamilia();
        
        new Thread(irAsCompras,"Pai").start();
        new Thread(irAsCompras,"Mãe").start();
        new Thread(irAsCompras,"Filho").start();
    }

}
