import java.util.*;

public class MainEsportes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ProdutoEsporte> estoque = new ArrayList<>();
        Random random = new Random();

        estoque.add(new ProdutoEsporte(random.nextInt(10000), "Bola de Futebol Adidas", "Bolas", 129.90, 20));
        estoque.add(new ProdutoEsporte(random.nextInt(10000), "Tênis Nike Air Zoom", "Calçados Esportivos", 599.00, 15));
        estoque.add(new ProdutoEsporte(random.nextInt(10000), "Raquete de Tênis Wilson", "Tênis", 349.99, 10));
        estoque.add(new ProdutoEsporte(random.nextInt(10000), "Camisa Oficial Seleção", "Roupas Esportivas", 259.00, 12));
        estoque.add(new ProdutoEsporte(random.nextInt(10000), "Luvas de Boxe Everlast", "Boxe", 229.90, 8));
        estoque.add(new ProdutoEsporte(random.nextInt(10000), "Skate Profissional", "Esportes Radicais", 499.00, 6));

        while (true) {
            System.out.println("\n--- MENU ESTOQUE ESPORTES ---");
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
                    for (ProdutoEsporte p : estoque) {
                        System.out.println(p);
                    }
                    break;
                case 2:
                    System.out.print("Digite o nome do produto: ");
                    String nomeBusca = scanner.nextLine().toLowerCase();
                    boolean encontradoNome = false;
                    for (ProdutoEsporte p : estoque) {
                        if (p.getNome().toLowerCase().contains(nomeBusca)) {
                            System.out.println(p);
                            encontradoNome = true;
                        }
                    }
                    if (!encontradoNome) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o ID do produto: ");
                    int idBusca = scanner.nextInt();
                    ProdutoEsporte produtoId = buscarPorId(estoque, idBusca);
                    if (produtoId != null) {
                        System.out.println(produtoId);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o ID do produto: ");
                    int idAdd = scanner.nextInt();
                    System.out.print("Quantidade a adicionar: ");
                    int qtdAdd = scanner.nextInt();
                    ProdutoEsporte produtoAdd = buscarPorId(estoque, idAdd);
                    if (produtoAdd != null) {
                        produtoAdd.adicionarEstoque(qtdAdd);
                        System.out.println("Estoque atualizado.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("Digite o ID do produto: ");
                    int idRem = scanner.nextInt();
                    System.out.print("Quantidade a remover: ");
                    int qtdRem = scanner.nextInt();
                    ProdutoEsporte produtoRem = buscarPorId(estoque, idRem);
                    if (produtoRem != null) {
                        produtoRem.removerEstoque(qtdRem);
                    } else {
                        System.out.println("Produto não encontrado.");
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
                    estoque.add(new ProdutoEsporte(novoId, novoNome, novaCategoria, novoPreco, novaQtd));
                    System.out.println("Produto cadastrado com ID: " + novoId);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    private static ProdutoEsporte buscarPorId(List<ProdutoEsporte> estoque, int id) {
        for (ProdutoEsporte p : estoque) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}