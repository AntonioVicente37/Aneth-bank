/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelpackage.bank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Engº António Vicente
 */
public class Conta extends Cliente{
 
    private int numconta;
    private int iban;
    private double saldo;
    //atributos para o metodo extrato    
    private double extrato;
    private String descricao;
    private int tipo;
    
    //Construtor da classe conta
    public Conta(int numconta, int iban, double saldo, String n, double extrato) {
        super(n);
        this.numconta = numconta;
        this.iban = iban;
        this.saldo = saldo;
        this.extrato = extrato;
    }
    //construtor extendido da classe cliente
    public Conta(String n) {
        super(n);
    }
    
    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getExtrato() {
        return extrato;
    }

    public void setExtrato(double extrato) {
        this.extrato = extrato;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    //funcao para retornar data e hora atual do sistema
    private String getDateTime() {
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	return dateFormat.format(date);
}
}
