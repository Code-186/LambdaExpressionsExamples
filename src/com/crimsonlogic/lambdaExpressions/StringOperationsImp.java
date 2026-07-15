package com.crimsonlogic.lambdaExpressions;

import com.crimsonlogic.interfaces.stringoperation.StringOperations;

import java.util.Scanner;

public class StringOperationsImp {
    public StringOperations str = () -> {
        String text;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        text = sc.next();

        int number;
        System.out.println("Enter the number for the string operation");
        System.out.println(""" Choose an operation:
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
                                        31. Return Last Character""");

        System.out.print("Enter your choice: ");
        number = sc.nextInt();

        System.out.println("Converted to Upper");
        System.out.println(text.toUpperCase());
    };


}
