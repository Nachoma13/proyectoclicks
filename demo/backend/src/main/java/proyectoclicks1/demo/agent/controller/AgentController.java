package proyectoclicks1.demo.agent.controller;

import proyectoclicks1.demo.agent.automation.BrowserAutomation;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/agent")
@CrossOrigin(origins = "http://localhost:5173")
public class AgentController {

    @Autowired
    private BrowserAutomation browserAutomation;

    @GetMapping("/test")
    public Map<String, String> test() {

        return Map.of(
                "status", "success",
                "message", "Backend funcionando"
        );
    }

    @PostMapping("/chat")
    public Map<String, String> chat(
            @RequestBody Map<String, String> body
    ) {

        String message = body.get("message");

        System.out.println(message);

        return Map.of(
                "status", "success",
                "message", "Mensaje recibido"
        );
    }

    @GetMapping("/google")
    public Map<String, String> openGoogle() {

        browserAutomation.openGoogle();

        return Map.of(
                "status", "success",
                "message", "Google abierto"
        );
    }
}