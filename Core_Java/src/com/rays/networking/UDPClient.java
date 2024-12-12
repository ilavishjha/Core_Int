package com.rays.networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(4445);

        byte[] buf = new byte[256];

        InetAddress address = InetAddress.getByName("127.0.0.1");

        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);

        socket.send(packet);

        packet = new DatagramPacket(buf, buf.length);

        socket.receive(packet);
        String received = new String(packet.getData());
        System.out.println("Quote of the Moment: " + received);

        // Close Socket
        socket.close();
    }
}