import java.util.Scanner;

public class odontoEstoque {
static Scanner ler = new Scanner(System.in);
    
public static void ShowProdutos() {        
        System.out.println("""
            Digite o numero do produto que voce deseja adicionar(Digite 0 para fechar):
                           
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

   public static int[] inicializarEstoque() {
        int[] estoque = new int[10];
        for (int i = 0; i < estoque.length; i++) {
            estoque[i] = 0;
        }
        return estoque;
    }
    
    

    public static void main(String[] args) {
        
        int qtd = 0, o, rp, rm1 = 0, rm2,  pe, pq, valorT = 0;
        int[] estoque = inicializarEstoque();          

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

        System.out.println("--------------------Estoque--------------------");
        do {
            System.out.println("\n\nEscolha:\n1- Para repor estoque\n2- Retirar estoque\n3- Verificar estoque\n4- Fechar");
            o = ler.nextInt();
            switch (o) {
                case 1 -> {
                    do {
                        ShowProdutos();
                        int p = ler.nextInt();                       
                       

                        if (p >= 1 && p <= 10) {
                            int quantidadeAtual = estoque[p - 1];
                            System.out.printf("\nVoce escolheu %d - %s", p, ProS[p-1]);

                            System.out.println("\n\nQuantos voce quer adicionar/repor?(Digite 0 para fechar)");
                            rp = ler.nextInt();
                            quantidadeAtual += rp;
                            estoque[p - 1] = quantidadeAtual;
                            System.out.println("---\nVoce adicionou " + rp + " " + ProS[p-1] + "\n\nQuantidade total de " + ProS[p-1] + ": " + quantidadeAtual+"\n---");
                            //Resolver a quantidade armazenada em cada produto
                        } else if (p == 0) {
                            System.out.println("\n\nAdicionado com sucesso!\nArmazenado " + qtd);
                            break;
                        } else {
                            System.out.println("Opção invalida!");
                        }
                    } while (true);
                }
                case 2 -> {
                    do {
                        ShowProdutos();
                        int p = ler.nextInt(); 
                        if(p >= 1 && p<=10){
                            
                        int quantidadeAtual = estoque[p - 1];
                            System.out.printf("\nVoce escolheu %d - %s", p, ProS[p-1]);    
                        
                        System.out.println("\n\nQuantos voce quer retirar?(Digite 0 para fechar)");
                        rm1 = ler.nextInt();
                        
                        quantidadeAtual -= rm1;
                        estoque[p - 1] = quantidadeAtual;
                        
                        if (quantidadeAtual < 0) {
                            System.out.println("Quantidade insuficiente");
                            break;
                        }
                        System.out.println("\nVoce removeu " + rm1 + "\nQuantidade " + estoque[p - 1]);
                        
                        }else if (rm1 == 0) {
                            System.out.println("\n\nRemovido com sucesso!");
                            break;
                        }else {
                            System.out.println("Opção invalida!");
                        }
                       /* System.out.println("\n\nQuantos voce quer retirar?(Digite 0 para fechar)");
                        rm1 = ler.nextInt();
                        qtd = qtd - rm1;
                        if (qtd < 0) {
                            System.out.println("Quantidade insuficiente");
                            break;
                        }
                        System.out.println("\nVoce removeu " + rm1 + "\nQuantidade " + qtd);
                        if (rm1 == 0) {
                            System.out.println("\n\nRemovido com sucesso!\nArmazenado " + qtd);
                            break;
                        }*/
                    } while (true);
                }
                case 3 -> {

                }
                case 4 -> {
                    System.out.println("Voce saiu do sistema!");
                    return;

                }
                default -> {
                    System.out.println("Opção inválida, digite novamente!");

                }
            }
        } while (true);
    }
}