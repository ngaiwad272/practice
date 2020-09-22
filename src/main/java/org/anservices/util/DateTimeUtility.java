package org.anservices.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeUtility {
	public static LocalDateTime getLocalDateNTime() {
		LocalDateTime localDateTime = LocalDateTime.now();
		return localDateTime; 
	}
}
