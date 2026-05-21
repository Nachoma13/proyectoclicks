package proyectoclicks1.demo.agent.model.response;

public class AgentResponse {

    private String status;
    private String message;

    public AgentResponse() {
    }

    public AgentResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}