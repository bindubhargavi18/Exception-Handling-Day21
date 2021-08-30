package com.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MoodAnalyzerTest {
	MoodAnalyserProblem analyze=new MoodAnalyserProblem();

	@Test
	public void shouldReturnSadWhenGivenSadMessage() throws MoodAnalyserException
	{
		
		String result=analyze.moodAnalyzer("I am in Sad Mood");
		assertEquals(result, "SAD");
	}
	@Test
	public void shouldReturnHappyWhenNotSad() throws MoodAnalyserException
	{
		String result=analyze.moodAnalyzer("I am feeling happy");
		assertEquals(result,"HAPPY");
	}
	@Test
	public void givenMessageIsNullThrowsException()
	{
		try
		{
			analyze.moodAnalyzer(null);
		}catch(MoodAnalyserException exception) {
			assertEquals(MoodAnalyserException.ExceptionType.NULL,exception.exceptionType);
		}
	}
	@Test
	public void givenMessageIsEmptyThrowsException()
	{
		try
		{
			analyze.moodAnalyzer("");
		}catch(MoodAnalyserException exception) {
			assertEquals(MoodAnalyserException.ExceptionType.EMPTY,exception.exceptionType);
		}
	}

}
