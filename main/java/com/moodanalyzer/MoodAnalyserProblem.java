package com.moodanalyzer;
public class MoodAnalyserProblem 
{
	private String message;

	public MoodAnalyserProblem()
	{ 
	}
	public MoodAnalyserProblem(String message) 
	{
		this.message = message;
	}

	public String moodAnalyzer(String message) throws MoodAnalyserException 
	{
		try 
		{
			if (message=="")
				throw new MoodAnalyserException("Invalid message", MoodAnalyserException.ExceptionType.EMPTY);
			if (message.toLowerCase().contains("sad"))
				return "SAD";
			return "HAPPY";
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}
}
