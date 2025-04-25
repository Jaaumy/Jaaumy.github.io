import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Eletronico> estoque = new ArrayList<>();
        Random random = new Random();

        estoque.add(new Eletronico(random.nextInt(10000), "Galaxy S25", "Celular Gamer", 3999.99, 15));
        estoque.add(new Eletronico(random.nextInt(10000), "iPhone 14 Pro", "Celular", 7599.00, 12));
        estoque.add(new Eletronico(random.nextInt(10000), "Motorola Edge 40", "Celular", 2999.00, 18));
        estoque.add(new Eletronico(random.nextInt(10000), "Redmi Note 12", "Celular", 1799.00, 20));
        estoque.add(new Eletronico(random.nextInt(10000), "Acer Nitro 5", "Notebook Gamer", 4999.00, 10));
        estoque.add(new Eletronico(random.nextInt(10000), "Lenovo Ideapad 3", "Notebook", 2799.00, 16));
        estoque.add(new Eletronico(random.nextInt(10000), "Samsung Smart TV 4K", "TV", 3299.00, 14));
        estoque.add(new Eletronico(random.nextInt(10000), "LG OLED Evo", "TV OLED", 8399.00, 8));
        estoque.add(new Eletronico(random.nextInt(10000), "Dell XPS 13", "Ultrabook", 6899.00, 9));
        estoque.add(new Eletronico(random.nextInt(10000), "Asus ROG Phone 6", "Celular Gamer", 6899.00, 7));

        while (true) {
            System.out.println("\n--- MENU ESTOQUE ELETRÔNICOS ---");
            System.out.println("1. Listar todos os produtos");
            System.out.println("2. Buscar por nome");
            System.out.println("3. Buscar por ID");
            System.out.println("4. Adicionar estoque");
            System.out.println("5. Remover estoque");
            System.out.println("6. Cadastrar novo produto");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0) break;

            switch (opcao) {
                case 1:
                    for (Eletronico e : estoque) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    System.out.print("Digite o nome do produto: ");
                    String nomeBusca = scanner.nextLine().toLowerCase();
                    for (Eletronico e : estoque) {
                        if (e.nome.toLowerCase().contains(nomeBusca)) {
                            System.out.println(e);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Digite o ID do produto: ");
                    int idBusca = scanner.nextInt();
                    for (Eletronico e : estoque) {
                        if (e.id == idBusca) {
                            System.out.println(e);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Digite o ID do produto: ");
                    int idAdd = scanner.nextInt();
                    System.out.print("Quantidade a adicionar: ");
                    int qtdAdd = scanner.nextInt();
                    for (Eletronico e : estoque) {
                        if (e.id == idAdd) {
                            e.adicionarEstoque(qtdAdd);
                            System.out.println("Estoque atualizado.");
                        }
                    }
                    break;
                case 5:
                    System.out.print("Digite o ID do produto: ");
                    int idRem = scanner.nextInt();
                    System.out.print("Quantidade a remover: ");
                    int qtdRem = scanner.nextInt();
                    for (Eletronico e : estoque) {
                        if (e.id == idRem) {
                            e.removerEstoque(qtdRem);
                        }
                    }
                    break;
                case 6:
                    System.out.print("Nome do produto: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Categoria: ");
                    String novaCategoria = scanner.nextLine();
                    System.out.print("Preço: ");
                    double novoPreco = scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int novaQtd = scanner.nextInt();
                    int novoId = random.nextInt(10000);
                    estoque.add(new Eletronico(novoId, novoNome, novaCategoria, novoPreco, novaQtd));
                    System.out.println("Produto cadastrado com ID: " + novoId);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}