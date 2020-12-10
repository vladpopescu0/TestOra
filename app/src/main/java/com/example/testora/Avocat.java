package com.example.testora;

import android.text.Editable;

public class Avocat extends Persoana{

    String barou,numeCaz;

    public Avocat(){

    }
    public Avocat(String nume,String varsta,String barou,String numeCaz,String vechime){
        super(nume,varsta,vechime);
        this.barou=barou;
        this.numeCaz=numeCaz;

    }
    public String getBarou(){
        return barou;
    }
    public String getNumeCaz(){
        return numeCaz;
    }
}
