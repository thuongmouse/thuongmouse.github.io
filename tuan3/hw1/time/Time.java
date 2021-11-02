package com.tuan3.hw1.time;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return this.hour;
	}

	public void setHour(int hour) {
		if (minute >= 0 && minute <= 23) {
			this.hour = hour;
		} else {
			this.hour = 0;
			System.out.println("Error: invalid hour");
		}

	}

	public int getMinute() {
		return this.minute;
	}

	public void setMinute(int minute) {
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;
		} else {
			this.minute = 0;
			System.out.println("Error: invalid minute");
		}

	}

	public int getSecond() {
		return this.second;
	}

	public void setSecond(int second) {
		if (minute >= 0 && minute <= 59) {
			this.second = second;
		} else {
			this.second = 0;
			System.out.println("Error: invalid second");
		}

	}

	public void setTime(int hour, int second, int minute) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	public Time nextSecond() {
		++second;
		if (second >= 60) {
			second = 0;
			++minute;
		}
		if (minute >= 60) {
			minute = 0;
			++hour;
		}
		if (hour >= 24) {
			hour = 0;
		}
		return this;
	}

	public Time previousSecond() {
		--second;
		if (second < 0) {
			second = 59;
			minute -= 1;
		}
		if (minute < 0) {
			minute = 59;
			hour -= 1;
		}
		if (hour < 0) {
			hour = 23;
		}
		return this;
	}
}
