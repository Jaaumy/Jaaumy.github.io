package introducao;

import introducao.roupass.Roupas_classes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class ROUPAS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random codigo = new Random();
        int opcao;
        String nome_busca;
        String tipo = "";
        String nome;
        int tamanho;
        double preco;
        int quantidade;
        int id_busca;
        int escolha;
        ArrayList<Roupas_classes> roupas = new ArrayList<>();
        ArrayList<Roupas_classes> camiseta = new ArrayList<>();
        ArrayList<Roupas_classes> calca = new ArrayList<>();
        ArrayList<Roupas_classes> sapato = new ArrayList<>();
        ArrayList<Roupas_classes> meia = new ArrayList<>();
        System.out.println("Camisetas: ");

        Roupas_classes camiseta1 = new Roupas_classes("Camiseta Polo", "Camisa", 95.99, 68, codigo.nextInt(1000000), 42 );
        Roupas_classes camiseta2 = new Roupas_classes("Camiseta Básica de Algodão", "Camisa", 65.99, 68, codigo.nextInt(1000000), 38 );
        Roupas_classes camiseta3 = new Roupas_classes("Camiseta Estampada", "Camisa", 85.00, 68, codigo.nextInt(1000000), 46 );

        camiseta.add(camiseta1);
        camiseta.add(camiseta2);
        camiseta.add(camiseta3);
        roupas.add(camiseta1);
        roupas.add(camiseta2);
        roupas.add(camiseta3);


        Roupas_classes calca1 = new Roupas_classes("Calça Jeans", "Calça", 109.99, 141, codigo.nextInt(1000000), 40);
        Roupas_classes calca2 = new Roupas_classes("Calça Moletom", "Calça", 79.99, 70, codigo.nextInt(1000000), 36);
        Roupas_classes calca3 = new Roupas_classes("Calça Social", "Calça", 129.99, 121, codigo.nextInt(1000000), 42);
        calca.add(calca1);
        calca.add(calca2);
        calca.add(calca3);
        roupas.add(calca1);
        roupas.add(calca2);
        roupas.add(calca3);


        Roupas_classes meias1 = new Roupas_classes("Meia Cano Alto", "Meia", 11.99, 116, codigo.nextInt(1000000), 37 );
        Roupas_classes meias2 = new Roupas_classes("Meia Soquete", "Meia", 9.99, 67, codigo.nextInt(1000000), 41 );
        Roupas_classes meias3 = new Roupas_classes("Meia Térmica", "Meia", 21.99, 35, codigo.nextInt(1000000), 36 );
        meia.add(meias1);
        meia.add(meias2);
        meia.add(meias3);
        roupas.add(meias1);
        roupas.add(meias2);
        roupas.add(meias3);


        Roupas_classes sapato1 = new Roupas_classes("Tênis Esportivo", "Sapato", 349.99, 125, codigo.nextInt(1000000), 41);
        Roupas_classes sapato2 = new Roupas_classes("Mocassim", "Sapato", 149.99, 43, codigo.nextInt(1000000), 40);
        Roupas_classes sapato3 = new Roupas_classes("Bota de Couro", "Sapato", 299.99, 23, codigo.nextInt(1000000), 43);
        sapato.add(sapato1);
        sapato.add(sapato2);
        sapato.add(sapato3);
        roupas.add(sapato1);
        roupas.add(sapato2);
        roupas.add(sapato3);

        while (true) {
            System.out.println(" 1- Adicionar roupas.");
            System.out.println(" 2- Mostrar as roupas disponíveis.");
            System.out.println(" 3- Buscar pelo nome.");
            System.out.println(" 4- Buscar pelo ID.");
            System.out.println(" 5- Remover roupa.");
            System.out.println(" 6- Mostrar apenas camisetas.");
            System.out.println(" 7- Mostrar apenas calças.");
            System.out.println(" 8- Mostrar apenas meias.");
            System.out.println(" 9- Mostrar apenas sapatos.");
            System.out.println("10- Finalizar.");
            System.out.println("Escolha o que deseja fazer: ");
            opcao = sc.nextInt();

            if (opcao == 10) {
                System.out.println("Programa finalizado.");
                break;
            }
            if (opcao == 1) {
                while (true) {
                    System.out.println("Escolha qual peça de roupa você deseja adicionar, 1 - Camiseta, 2 - Calça, 3- Meia, 4 - Sapato, ou 5 - para sair.");
                    escolha = sc.nextInt();

                    if (escolha == 5) {
                        break;
                    }
                    System.out.println("Digite o nome da roupa: ");
                    sc.nextLine();
                    nome = sc.nextLine();

                    System.out.println("Digite o tamanho da roupa em formato numérico: ");
                    tamanho = sc.nextInt();

                    System.out.println("Digite o preço da roupa: ");
                    preco = sc.nextInt();

                    System.out.println("Digite a quantidade de roupa: ");
                    quantidade = sc.nextInt();

                    int id = codigo.nextInt(1000000);
                    Roupas_classes roupa1 = new Roupas_classes(nome, tipo, preco, quantidade, id, tamanho);

                    switch (escolha) {
                        case 1:
                            roupa1.setTipo("Camisa");
                            camiseta.add(roupa1);
                            break;
                        case 2:
                            roupa1.setTipo("Calça");
                            calca.add(roupa1);
                            break;
                        case 3:
                            roupa1.setTipo("Meia");
                            meia.add(roupa1);
                            break;
                        case 4:
                            roupa1.setTipo("Sapato");
                            sapato.add(roupa1);
                            break;
                        default:
                            System.out.println("Número invalido.");
                            break;
                    }
                    roupas.add(roupa1);
                    System.out.println("Roupas adicionada com sucesso.");
                }
            }
            if (opcao == 2) {
                System.out.println("Roupas cadastradas: ");
                for (Roupas_classes r : roupas) {
                    System.out.println("\n" + r);
                }
            }
            if (opcao == 3) {
                System.out.println("Digite o nome da roupa: ");
                sc.nextLine();
                nome_busca = sc.nextLine();
                boolean encontrado = false;


                for (Roupas_classes r : roupas) {
                    if (r.getNome().equals(nome_busca)) {
                        System.out.println(r);
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("Roupa não encontrada.");
                }

            }
            if (opcao == 4) {
                System.out.println("Digite o ID da roupa: ");
                id_busca = sc.nextInt();
                boolean encontrado = false;
                sc.nextLine();

                for (Roupas_classes r : roupas) {
                    if (r.getID() == id_busca) {
                        System.out.println(r);
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("Roupa não encontrada.");
                }
            }
            if (opcao == 5) {
                System.out.println("Digite o ID da roupa que deseja remover: ");
                id_busca = sc.nextInt();

                sc.nextLine();

                for (int i = 0; i < roupas.size(); i++) {
                    if (roupas.get(i).getID() == id_busca) {
                        roupas.remove(i);
                        System.out.println("Roupa removida com sucesso.");

                        break;
                    }
                }
            }
            if (opcao == 6) {
                System.out.println("Camisetas cadastradas: ");
                for (Roupas_classes r : camiseta) {
                    System.out.println(r);

                }
            }
            if (opcao == 7) {
                System.out.println("Calças cadastradas: ");
                for (Roupas_classes r : calca) {
                    System.out.println(r);

                }
            }
            if (opcao == 8) {
                System.out.println("Meias cadastradas: ");
                for (Roupas_classes r : meia) {
                    System.out.println(r);

                }
            }
            if (opcao == 9) {
                System.out.println("Sapatos cadastradas: ");
                for (Roupas_classes r : sapato) {
                    System.out.println(r);

                }
            }
        }
    }
}

