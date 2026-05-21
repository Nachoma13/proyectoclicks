package proyectoclicks1.demo.agent.service;

import proyectoclicks1.demo.agent.automation.BrowserAutomation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentService {

    @Autowired
    private BrowserAutomation browserAutomation;

    public String processMessage(String message) {

        System.out.println("MENSAJE RECIBIDO: " + message);

        if (message == null) {
            return "Mensaje vacío";
        }

        String lower = message.toLowerCase();

        if (lower.contains("google")) {
            System.out.println("EJECUTANDO GOOGLE");
            browserAutomation.openGoogle();
            return "Abriendo Google";
        }

        if (lower.contains("youtube")) {
            System.out.println("EJECUTANDO YOUTUBE");
            browserAutomation.openYoutubeViaGoogleSearch();
            return "Buscando YouTube";
        }

        System.out.println("NO MATCH");
        return "No entendí el comando";
    }
}