/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

import estrutura.EstruturaEstatica;

/**
 *
 * @author Programador-03
 */
public class FilaSimples<T> extends EstruturaEstatica<T> {

    public FilaSimples(int capacidade) {
        super(capacidade);
    }

    public FilaSimples() {
        super();
    }

    public void enfileira(T elemento) {
        this.adiciona(elemento);
    }
    
    public T desenfileira(){
        final int POS = 0;
        
        if(this.estaVazia()){
            return null;
        }
        
        T elementoRemovido = this.elementos[POS];
        
        this.remove(POS);
        return elementoRemovido;
    }
    
    public T espiar(){
        return this.elementos[0];
    }
    
    public static void main(String []args){
        FilaSimples<Integer> fila = new FilaSimples();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        
        System.out.println(fila.tamanho());//3
        System.out.println(fila.toString());//[1,2,3]
        
        fila.desenfileira();
        System.out.println(fila.toString());//[2,3]
        fila.desenfileira();
        System.out.println(fila.toString());//[3]
        fila.desenfileira();
        System.out.println(fila.toString());//[]
        
    }
}
