/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SPRA;

/**
 *
 * @author Manu
 */
public class Alun {
     private String nome;
     private String matr;
     private String idade;
     private String turma;
     private String qtdAut;

    public Alun(String nome, String matr, String idade, String turma, String qtdAut) {
        this.nome = nome;
        this.matr = matr;
        this.idade = idade;
        this.turma = turma;
        this.qtdAut = qtdAut;
    }

    public Alun(String matr) {
        this.matr = matr;
    }

    public String getQtdAut() {
        return qtdAut;
    }

    public void setQtdAut(String qtdAut) {
        this.qtdAut = qtdAut;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
     
    
}
