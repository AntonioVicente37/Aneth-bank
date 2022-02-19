/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelpackage.bank;


import ferramentas.formatacao;
import java.util.ArrayList;

/**
 *
 * @author Engº António Vicente
 */
public class Conta{
    //Variavel contador para contar o numero de clientes
    private static int contadorContas = 1;
    // Atributos da classe conta
    private int numConta = 0;
    private int iban = 0;
    private double saldo = 0.0;
    private Cliente cliente;
    //atributos para o metodo extrato    
    /*private double extrato = 0.0;
    private String descricao;
    private String tipo = "Conta Corrente" ;*/
    
      public Conta(Cliente cliente, int iban, double saldo) {
          this.numConta = contadorContas;
          this.cliente = cliente;
          this.iban = iban;
          this.saldo = saldo;
          //cada ves que uma conta for criada o nosso contador vai ser incremento
          contadorContas += 1;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
     // funcao responsavel pelo levantamento do valores da classse conta
    public void debitar(double valor){        
        if(this.getSaldo() >= valor && valor != 0 ){
            System.out.println("O valor retirado da sua conta: "+formatacao.doubleToString(valor));
            setSaldo(getSaldo() - valor);
            System.out.println("O seu saldo atual: "+formatacao.doubleToString(this.getSaldo()));
            System.out.println("Levantamento realizado com sucesso");
            //setExtrato(getSaldo());
        }else{
            System.out.println("Erro ao fazer o levantamento, valor insuficiente ou igual a zero");            
            System.out.println("Saldo: "+formatacao.doubleToString(this.getSaldo())); 
        }
    }
    // funcao responsavel pelo deposito da classse conta
   public void creditar(double valor){
        if(valor !=0 ){
            System.out.println("O valor depositado: "+formatacao.doubleToString(valor));
            setSaldo(getSaldo() + valor);
            System.out.println("O seu saldo atual: "+formatacao.doubleToString(this.getSaldo()));           
            System.out.println("Deposito realizado com sucesso");
            //setExtrato(getSaldo());  
        }else{
            System.out.println("Errro ao efectuar o deposito, valor igual a zero");            
            System.out.println("O valor a depositar: "+formatacao.doubleToString(valor));
        }
    } 
     // funcao responsavel pela transferencia dos valor de uma conta a outra
    public void transferir(Conta contaD, Double valor) {
         if(this.getSaldo() >= valor && valor != 0 ){             
             System.out.println("Valor a transferir: "+formatacao.doubleToString(valor));
             setSaldo(getSaldo() - valor);             
             //contaD esta a se referir a conta que vai ser feita a transferencia
             contaD.saldo = contaD.getSaldo() + valor;
            System.out.println("Transferencia realizado com sucesso");
         }else{             
            System.out.println("Erro ao realizar a transferencia! Valor insuficiente");
         }
    }
     //Metodo toString para fazer a impressao dos dados da  nossas contas
    @Override
    public String toString() { 
        return "Numero de conta: " +this.getNumConta()+ "\n"+
               "Nome: " + cliente.getNome() +"\n"+
               "Nif: " + cliente.getNif()+ "\n"+
               "Iban: " + this.iban +"\n"+
               "Saldo: " + formatacao.doubleToString(this.getSaldo())+"\n";
                
                
    }  
    
    /*
       
   //funcao para mostrar o extrato da conta
   public void extrato(){
        System.out.println("\tEXTRATO");
        System.out.println("Nome: " + getNome());
       // System.out.println("Número da conta: " + getNumconta());
        System.out.printf("Saldo atual: %.2f\n "+ getSaldo());
        System.out.println("Descricao: "+ Descricao());
        //System.out.println("Tipo 1: "+ ipo);
        System.out.println("Data: "+ getDateTime());
        System.out.println("Saques realizados hoje: " + getExtrato() + "\n");
   }
    */
    
  /*
       // funcao responsavel por fazer a consulta do saldo da classse contapoupanca
   public void consultarSaldo(int num){
       if(getExtrato() == num){
           System.out.println("O saldo da sua conta e: "+getSaldo()+"kwz");
       }else{
           System.out.println("Conta nao existente");
       }
   }
    */
    
}
