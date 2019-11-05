/**
 * Write a description of class OOP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OOP 
{
    IDE IDE= new IDE();
    Frameworks Frame= new Frameworks();
    String BirthDate;
    String Creator;
    String Owner;
    String ReasonForDemand;
    String GitHubUsageRank;
    String KeyCompanies;
    String AvgSalary;
    //defining variables that are info for later to set/get
   public String getBirthDate(){
       return BirthDate;
    }
   public String getCreator(){
       return Creator; 
    }
   public String getOwner(){
       return Owner;
    }
   public String getReasonForDemand(){
      return ReasonForDemand;
   }
   public String getGitHubUsageRank(){
       return GitHubUsageRank;
    }
   public String getKeyCompanies(){
       return KeyCompanies;
    }
}
