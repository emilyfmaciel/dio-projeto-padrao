package registroDeEventos;


import java.util.List;
import java.util.ArrayList;

public class EventLogger {
    private static EventLogger instance;
    private List<String> eventLog;

    private EventLogger() {
        eventLog = new ArrayList<>();
    }

    public static EventLogger getInstance() {
        if (instance == null) {
            instance = new EventLogger();
        }
        return instance;
    }

    public void logEvent(String event) {
        eventLog.add(event);
    }

    public List<String> getEventLog() {
        return eventLog;
    }
}

