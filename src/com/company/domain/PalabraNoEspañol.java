package com.company.domain;

public class PalabraNoEspañol extends Palabra {
    private String pronunciacion;

    public PalabraNoEspañol(String pronunciacion, String palabra, String significado, String idioma) {
        super(palabra,significado,idioma);
        this.pronunciacion = pronunciacion;
    }

    public String getPronunciacion() {
        return pronunciacion;
    }

    public void setPronunciacion(String pronunciacion) {
        this.pronunciacion = pronunciacion;
    }
}
