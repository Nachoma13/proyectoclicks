import { useState } from "react";

export default function ChatBox() {

    const [message, setMessage] = useState("");
    const [response, setResponse] = useState("");

    const sendMessage = async () => {

        try {

            const res = await fetch("http://localhost:8080/agent/chat", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({ message })
            });

            const data = await res.json();

            setResponse(data.message);

        } catch (error) {

            console.log(error);
            setResponse("Error backend");
        }
    };

    const openGoogle = async () => {

        try {

            await fetch("http://localhost:8080/agent/google");

            setResponse("Google abierto");

        } catch (error) {

            setResponse("Error Google");
        }
    };

    return (
        <div style={{ padding: "20px" }}>

            <h2>Agent</h2>

            <input
                value={message}
                onChange={(e) => setMessage(e.target.value)}
                placeholder="mensaje"
            />

            <button onClick={sendMessage}>Enviar</button>
            <button onClick={openGoogle}>Google</button>

            <p>{response}</p>

        </div>
    );
}