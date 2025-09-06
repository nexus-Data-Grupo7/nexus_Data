package school.sptech;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    // Exemplo de uso
    public static void main(String[] args) {
        Log log = new Log();
        log.info("Iniciando processamento de dados");
        log.debug("Lendo arquivo dados.csv");
        log.trace("Lendo linhas 1..100");

        try {
            // Simulando erro
            if (true) throw new RuntimeException("Erro ao processar linha 359");
        } catch (Exception e) {
            log.error("Erro ao ler linha 359", e);
        }

        log.info("Processo finalizado com erro!");
    }
}
