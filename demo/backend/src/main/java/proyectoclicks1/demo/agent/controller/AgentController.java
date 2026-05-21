package proyectoclicks1.demo.agent.controller;

import proyectoclicks1.demo.agent.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/agent")
@CrossOrigin(origins = "http://localhost:5173")
public class AgentController {

    @Autowired
    private AgentService agentService;

    // -------------------------
    // CHAT PRINCIPAL
    // -------------------------
    @PostMapping("/chat")
    public Map<String, String> chat(@RequestBody Map<String, String> body) {

        String message = body.get("message");

        String response = agentService.processMessage(message);

        return Map.of(
                "status", "ok",
                "message", response
        );
    }

    // -------------------------
    // TEST GOOGLE DIRECTO
    // -------------------------
    @GetMapping("/google")
    public Map<String, String> google() {

        agentService.processMessage("google");

        return Map.of(
                "status", "ok",
                "message", "Google abierto"
        );
    }
}