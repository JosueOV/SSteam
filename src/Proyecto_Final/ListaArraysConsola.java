/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_Final;

/**
 *
 * @author YaSabesQuienSoy =D
 */
public class ListaArraysConsola {
    private final Consola [] lista;
    private final int MAX = 100;
    private int N;

    public ListaArraysConsola() {
        lista = new Consola[MAX];
        N = 0;
    }
    public void add(Consola c) {
        lista[N] = c;
        N = N + 1;
    }
    public void edit(Consola c, int pos) {
        lista[pos] = c;
    }
    public void delete(int pos) {
        for (int i = pos; i < N - 1; i++) {
            lista[i] = lista[i + 1];
        }
        N = N - 1;
    }
//    public int buscar(int codigo){
//        int pos = -1;
//        for(int i=0; i<N;i++){
//            if (lista[i].setCodigo(i).equals(codigo))
//                pos = i;
//        }
//    return pos;
//    }
    public void imprimeLista() {
        for (int i = 0; i < N; i++) {
            System.out.println(lista[i].toString());
        }
    }
    public Consola get_persona(int pos){
        if (pos>=0 && pos <N)
            return lista[pos];
        else 
            return null;
    }

    public int count() {
        return N;
    }

}

