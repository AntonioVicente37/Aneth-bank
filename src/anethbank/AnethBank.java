/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anethbank;
import java.util.ArrayList;
import java.util.Scanner;
import modelpackage.bank.Cliente;

/**
 *
 * @author Engº António Vicente
 */
public class AnethBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("                               ANETH BANK                                     ");
        System.out.println("-------------------------------------------------------------------------------");
        
        Scanner input = new Scanner(System.in);
        
        int op = 0;        
        int oc = 0;
        // Menu de opcoes do sistema bancario
       do{
        System.out.println("1. Cliente");
        System.out.println("2. Criar conta corrente");
        System.out.println("3. Cria conta poupanca");
        System.out.println("4. Conta");
        System.out.println("5. Sair");
        op = input.nextInt();
        
        if(op == 1){
            System.out.println("\n1.Cadastrar cliente\n2.Listar Clientes");
            oc = input.nextInt();
            if(oc == 1){
                // chamando a funcao responsavel pelo cadastramento de usuario
                clienteCad();
                  //System.out.println("Cliente cadastrado com sucesso|");
            }else if(oc == 2){
                System.out.println("Lista dos Clientes:");
                //chamando a funcao responsaver pela listagem de clientes
                clienteList();
               /// System.out.println("Conta Criada com sucesso|");
            }else{
                System.out.println("Opcao nao existente|");
            }          
        }else if(op == 2){
            System.out.println("Conta corrente criada com sucesso");
        }else if(op == 3){
             System.out.println("Conta poupanca criada com sucesso");
        }else if(op == 4){
            System.out.println("Qual e o tipo de opercao que deseja executar?"
                    + "\n1.saldo da conta\n2.extrato da conta\n3.deposito\n4.levantamento\n5.Tranferencia");
            oc = input.nextInt();
            if(oc == 1){
                System.out.println("Consultar saldoe: ");             
            }else if(oc == 2){      
                System.out.println("O seu extrato bancario: ");             
            }else if(oc == 3){
                System.out.println("deposito realizado com suceso: ");             
            }else if(oc == 4){
                System.out.println("levantamento realizado com sucesso: ");             
            }else if(oc == 5){
                System.out.println("Transferencia realizada com sucesso: ");             
            }else{
                System.out.println("Operacao invalida");
            }
        }else if(op > 5){
            System.out.println("Opcao nao exite no nosso sistema");
        }
        
       }while(op !=5);
    }
    
   //funcao para o cadastro de clientes 
  public static void clienteCad(){
      Scanner input = new Scanner(System.in);
        //Usando a Collection Arraylist para armazenar os dados dos clientes
        ArrayList<Cliente> ls = new ArrayList<Cliente>();
        // Variavel responsavel por controlar o laco do while 
       char ct = 's';
       do{
           System.out.println("Digite o nome do cliente: ");
           String n = input.next();
           System.out.println("Digite o NIF do cliente");
           int nf = input.nextInt();
           Cliente c = new Cliente(n,nf);
           //adicionando os dados dos clientes na lista
           ls.add(c);
           System.out.println("Deseja cadastrar um outro cliente? s ou S para sim.");
           ct = input.next().charAt(0);
       }while (ct == 's' || ct == 'S');
       
        for (Cliente i: ls){
          System.out.println(i);
                  
      }
  }
  //Funcao responsavel por listar os clientes
  public static void clienteList(){
      /*for (cliente i: lista){
          System.out.println(i);
      }
        /*Cliente c1 = new Cliente("Tino", 123);
        System.out.println(c1);
        Cliente c2 = new Cliente("Jose", 321);
        System.out.println(c2);*/
  }
}
