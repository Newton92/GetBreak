package com.pelba;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) {
        int session = 0;
        int duration = 0;
        int pause = 0;

        // Parsing des arguments
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "--session":
                case "-s":
                    session = Integer.parseInt(args[i + 1]);
                    break;
                case "--duree":
                case "-d":
                    duration = Integer.parseInt(args[i + 1]);
                    break;
                case "--pause":
                case "-p":
                    pause = Integer.parseInt(args[i + 1]);
                    break;
            }
        }

        // Lancement des sessions
        for (int i = 0; i < session; i++) {
            launchSession(duration, pause);
            System.out.printf("Session %d terminée, il reste %d sessions%n", i + 1, session - i - 1);
        }
    }

    public static void launchSession(int duration, int pause) {
        System.out.println("Une session a commencé");
        try {
            Thread.sleep(duration * 60 * 1000);
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=yzg94Iamm_c"));
            System.out.println("Pause en cours");
            Thread.sleep(pause * 60 * 1000);
        } catch (InterruptedException | URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }
}
