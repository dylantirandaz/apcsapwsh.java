class RoachPopulation 
{
	private static final int DEFAULT_POPULATION = 10;
	
	private int numRoaches;		// The roach population
	
	/** Default constructor, initializes the population to 10 
	 */
	public RoachPopulation() 
	{
		numRoaches = DEFAULT_POPULATION;
	}
	/** My constructor, lets you input the population
	 */
		public RoachPopulation(int numRoaches)
		{
			this.numRoaches = numRoaches;
		}

	/** Provides the current roach population
	 *  @return number of roaches remaining
	 */
	public int getRoaches() 
	{
		return numRoaches;
	}


	/** Doubles the amount of roaches
	 * non-return method
	 */
	public void waitForDoubling() 
	{
		numRoaches = numRoaches * 2;
	}
	
}
