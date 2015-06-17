import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * Puzzle 3
 * Try adding two values 12345 + 5432l where the 'l' in one of the value stands for long
 * 
 * 
		 * Puzzle 4 Confusion!!!! Avoid using small letter 'l'(L) for long
		 * Always use capital(L) in Long literals
		 * literals. Always use capital(L) in Long literals.
		 *
 * @author Omeya
 *
 */
public class Puzzle3 {
	
public static void main(String[] args) {
	
	CommandLineParser parser = new DefaultParser();
	Options options = new Options();
	options.addOption("a", true,"First parameter");
	options.addOption("b", true,"Second parameter");
	options.addOption("h","help", false,"shows this help");
	try {
		CommandLine commandLine = parser.parse(options, args);
		String firstValue = commandLine.getOptionValue("a");
		String secondValue = commandLine.getOptionValue("b");
		if(commandLine.hasOption("h")){
			HelpFormatter formatter = new HelpFormatter();
			formatter.printHelp("CommandLineParameters", options);
		}
		double first_num = Double.parseDouble(firstValue);
		double second_num = Double.parseDouble(secondValue);
		
		System.out.println(firstValue+secondValue);

		Expression expr = new Expression();
		
		expr.computeDouble(first_num,second_num);
		expr.computeBigDec(firstValue,secondValue);

	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
