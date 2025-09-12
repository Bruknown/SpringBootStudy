package com.brunosoft.produtosAPI.model;

import com.brunosoft.produtosAPI.enums.Montadora;

import java.awt.*;

public class HondaHRV extends Carro{

    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HRV");
        setCor(Color.BLACK);
        setMontadora(Montadora.HONDA);
    }

}
