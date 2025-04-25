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
    }
}
