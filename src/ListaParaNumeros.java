import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListaParaNumeros {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("10", "abc", "20", "30x");

        // Filtra e converte apenas os valores numéricos
        List<Integer> numeros = input.stream()
                .filter(valor -> {
                    try {
                        Integer.parseInt(valor);
                        return true;
                    } catch (NumberFormatException e) {
                        System.out.println("Valor ignorado: " + valor);
                        return false;
                    }
                })
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Números convertidos: " + numeros);
        exibirMensagemDeSaida();
    }


    public static void exibirMensagemDeSaida() {
        System.out.println("\n" + "=".repeat(22) + " 🐱✨ Programa encerrado! ✨🐱 " + "=".repeat(20));
        System.out.println("Desenvolvido por: Jeisa Boaventura");
        System.out.println("GitHub: https://github.com/Caaarolb");
        System.out.println("LinkedIn: https://www.linkedin.com/in/-caroline-boaventura/");
        System.out.println("=" + "=".repeat(68) + "\n");
    }
}
