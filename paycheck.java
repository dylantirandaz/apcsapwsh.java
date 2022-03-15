public class PayCheck 
{
	/* Static Constants Go Here */
	public static double BASIC_WAGE = 9.75;
	public static double OVERTIME_WAGE = BASIC_WAGE * 1.5;
	public static double BONUS_MONEY = 100.00;
	



	
	/* Instance variables */
	private String employee;
	private double hoursWorked;
	private boolean isManager;
	private double weeklySales;
	
	/** 
	 *  Creates a PayCheck object for an employee given the name and
	 *  whether or not this employee is a manager.
	 *  @param name the name of the employee
	 *  @param manager indicates whether or not this is a manager 
	 *     (true if a manager, false if a sales clerk)
	 */
	public PayCheck(String name, boolean manager)
	{
		employee = name;
		isManager = manager;
		hoursWorked = 0;
		weeklySales = 0;
	}


	public double calcWages()
	{
		double wages = 0;
		if (hoursWorked <= 40)
			wages = hoursWorked * BASIC_WAGE;
		else if (hoursWorked > 40)
			wages = ((hoursWorked - 40) * OVERTIME_WAGE) 
				+ (40 * (BASIC_WAGE));
		if (isManager == true)
			wages = wages + BONUS_MONEY;
		else if (isManager == false)
			wages = wages;
		return wages;
	}
	
	
	/** Retrieves the employee's name
	 *  @return the name of this employee
	 */
	public String getName()
	{
		return employee;
	}
	
	/** Reports whether or not this employee is a manager
	 *  @return true if this employee is a manager, false otherwise
	 */
	public boolean isManager()
	{
		return isManager;
	}
	
	/** Retrieves the number of hours worked 
	 *  @return the number of hours worked this pay period
	 */
	public double getHours()
	{
		return hoursWorked;
	}

	/** Resets the number of hours worked to newHours
	 *  @param newHours the number of hours worked this pay period
	 */
	public void setHours(double newHours)
	{
		hoursWorked = newHours;
	}

	/** Retrieves the total amount of sales generated 
	 *  @return the total amount of sales generated this pay period
	 */

	public double getSales()
	{
		return weeklySales;
	}

	/** Resets the amount of sales generated to newSales
	 *  @param newSales the total amount of sales generated this pay period
	 */
	public void setSales(double newSales)
	{
		weeklySales = newSales;
	}
}
