
/**
 * Write a description of class ProgrammingLanguages here.
 
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProgrammingLanguages
{
    public static void main(String [] args) {
     System.out.print('\u000C'); //clears screen
    int exit= 1;
    //define exit number
        while(exit!=0){
        System.out.println("\n Welcome to Object Oriented Programming!");
        System.out.println("Press 0 to exit \n");
        System.out.println("What would you like to learn about?");
        System.out.println("Press 1 for Python");
        System.out.println("Press 2 for Swift");
        System.out.println("Press 3 for Ruby");
        System.out.println("Press 4 for C#");
        System.out.println("Press 5 for Java");
        System.out.println("Press 6 for C++");
        System.out.println("Press 7 for C");
        System.out.println("Press 8 for Objective C");
        System.out.println("Press 9 for JavaScript");
        System.out.println("Press 10 for IDE");
        System.out.println("Press 11 for Framework");
        int answer = UserInputOutput.inInt("Select option: ");
        //options and define answer
        //defines existing class within the project as CS for this main class
        //makes new object for said existing class, so able to call later
    OOP ObjectOrientedPrograming= new OOP();
    Python Python= new Python();
    if (answer==0){
        exit=0;
    }
    if (answer==1){
    Python.init();
    System.out.println(Python.BirthDate);
    System.out.println(Python.Creator);
    System.out.println(Python.Owner);
    System.out.println(Python.ReasonForDemand);
    System.out.println(Python.GitHubUsageRank);
    System.out.println(Python.KeyCompanies);
    System.out.println(Python.AvgSalary);
}
}
}
}
