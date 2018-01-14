package ru.mashnatash.learning_castle;

public class ServerMain {
    public static void main(String[] args) {
        class WebsiteThread extends Thread {
            @Override
            public void run() {
                new WebsiteServer().start();
                System.out.println("Wait client from website");
            }
        }
        new WebsiteThread().start();
    }
}
