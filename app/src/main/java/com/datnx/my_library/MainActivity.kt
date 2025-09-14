package com.datnx.my_library

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.datnx.mylibrary.StringUtils
import com.datnx.mylibrary.MathUtils
import com.datnx.mylibrary.DateUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val textView = findViewById<TextView>(R.id.textView)
        
        // Demo StringUtils
        val originalString = "hello world android"
        val reversedString = StringUtils.reverseString(originalString)
        val capitalizedString = StringUtils.capitalizeWords(originalString)
        val withoutSpaces = StringUtils.removeSpaces(originalString)
        val wordCount = StringUtils.countWords(originalString)
        val isPalindrome = StringUtils.isPalindrome("madam")
        
        // Demo MathUtils
        val factorial5 = MathUtils.factorial(5)
        val isPrime17 = MathUtils.isPrime(17)
        val fibonacci7 = MathUtils.fibonacci(7)
        val power2to5 = MathUtils.power(2, 5)
        val gcd12and18 = MathUtils.gcd(12, 18)
        val lcm12and18 = MathUtils.lcm(12, 18)
        
        // Demo DateUtils
        val currentDate = DateUtils.getCurrentDateString()
        val isLeap2024 = DateUtils.isLeapYear(2024)
        
        val demoText = """
            📱 My Android Library Demo
            
            🔤 StringUtils Examples:
            • Original: "$originalString"
            • Reversed: "$reversedString"
            • Capitalized: "$capitalizedString"
            • Without spaces: "$withoutSpaces"
            • Word count: $wordCount
            • Is "madam" palindrome: $isPalindrome
            
            🔢 MathUtils Examples:
            • Factorial of 5: $factorial5
            • Is 17 prime: $isPrime17
            • Fibonacci(7): $fibonacci7
            • 2^5 = $power2to5
            • GCD(12, 18) = $gcd12and18
            • LCM(12, 18) = $lcm12and18
            
            📅 DateUtils Examples:
            • Current date: $currentDate
            • Is 2024 leap year: $isLeap2024
            
            ✅ Library is working perfectly!
        """.trimIndent()
        
        textView.text = demoText
    }
}
