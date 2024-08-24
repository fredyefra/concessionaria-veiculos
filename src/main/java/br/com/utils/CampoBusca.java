package br.com.utils;

public enum CampoBusca {

    MES("/references"),
    ;

    private String campo;

    CampoBusca(String campo) {
        this.campo = campo;
    }

    public String getMes(){
        return campo;
    }
}
