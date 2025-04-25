import java.util.ArrayList;
import java.util.Scanner;
public class Padaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Na classe padaria, separei por categoria: pães, bolos e salgados
        String[] Paes = {
            "Pão francês", "Pão de forma", "Pão integral", 
            "Pão doce", "Pão de queijo", "Pão de milho"
        };

        // Preço da lista pães
        double[] Preco1 = {0.80, 6.50, 7.00, 2.50, 1.20, 1.80};

        String[] BoloseDoces = {
            "Bolo de chocolate", "Bolo de cenoura", "Bolo de fubá", 
            "Sonho recheado", "Torta de morango", "Croissant de chocolate"
        };

        // Preço da lista bolos
        double[] Preco2 = {18.00, 16.00, 15.00, 4.50, 25.00, 5.00};

        String[] Salgados = {
            "Coxinha", "Esfirra", "Enroladinho de salsicha", 
            "Pastel de queijo", "Quibe", "Empada de frango"
        };

        // Preço da lista salgados
        double[] Preco3 = {3.50, 2.40, 2.90, 4.50, 2.80, 5.90};

        // Carrinho de compras (usando ArrayList)
        ArrayList<String> carrinho = new ArrayList<>();
        ArrayList<Double> precoCarrinho = new ArrayList<>();

        while (true) {
            // Menu
            System.out.println("=== MENU PADARIA ===");
            System.out.println("1 - Ver Pães");
            System.out.println("2 - Ver Bolos e Doces");
            System.out.println("3 - Ver Salgados");
            System.out.println("4 - Ver Carrinho");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int tipo = scanner.nextInt();

            if (tipo == 1) {
                // Exibir pães
                System.out.println("\n=== Pães ===");
                for (int i = 0; i < Paes.length; i++) {
                    System.out.println((i + 1) + " - " + Paes[i] + " (R$ " + Preco1[i] + ")");
                }
                System.out.print("Escolha o Pão (1 a " + Paes.length + "): ");
                int escolha = scanner.nextInt();
                if (escolha >= 1 && escolha <= Paes.length) {
                    System.out.println("Você escolheu: " + Paes[escolha - 1] + " R$ " + Preco1[escolha - 1]);
                    // Adicionando ao carrinho
                    carrinho.add(Paes[escolha - 1]);
                    precoCarrinho.add(Preco1[escolha - 1]);
                } else {
                    System.out.println("Opção inválida.");
                }

            } else if (tipo == 2) {
                // Exibir bolos e doces
                System.out.println("\n=== Bolo e Doces ===");
                for (int i = 0; i < BoloseDoces.length; i++) {
                    System.out.println((i + 1) + " - " + BoloseDoces[i] + " (R$ " + Preco2[i] + ")");
                }
                System.out.print("Escolha o Bolo (1 a " + BoloseDoces.length + "): ");
                int escolha = scanner.nextInt();
                if (escolha >= 1 && escolha <= BoloseDoces.length) {
                    System.out.println("Você escolheu: " + BoloseDoces[escolha - 1] + " R$ " + Preco2[escolha - 1]);
                    // Adicionando ao carrinho
                    carrinho.add(BoloseDoces[escolha - 1]);
                    precoCarrinho.add(Preco2[escolha - 1]);
                } else {
                    System.out.println("Opção inválida.");
                }

            } else if (tipo == 3) {
                // Exibir salgados
                System.out.println("\n=== Salgados ===");
                for (int i = 0; i < Salgados.length; i++) {
                    System.out.println((i + 1) + " - " + Salgados[i] + " (R$ " + Preco3[i] + ")");
                }
                System.out.print("Escolha o Salgado (1 a " + Salgados.length + "): ");
                int escolha = scanner.nextInt();
                if (escolha >= 1 && escolha <= Salgados.length) {
                    System.out.println("Você escolheu: " + Salgados[escolha - 1] + " R$ " + Preco3[escolha - 1]);
                    // Adicionando ao carrinho
                    carrinho.add(Salgados[escolha - 1]);
                    precoCarrinho.add(Preco3[escolha - 1]);
                } else {
                    System.out.println("Opção inválida.");
                }

            } else if (tipo == 4) {
                // Exibe o carrinho de compras
                if (carrinho.isEmpty()) {
                    System.out.println("O carrinho está vazio.");
                } else {
                    System.out.println("\n=== Seu Carrinho ===");
                    double total = 0;
                    for (int i = 0; i < carrinho.size(); i++) {
                        System.out.println((i + 1) + " - " + carrinho.get(i) + " R$ " + precoCarrinho.get(i));
                        total += precoCarrinho.get(i);
                    }
                    System.out.println("Total: R$ " + total);

                    // Pergunta se o usuário quer remover algum item
                    System.out.print("\nDeseja remover algum item? (1 - Sim, 2 - Não): ");
                    int remocao = scanner.nextInt();

                    if (remocao == 1) {
                        System.out.print("Escolha o item a remover (1 a " + carrinho.size() + "): ");
                        int itemRemover = scanner.nextInt();
                        if (itemRemover >= 1 && itemRemover <= carrinho.size()) {
                            carrinho.remove(itemRemover - 1);
                            precoCarrinho.remove(itemRemover - 1);
                            System.out.println("Item removido com sucesso!");
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    }
                }

            } else if (tipo == 0) {
                // Finaliza o programa
                System.out.println("Obrigado por usar o sistema de compras!");
                break;

            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
