import java.util.Scanner;

public class odontoEstoque {   
    public static void main(String[] args) {
        Scanner ler = new  Scanner(System.in);
       int qtd=0, o, rp, rm1, rm2,p, pe, pq;
       String produtos[] = new String[10];//{"Bandeja","Espelho cli­nico","Pinça","Escovador","Sonda exploradora","Esculpidor Hollemback","Seringa Carpule","Placa de vidro","Cubas","Pote Dappen",};
       produtos[0] = "Bandeja";
       produtos[1] = "Espelho cli­nico";
       produtos[2] = "Pinça";
       produtos[3] = "Escovador";
       produtos[4] = "Sonda exploradora";
       produtos[5] = "Esculpidor Hollemback";
       produtos[6] = "Seringa Carpule";
       produtos[7] = "Placa de vidro";
       produtos[8] = "Cubas";
       produtos[9] = "Pote Dappen";
        System.out.println("--------------------Estoque--------------------");    
        do{
        System.out.println("\n\nEscolha:\n1- Para repor estoque\n2- Retirar estoque\n3- Verificar estoque\n4- Fechar");
        o = ler.nextInt();    
            switch(o){
                case 1 ->{
            do{
                System.out.println("Digite o numero do produto que voce deseja adicionar(Digite 0 para fechar):\n\n---Tabela dos Produtos---\n\n1-Bandeja\n2-Espelho clÃ­nico\n3-PinÃ§a\n4-Escovador\n5-Sonda exploratÃ³ria\n6-Esculpidor Hollemback\n7-Seringa Carpule\n8-Placa de vidro\n9-Cubas\n10-Pote Dappen");
                System.out.println("\n\n Escolha:");
                p=ler.nextInt();
                if(p >= 1 && p <= 10){
                System.out.printf("\nVoce escolheu %s",produtos[p-1]);
                
                System.out.println("\n\nQuantos voce quer adicionar/repor?(Digite 0 para fechar)");
                rp = ler.nextInt();                   
                    produtos[p] = produtos[p] + rp;                   
                        System.out.println("\nVoce adicionou "+rp+" "+produtos[p-1]+"\nQuantidade total de "+produtos[p-1]+": \n"+produtos[p]);
                        //Resolver a quantidade armazenada em cada produto
                }else if(p == 0){                  
                    System.out.println("\n\nAdicionado com sucesso!\nArmazenado "+qtd);
                    break;
                }else{System.out.println("Opção invalida!");}    
                }while(true);
                }
            case 2 ->{           
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
            }case 3 ->{
                
                
                
            }case 4 ->{
                System.out.println("Voce saiu do sistema!");
                return;
                
            }           
            default ->{
            System.out.println("Opção inválida, digite novamente!");
           
            }
            }
    }while(true);               
    }
}