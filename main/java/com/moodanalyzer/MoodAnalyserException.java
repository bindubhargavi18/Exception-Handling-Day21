package com.moodanalyzer;

public class MoodAnalyserException extends Exception 
{
	public String message;
	public ExceptionType exceptionType;

	enum ExceptionType {
		NULL, EMPTY;

	}

	public MoodAnalyserException(String message, ExceptionType type) 
	{
		this.message = message;
		this.exceptionType = type;
	}

}
