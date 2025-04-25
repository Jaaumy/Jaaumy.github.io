/*package bebidas;

// código base

import java.util.Scanner;

public class Bebidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        // Bebidas Alcoólicas
        String[] BebidasAlcoolicas = {
            
            "Vodka", "Gin", "Cachaça", "Whisky", "Rum", "Vinho Tinto", 
            "Vinho Branco", "Espumante", "Cerveja", "Licor"
        };
        
        // Preço das bebidas Alcoólicas
        double[] PrecosAlcoolicas = {
            45.90, 39.99, 18.50, 89.90, 25.50, 34.90, 
            49.90, 29.90, 59.90, 30.90
        };
        
        
        // Bebidas não Alcoólicas
        String[] BebidasNaoAlcoolicas = {
            "Água", "Água com gás", "Suco de Lanranja", "Suco de Uva", "Suco de Maracujá", 
            "Coca Cola", "Guaraná", "Soda", "Energético", "Chá gelado"
        };
        
        // Preço das bebidas não alcoólicas
        double[] PrecosNaoAlcoolicas = {
          2.50, 4.00, 5.50, 3.75, 4.80, 6.50, 
          8.90, 6.50, 7.20, 5.90
        };
        
        
        // Aqui o usúario vai escolher entre bebida com Álcool ou sem Álcool
        System.out.println("Escolha o tipo de bebida:");
        System.out.println("1 - Alcoólica");
        System.out.println("2 - Não Alcoólica");
        System.out.print("Opção: ");
        int tipo = scanner.nextInt();
        
        //Exibir lista bebidas com alcool
        if(tipo == 1){
            System.out.println();
            System.out.println("=== Bebidas Alcoólicas ===");
            for (int i = 0; i < BebidasAlcoolicas.length; i++){
                System.out.println((i + 1) + " " + BebidasAlcoolicas[i] 
                        + "(R$ " + PrecosAlcoolicas[i] + ") ");
            }
            
            // Aqui vai exibir a bebida que o usuário escolheu
            System.out.println();
            System.out.print("Escolha a bebida (1 a 10): ");
            int escolha = scanner.nextInt();
            if (escolha >= 1 && escolha <= BebidasAlcoolicas.length){
                System.out.println("Você escolheu: " + BebidasAlcoolicas[escolha - 1] 
                        + " R$ " + PrecosAlcoolicas[escolha - 1]);
            }else{
                System.out.println("Opção inválida.");
            }
            
            //Exibir lista bebidas sem alcool
        }else if (tipo == 2){
            System.out.println();
            System.out.println("=== Bebidas Não Alcoólicas ===");
            for (int i = 0; i < BebidasNaoAlcoolicas.length; i++){
                System.out.println((i + 1) + " - " + BebidasNaoAlcoolicas[i] 
                        + " R$ " + PrecosNaoAlcoolicas[i]);
            }
            
            
            System.out.println();
            System.out.print("Escolha a bebida (1 a 10): "); 
            int escolha = scanner.nextInt();
            if (escolha >= 1 && escolha <= BebidasNaoAlcoolicas.length){
                System.out.println("Você escolheu: " + BebidasNaoAlcoolicas[escolha - 1] 
                        + " R$ " + PrecosNaoAlcoolicas[escolha - 1]);
            }else{
                System.out.println("Opção inválida.");
            }
            
        }else{
            System.out.println("Opção inválida.");
        }
        
        scanner.close();
        
    }
    
}
*/

//Código atualizado!
package bebidas;

import java.util.ArrayList;
import java.util.Scanner;

public class Bebidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bebidas Alcoólicas
        String[] BebidasAlcoolicas = {
            "Vodka", "Gin", "Cachaça", "Whisky", "Rum", "Vinho Tinto", 
            "Vinho Branco", "Espumante", "Cerveja", "Licor"
        };
        
        // Preço das bebidas Alcoólicas
        double[] PrecosAlcoolicas = {
            45.90, 39.99, 18.50, 89.90, 25.50, 34.90, 
            49.90, 29.90, 59.90, 30.90
        };
        
        // Bebidas não Alcoólicas
        String[] BebidasNaoAlcoolicas = {
            "Água", "Água com gás", "Suco de Laranja", "Suco de Uva", "Suco de Maracujá", 
            "Coca Cola", "Guaraná", "Soda", "Energético", "Chá gelado"
        };
        
        // Preço das bebidas não alcoólicas
        double[] PrecosNaoAlcoolicas = {
            2.50, 4.00, 5.50, 3.75, 4.80, 6.50, 
            8.90, 6.50, 7.20, 5.90
        };

        // Carrinho de compras (usando ArrayList)
        ArrayList<String> carrinho = new ArrayList<>();
        ArrayList<Double> precoCarrinho = new ArrayList<>();

        while (true) {
            // Escolha do tipo de bebida
            System.out.println("\nEscolha o tipo de bebida:");
            System.out.println("1 - Alcoólica");
            System.out.println("2 - Não Alcoólica");
            System.out.println("3 - Ver Carrinho");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            int tipo = scanner.nextInt();

            if (tipo == 1) {
                // Exibe as bebidas alcoólicas
                System.out.println("\n=== Bebidas Alcoólicas ===");
                for (int i = 0; i < BebidasAlcoolicas.length; i++) {
                    System.out.println((i + 1) + " - " + BebidasAlcoolicas[i] + " (R$ " + PrecosAlcoolicas[i] + ")");
                }
                System.out.print("\nEscolha a bebida (1 a 10): ");
                int escolha = scanner.nextInt();

                if (escolha >= 1 && escolha <= BebidasAlcoolicas.length) {
                    System.out.println("Você escolheu: " + BebidasAlcoolicas[escolha - 1] + " R$ " + PrecosAlcoolicas[escolha - 1]);
                    // Adicionando ao carrinho
                    carrinho.add(BebidasAlcoolicas[escolha - 1]);
                    precoCarrinho.add(PrecosAlcoolicas[escolha - 1]);
                } else {
                    System.out.println("Opção inválida.");
                }

            } else if (tipo == 2) {
                // Exibe as bebidas não alcoólicas
                System.out.println("\n=== Bebidas Não Alcoólicas ===");
                for (int i = 0; i < BebidasNaoAlcoolicas.length; i++) {
                    System.out.println((i + 1) + " - " + BebidasNaoAlcoolicas[i] + " R$ " + PrecosNaoAlcoolicas[i]);
                }
                System.out.print("\nEscolha a bebida (1 a 10): ");
                int escolha = scanner.nextInt();

                if (escolha >= 1 && escolha <= BebidasNaoAlcoolicas.length) {
                    System.out.println("Você escolheu: " + BebidasNaoAlcoolicas[escolha - 1] + " R$ " + PrecosNaoAlcoolicas[escolha - 1]);
                    // Adicionando ao carrinho
                    carrinho.add(BebidasNaoAlcoolicas[escolha - 1]);
                    precoCarrinho.add(PrecosNaoAlcoolicas[escolha - 1]);
                } else {
                    System.out.println("Opção inválida.");
                }

            } else if (tipo == 3) {
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

            } else if (tipo == 4) {
                // Finalizar o programa
                System.out.println("Obrigado por usar o sistema de compras!");
                break;

            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
