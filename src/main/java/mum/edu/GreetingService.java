package mum.edu;

public class GreetingService implements IGreeting {
	private int initial = 0;

	public String getMessage(Person person) {
		System.out.println("RMI Server object receiving person with name "
				+ person.getFirstName() + " " + person.getLastName());
		return "Hello " + person.getFirstName() + " " + person.getLastName();
	}
	
	public synchronized int calculator(char operator, int value){
		if(operator=='+')
			initial+=value;
		else if(operator=='*')
			initial*=value;
		else if(operator=='/'&&value>0)
			initial/=value;
		
		return initial;
	}
}