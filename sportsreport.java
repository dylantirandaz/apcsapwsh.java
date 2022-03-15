public class SportsReport
{
	/** Names of the winning and losing teams */
	private String winner;
	private String loser;

	public static String beatsWord = " beat ";

	/** the winning and losing scores */
	private int winningScore;
	private int losingScore;

	/** Constructs a SportsReport using the information in score
	 *  @param score contains winner, loser, and scores in the format:
	 *  <winner> beat <loser> by a score of <winning score> to <losing score>
	 */
	public SportsReport(String score)
	{
		extractInformation(score);
	}

	/** Changes the sports scoring information
	 *  @param score contains winner, loser, and scores in the format:
	 *  <winner> beat <loser> by a score of <winning score> to <losing score>
	 */
	public void changeScoringInfo(String score)
	{
		extractInformation(score);
	}

	public String getWinner()
	{
		return winner;
	}

	public String getLoser()
	{
		return loser;
	}

	public int getWinningScore()
	{
		return winningScore;
	}

	public int getLosingScore()
	{
		return losingScore;
	}

	// write getScoreDifference method HERE!!
	public int getScoreDifference()
	{
		return winningScore - losingScore;
	}

	@Override
	public String toString()
	{
		String gameOver = String.format("%-25s%4d, %-25s%4d", winner, winningScore, loser, losingScore);
		return gameOver;
	}

	// write PRIVATE extractInformation method HERE!!
	
	private void extractInformation(String score)
	{
		int indexOfBeat = -1;
		int indexOfBy = -1;
		int indexOfOff = -1;
		int indexOfTo = -1;
		
			if(score.indexOf(beatsWord)!= -1)
			{
				indexOfBeat = score.indexOf(beatsWord);
				winner = score.substring(0, indexOfBeat).trim();

			}	
		
		for (int b = indexOfBeat; b < score.length()- 1; b++)
		{
			if(score.substring(b, b + 4).equals(" by "))
			{
				indexOfBy = b;
				loser = score.substring(indexOfBeat + 6, indexOfBy);
				break;
			}
			
		}
		
		for (int a = indexOfBy; a < score.length()- 1; a++)
		{
			if(score.substring(a, a + 4).equals(" of "))
			{
				indexOfOff = a;
				break;
			}
			
		}
		
		for (int b = indexOfOff; b < score.length()- 1; b++)
		{
			if(score.substring(b, b + 4).equals(" to "))
			{
				indexOfTo = b;
				String stringWinScore = score.substring(indexOfOff 
					+ 3, indexOfTo).trim();
				winningScore = Integer.parseInt(stringWinScore);
				break;
			}	
				
		}
		
		String stringLoseScore = score.substring(indexOfTo 
			+ 3, score.length()).trim();
		losingScore = Integer.parseInt(stringLoseScore);
		
	}

}
