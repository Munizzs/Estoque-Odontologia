import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class odontoEstoque {
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    static Scanner ler = new Scanner(System.in);
    static String NewC [][]= new String[10][2]; 
    
    //Método de Criar Conta
    public static void CreateNewLogin(){
        int conta = 0;
        
        System.out.println("   ---NEW LOGIN---");
         
         boolean account;
         do{
         if (NewC[conta][0] == null && NewC[conta][1] == null){
        
        System.out.println("Type your new username");
         NewC[conta][0]=ler.nextLine();
         
         System.out.println("\nType your new password");
         NewC[conta][1]=ler.nextLine();
         Login();
         break;
         
         }else{
         conta++;
         continue;       
         }        
         }while(true);
    }
    
    //Método de login
    public static void Login(){
    
       int cont = 0;
       String user = null, password = null;
     do{ 
         
         System.out.println("   ---LOGIN---\n");
         
         for (String[] linha : NewC) {
            for (String elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println(); 
        }
         
         System.out.println("\nType your username");
         user=ler.nextLine();
         
         System.out.println("\nType your password");
         password=ler.nextLine();
        
         
         do{
         if(user.equals(NewC[cont][0]) && password.equals(NewC[cont][1])){
              
           System.out.println(ANSI_GREEN + "\nAllowed user" + ANSI_RESET+"\n");
           break;
       }else if (NewC[cont][0] == null && NewC[cont][1] == null){
           System.out.println(ANSI_RED +"\nPassword or username is incorrect" + ANSI_RESET+"\n");
           continue;    
           
       }else{
       cont++;
       continue;
       }
         
         }while(true);
         break;
       }while(true);
    }
        

    //Método para carregar os dados salvos
    public static void Carregar(int[] valor, String[] ProS) {
        String DiretorioE = "C:\\Estoquee";
        String ArquivoS = "SalvarEstoque.txt";
        
        // Este objeto representa o arquivo onde os dados do estoque são armazenados.
        File arq = new File(DiretorioE, ArquivoS);
        
        // Verificação da Existência do Arquivo
        if (arq.exists()) {
            try {
                // se caso existir ele lê o arquivo
                Scanner scanner = new Scanner(arq);
                
                /* O programa entra em um loop que continua enquanto houver mais linhas no arquivo
                e o índice i for menor que o comprimento do array valor. 
                
                -Lê a linha e divide-a em duas partes usando o delimitador ?:?.
                -Se a linha tiver exatamente duas partes, atribui a primeira parte (nome do produto) 
                ao array ProS e a segunda parte (quantidade) ao array valor. A quantidade é convertida 
                de uma string para um inteiro usando Integer.parseInt().*/
                int i = 0;
                while (scanner.hasNextLine() && i < valor.length) {
                    String linha = scanner.nextLine();
                    String[] partes = linha.split(":");
                    if (partes.length == 2) {
                        ProS[i] = partes[0].trim();
                        valor[i] = Integer.parseInt(partes[1].trim());
                        i++;
                    }
                }

                scanner.close();
            
            /*Se ocorrer uma exceção IOException durante a leitura do arquivo,
            o programa imprime uma mensagem de erro.*/    
            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            }
        }
    }

    //Método para salvar.
    public static void Salvar(int[] valor, String[] ProS) {

        String DiretorioE = "C:\\Estoquee";
        String ArquivoS = "SalvarEstoque.txt";

        File dir = new File(DiretorioE);
        if (!dir.exists()) {
            if (dir.mkdir()) {
                System.out.println(ANSI_GREEN + "Diretório criado com sucesso!" + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED + "Erro na criação do diretório." + ANSI_RESET);
                return;
            }
        }

        File arq = new File(DiretorioE, ArquivoS);
        try {
            if (arq.createNewFile()) {
                System.out.println(ANSI_GREEN + "Arquivo SalvarEstoque.txt criado com sucesso!" + ANSI_RESET);
            } else {
                //System.out.println(ANSI_RED + "Arquivo já existente." + ANSI_RESET);
            }

            FileWriter writer = new FileWriter(arq);
            for (int i = 0; i < valor.length; i++) {
                writer.write(ProS[i] + ": " + valor[i] + "\n");
            }
            writer.close();

        } catch (IOException e) {
            System.out.println(ANSI_RED + "Erro ao criar o arquivo: " + e.getMessage() + ANSI_RESET);
        }

    }

    //Método Para exibir o menu.
    public static void ExibirMenu() {
        System.out.println("\n-----Gerenciamento de Estoque-----\n\n1- Adicionar/Repor estoque\n2- Remover estoque\n3- Verificar estoque\n4- Salvar e Fechar\n\n----------------------------------");
    }

    //Método para mostrar o menu.
    public static void MostrarProdutos() {
        System.out.println("""
                          
            Digite o número do produto que você deseja selecionar (Digite 0 para fechar):
                          
                ------------Tabela dos Produtos------------
                          
                    1-Bandeja;
                    2-Espelho clínico;
                    3-Pinça;
                    4-Escovador;
                    5-Sonda exploradora;
                    6-Esculpidor Hollemback;
                    7-Seringa Carpule;
                    8-Placa de vidro;
                    9-Cubas;
                    10-Pote Dappen;""");
        System.out.println("\nEscolha:");
    }

    //Método Para exibir o estoque.
    public static void ExibirEstoque(int[] valor, String[] ProS) {
        int n = 0;
        System.out.print("\n----------------------------------");
        for (int produtos : valor) {
            System.out.printf("\n|%2d - %-22s: %-3d|", n + 1, ProS[n], produtos);
            n++;
        }
        System.out.print("\n----------------------------------\n\n");
    }

    //Método Para salvar e fechar.
    public static void SalvarEncerrar(int[] valor, String[] ProS) {
        Salvar(valor, ProS);
        System.out.println(ANSI_GREEN + "Dados salvos. Encerrando o programa." + ANSI_RESET);
        System.exit(0);
    }

    public static void main(String[] args) {

        int o, p, v, r, e = 0;
        /*
        o - Opção do menu;
        p - Produto selecionado;
        v - Quantidade armazenada de cada produto;
        r - Quantidade que deseja remover de cada produto;
        e - Escolha das três opções após adicionar/remover produto;
        */

        int[] valor = new int[10];

        String[] ProS = new String[10];
        ProS[0] = "Bandeja";
        ProS[1] = "Espelho clínico";
        ProS[2] = "Pinça";
        ProS[3] = "Escovador";
        ProS[4] = "Sonda exploradora";
        ProS[5] = "Esculpidor Hollemback";
        ProS[6] = "Seringa Carpule";
        ProS[7] = "Placa de vidro";
        ProS[8] = "Cubas";
        ProS[9] = "Pote Dappen";

        Carregar(valor, ProS);
        CreateNewLogin();
        //Login();
        do {           
            try {
                ExibirMenu();
                o = ler.nextInt();
            } catch (Exception b) {
                System.out.println(ANSI_RED + "Valor não é um número inteiro positivo" + ANSI_RESET);
                ler.nextLine();
                continue;
            }
            switch (o) {//switch das 4 opções.
                case 1 -> {//Adicionar Produto.
                    do {
                        MostrarProdutos();
                        try {
                            p = ler.nextInt();
                        } catch (Exception b) {
                            System.out.println(ANSI_RED + "Valor não é um número inteiro positivo" + ANSI_RESET);
                            ler.nextLine();
                            continue;
                        }
                        if (p == 0) {
                            System.out.println("\n\nPressione Enter para continuar...\n\n");
                            ler.nextLine();
                            ler.nextLine();
                            break;
                        }
                        if (p > 0 && p < 11) {
                            do {
                                try {
                                    System.out.printf("\nVocê selecionou %d. %s\n\nQuantos você quer adicionar? (Digite 0 para voltar) ", p, ProS[p - 1]);
                                    v = ler.nextInt();
                                } catch (Exception b) {
                                    System.out.println(ANSI_RED + "Valor não é um número " + ANSI_RESET);
                                    ler.nextLine();
                                    continue;
                                }
                                if (v < 0) {
                                    System.out.println(ANSI_RED + "Quantidade inválida." + ANSI_RESET);
                                    continue;
                                }
                                if (v > 1000000) {
                                    System.out.println(ANSI_RED + "Limite do estoque atingido" + ANSI_RESET);
                                    continue;
                                }

                                valor[p - 1] = valor[p - 1] + v;

                                if (v == 0) {    
                                    break;
                                }

                                System.out.printf(ANSI_GREEN + "Você adicionou %d %s", v, ProS[p - 1] + ANSI_RESET);
                                do {
                                    try {
                                        System.out.println("\n\nEscolha:\n |1-Continuar | 2-Escolher outro produto| 3-Voltar para o menu|");
                                        e = ler.nextInt();
                                    } catch (Exception b) {
                                        System.out.println(ANSI_RED + "Valor não é um número " + ANSI_RESET);
                                        ler.nextLine();
                                        continue;
                                    }
                                    if (e == 1) {
                                        break;
                                    } else if (e == 2) {
                                        break;
                                    } else if (e == 3) {
                                        break;
                                    } else {
                                        System.out.println(ANSI_RED + "Opção Inválida.\n" + ANSI_RESET);
                                    }
                                } while (true);
                                if (e == 2) {
                                    break;
                                }
                                if (e == 3) {
                                    break;
                                }
                            } while (true);
                            if (e == 3) {
                                break;
                            }
                        } else {
                            System.out.print(ANSI_RED + "Opção Inválida.\n" + ANSI_RESET);
                        }
                    } while (true);
                }
                case 2 -> {//Remover Produto.
                    do {
                        MostrarProdutos();
                        try {
                            p = ler.nextInt();
                        } catch (Exception b) {
                            System.out.println(ANSI_RED + "Valor não é um número " + ANSI_RESET);
                            ler.nextLine();
                            continue;
                        }
                        if (p == 0) {
                                    System.out.println("\n\nPressione Enter para continuar...\n\n");
                                    ler.nextLine();
                                    ler.nextLine();
                            break;
                        }
                        if (p > 0 && p < 11) {
                            do {
                                try {
                                    System.out.printf("\nVocê selecionou %d. %s\n\nQuantos você quer remover? (Digite 0 para voltar) ", p, ProS[p - 1]);
                                    r = ler.nextInt();
                                } catch (Exception b) {
                                    System.out.println(ANSI_RED + "Valor não é um número " + ANSI_RESET);
                                    ler.nextLine();
                                    continue;
                                }
                                if (r > 0 && valor[p - 1] >= r) {
                                    valor[p - 1] = valor[p - 1] - r;
                                    System.out.printf(ANSI_GREEN + "Você removeu %d %s", r, ProS[p - 1] + ANSI_RESET);
                                } else if (r == 0) {  
                                    break;
                                } else {
                                    System.out.println(ANSI_RED + "Quantidade inválida." + ANSI_RESET);
                                    continue;
                                }
                                do {
                                    try {
                                        System.out.println("\n\nEscolha:\n |1-Continuar | 2-Escolher outro produto| 3-Voltar para o menu|");
                                        e = ler.nextInt();
                                    } catch (Exception b) {
                                        System.out.println(ANSI_RED + "Valor não é um número " + ANSI_RESET);
                                        ler.nextLine();
                                        continue;
                                    }
                                    if (e == 1) {
                                        break;
                                    } else if (e == 2) {
                                        break;
                                    } else if (e == 3) {
                                        break;
                                    } else {
                                        System.out.print(ANSI_RED + "Opção Inválida.\n" + ANSI_RESET);
                                    }
                                } while (true);
                                if (e == 2) {
                                    break;
                                }
                                if (e == 3) {
                                    break;
                                }
                            } while (true);
                            if (e == 3) {
                                break;
                            }
                        } else {
                            System.out.print(ANSI_RED + "Opção Inválida.\n" + ANSI_RESET);
                        }
                    } while (true);
                }
                case 3 -> {//Ver quantidade de Produtos.                   
                    ExibirEstoque(valor, ProS);
                    System.out.println("\n\nPressione Enter para continuar...\n\n");
                    ler.nextLine();
                    ler.nextLine();
                    }
                case 4 -> //Salvar e fechar o programa.
                    SalvarEncerrar(valor, ProS);
                default -> System.out.println(ANSI_RED + "Opção Inválida.\n" + ANSI_RESET);
            }
            if (o == 4) {
                break;
            }
        } while (true);
    }
}