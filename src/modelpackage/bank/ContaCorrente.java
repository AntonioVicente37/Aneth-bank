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
public class ContaCorrente extends Conta{
     
    private String descricao;
    private String tipo = "Conta Corrente" ;
    
    //intanciando o construtor da classe conta para a classe filha conta popanca
    public ContaCorrente(String n, int numconta, int iban, double saldo) {
        super(n, numconta, iban, saldo);
    }
     
    public String Descricao(){
         return "Extrato da sua conta criada no Aneth Bank, espero que o senhora esteja satisfeito como  nossoo  atendimento ate ao momento";
    }
    
     // funcao responsavel pelo levantamento de valores da classse contapoupanca
    public void levan(double valor){
        
        if(super.getSaldo() >= valor ){
            System.out.println("O seu saldo e de: "+super.getSaldo());
            System.out.println("O valor a levantar e de : "+valor+" kwz");
            super.setSaldo(super.getSaldo() - 1 - valor);
            System.out.println("Saldo: "+super.getSaldo()+" kwz"); 
            super.setExtrato(super.getSaldo());
        }else{
            System.out.println("Nao lhe e permitido fazer levantamento em sua conta");
        }
    }
    // funcao responsavel pelo deposito da classse contapoupanca
   public void deposito(double valor){
        System.out.println("O seu saldo e de: "+super.getSaldo());
        System.out.println("O valor a depositar: "+valor+" kwz");
        super.setSaldo(super.getSaldo() + valor - 1);
        // aplicando a variacao juros no deposito da conta poupanca, aplicando um juros de 4.4%
        System.out.println("Saldo: "+super.getSaldo()+" kwz"); 
        super.setExtrato(super.getSaldo());  
    } 
   
    // funcao responsavel por fazer a consulta do saldo da classse contapoupanca
   public void consultarSaldo(int num){
       if(getNumconta() == num){
           System.out.println("O saldo da sua conta e: "+super.getSaldo()+"kwz");
       }else{
           System.out.println("Conta nao existente");
       }
   }
   
//funcao para retornar data e hora atual do sistema
    private String getDateTime() {
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	return dateFormat.format(date);
    }
   //funcao para mostrar o extrato da conta
   public void extrato(){
        System.out.println("\tEXTRATO");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Número da conta: " + super.getNumconta());
        System.out.printf("Saldo atual: %.2f\n "+ super.getSaldo());
        System.out.println("Descricao: "+ Descricao());
        System.out.println("Tipo 1: "+ this.tipo);
        System.out.println("Data: "+ getDateTime());
        System.out.println("Saques realizados hoje: " + getExtrato() + "\n");
   }
   
   //Metodo toString para fazer a impressao dos dados das contas na tela

    @Override
    public String toString() { 
        return "Nome do cliente: " + getNome() + "\n" +"Numero da Conta: " + getNumconta()+"\n"
              +"IBAN: " + getIban()+"\n"+"Saldo: " + getSaldo()+"kwz\n";
    }
   
   /*public boolean transfe(double valor, int conta){
       if(valor > 0){
           boolean reti = levant(valor);
           
       }
   }*/
}
