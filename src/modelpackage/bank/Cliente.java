/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelpackage.bank;

/**
 *
 * @author Engº António Vicente
 */
public class Cliente {
    // iniciando a criacao da classe clinete 
    private String nome;
    private int nif;
    
    //construtor da classe Cliente
    public Cliente(String n) {
        //this.nome = nome;
        //this.nif = nif;
        this.setNome(n);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }
    
    //Metodo toString para fazer a impressao dos dados dos nossos clientes na tela

    @Override
    public String toString() { 
        return "Nome: " + getNome() + "\n" +"Nif: " + getNif()+"\n";
    }
    
}
