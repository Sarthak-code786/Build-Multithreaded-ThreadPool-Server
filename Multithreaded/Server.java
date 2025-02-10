
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;

public class Server {

    public Consumer<Socket> getConsumer() {
        return new Consumer<Socket>() {
            @Override
            public void accept(Socket clientSocket) {
                try {
                    PrintWriter toClient = new PrintWriter(clientSocket.getOutputStream(), true);
                    toClient.println("Hello from the server" + clientSocket.getInetAddress());
                    toClient.close();
                    clientSocket.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        };
    }

    public static void main(String[] args) {
        int port = 8010;
        Server server = new Server();
        try {
            ServerSocket socket = new ServerSocket(port);
            socket.setSoTimeout(70000);
            while (true) {
                System.out.println("Server is listening on port " + port);
                Socket acceptedConnection = socket.accept();
                Thread thread = new Thread(()->server.getConsumer().accept(acceptedConnection));
                thread.start();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
