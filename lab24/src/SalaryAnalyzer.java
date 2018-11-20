import java.io.*;
import java.util.*;
public class SalaryAnalyzer {
	static final String IN_FILE_NAME = "StateOfSC-Salary-List-04012015.txt";
	static final String OUT_FILE_NAME = "OVER250000.txt";
	static final String DELIM = "\t";
	public static void main(String[] args)
	{
		System.out.println("Let's see how many state employees make over $250,000 and work at USC.");
		analyzeEmployeeFile(IN_FILE_NAME);
		System.out.println("Results have been printed to "+OUT_FILE_NAME);
	}
	public static void analyzeEmployeeFile(String fileName)
	{
		//TODO: Fill this in
	}
	public static void printToSalaryFile(String fileName, String text)
	{
		//TODO: Fill this in
	}
}
