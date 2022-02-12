/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anethbank;
import java.util.ArrayList;
import java.util.Scanner;
import modelpackage.bank.Cliente;
import modelpackage.bank.ContaCorrente;

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
            //System.out.println("\n1.Cadastrar cliente\n2.Listar Clientes");
            //oc = input.nextInt();             
            ClienteCad();
            System.out.println("Cliente cadastrado com sucesso."); 
        }else if(op == 2){
            ContaCC();
            System.out.println("Conta criada com sucesso");
        }else if(op == 3){
             System.out.println("Conta poupanca criada com sucesso");
        }else if(op == 4){
            System.out.println("Qual e o tipo de opercao que deseja executar?"
                    + "\n1.Consultar saldo da conta\n2.extrato da conta\n3.deposito\n4.levantamento\n5.Tranferencia\n6.Pagamentos de servicos");
            oc = input.nextInt();
            
            if(oc == 1){
                ContaCorrente cc = new ContaCorrente();
                System.out.println("informe o numero da conta: ");
                int con = input.nextInt();
                cc.consultarSaldo(con);                           
            }else if(oc == 2){      
                System.out.println("O seu extrato bancario: ");             
            }else if(oc == 3){
                System.out.println("deposito realizado com suceso: ");             
            }else if(oc == 4){
                System.out.println("levantamento realizado com sucesso: ");             
            }else if(oc == 5){
                System.out.println("Transferencia realizada com sucesso: ");             
            }else if(oc == 6){
                System.out.println("Pagamentos de servicos");
            }else{
                System.out.println("Operacao invalida");
            }
           }else if(op > 6){
            System.out.println("Opcao nao exite no nosso sistema");
        }
        
       }while(op !=5);
    }
    
   //funcao para o cadastro de clientes 
  public static void ClienteCad(){
      Scanner input = new Scanner(System.in);
        //Usando a Collection Arraylist para armazenar os dados dos clientes
        ArrayList<Cliente> ls = new ArrayList<Cliente>();
        // Variavel responsavel por controlar o laco do while 
       char ct = 's';
       do{
           System.out.print("Digite o nome do cliente: ");
           String n = input.next();
           System.out.print("Digite o NIF do cliente: ");
           int nf = input.nextInt();
           Cliente c = new Cliente(n,nf);
           //adicionando os dados dos clientes na lista
           ls.add(c); 
           System.out.println("Deseja cadastrar um outro cliente? s ou S para sim.");
           ct = input.next().charAt(0);
           System.out.println("Lista de Clientes:");
       }while (ct == 's' || ct == 'S');
       
        for (Cliente i: ls){
          System.out.println(i);            
        }
  }
  //Funcao responsavel por listar os clientes
  public static void ContaList(){
      /*for (cliente i: lista){
          System.out.println(i);
      }
        /*Cliente c1 = new Cliente("Tino", 123);
        System.out.println(c1);
        Cliente c2 = new Cliente("Jose", 321);
        System.out.println(c2);*/
  }
  public static void ContaCC(){
        ArrayList<ContaCorrente> cl = new ArrayList<ContaCorrente>();
       char ct = 's';
       do{
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do cliente: ");
        String n = input.next();
        System.out.print("Digite o numero da conta: ");
        int nun = input.nextInt();
        System.out.print("Digite o IBAN: ");
        int ib = input.nextInt();
        System.out.print("Digite o valor inicial: ");
        double val = input.nextDouble();
        ContaCorrente cc = new ContaCorrente(n,nun,ib,val);
        
        cl.add(cc); 
        System.out.println("Deseja cadastrar uma outra Conta? s ou S para sim.");
        ct = input.next().charAt(0);       
       }while (ct == 's' || ct == 'S');
       
       System.out.println("Lista de Contas:");
       for (ContaCorrente i: cl){
          System.out.println(i);            
       }
    }
}
