package com.datnx.mylibrary

import java.text.SimpleDateFormat
import java.util.*

/**
 * Date utility functions
 */
object DateUtils {
    
    private const val DEFAULT_DATE_FORMAT = "yyyy-MM-dd"
    private const val DEFAULT_DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss"
    
    /**
     * Format current date to string
     * @param format Date format pattern (default: yyyy-MM-dd)
     * @return Formatted date string
     */
    fun getCurrentDateString(format: String = DEFAULT_DATE_FORMAT): String {
        val sdf = SimpleDateFormat(format, Locale.getDefault())
        return sdf.format(Date())
    }
    
    /**
     * Format date to string
     * @param date Date to format
     * @param format Date format pattern (default: yyyy-MM-dd)
     * @return Formatted date string
     */
    fun formatDate(date: Date, format: String = DEFAULT_DATE_FORMAT): String {
        val sdf = SimpleDateFormat(format, Locale.getDefault())
        return sdf.format(date)
    }
    
    /**
     * Parse string to date
     * @param dateString Date string to parse
     * @param format Date format pattern (default: yyyy-MM-dd)
     * @return Parsed Date object or null if parsing fails
     */
    fun parseDate(dateString: String, format: String = DEFAULT_DATE_FORMAT): Date? {
        return try {
            val sdf = SimpleDateFormat(format, Locale.getDefault())
            sdf.parse(dateString)
        } catch (e: Exception) {
            null
        }
    }
    
    /**
     * Get difference between two dates in days
     * @param date1 First date
     * @param date2 Second date
     * @return Difference in days
     */
    fun getDifferenceInDays(date1: Date, date2: Date): Long {
        val diffInMillis = kotlin.math.abs(date1.time - date2.time)
        return diffInMillis / (24 * 60 * 60 * 1000)
    }
    
    /**
     * Check if a year is leap year
     * @param year Year to check
     * @return true if leap year, false otherwise
     */
    fun isLeapYear(year: Int): Boolean {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
    }
    
    /**
     * Add days to a date
     * @param date Original date
     * @param days Number of days to add
     * @return New date with added days
     */
    fun addDays(date: Date, days: Int): Date {
        val calendar = Calendar.getInstance()
        calendar.time = date
        calendar.add(Calendar.DAY_OF_MONTH, days)
        return calendar.time
    }
}
