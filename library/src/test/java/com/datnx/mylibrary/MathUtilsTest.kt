package com.datnx.mylibrary

import org.junit.Test
import org.junit.Assert.*

class MathUtilsTest {
    
    @Test
    fun testFactorial() {
        assertEquals(1L, MathUtils.factorial(0))
        assertEquals(1L, MathUtils.factorial(1))
        assertEquals(2L, MathUtils.factorial(2))
        assertEquals(6L, MathUtils.factorial(3))
        assertEquals(24L, MathUtils.factorial(4))
        assertEquals(120L, MathUtils.factorial(5))
    }
    
    @Test
    fun testIsPrime() {
        assertFalse(MathUtils.isPrime(0))
        assertFalse(MathUtils.isPrime(1))
        assertTrue(MathUtils.isPrime(2))
        assertTrue(MathUtils.isPrime(3))
        assertFalse(MathUtils.isPrime(4))
        assertTrue(MathUtils.isPrime(5))
        assertFalse(MathUtils.isPrime(6))
        assertTrue(MathUtils.isPrime(7))
        assertFalse(MathUtils.isPrime(8))
        assertFalse(MathUtils.isPrime(9))
        assertFalse(MathUtils.isPrime(10))
        assertTrue(MathUtils.isPrime(11))
        assertTrue(MathUtils.isPrime(17))
        assertTrue(MathUtils.isPrime(19))
        assertFalse(MathUtils.isPrime(21))
    }
    
    @Test
    fun testFibonacci() {
        assertEquals(0, MathUtils.fibonacci(0))
        assertEquals(1, MathUtils.fibonacci(1))
        assertEquals(1, MathUtils.fibonacci(2))
        assertEquals(2, MathUtils.fibonacci(3))
        assertEquals(3, MathUtils.fibonacci(4))
        assertEquals(5, MathUtils.fibonacci(5))
        assertEquals(8, MathUtils.fibonacci(6))
        assertEquals(13, MathUtils.fibonacci(7))
    }
    
    @Test
    fun testPower() {
        assertEquals(1L, MathUtils.power(2, 0))
        assertEquals(2L, MathUtils.power(2, 1))
        assertEquals(4L, MathUtils.power(2, 2))
        assertEquals(8L, MathUtils.power(2, 3))
        assertEquals(32L, MathUtils.power(2, 5))
        assertEquals(1L, MathUtils.power(5, 0))
        assertEquals(25L, MathUtils.power(5, 2))
    }
    
    @Test
    fun testGcd() {
        assertEquals(6, MathUtils.gcd(12, 18))
        assertEquals(1, MathUtils.gcd(7, 13))
        assertEquals(5, MathUtils.gcd(15, 25))
        assertEquals(12, MathUtils.gcd(12, 0))
        assertEquals(7, MathUtils.gcd(0, 7))
    }
    
    @Test
    fun testLcm() {
        assertEquals(36, MathUtils.lcm(12, 18))
        assertEquals(91, MathUtils.lcm(7, 13))
        assertEquals(75, MathUtils.lcm(15, 25))
        assertEquals(20, MathUtils.lcm(4, 10))
    }
    
    @Test
    fun testIsEven() {
        assertTrue(MathUtils.isEven(0))
        assertFalse(MathUtils.isEven(1))
        assertTrue(MathUtils.isEven(2))
        assertFalse(MathUtils.isEven(3))
        assertTrue(MathUtils.isEven(10))
        assertFalse(MathUtils.isEven(11))
        assertTrue(MathUtils.isEven(-2))
        assertFalse(MathUtils.isEven(-3))
    }
    
    @Test
    fun testIsOdd() {
        assertFalse(MathUtils.isOdd(0))
        assertTrue(MathUtils.isOdd(1))
        assertFalse(MathUtils.isOdd(2))
        assertTrue(MathUtils.isOdd(3))
        assertFalse(MathUtils.isOdd(10))
        assertTrue(MathUtils.isOdd(11))
        assertFalse(MathUtils.isOdd(-2))
        assertTrue(MathUtils.isOdd(-3))
    }
}
