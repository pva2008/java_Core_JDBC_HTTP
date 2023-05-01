package com.vpdev.http.client;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Stream;

public class UrlExample {

    public static void main(String[] args) throws IOException {

        var url = new URL("file:/Users/beshenyiy_/Documents/JavaProjects/Java-Refresh/src/com/vpdev/http/socket/DatagramRunner.java");
        var urlConnection = url.openConnection();

        System.out.println(new String(urlConnection.getInputStream().readAllBytes()));
    }

    private static void checkGoogle() throws IOException {
        var url = new URL("https://www.google.com");
        var urlConnection = url.openConnection();

//        urlConnection.setDoOutput(true);
//        try (var outputStream = urlConnection.getOutputStream()) {
//        }

        System.out.println(urlConnection.getHeaderFields());

//        var url = new URL("https://www.google.com/");
//        var urlConnection = url.openConnection();
//
//      urlConnection.getHeaderFields().entrySet().stream().forEach(x -> {System.out.print(x.getKey() + " ");
//        System.out.println(x.getValue());});
    }
}