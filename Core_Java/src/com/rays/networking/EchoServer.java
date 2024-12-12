package com.rays.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(5643);
        System.out.println("Server start");
        Socket socket = null;
        boolean flag = true;
        while (flag) {
            socket = serverSocket.accept();
            talk(socket);
        }
        serverSocket.close();
    }

    public static void talk(Socket socket) throws Exception {
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String line = in.readLine();
        while (line != null) {
            System.out.println("Server Received: " + line);
            out.println(line + "..");
            if (line.equals("quit")) {
                break;
            }
            line = in.readLine();
        }
        out.close();
        in.close();
        socket.close();
    }
}