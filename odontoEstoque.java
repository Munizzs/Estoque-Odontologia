import java.util.Scanner;

public class odontoEstoque {
static Scanner ler = new Scanner(System.in);
    
public static void ShowProdutos() {        
        System.out.println("""
                          
            Digite o n�mero do produto que voc� deseja selecionar(Digite 0 para fechar):
                          
                ------------Tabela dos Produtos------------
                          
                    1-Bandeja;
                    2-Espelho cli�nico;
                    3-Pin�a;
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
        

        String ProS[] = new String[10];//{"Bandeja","Espelho cli-nico","Pin�a","Escovador","Sonda exploradora","Esculpidor Hollemback","Seringa Carpule","Placa de vidro","Cubas","Pote Dappen",};
        ProS[0] = "Bandeja";
        ProS[1] = "Espelho cli�nico";
        ProS[2] = "Pin�a";
        ProS[3] = "Escovador";
        ProS[4] = "Sonda exploradora";
        ProS[5] = "Esculpidor Hollemback";
        ProS[6] = "Seringa Carpule";
        ProS[7] = "Placa de vidro";
        ProS[8] = "Cubas";
        ProS[9] = "Pote Dappen";
                
      do{
          try{
      System.out.println("\n\nEscolha:\n1- Adicionar/Repor estoque\n2- Remover estoque\n3- Verificar estoque\n4- Fechar");
            o = ler.nextInt(); 
            /*Nessas linhas de c�digo, � mostrado um simples menu onde o usu�rio digita um valor desejado entre 1 e 4
            e � armazenado na vari�vel o(Op��o).*/
          } catch(Exception b ){            
                    System.out.println("Valor n�o � um n�mero ");
                ler.nextLine();
                continue;}
          //Caso o usu�rio digitar um valor n�o inteiro ele mostra uma mensagem de erro.
              switch (o) {
                case 1 -> {  
      do{
          
          ShowProdutos(); 
          try { 
            p=ler.nextInt();
            /*Aqui � mostrado uma lista de produtos que pede para o usu�rio selecionar um deles digitando um n�mero entre 1 e 10.*/          
          } catch(Exception b ){
                    System.out.println("Valor n�o � um n�mero ");
                ler.nextLine();
                continue;}
          //Caso o usu�rio digitar um valor n�o inteiro ele mostra uma mensagem de erro.
        if(p==0){break;} 
        //Se o valor digitado for 0 ele volta para o menu.
        if(p>0 && p<11){ 
                
            do{
                try{ 
            System.out.printf("\nVoce selecionou %d. %s\n\nQuantos voc� quer adicionar?(Digite 0 para voltar) ",p,ProS[p-1]);
            v=ler.nextInt();
            //O usu�rio coloca um valor para ser armazenado no estoque na vari�vel v
                } catch(Exception b ){
                    System.out.println("Valor n�o � um n�mero ");
                ler.nextLine();
                continue;}
                //Caso o usu�rio digitar um valor n�o inteiro ele mostra uma mensagem de erro.
                if(v<0){System.out.println("Quantidade invalida."); continue;} 
                //mensagem de erro caso o valor digitado em v for menor que 0.
            if (v > 1000000){
                    System.out.println("Limite do estoque atingido");
            continue; }
            //mensagem de erro caso o valor for maior que 1.000.000.
            
            valor[p-1] = valor[p-1]+v;  
          //C�lculo para armazenar o valor de v digitado na array.
            
            if(v==0){System.out.printf("\nAdicionado com sucesso!\n\n");break;}

            System.out.printf("Voce adicionou %d %s",v,ProS[p-1]);
            do{
                try{
                System.out.println("\n\nEscolha:\n |1-Continuar | 2-Escolher outro produto| 3-Voltar para o menu|");
                e=ler.nextInt();
                //Na vari�vel e recebe um n�mero de 1 a 3 e leva o usu�rio para suas respectivas fun��es.
                } catch(Exception b ){
                    System.out.println("Valor n�o � um n�mero ");
                ler.nextLine();
                continue;} 
                //Caso o usu�rio digitar um valor n�o inteiro ele mostra uma mensagem de erro.
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
            System.out.println("Op��o Invalida.\n");
            //mensagem de erro.
            continue;        
        }            
      }while(true);
                }
                case 2 ->{
                    do{                        
                        ShowProdutos();
                        try{
            p=ler.nextInt();
                        } catch(Exception b ){
                    System.out.println("Valor n�o � um n�mero ");
                ler.nextLine();
                continue;}
                        //Caso o usu�rio digitar um valor n�o inteiro ele mostra uma mensagem de erro.
        if(p==0){break;}  
        if(p>0 && p<11){  
            do{
                try{
            System.out.printf("\nVoce selecionou %d. %s\n\nQuantos voc� quer remover?(Digite 0 para voltar) ",p,ProS[p-1]);
            r=ler.nextInt();
            //O usu�rio coloca um valor para ser removido no estoque na vari�vel r
                } catch(Exception b ){
                    System.out.println("Valor n�o � um n�mero ");
                ler.nextLine();
                continue;}
                //Caso o usu�rio digitar um valor n�o inteiro ele mostra uma mensagem de erro.
                if(r>0 && valor[p-1]>=r){               
            
            valor[p-1] = valor[p-1]-r;
            //C�lculo para armazenar o valor de v digitado na array.                     
            
            System.out.printf("Voce removeu %d %s",r,ProS[p-1]);
                }else if(r==0){System.out.printf("\nRemovido com sucesso!\n\n");break;
                }else{System.out.println("Quantidade invalida."); continue;}
            do{
                try {
                System.out.println("\n\nEscolha:\n |1-Continuar | 2-Escolher outro produto| 3-Voltar para o menu|");
                e=ler.nextInt();
                //Na vari�vel e recebe um n�mero de 1 a 3 e leva o usu�rio para suas respectivas fun��es.
                } catch(Exception b ){
                    System.out.println("Valor n�o � um n�mero ");
                ler.nextLine();
                continue;}
                //Caso o usu�rio digitar um valor n�o inteiro ele mostra uma mensagem de erro.
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
            System.out.println("Op��o Invalida.\n");
            //mensagem de erro.
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
                //Aqui � mostrado a quantidade de cada produto.
                case 4 ->{System.out.close();}
                //Nessa linha acima o c�digo � finalizado.
                default->{}
    }
            if(o==4){break;}
    }while(true);
      
      }  
    }