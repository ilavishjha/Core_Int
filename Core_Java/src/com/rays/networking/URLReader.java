package com.rays.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLReader {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://erp.sunilos.com/NCSA/#/Dashboard");

            System.out.println("Protocol = " + url.getProtocol());
            System.out.println("Host Name = " + url.getHost());
            System.out.println("PortNo = " + url.getPort());
            System.out.println("File Name = " + url.getFile());

            InputStream is = url.openStream();

            Scanner sc = new Scanner(is);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL");
        } catch (IOException e) {
            System.out.println("Input Output Error");
        }
    }
}