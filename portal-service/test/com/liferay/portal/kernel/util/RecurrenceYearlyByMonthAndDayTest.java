/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.kernel.util;

import com.liferay.portal.kernel.cal.DayAndPosition;
import com.liferay.portal.kernel.cal.Duration;
import com.liferay.portal.kernel.cal.Recurrence;

import java.util.Calendar;

/**
 * @author Douglas Wong
 */
public class RecurrenceYearlyByMonthAndDayTest extends RecurrenceTestCase {

	public void testRecurrence() {
		Recurrence recurrence = getRecurrence(
			dtStart, durationOneHour, FEBRUARY, FRIDAY, 3, 1);

		Calendar beforeRecurrence = getCalendar(2008, FEBRUARY, 15, 22, 9);

		assertRecurrenceEquals(false, recurrence, beforeRecurrence);

		Calendar duringRecurrence1 = getCalendar(2008, FEBRUARY, 15, 22, 10);
		Calendar duringRecurrence2 = getCalendar(2009, FEBRUARY, 20, 22, 15);

		assertRecurrenceEquals(true, recurrence, duringRecurrence1);
		assertRecurrenceEquals(true, recurrence, duringRecurrence2);

		Calendar afterRecurrence = getCalendar(2008, FEBRUARY, 15, 23, 10);

		assertRecurrenceEquals(false, recurrence, afterRecurrence);
	}

	public void testRecurrenceCrossDates() {
		Recurrence recurrence = getRecurrence(
			dtStart, durationTwoHours, FEBRUARY, FRIDAY, 3, 1);

		Calendar duringRecurrence = getCalendar(2008, FEBRUARY, 16, 0, 9);

		assertRecurrenceEquals(true, recurrence, duringRecurrence);

		Calendar afterRecurrence = getCalendar(2008, FEBRUARY, 16, 0, 10);

		assertRecurrenceEquals(false, recurrence, afterRecurrence);
	}

	public void testRecurrenceCrossWeeks() {
		Recurrence recurrence = getRecurrence(
			dtStart, durationCrossWeek, FEBRUARY, FRIDAY, 3, 1);

		Calendar duringRecurrence = getCalendar(2008, FEBRUARY, 23, 22, 9);

		assertRecurrenceEquals(true, recurrence, duringRecurrence);

		Calendar afterRecurrence = getCalendar(2008, FEBRUARY, 23, 22, 10);

		assertRecurrenceEquals(false, recurrence, afterRecurrence);
	}

	public void testRecurrenceCrossYears() {
		Recurrence recurrence = getRecurrence(
			dtStart, durationCrossWeek, DECEMBER, FRIDAY, 4, 1);

		Calendar duringRecurrence = getCalendar(2009, JANUARY, 3, 22, 9);

		assertRecurrenceEquals(true, recurrence, duringRecurrence);

		Calendar afterRecurrence = getCalendar(2009, JANUARY, 3, 22, 10);

		assertRecurrenceEquals(false, recurrence, afterRecurrence);
	}

	public void testRecurrenceWithInterval() {
		Recurrence recurrence = getRecurrence(
			dtStart, durationOneHour, FEBRUARY, FRIDAY, 3, 2);

		Calendar duringRecurrence1 = getCalendar(2008, FEBRUARY, 15, 22, 15);
		Calendar duringRecurrence2 = getCalendar(2009, FEBRUARY, 20, 22, 15);
		Calendar duringRecurrence3 = getCalendar(2010, FEBRUARY, 19, 22, 15);
		Calendar duringRecurrence4 = getCalendar(2011, FEBRUARY, 18, 22, 15);

		assertRecurrenceEquals(true, recurrence, duringRecurrence1);
		assertRecurrenceEquals(false, recurrence, duringRecurrence2);
		assertRecurrenceEquals(true, recurrence, duringRecurrence3);
		assertRecurrenceEquals(false, recurrence, duringRecurrence4);
	}

	public void testRecurrenceWithLeapYear() {
		Recurrence recurrence = getRecurrence(
			dtStart, durationTwoHours, FEBRUARY, FRIDAY, -1, 1);

		Calendar duringRecurrence1 = getCalendar(2008, FEBRUARY, 29, 22, 10);
		Calendar duringRecurrence2 = getCalendar(2008, MARCH, 1, 0, 9);

		assertRecurrenceEquals(true, recurrence, duringRecurrence1);
		assertRecurrenceEquals(true, recurrence, duringRecurrence2);

		Calendar afterRecurrence = getCalendar(2008, MARCH, 1, 0, 10);

		assertRecurrenceEquals(false, recurrence, afterRecurrence);
	}

	public void testRecurrenceWithUntilDate() {
		Recurrence recurrence = getRecurrence(
			dtStart, durationOneHour, FEBRUARY, FRIDAY, 3, 1);

		recurrence.setUntil(getCalendar(2008, MARCH, 15, 22, 10));

		Calendar beforeUntil = getCalendar(2008, FEBRUARY, 15, 22, 15);

		assertRecurrenceEquals(true, recurrence, beforeUntil);

		Calendar afterUntil = getCalendar(2009, FEBRUARY, 20, 22, 15);

		assertRecurrenceEquals(false, recurrence, afterUntil);
	}

	protected Recurrence getRecurrence(
		Calendar dtStart, Duration duration, int month, int day, int position,
		int interval) {

		Recurrence recurrence = new Recurrence(
			dtStart, duration, Recurrence.YEARLY);

		DayAndPosition[] days = {new DayAndPosition(day, position)};
		int[] months = {month};

		recurrence.setByDay(days);
		recurrence.setByMonth(months);
		recurrence.setInterval(interval);

		return recurrence;
	}

}