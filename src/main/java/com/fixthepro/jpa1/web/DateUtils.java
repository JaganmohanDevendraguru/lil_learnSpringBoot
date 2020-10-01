package com.fixthepro.jpa1.web;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

	public static Date createDateFromString(String dateString) {
		Date date = null;
		if (dateString != null) {
			try {
				date = DATE_FORMAT.parse(dateString);
			} catch (ParseException e) {
				date = new Date();
			}
		} else {
			date = new Date();
		}
		return date;
	}
}
