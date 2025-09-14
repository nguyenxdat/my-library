package com.datnx.mylibrary

import kotlin.math.sqrt

/**
 * Mathematical utility functions
 */
object MathUtils {
    
    /**
     * Calculate factorial of a number
     * @param n The number to calculate factorial
     * @return Factorial of n
     */
    fun factorial(n: Int): Long {
        return if (n <= 1) 1L else n * factorial(n - 1)
    }
    
    /**
     * Check if a number is prime
     * @param number The number to check
     * @return true if prime, false otherwise
     */
    fun isPrime(number: Int): Boolean {
        if (number < 2) return false
        for (i in 2..sqrt(number.toDouble()).toInt()) {
            if (number % i == 0) return false
        }
        return true
    }
    
    /**
     * Calculate Fibonacci number at position n
     * @param n Position in Fibonacci sequence
     * @return Fibonacci number at position n
     */
    fun fibonacci(n: Int): Int {
        return when (n) {
            0 -> 0
            1 -> 1
            else -> fibonacci(n - 1) + fibonacci(n - 2)
        }
    }
    
    /**
     * Calculate power of a number
     * @param base Base number
     * @param exponent Exponent
     * @return base^exponent
     */
    fun power(base: Int, exponent: Int): Long {
        var result = 1L
        repeat(exponent) {
            result *= base
        }
        return result
    }
    
    /**
     * Find greatest common divisor of two numbers
     * @param a First number
     * @param b Second number
     * @return GCD of a and b
     */
    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
    
    /**
     * Find least common multiple of two numbers
     * @param a First number
     * @param b Second number
     * @return LCM of a and b
     */
    fun lcm(a: Int, b: Int): Int {
        return (a * b) / gcd(a, b)
    }
    
    /**
     * Check if a number is even
     * @param number Number to check
     * @return true if even, false otherwise
     */
    fun isEven(number: Int): Boolean {
        return number % 2 == 0
    }
    
    /**
     * Check if a number is odd
     * @param number Number to check
     * @return true if odd, false otherwise
     */
    fun isOdd(number: Int): Boolean {
        return number % 2 != 0
    }
}
