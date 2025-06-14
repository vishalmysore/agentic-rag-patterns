package client;

import io.github.vishalmysore.a2a.client.A2AAgent;

public class ClientTest {
    public static void main(String[] args) {
        A2AAgent agent = new A2AAgent();
        agent.connect("http://localhost:7860");
    }
}
