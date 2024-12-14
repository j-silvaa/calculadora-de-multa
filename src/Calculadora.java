public class Calculadora {
    public static void main(String[] arg) {
        var scanner = new java.util.Scanner(System.in);

        System.out.print("Velocidade permitida: ");
        double Velocidade1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Velocidade do veiculo: ");
        double Velocidade2 = Double.parseDouble(scanner.nextLine());

        int considered;

        // Calcula o valor  dependendo da velocidade permitida
        if (Velocidade1 < 100) {
            considered = (int) (Velocidade2 + 7);
        } else {
            considered = (int) (Velocidade2 + Velocidade2 * 0.1);
        }

        // Calcula a diferença entre considered e a velocidade permitida
        int diff = (int) (considered - Velocidade1);

        // Se houver uma diferença positiva, calcula a multa
        if (diff > 0) {
            int amount = diff * 10;
            System.out.println("Multa: " + amount);
        } else {
            System.out.println("Sem multa.");
        }
    }
}
