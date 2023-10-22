package registroDeEventos;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Obtém uma instância do EventLogger
        EventLogger logger = EventLogger.getInstance();

        // Registra eventos
        logger.logEvent("Show de pagode");
        logger.logEvent("Show de sertanejo");
        logger.logEvent("Show de MPB");

        // Obtém o histórico de eventos
        List<String> eventLog = logger.getEventLog();

        // Exibe o histórico de eventos
        System.out.println("Histórico de Eventos:");
        for (String event : eventLog) {
            System.out.println(event);
        }
    }
}


