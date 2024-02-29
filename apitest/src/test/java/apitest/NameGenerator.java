package apitest;

import java.util.Random;

public class NameGenerator {
    public static void main(String[] args) {
        String[] domains = {"gmail.com", "yahoo.com", "outlook.com", "example.com", "testmail.com"};
        int numberOfEmails = 100000;
        
        Random random = new Random();
        
        for (int i = 0; i < numberOfEmails; i++) {
            String username = generateRandomUsername(random);
            String domain = domains[random.nextInt(domains.length)];
            String email = username + "@" + domain;
            System.out.println(email);
        }
    }
    
    public static String generateRandomUsername(Random random) {
        int length = random.nextInt(10) + 5; // Random username length between 5 and 14
        StringBuilder username = new StringBuilder();
        
        for (int i = 0; i < length; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a'); // Random lowercase letter
            username.append(randomChar);
        }
        
        return username.toString();
    }
}

