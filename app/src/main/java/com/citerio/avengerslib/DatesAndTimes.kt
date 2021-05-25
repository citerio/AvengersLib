package com.citerio.avengerslib

import org.joda.time.format.DateTimeFormat

object DatesAndTimes {

    fun FormatIso8601(value: String, pattern: String): String {
        val dateTime = org.joda.time.DateTime(value)
        val dateTimeFormatter = DateTimeFormat.forPattern(pattern)
        return dateTimeFormatter.print(dateTime)
    }

    fun FormatIso8601ToSimpleDate(value: String): String {
        return FormatIso8601(value, "dd MMM yyyy")
    }

    fun Now(): org.joda.time.DateTime {
        return org.joda.time.DateTime()
    }

}