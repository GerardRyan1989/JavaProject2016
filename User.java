
public class User{
	
	private int age;
	private String uName;
	private double balance;
	
	public User(){
		this("jimmy",0,0.0);
	}
	
	public User(String uName, int age, double balance){
		this.uName = uName;
		this.age = age;
		this.balance = balance;
	}
	
	public void setName(String uName){
		this.uName = uName;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public String getName(){
		return uName;
	}
	
	public int getAge(){
		return age;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public String toString(){
		return uName +" " + age + " " + balance;
	}
}