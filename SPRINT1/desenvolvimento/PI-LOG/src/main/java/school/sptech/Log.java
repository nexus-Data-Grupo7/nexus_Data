package school.sptech;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {
    public static DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

    void info(String mensagem) {
        String agora = LocalDateTime.now().format(FORMATTER);
        System.out.println(agora + " INFO: " + mensagem);
    }

    // mensagens de depuração (Lendo arquivo dados.csv)
    void debug(String mensagem) {
        String agora = LocalDateTime.now().format(FORMATTER);
        System.out.println(agora + " DEBUG: " + mensagem);
    }

    // mensagens ainda mais detalhadas que o DEBUG ( Lendo linha 1 do arquivo )
    void trace(String mensagem) {
        String agora = LocalDateTime.now().format(FORMATTER);
        System.out.println(agora + " TRACE: " + mensagem);
    }

    // mensagens de erro   // Exception = erro do java (tudo em vermelho)
    void error(String mensagem, Exception e) {
        String agora = LocalDateTime.now().format(FORMATTER);
        // getMessage() remove o detalamento do erro e exibe somente a descricao
        System.out.println(agora + " ERROR: " + mensagem + ": " + e.getMessage());
        e.printStackTrace(); // imprime a stacktrace de forma automática
    }
}
