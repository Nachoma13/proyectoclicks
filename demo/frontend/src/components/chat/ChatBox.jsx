import { useState } from "react"
import API from "../../services/api"

export default function ChatBox() {

    const [message, setMessage] = useState("")

    const sendMessage = async () => {

        console.log("BOTON FUNCIONA")

        try {

            const response = await API.post(
                "/agent/chat",
                {
                    message
                }
            )

            console.log(response.data)

        } catch (error) {

            console.error(error)
        }
    }

    return (

        <div>

            <input
                type="text"
                value={message}
                onChange={(e) => setMessage(e.target.value)}
                placeholder="Escribe un comando..."
            />

            <button onClick={sendMessage}>
                Ejecutar
            </button>

        </div>
    )
}