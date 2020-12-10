package com.example.testora;

public class Persoana {

    String nume,varsta,vechime;

    public Persoana(){

    }
    public Persoana(String nume,String varsta,String vechime){
        this.nume=nume;
        this.varsta=varsta;
        this.vechime=vechime;
    }
    public String getNume(){
        return nume;
    }
    public String getVarsta(){
        return varsta;
    }
    public String getVechime(){
        return vechime;
    }
}
