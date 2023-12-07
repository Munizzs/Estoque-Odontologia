import java.util.Scanner;

public class odontoEstoque {   
    public static void main(String[] args) {
        Scanner ler = new  Scanner(System.in);
       int qtd=0, o, rp, rm1, rm2;
        System.out.println("--------------------Estoque--------------------");    
        do{
        System.out.println("\n\nEscolha:\n1- Para repor estoque\n2-Retirar estoque");
        o = ler.nextInt();    
            if(o == 1){
            do{
                System.out.println("\n\nQuantos voce quer repor?(Digite 0 para fechar)");
                rp = ler.nextInt();                   
                    qtd = qtd + rp;                   
                        System.out.println("\nVoce colocou "+rp+"\nQuantidade "+qtd);
                if(rp == 0){                  
                    System.out.println("\n\nAdicionado com sucesso!\nArmazenado "+qtd);
                    break;
                }}while(true);
            }else if(o==2){           
            do{
                System.out.println("\n\nQuantos voce quer retirar?(Digite 0 para fechar)");
                rm1 = ler.nextInt();                    
                    qtd = qtd - rm1;
                    if (qtd < 0){
                        System.out.println("Quantidade insuficiente");
                        break;
                    }
                        System.out.println("\nVoce removeu "+rm1+"\nQuantidade "+qtd);
                if(rm1 == 0){                   
                    System.out.println("\n\nRemovido com sucesso!\nArmazenado "+qtd);
                    break;
                }}while(true);       
            }else{
            System.out.println("Opção inválida, digite novamente!");
           
            }}while(true);
    }               
    }