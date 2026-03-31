import java.util.Scanner;
//aq eu importo a classe scanner para meu código
public class GestaoSubmarino {
    public static void main(String[] args) {
        //aq em baixo eu puxo scanner para um objeto "sc" q eu vou usar para ler o teclado
        Scanner sc = new Scanner(System.in);

        // --- SITUAÇÃO 1: ORÇAMENTO E CRONOGRAMA ---
        System.out.println("=== SISTEMA DE GESTÃO DE SUBMARINOS ===");
        System.out.println("> Insira o valor do repasse anual (em bilhões de reais):");
        
        double repasseAnual = sc.nextDouble();
        sc.nextLine(); // LIMPEZA DE BUFFER 

        if (repasseAnual < 0.5) {
            System.out.println("ALERTA: Risco de paralisação total. Data estimada: 2045");
        } else if (repasseAnual >= 0.5 && repasseAnual <= 1.0) {
            System.out.println("Ritmo lento: Finalização prevista para 2037");
        } else {
            System.out.println("Projeto acelerado: Possibilidade de antecipação da entrega");
        }

        System.out.println("\n-------------------------------------------");

        // --- SITUAÇÃO 2: PROTOCOLO DE ACESSO ---
        System.out.println("Iniciando Protocolo de Acesso Internacional...");
        System.out.println("...");

        System.out.println("> Digite seu Nível de Acesso:");
        String nivelDeAcesso = sc.nextLine(); // Não precisa de .toUpperCase() aqui se usar ignoreCase ali emm baixo

        System.out.println("> Digite seu Código de País (Nome do País):");
        String codigoDePais = sc.nextLine();

        // Lógica de Acesso
        if (nivelDeAcesso.equalsIgnoreCase("TOTAL") && !codigoDePais.equalsIgnoreCase("BRASIL")) {
            System.out.println("ACESSO NEGADO: Soberania Nacional preservada. Dados criptografados.");
        } 
        else if (nivelDeAcesso.equalsIgnoreCase("TOTAL") && codigoDePais.equalsIgnoreCase("BRASIL")) {
            System.out.println("Acesso autorizado ao Almirantado.");
        } 
        else {
            System.out.println("Tente novamente: Operação inválida ou nível insuficiente.");
        }

        System.out.println("\n-------------------------------------------");

        // --- SITUAÇÃO 3: PROPULSÃO E SEGURANÇA ---
        System.out.println("Pronto! Indo para o Nível 3...");
        System.out.println("Executando Simulação de Segurança do Reator...");

        System.out.println("> Digite a temperatura do reator nuclear (°C):");
        double temperaturaReator = sc.nextDouble();

        if (temperaturaReator < 280) {
            System.out.println("STATUS: Aumentar potência do reator.");
        } else if (temperaturaReator >= 280 && temperaturaReator <= 350) {
            System.out.println("STATUS: Operação Normal - Cruzeiro.");
        } else {
            System.err.println("ALERTA DE EMERGÊNCIA: Acionar sistema de resfriamento imediato!");
        }

        sc.close(); 
    }
}
