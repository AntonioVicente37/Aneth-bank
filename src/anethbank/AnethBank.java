
package anethbank;
import java.util.ArrayList;
import java.util.Scanner;
import modelpackage.bank.Cliente;
import modelpackage.bank.Conta;

/**
 *
 * @author Engº António Vicente
 */
public class AnethBank {
    //Variavei para receber as informacoes vindas do teclado  
    static Scanner input = new Scanner(System.in);
    static ArrayList<Conta> contasB;
    public static void main(String[] args) {
        //arrays para aramazenar as contas
        contasB = new ArrayList<Conta>();
        System.out.println("-----------------------------------------------------");
        System.out.println("----------Seja bem vindo a nossa agencia-------------");        
        System.out.println("-----------------------------------------------------");
        System.out.println("***************      ANETH BANK       ***************");
        System.out.println("-----------------------------------------------------");
        operacao();
        
    }
    // funcao responsavel por mostrar o menu com as opcoes do sistema
     private static void operacao() {  
        // Menu de opcoes do sistema bancario
        int oc = 0;
        System.out.println("|   opcao 1 - Criar conta      |");
        System.out.println("|   opcao 2 - Listar contas    |");
        System.out.println("|   opcao 3 - Conta poupanca   |");
        System.out.println("|   opcao 4 - Consultar saldo  |");
        System.out.println("|   opcao 5 - Deposito         |");
        System.out.println("|   opcao 6 - Levantamento     |");
        System.out.println("|   opcao 7 - Transferencia    |");
        System.out.println("|   opcao 8 - Extrato          |");
        System.out.println("|   opcao 0 - Sair             |");        
        System.out.print("Escolha uma opcao:");        
        int op = input.nextInt();
        
        switch(op){
            case 1:
            //Chamada do funcao Criar Conta
                criarCont();
                break;
            case 2:
            //Chamada do funcao Listar Conta
                listrCont();
                break;
            case 3:
            //Chamada da funcao Criar Conta Poupanca
               criarContPou();
               break;
            case 4:
            //Chamada da funcao Consulta Saldo
               consultSaldo();
               break;
            case 5:
            //Chamada da funcao para fazer o depositar
                creditar();
                break;
            case 6:
             //Chamada da funcao para fazer o levantamento 
                debitar();
                break;        
            case 7:
             //Chamada da funcao para fazer a transferencia
                trnsfer();
                break;
            case 8:
             //Chamada da funcao para mostrar o extrato
                extract();
                break;
            case 0:
               System.out.println("Obrigada por usar os nossos servicos!");
               System.exit(0); 
             default:   
                System.out.println("Opcao invalida! Tente novamente");
                operacao();
                break;
        }
     }
    
     private static void criarCont() {
         //informando os dados para criar um cliente
        System.out.print("Digite o seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite o seu NIF: ");
        int nif = input.nextInt();
        //Passando os dados necessarios para criar uma conta
        System.out.print("Digite o seu IBAN: ");
        int iban = input.nextInt();
        System.out.print("Informe o seu deposito inicial: ");  
        double saldo = Double.parseDouble(input.nextLine());
        if(saldo >= 5000){
            //adicionando os clientes a classe cliente
           Cliente cliente = new Cliente(nome,nif);
           //adicionando a conta do cliente a classe Conta
           Conta conta = new Conta(cliente, iban, saldo);
            contasB.add(conta);
        }else{
            System.out.println("Valor insuficiente para fazer a abertura da sua conta Sr: "+nome);
        }
        //chamando a funcao operacao novamente
        operacao();
     }

    private static void listrCont() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void criarContPou() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void consultSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void creditar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void debitar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void trnsfer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void extract() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   //funcao para o cadastro de clientes 
  /*public static void ClienteCad(){
       Scanner input = new Scanner(System.in);
        String nome, nif, iban, tipo= "";
        double saldo = 0;
    
        System.out.print("Digite o teu primeiro nome: ");
        nome = input.nextLine();
        System.out.print("Digite o seu NIf: ");
        nif = input.nextLine();
        System.out.print("Digite o seu Iban: ");
        iban = input.nextLine();
        System.out.print("Informe o seu deposito inicial: ");  
        saldo = Double.parseDouble(input.nextLine());
           
        /// agora estamos a criar um nova conta
        
        //comecand a instanciar a classe cliente
         Cliente cliente = new Cliente(nome,nif,iban,saldo);
        //adicionando o cliente ao banco
        Conta conta = new Conta();
        conta.addClinte(cliente);
     
  }*/
  //Funcao responsavel por listar os clientes
  /*public static void deposito(){      
    Scanner input = new Scanner(System.in);
     int cont = selecConta();     
     System.out.print("Qual e o valor que deseja depositar: ");
     double valor = 0;
     try{
         valor = Double.parseDouble(input.nextLine());
     }catch(NumberFormatException e){
         valor =0;
     }
     
     Conta conta = new Conta();
     conta.getCliente(cont).depositar();
      
  }
  //fazer levantamento
   public static void levant(){
     int conta = selecConta();
      
  }*/
  //Selecionar uma conta para fazer o depoisito
   /* private static int selecConta() {
        return 0;
    }*/
  /*public static void ContaCC(){
       // ArrayList<ContaCorrente> cl = new ArrayList<ContaCorrente>();
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
        Cliente cliente = new Cliente(n,nun,ib,val);
        conta.addCliente(cliente);
        //cl.add(cc); 
        System.out.println("Deseja cadastrar uma outra Conta? s ou S para sim.");
        ct = input.next().charAt(0);       
       }while (ct == 's' || ct == 'S');
       
      /* System.out.println("Lista de Contas:");
       for (ContaCorrente i: cl){
          System.out.println(i);            
       }
    }*/
   
 }
