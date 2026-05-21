package proyectoclicks1.demo.agent.service;

import com.agent.automation.BrowserAutomation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentService {

    @Autowired
    private BrowserAutomation browserAutomation;

    public String processMessage(String message) {

        String lower = message.toLowerCase();

        if (lower.contains("presupuesto")) {

            browserAutomation.openYoutubeAndSearch(
                    "aprende como hacer un presupuesto personal paso a paso clips"
            );

            return "Automatización ejecutada";
        }

        if (lower.contains("computacion")) {

            browserAutomation.openYoutubeAndSearch(
                    "que es la computacion en la nube y como funciona en 2026 clips"
            );

            return "Automatización ejecutada";
        }

        return "No entendí el comando";
    }
}
