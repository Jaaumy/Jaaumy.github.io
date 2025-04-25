package introducao.test;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

import introducao.dominio.Carnes;

public class CarnesTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int escolha;
        int opcao;
        int busca;
        String nome_busca;
        int id_busca;
        String tipo = " ";
        ArrayList<Carnes> carnes = new ArrayList<>();
        ArrayList<Carnes> carnes_bovinas = new ArrayList<>();
        ArrayList<Carnes> carnes_suinas = new ArrayList<>();
        ArrayList<Carnes> carnes_peixe = new ArrayList<>();
        ArrayList<Carnes> carnes_frango = new ArrayList<>();
        Carnes frango1 = new Carnes("Frango inteiro", aleatorio.nextInt(1000000), 2.0, 43.0, "01/04/2025", "01/07/2025", "Frango");
        Carnes frango2 = new Carnes("Sobre coxa ", aleatorio.nextInt(1000000), 2.0, 47.32, "01/02/2025", "01/05/2025", "Frango");
        Carnes frango3 = new Carnes("Asinha ", aleatorio.nextInt(1000000), 1.0, 10.97, "10/12/2024", "10/03/2025", "Frango");
        Carnes frango4 = new Carnes("Pescoço", aleatorio.nextInt(1000000), 1.5, 23.65, "21/05/2025", "21/08/2025", "Frango");
        carnes_frango.add(frango1);
        carnes_frango.add(frango2);
        carnes_frango.add(frango3);
        carnes_frango.add(frango4);
        carnes.add(frango1);
        carnes.add(frango2);
        carnes.add(frango3);
        carnes.add(frango4);

        Carnes suinas1 = new Carnes("Pernil", aleatorio.nextInt(1000000), 1.35, 37.56, "02/03/2025", "07/07/2025", "Suína");
        Carnes suinas2 = new Carnes("Costelinha", aleatorio.nextInt(1000000), 1.0, 23.56, "07/01/2025", "07/04/2025", "Suína");
        carnes.add(suinas1);
        carnes.add(suinas2);
        carnes_suinas.add(suinas1);
        carnes_suinas.add(suinas2);

        Carnes bovinas1 = new Carnes("Picanha", aleatorio.nextInt(1000000), 2.25, 253.43, "01/10/2025", "10/01/2026", "Bovina");
        Carnes bovinas2 = new Carnes("Maminha", aleatorio.nextInt(1000000), 1.0, 73.0, "23/01/2025", "22/04/2025", "Bovina");
        carnes.add(bovinas1);
        carnes.add(bovinas2);
        carnes_bovinas.add(bovinas1);
        carnes_bovinas.add(bovinas2);

        Carnes peixe1 = new Carnes("Salmão", aleatorio.nextInt(1000000), 0.500, 56.32, "13/01/2025", "12/02;2025", "Peixe");
        carnes.add(peixe1);
        carnes_peixe.add(peixe1);


        while (true) {
            System.out.println("1- Adicionar Carnes.");
            System.out.println("2- Mostrar todas as carnes. ");
            System.out.println("3- Finalizar.");
            System.out.println("4- Buscar por nome. ");
            System.out.println("5- Buscar por ID.");
            System.out.println("6- Remover carne.");
            System.out.println("7- Mostrar as carnes bovinas.");
            System.out.println("8- Mostrar as carnes suinas.");
            System.out.println("9- Mostrar as carnes peixe.");
            System.out.println("10- Mostrar as carnes frango.");
            System.out.println("Digite aqui sua opção: ");
            opcao = sc.nextInt();

            if (opcao == 3) {
                System.out.println("Programa finalizado.");
                break;
            }

            if (opcao == 1) {

                while (true) {
                    System.out.println("Escolha o tipo de carne, 1 - para Bovinas, 2 -  para Frangos, 3 - para Suinas e 4 - para Peixa e 5 - sair: ");
                    escolha = sc.nextInt();
                    sc.nextLine();

                    if (escolha == 5) {
                        break;
                    }

                    System.out.println("Digite o nome da carne: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o peso da carne: ");
                    double peso = sc.nextInt();

                    System.out.println("Digite o preço da carne: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite a data de chegada da carne no formato DD/MM/YYYY: ");
                    String data_chegada = sc.nextLine();

                    System.out.println("Digite a data de vencimento da carne: ");
                    String data_vencimento = sc.nextLine();

                    int id = aleatorio.nextInt(1000000);
                    Carnes carnes1 = new Carnes(nome, id, peso, preco, data_chegada, data_vencimento, tipo);

                    switch (escolha) {
                        case 1:
                            carnes1.setTipo("Bovinas");
                            carnes_bovinas.add(carnes1);

                            break;
                        case 2:
                            carnes1.setTipo("Frangos");
                            carnes_frango.add(carnes1);

                            break;
                        case 3:
                            carnes1.setTipo("Suinas");
                            carnes_suinas.add(carnes1);

                            break;
                        case 4:
                            carnes1.setTipo("Peixes");
                            carnes_peixe.add(carnes1);
                    }
                    carnes.add(carnes1);
                    System.out.println("Carnes adicionadas.");
                }

            }
            if (opcao == 4) {
                System.out.println("Digite 1 para buscar por nome e 2 para buscar por ID: ");
                busca = sc.nextInt();
                sc.nextLine();

                if (busca == 1) {
                    System.out.println("Digite o nome do carne: ");
                    nome_busca = sc.nextLine();
                    boolean encontrado = false;

                    for (Carnes c : carnes) {
                        if (c.getNome().toLowerCase().contains(nome_busca)) {
                            System.out.println(c);
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Carne não encontrada.");
                    }

                } else if (busca == 2) {
                    System.out.println("Digite o ID do carne: ");
                    id_busca = sc.nextInt();
                    boolean encontrado = false;

                    for (Carnes c : carnes) {
                        if (c.getID() == id_busca) {
                            System.out.println(c);
                            encontrado = true;

                        }
                    }
                    if (!encontrado) {
                        System.out.println("Carne não encontrada.");
                    }
                }
            }
            if (opcao == 5) {
                System.out.println("Digite o ID da carne:");
                id_busca = sc.nextInt();
                boolean encontrado = false;

                for (Carnes c : carnes) {
                    if (c.getID() == id_busca) {
                        System.out.println(c);
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("Nenhum carne encontrado.");
                }
            }
            if (opcao == 6) {
                System.out.println("Digite o ID da carne que deseja remover: ");
                id_busca = sc.nextInt();
                boolean encontrado = false;

                for (int i = 0; i < carnes.size(); i++) {
                    if (carnes.get(i).getID() == id_busca) {
                        carnes.remove(i);
                        System.out.println("Carne removida.");
                        encontrado = true;
                        break;
                    }

                }
            }
            if (opcao == 2) {
                System.out.println("Carnes cadastradas: ");
                for (Carnes c : carnes) {
                    System.out.println(c);
                }
            }
            if (opcao == 7) {
                for (Carnes c : carnes_bovinas) {
                    System.out.println(c);

                }
            }
            if (opcao == 8) {
                for (Carnes c : carnes_suinas) {
                    System.out.println(c);
                }
            }
            if (opcao == 9) {
                for (Carnes c : carnes_peixe) {
                    System.out.println(c);

                }
            }
            if (opcao == 10) {
                for (Carnes c : carnes_frango) {
                    System.out.println(c);

                }
            }
        }
    }
}




