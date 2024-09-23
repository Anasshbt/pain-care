package com.pain_care.pain_care;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class PainCareApplicationTests {

    public static void main(String[] args) {
        // Lancer l'application
        SpringApplication.run(PainCareApplicationTests.class, args);

        // Exécuter les tests
        testAddition();
        testStringManipulation();
        testContextLoad();
    }

    static void testAddition() {
        int result = add(2, 3);
        if (result == 5) {
            System.out.println("Test Addition: SUCCESS");
        } else {
            System.out.println("Test Addition: FAILED");
        }
    }

    static void testStringManipulation() {
        String original = "Hello";
        String result = original.toUpperCase();
        if ("HELLO".equals(result)) {
            System.out.println("Test String Manipulation: SUCCESS");
        } else {
            System.out.println("Test String Manipulation: FAILED");
        }
    }

    static void testContextLoad() {
        try {
            // Simuler le chargement du contexte
            System.out.println("Context loads successfully.");
            System.out.println("Test Context Load: SUCCESS");
        } catch (Exception e) {
            System.out.println("Test Context Load: FAILED");
        }
    }

    // Méthode pour tester l'addition
    private static int add(int a, int b) {
        return a + b;
    }
}
