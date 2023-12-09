import java.util.Scanner;

public class odontoEstoque {
static Scanner ler = new Scanner(System.in);
    
public static void ShowProdutos() {        
        System.out.println("""
            Digite o numero do produto que voce deseja selecionar(Digite 0 para fechar):
                           
                ------------Tabela dos Produtos------------
                           
                    1-Bandeja;
                    2-Espelho cli­nico;
                    3-Pinça;
                    4-Escovador;
                    5-Sonda exploradora;
                    6-Esculpidor Hollemback;
                    7-Seringa Carpule;
                    8-Placa de vidro;
                    9-Cubas;
                    10-Pote Dappen;""");
        System.out.println("\n Escolha:");
    }

    public static void main(String[] args) {
        
        int o,p,v,e = 0,r;
        
        int valor[] = new int[10];

        String ProS[] = new String[10];//{"Bandeja","Espelho cli­nico","Pinça","Escovador","Sonda exploradora","Esculpidor Hollemback","Seringa Carpule","Placa de vidro","Cubas","Pote Dappen",};
        ProS[0] = "Bandeja";
        ProS[1] = "Espelho cli­nico";
        ProS[2] = "Pinça";
        ProS[3] = "Escovador";
        ProS[4] = "Sonda exploradora";
        ProS[5] = "Esculpidor Hollemback";
        ProS[6] = "Seringa Carpule";
        ProS[7] = "Placa de vidro";
        ProS[8] = "Cubas";
        ProS[9] = "Pote Dappen";
                
      do{  
      System.out.println("\n\nEscolha:\n1- Adicionar/Repor estoque\n2- Remover estoque\n3- Verificar estoque\n4- Fechar");
            o = ler.nextInt();
            switch (o) {
                case 1 -> {  
       do{
           ShowProdutos();       
            p=ler.nextInt();
        if(p==0){break;}  
        if(p>0 && p<11){  
            do{
            System.out.printf("\nVoce selecionou %d. %s\n\nQuantos voce quer adicionar?(Digite 0 para voltar) ",p,ProS[p-1]);
            v=ler.nextInt();
                if(v<0){System.err.println("Quantidade invalida."); continue;}            
            
            valor[p-1] = valor[p-1]+v;              
            
            if(v==0){System.out.printf("\nAdicionado com sucesso!\n\n");break;}
            
            System.out.printf("Voce adicionou %d %s",v,ProS[p-1]);
            do{
                System.out.println("\n\nEscolha:\n |1-Continuar | 2-Escolher outro produto| 3-Voltar para o menu|");
                e=ler.nextInt();
                    
                        if(e==1){                           
                            break;
                        }else if(e==2){
                            break;
                        }else if(e==3){
                            break;
                        }else{
                            continue;
                        }
                    }while(true);
            if(e==2){break;}
            if(e==3){break;}
            }while(true);
            if(e==3){break;}
            
        }else{       
            System.err.println("Opção Invalida.\n");
            continue;        
        }  
            
       }while(true);
                }
                case 2 ->{
                    do{ 
                        ShowProdutos();
            p=ler.nextInt();
        if(p==0){break;}  
        if(p>0 && p<11){  
            do{
            System.out.printf("\nVoce selecionou %d. %s\n\nQuantos voce quer remover?(Digite 0 para voltar) ",p,ProS[p-1]);
            r=ler.nextInt();
                if(r<0){System.err.println("Quantidade invalida."); continue;}
            
            valor[p-1] = valor[p-1]-r;                               
            
            if(r==0){System.out.printf("\nRemovido com sucesso!\n\n");break;}
                if(valor[p-1]<r){System.err.println("Quantidade insuficiente."); continue;} 
            
            System.out.printf("Voce removeu %d %s",r,ProS[p-1]);
            do{
                System.out.println("\n\nEscolha:\n |1-Continuar | 2-Escolher outro produto| 3-Voltar para o menu|");
                e=ler.nextInt();
                    
                        if(e==1){                           
                            break;
                        }else if(e==2){
                            break;
                        }else if(e==3){
                            break;
                        }else{
                            continue;
                        }
                    }while(true);
            if(e==2){break;}
            if(e==3){break;}
            }while(true);
            if(e==3){break;}
            
        }else{       
            System.err.println("Opção Invalida.\n");
            continue;        
        }              
       }while(true);}
                case 3 ->{
                   int n = 0;
                        System.out.printf("\n----------------------------------");
                    for(int produtos : valor) {
                        System.out.printf("\n|%2d - %-22s: %-3d|",n+1,ProS[n],produtos);
                        n++; 
                    }
                    System.out.printf("\n----------------------------------");
                }
                case 4 ->{System.out.close();}
                default->{}
    }
            if(o==4){break;}
    }while(true);
      
      }   
    }