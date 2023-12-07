import java.util.Scanner;

public class odontoEstoque {
        public static void main(String[] args) {
            Scanner ler = new  Scanner(System.in);
            int qtd=0, o, rp, rm1, prod,produ, band=0, esp_cli=0, pin=0, esco=0, son_expl=0, esculHolle=0, serin=0, placVidro=0, cubas=0, potedappen=0;
            System.out.println("--------------------Estoque--------------------");
            do{
                System.out.println("\n\nEscolha:\n1- Para adicionar no estoque\n2-Retirar estoque \n3-Verificar estoque");
                o = ler.nextInt();
                if(o == 1){
                 
                    
                    do{
                        System.out.println("\n\nQuantos você quer adicionar?(Digite 0 para retornar ao menu principal)");
                        rp = ler.nextInt();
                        qtd = qtd + rp;
                        if(rp == 0){
                            break;
                        }
                        System.out.println("\nVoce colocou "+rp+"\n produto no estoque, a quantidade total é: "+qtd);
                        System.out.println("\n\nQual produto deseja adicionar?");
                        System.out.println("\n1-Bandeja\n2-Espelho clínico\n3-Pinça\n4-Escovador\n5-Sonda exploratória\n6-Esculpidor Hollemback\n7-Seringa Carpule\n8-Placa de vidro\n9-Cubas\n10-Pote Dappen");
                        prod = ler.nextInt();
                        if (prod == 1){
                            System.out.println(rp+ " bandeja adicionada");
                            band = rp;
                        } else if (prod == 2){
                            System.out.println(rp+ " espelhos clínicos adicionados");
                            esp_cli = rp;
                        } else if (prod == 3){
                            System.out.println(rp+ " pinças adicionada");
                            pin = rp;
                        } else if (prod == 4){
                            System.out.println(rp+ " escovadores adicionado");
                            esco = rp;
                        } else if (prod == 5){
                            System.out.println(rp+ " sondas exploratórias adicionada");
                            son_expl = rp;
                        } else if (prod == 6){
                            System.out.println(rp+ " Esculpidores Hollemback adicionada");
                            esculHolle = rp;
                        } else if (prod == 7){
                            System.out.println(rp+ " Seringa Carpule adicionada");
                            serin = rp;
                        }  else if (prod == 8){
                            System.out.println(rp+ " Placa de vidro adicionada");
                            placVidro = rp;
                        } else if (prod == 9){
                            System.out.println(rp+ " Cubas adicionada");
                            cubas = rp;
                        } else if (prod == 10){
                            System.out.println(rp+ " Pote Dappen adicionada");
                            potedappen = rp;
                        } else {
                            System.out.println("Opção inválida! ");
                        }
                        }while(true);
                }else if(o==2){
                    do{

                        System.out.println("\n\nQuantos você deseja retirar?(Digite 0 para retornar ao menu principal)");
                        rm1 = ler.nextInt();
                        qtd = qtd - rm1;
                        if(rm1 == 0){
                            break;
                        }
                        System.out.println("\nQual produto deseja retirar? ");
                        System.out.println("\n1-Bandeja\n2-Espelho clínico\n3-Pinça\n4-Escovador\n5-Sonda exploratória\n6-Esculpidor Hollemback\n7-Seringa Carpule\n8-Placa de vidro\n9-Cubas\n10-Pote Dappen");
                        produ = ler.nextInt();
                        if (produ == 1){
                            System.out.println(rm1+ " bandeja adicionada");
                            band = band-rm1;
                        } else if (produ == 2){
                            System.out.println(rm1+ " espelhos clínicos adicionados");
                            esp_cli = esp_cli- rm1;
                        } else if (produ == 3){
                            System.out.println(rm1+ " pinças adicionada");
                            pin = pin- rm1;
                        } else if (produ == 4){
                            System.out.println(rm1+ " escovadores adicionado");
                            esco = esco- rm1;
                        } else if (produ == 5){
                            System.out.println(rm1+ " sondas exploratórias adicionada");
                            son_expl = son_expl- rm1;
                        } else if (produ == 6){
                            System.out.println(rm1+ " Esculpidores Hollemback adicionada");
                            esculHolle = esculHolle- rm1;
                        } else if (produ == 7){
                            System.out.println(rm1+ " Seringa Carpule adicionada");
                            serin = serin- rm1;
                        }  else if (produ == 8){
                            System.out.println(rm1+ " Placa de vidro adicionada");
                            placVidro = placVidro- rm1;
                        } else if (produ == 9){
                            System.out.println(rm1+ " Cubas adicionada");
                            cubas = cubas- rm1;
                        } else if (produ == 10){
                            System.out.println(rm1+ " Pote Dappen adicionada");
                            potedappen = potedappen- rm1;
                        } else {
                            System.out.println("Opção inválida! ");
                        }if (qtd < 0){
                            System.out.println("Quantidade insuficiente");
                            break;
                        }

                        System.out.println("\nVoce removeu "+rm1+" produtos do estoque, a quantidade total é: "+qtd);
                        }while(true);
                }else if(o == 3){
                    do{
                        System.out.println("O estoque possui "+qtd+" quantidades de produtos");
                        System.out.println("\nBandeja = "+ band);
                        System.out.println("Espelho Clínico = "+ esp_cli);
                        System.out.println("Pinça = "+pin);
                        System.out.println("Escovador = "+esco);
                        System.out.println("Sonda Exploratória = "+son_expl);
                        System.out.println("Esculpidor Hollemback = "+esculHolle);
                        System.out.println("Seringa Carpule = "+serin);
                        System.out.println("Placa de vidro = "+placVidro);
                        System.out.println("Cubas = "+cubas);
                        System.out.println("Pote dappen = "+potedappen);


                        break;
                    }while(true);
                }
                else {
                    System.out.println("Opção inválida, digite novamente!");

                }}while(true);
        }
    }