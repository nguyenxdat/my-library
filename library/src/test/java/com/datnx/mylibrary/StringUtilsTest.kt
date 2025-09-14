package com.datnx.mylibrary

import org.junit.Test
import org.junit.Assert.*

class StringUtilsTest {
    
    @Test
    fun testReverseString() {
        assertEquals("dlroW olleH", StringUtils.reverseString("Hello World"))
        assertEquals("", StringUtils.reverseString(""))
        assertEquals("a", StringUtils.reverseString("a"))
    }
    
    @Test
    fun testCapitalizeWords() {
        assertEquals("Hello World", StringUtils.capitalizeWords("hello world"))
        assertEquals("Android Studio", StringUtils.capitalizeWords("android studio"))
        assertEquals("", StringUtils.capitalizeWords(""))
        assertEquals("A", StringUtils.capitalizeWords("a"))
    }
    
    @Test
    fun testRemoveSpaces() {
        assertEquals("HelloWorld", StringUtils.removeSpaces("Hello World"))
        assertEquals("AndroidStudio", StringUtils.removeSpaces("Android Studio"))
        assertEquals("", StringUtils.removeSpaces(""))
        assertEquals("NoSpaces", StringUtils.removeSpaces("NoSpaces"))
    }
    
    @Test
    fun testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"))
        assertTrue(StringUtils.isPalindrome("racecar"))
        assertTrue(StringUtils.isPalindrome("A man a plan a canal Panama"))
        assertFalse(StringUtils.isPalindrome("hello"))
        assertFalse(StringUtils.isPalindrome("world"))
        assertTrue(StringUtils.isPalindrome(""))
        assertTrue(StringUtils.isPalindrome("a"))
    }
    
    @Test
    fun testCountWords() {
        assertEquals(2, StringUtils.countWords("Hello World"))
        assertEquals(3, StringUtils.countWords("Android Studio IDE"))
        assertEquals(0, StringUtils.countWords(""))
        assertEquals(0, StringUtils.countWords("   "))
        assertEquals(1, StringUtils.countWords("Hello"))
        assertEquals(4, StringUtils.countWords("  Hello   World   Android  Studio  "))
    }
    
    @Test
    fun testIsNumeric() {
        assertTrue(StringUtils.isNumeric("12345"))
        assertTrue(StringUtils.isNumeric("0"))
        assertTrue(StringUtils.isNumeric("999"))
        assertFalse(StringUtils.isNumeric(""))
        assertFalse(StringUtils.isNumeric("abc"))
        assertFalse(StringUtils.isNumeric("123abc"))
        assertFalse(StringUtils.isNumeric("12.34"))
        assertFalse(StringUtils.isNumeric("-123"))
    }
}
