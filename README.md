# My Android Library

[![](https://jitpack.io/v/datnx/mylibrary.svg)](https://jitpack.io/#datnx/mylibrary)

A comprehensive Android utility library providing string manipulation, mathematical operations, and date utilities.

## Features

### 📝 StringUtils
- String reversal
- Word capitalization  
- Space removal
- Palindrome checking
- Word counting
- Numeric validation

### 🔢 MathUtils
- Factorial calculation
- Prime number checking
- Fibonacci sequence
- Power calculation
- GCD and LCM operations
- Even/odd checking

### 📅 DateUtils
- Date formatting
- Date parsing
- Date arithmetic
- Leap year checking
- Date difference calculation

## Installation

Add the JitPack repository to your root `build.gradle` file:

```gradle
allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```

Add the dependency to your app `build.gradle` file:

```gradle
dependencies {
    implementation 'com.github.datnx:mylibrary:1.0.0'
}
```

## Usage

### StringUtils Examples

```kotlin
import com.datnx.mylibrary.StringUtils

// Reverse a string
val reversed = StringUtils.reverseString("Hello World") // "dlroW olleH"

// Capitalize words
val capitalized = StringUtils.capitalizeWords("hello world") // "Hello World"

// Remove spaces
val noSpaces = StringUtils.removeSpaces("Hello World") // "HelloWorld"

// Check palindrome
val isPalindrome = StringUtils.isPalindrome("madam") // true

// Count words
val wordCount = StringUtils.countWords("Hello World Android") // 3

// Check if numeric
val isNumeric = StringUtils.isNumeric("12345") // true
```

### MathUtils Examples

```kotlin
import com.datnx.mylibrary.MathUtils

// Calculate factorial
val factorial = MathUtils.factorial(5) // 120

// Check if prime
val isPrime = MathUtils.isPrime(17) // true

// Calculate Fibonacci
val fibonacci = MathUtils.fibonacci(7) // 13

// Calculate power
val power = MathUtils.power(2, 5) // 32

// Find GCD
val gcd = MathUtils.gcd(12, 18) // 6

// Find LCM
val lcm = MathUtils.lcm(12, 18) // 36

// Check even/odd
val isEven = MathUtils.isEven(10) // true
val isOdd = MathUtils.isOdd(11) // true
```

### DateUtils Examples

```kotlin
import com.datnx.mylibrary.DateUtils
import java.util.Date

// Get current date string
val currentDate = DateUtils.getCurrentDateString() // "2025-09-14"

// Format date with custom pattern
val customFormat = DateUtils.getCurrentDateString("dd/MM/yyyy") // "14/09/2025"

// Parse date string
val date = DateUtils.parseDate("2025-09-14")

// Calculate date difference
val date1 = Date()
val date2 = DateUtils.addDays(date1, 10)
val diffInDays = DateUtils.getDifferenceInDays(date1, date2) // 10

// Check leap year
val isLeap = DateUtils.isLeapYear(2024) // true

// Add days to date
val futureDate = DateUtils.addDays(Date(), 30)
```

## Sample App

The repository includes a sample Android app that demonstrates all library features. Run the app to see the utilities in action.

## Requirements

- Android API 24+
- Kotlin 1.8+

## License

```
MIT License

Copyright (c) 2025 Dat Nguyen

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## Support

If you find this library helpful, please give it a ⭐ on GitHub!

For issues and feature requests, please use the [GitHub Issues](https://github.com/datnx/mylibrary/issues) page.
