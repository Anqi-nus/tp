package seedu.event;

import seedu.exception.DukeException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateTime {
    private String dateTime;
    private String dateTimeFormat;

    public DateTime(String arguments) {
        this.dateTime = arguments;
        this.dateTimeFormat = getDateTimeFormat();
    }

    /**
     * Formats datetime to the correct output for the user.
     * @return The parsed string of date and time of the event.
     */
    public String getDateTimeFormat() {
        return getDateTime().format(DateTimeFormatter.ofPattern("E, MMM dd yyyy HHmm"));
    }

    /**
     * Parses datetime of pattern input by the user.
     * If no input by the user, it takes the current datetime.
     * @return Parsed datetime object
     */
    public LocalDateTime getDateTime() {
        try {
            LocalDateTime localDateTime = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HHmm"));
            return localDateTime;
        } catch (DateTimeParseException e) {
            LocalDateTime currentDateTime = LocalDateTime.now();
            return currentDateTime;
        }
    }

    /**
     * Gets the numerical value of the month of the event.
     * @return The value of the month
     */
    public Integer getMonth() {
        LocalDateTime localDateTime = getDateTime();
        int month = localDateTime.getMonthValue();
        return month;
    }

    /**
     * Gets the year of the event as a single or double digit number, referring to the current century.
     * @return Year of the event.
     */
    public Integer getYear() {
        LocalDateTime localDateTime = getDateTime();
        int year = localDateTime.getYear() - 2000;
        //only current century format in double digit
        return year;
    }

    public String toString() {
        return this.dateTimeFormat;
    }
}