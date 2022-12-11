package org.aibles.okrbackend.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    private static final DateTimeFormatter DATE_INTEGER_FORMATTER =
            DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final String VI_ZONE = "Asia/Ho_Chi_Minh";

    public static LocalDate getCurrentDate() {
        return LocalDate.now(ZoneId.of(VI_ZONE));
    }

    public static Integer getCurrentDateInteger() {
        return getDate(getCurrentDate());
    }

    public static LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now(ZoneId.of(VI_ZONE));
    }

    public static String getCurrentDateTimeStr() {
        return getCurrentDateTime().format(DATE_INTEGER_FORMATTER);
    }

    public static Integer getDate(LocalDate localDate) {
        return Integer.parseInt(DATE_INTEGER_FORMATTER.format(localDate));
    }
}
