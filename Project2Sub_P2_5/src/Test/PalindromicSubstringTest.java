package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.PalindromicSubstring;

/**
 * Unit tests for the PalindromicSubstring class.
 * This class contains test cases to verify the functionality of the 
 * {@link PalindromicSubstring#longestPalindrome(String)} method, which 
 * finds the longest palindromic substring within a given string.
 */
public class PalindromicSubstringTest {

    /**
     * Test case to find the longest palindromic substring in a given string.
     * In this test, the input string is "babad". The longest palindromic 
     * substring is "aba". This test ensures that the method correctly 
     * identifies the longest palindrome.
     */
    @Test
    public void testLongestPalindrome() {
        String s = "babad";
        
        // Verify if the longestPalindrome method returns the correct longest palindrome substring
        assertEquals("aba", PalindromicSubstring.longestPalindrome(s), 
            "The longest palindromic substring should be 'aba'.");
    }

    /**
     * Test case for a string with only one character.
     * A single character string is always a palindrome. In this test, 
     * the input string is "a", and the method should return "a" as the longest palindrome.
     */
    @Test
    public void testSingleCharacter() {
        String s = "a";
        
        // Verify if the longestPalindrome method returns the correct palindrome for a single character string
        assertEquals("a", PalindromicSubstring.longestPalindrome(s), 
            "A single character should be considered a palindrome.");
    }

    /**
     * Test case where no palindrome longer than one character exists.
     * In this test, the input string is "abc", where each character is its 
     * own palindrome. The longest palindrome in this case is any single character, 
     * and the method should return the first character in the string ("c").
     */
    @Test
    public void testNoPalindrome() {
        String s = "abc";
        
        // Verify if the longestPalindrome method correctly identifies the longest palindrome
        // when no palindromes longer than one character exist
        assertEquals("c", PalindromicSubstring.longestPalindrome(s), 
            "The longest palindromic substring should be 'c'.");
    }
}
