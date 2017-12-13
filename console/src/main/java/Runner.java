import java.util.Scanner;
import org.apache.log4j.Logger;

public class Runner{
	final static Logger logger = Logger.getLogger(main.class);
	
	public static void main(String[] args) {
		// PropertiesConfigurator is used to configure logger from properties file
        main.class.getClassLoader().getResource("log4j.properties");

        // Log in console
        logger.info("Log4j console appender configuration is successful !!");
		
		int N = 5;
		Scanner sc = new Scanner(System.in);

		logger.info("Choisir une valeur y/n >> ");
		String choice = sc.nextLine();
		
		if(choice.equals("y")) {
			logger.info("Entrez la valeur: ");
			N = sc.nextInt();
		}

		logger.info("\n");
		for(int i=1; i<=N; i++) {
			logger.info(Fibonacci.fib(i));
		}
	}
}