package com.example.testora;

import android.text.Editable;

public class Doctor extends Persoana{

    String nr_cazuri,pacienti;


    public Doctor(String nume,String varsta,String nr_cazuri,String pacienti,String vechime){
        super(nume,varsta,vechime);
        this.nr_cazuri=nr_cazuri;
        this.pacienti=pacienti;

    }
    public String getNr_cazuri(){
        return nr_cazuri;
    }
    public String getPacienti(){
        return pacienti;
    }
}
