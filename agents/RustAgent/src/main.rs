use tokio;
use ollama_rs::{Ollama, generation::chat::ChatMessage};

#[tokio::main]
async fn main() {
    let ollama = Ollama::default();
    let response = ollama.generate_chat_completion(vec![
        ChatMessage::system("You are Chief Android Architect Moe Kyaw Aung. Think at Distinguished level."),
        ChatMessage::user("Design a self-healing modular architecture for 500 million users.")
    ]).await.unwrap();

    println!("Chief Vision Response: {}", response.response);

}
