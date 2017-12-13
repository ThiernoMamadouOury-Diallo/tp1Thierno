import java.util.Scanner;
import org.apache.log4j.Logger;
class Fibonacci
{
	static Logger logger = Logger.getLogger(Fibonacci.class);
	
	public static void main(String[] args) {
		// PropertiesConfigurator is used to configure logger from properties file
        Fibonacci.class.getClassLoader().getResource("log4j.properties");
 
        // Log in console
        logger.debug("Log4j console appender configuration is successful !!");
		
		int N = 5;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Choisir une valeur y/n >> ");
		String choice = sc.nextLine();
		
		if(choice.equals("y")) {
			System.out.print("Entrez la valeur: ");
			N = sc.nextInt();
		}
		
		System.out.println("\n");
		for(int i=1; i<=N; i++) {
			System.out.println(fib(i));
		}
	}
	
	public static int fib(int n) {
		if (n <= 1) return(n);
		return(fib(n-1) + fib(n-2));
	}
}