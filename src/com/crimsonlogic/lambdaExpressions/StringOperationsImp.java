package com.crimsonlogic.lambdaExpressions;

import com.crimsonlogic.interfaces.stringoperation.StringOperations;

import java.util.Arrays;
import java.util.Scanner;

public class StringOperationsImp {

    public StringOperations SOperation = () -> {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("""
                Choose an operation:
                1. To Uppercase
                2. To Lowercase
                3. Find String Length
                4. Reverse a String
                5. Reverse a String using Lambda Expression
                6. Print Each Character
                7. Count Characters
                8. Check if String is Empty
                9. Trim Leading and Trailing Spaces
                10. Replace Spaces with Underscores
                11. Remove Vowels
                12. Check if Starts with "A"
                13. Check if Ends with ".java"
                14. Check if Contains "Java"
                15. Check if Contains Only Alphabets
                16. Check if Contains Only Digits
                17. Check if Contains Special Characters
                18. Check if Length is Greater than 10
                19. Check if Palindrome
                20. Check if Email Address
                21. Check if Blank
                22. Count Vowels
                23. Count Consonants
                24. Count Uppercase Letters
                25. Count Lowercase Letters
                26. Count Digits
                27. Count Words
                28. Find Longest Word
                29. Find Shortest Word
                30. Return First Character
                31. Return Last Character
                """);

        System.out.print("Enter your choice: ");
        int number = sc.nextInt();

        switch (number) {

            case 1:
                System.out.println(text.toUpperCase());
                break;

            case 2:
                System.out.println(text.toLowerCase());
                break;

            case 3:
                System.out.println("Length: " + text.length());
                break;

            case 4:
            case 5:
                System.out.println(new StringBuilder(text).reverse());
                break;

            case 6:
                text.chars()
                        .mapToObj(c -> (char) c)
                        .forEach(System.out::println);
                break;

            case 7:
                System.out.println("Characters: " + text.length());
                break;

            case 8:
                System.out.println(text.isEmpty());
                break;

            case 9:
                System.out.println(text.trim());
                break;

            case 10:
                System.out.println(text.replace(" ", "_"));
                break;

            case 11:
                System.out.println(text.replaceAll("[AEIOUaeiou]", ""));
                break;

            case 12:
                System.out.println(text.startsWith("A"));
                break;

            case 13:
                System.out.println(text.endsWith(".java"));
                break;

            case 14:
                System.out.println(text.contains("Java"));
                break;

            case 15:
                System.out.println(text.matches("[A-Za-z]+"));
                break;

            case 16:
                System.out.println(text.matches("\\d+"));
                break;

            case 17:
                System.out.println(text.matches(".*[^a-zA-Z0-9 ].*"));
                break;

            case 18:
                System.out.println(text.length() > 10);
                break;

            case 19:
                String rev = new StringBuilder(text).reverse().toString();
                System.out.println(text.equalsIgnoreCase(rev));
                break;

            case 20:
                System.out.println(text.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"));
                break;

            case 21:
                System.out.println(text.isBlank());
                break;

            case 22:
                long vowels = text.toLowerCase()
                        .chars()
                        .filter(c -> "aeiou".indexOf(c) != -1)
                        .count();
                System.out.println("Vowels: " + vowels);
                break;

            case 23:
                long consonants = text.toLowerCase()
                        .chars()
                        .filter(Character::isLetter)
                        .filter(c -> "aeiou".indexOf(c) == -1)
                        .count();
                System.out.println("Consonants: " + consonants);
                break;

            case 24:
                System.out.println(text.chars().filter(Character::isUpperCase).count());
                break;

            case 25:
                System.out.println(text.chars().filter(Character::isLowerCase).count());
                break;

            case 26:
                System.out.println(text.chars().filter(Character::isDigit).count());
                break;

            case 27:
                System.out.println(text.trim().split("\\s+").length);
                break;

            case 28:
                System.out.println(Arrays.stream(text.split("\\s+"))
                        .max((a, b) -> Integer.compare(a.length(), b.length()))
                        .orElse(""));
                break;

            case 29:
                System.out.println(Arrays.stream(text.split("\\s+"))
                        .min((a, b) -> Integer.compare(a.length(), b.length()))
                        .orElse(""));
                break;

            case 30:
                System.out.println(text.charAt(0));
                break;

            case 31:
                System.out.println(text.charAt(text.length() - 1));
                break;

            default:
                System.out.println("Invalid Choice");
        }
    };
}