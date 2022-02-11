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
public class ContaPoupanca extends Conta{
    //Classe responsavel pela a criacao da conta poupanca
    private double variacao;
    private double limite;
    // trabalhar com o numconta e o ibam e o nome do cliente
    public ContaPoupanca(int numconta, int iban, double saldo, String n) {
        super(numconta, iban, saldo, n);
    }
    
    public double getVariacao() {
        return variacao;
    }

    public void setVariacao(double variacao) {
        this.variacao = variacao;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    // funcao responsavel pelo levantamento de valores
    public void levan(double valor){
        double lm = 50000;
        if(this.limite > lm ){
            System.out.println("O seu saldo e de: "+super.getSaldo());
            System.out.println("O valor a levantar e de : "+valor+" kwz");
            super.setSaldo(super.getSaldo() - 1 - valor);
            System.out.println("Saldo: "+super.getSaldo()+" kwz"); 
            super.setExtrato(super.getSaldo());
        }else{
            System.out.println("Escedeu o valor limite que pode levantar da sua conta");
        }
    }
    // funcao responsavel pelo deposito
    public void deposito(double valor){
        this.variacao = 4.4;
        System.out.println("O seu saldo e de: "+super.getSaldo());
        System.out.println("O valor a depositar: "+valor+" kwz");
        super.setSaldo(super.getSaldo() + valor - 1);
        // aplicando a variacao juros no deposito da conta poupanca, aplicando um juros de 4.4%
        super.setSaldo((this.variacao / getSaldo() * 100));
        System.out.println("Saldo: "+super.getSaldo()+" kwz"); 
        super.setExtrato(super.getSaldo());
        
    }    
}
