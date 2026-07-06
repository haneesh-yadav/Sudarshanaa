package com.sudarshanaa.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@SpringBootApplication
@EnableScheduling
public class SudarshanaaApplication {

    public static void main(String[] args) {
        loadEnvFile();
        SpringApplication.run(SudarshanaaApplication.class, args);
    }

    private static void loadEnvFile() {
        Path currentDir = Paths.get(".").toAbsolutePath().normalize();
        Path envPath = null;
        for (int i = 0; i < 4; i++) {
            Path candidate = currentDir.resolve(".env");
            if (Files.exists(candidate)) {
                envPath = candidate;
                break;
            }
            currentDir = currentDir.getParent();
            if (currentDir == null) {
                break;
            }
        }

        if (envPath != null && Files.exists(envPath)) {
            try {
                List<String> lines = Files.readAllLines(envPath);
                for (String line : lines) {
                    line = line.trim();
                    if (line.isEmpty() || line.startsWith("#")) {
                        continue;
                    }
                    int eqIdx = line.indexOf('=');
                    if (eqIdx > 0) {
                        String key = line.substring(0, eqIdx).trim();
                        String val = line.substring(eqIdx + 1).trim();
                        if (val.startsWith("\"") && val.endsWith("\"")) {
                            val = val.substring(1, val.length() - 1);
                        } else if (val.startsWith("'") && val.endsWith("'")) {
                            val = val.substring(1, val.length() - 1);
                        }
                        System.setProperty(key, val);
                    }
                }
                System.out.println("Loaded environment variables from " + envPath.toAbsolutePath());
            } catch (IOException e) {
                System.err.println("Failed to read .env file: " + e.getMessage());
            }
        } else {
            System.out.println(".env file not found, using system environment variables.");
        }
    }
}
