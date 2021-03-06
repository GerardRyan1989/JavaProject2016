import java.io.*;

/**
*Represents a user of the system
*@author Gerard Ryan
*/
public class User implements Serializable{
	
	/**
	 *The users Age
	 */
	private int age;
	/**
	 *The Users forename and surname
	 */
	private String uName;
	/**
	 *the Users balance in Euros
	 */
	private double balance;
	
	/**
	 *creates a new student with default values of ("unknown", 0,0.0)
	 **/
	public User(){
		this("Unknown",0,0.0);
	}
	
	/**
	 *Creates a new user with supplied values
	 *the name should include both forename and surname
	 */
	public User(String uName, int age, double balance){
		this.uName = uName;
		this.age = age;
		this.balance = balance;
	}
	
	/**
	 *Changes the name of the user
	 *@param uName this should include both forename and surname
	 */
	public void setName(String uName){
		this.uName = uName;
	}
	
	/**
	 *Changes the users Age
	 *@param age
	 */
	public void setAge(int age){
		this.age = age;
	}
	
	/**
	 *Changes the users balance
	 *@param balance The balance entered should be correct to 2 decimal places
	 */
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	/**
	 *Gets the forename and surname of this user
	 *@return this users name
	 */
	public String getName(){
		return uName;
	}
	
	/**
	 *Gets the age of this user
	 *@return this users age
	 */
	public int getAge(){
		return age;
	}
	
	/**
	 *Gets the balance of this user
	 *@return this users balance
	 */
	public double getBalance(){
		return balance;
	}
	/**
	 *returns user details
	 *@return string value of users forename and  surname, age and balance
	 */
	public String toString(){
		return uName +" " + age + " €" + String.format("%.2f",balance);
	}
}