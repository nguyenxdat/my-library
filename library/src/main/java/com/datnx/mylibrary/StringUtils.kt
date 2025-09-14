package com.datnx.mylibrary

/**
 * String utility functions for common string operations
 */
object StringUtils {
    
    /**
     * Reverse a string
     * @param input The input string to reverse
     * @return Reversed string
     */
    fun reverseString(input: String): String {
        return input.reversed()
    }
    
    /**
     * Capitalize all words in a string
     * @param input The input string
     * @return String with capitalized words
     */
    fun capitalizeWords(input: String): String {
        return input.split(" ").joinToString(" ") { word ->
            word.replaceFirstChar { 
                if (it.isLowerCase()) it.titlecase() else it.toString() 
            }
        }
    }
    
    /**
     * Remove all spaces from a string
     * @param input The input string
     * @return String without spaces
     */
    fun removeSpaces(input: String): String {
        return input.replace(" ", "")
    }
    
    /**
     * Check if a string is a palindrome
     * @param input The input string to check
     * @return true if palindrome, false otherwise
     */
    fun isPalindrome(input: String): Boolean {
        val cleaned = input.lowercase().replace(" ", "")
        return cleaned == cleaned.reversed()
    }
    
    /**
     * Count words in a string
     * @param input The input string
     * @return Number of words
     */
    fun countWords(input: String): Int {
        return if (input.trim().isEmpty()) 0 else input.trim().split("\\s+".toRegex()).size
    }
    
    /**
     * Check if string contains only digits
     * @param input The input string
     * @return true if contains only digits, false otherwise
     */
    fun isNumeric(input: String): Boolean {
        return input.matches("\\d+".toRegex())
    }
}
