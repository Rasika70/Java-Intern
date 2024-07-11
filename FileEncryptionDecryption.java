

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEncryptionDecryption {
    private static final int SHIFT = 4; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Encrypt a file");
        System.out.println("2. Decrypt a file");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.println("Enter the file path:");
        String filePath = sc.nextLine();

        System.out.println("Enter the output file path:");
        String outputPath = sc.nextLine();

        try {
            if (choice == 1) {
                encryptFile(filePath, outputPath);
                System.out.println("File encrypted successfully.");
            } else if (choice == 2) {
                decryptFile(filePath, outputPath);
                System.out.println("File decrypted successfully.");
            } else {
                System.out.println("Invalid choice.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void encryptFile(String filePath, String outputPath) throws IOException {
        processFile(filePath, outputPath, SHIFT);
    }

    private static void decryptFile(String filePath, String outputPath) throws IOException {
        processFile(filePath, outputPath, -SHIFT);
    }

    private static void processFile(String filePath, String outputPath, int shift) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));

        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(applyCaesarCipher(line, shift));
            writer.newLine();
        }

        reader.close();
        writer.close();
    }

    private static String applyCaesarCipher(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                character = (char) ((character - base + shift + 26) % 26 + base);
            }

            result.append(character);
        }

        return result.toString();
    }
}
