package br.com.entities;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Mes {

    public String code;
    public String month;

    @Override
    public String toString(){
        return "Mês: " + month + " código: " + code;
    }
}
