package uc;


import util.Ticket;

import java.io.Serializable;


public class Outra extends Ticket implements Serializable {


    public Outra(int startRange,int endRange, int qtdNumeros, String nome) {
        super(startRange, endRange, qtdNumeros, nome);
    }


}