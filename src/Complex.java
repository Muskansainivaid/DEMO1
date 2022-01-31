package ca.Sheridancollege.Muskan16;
public class App {
    public static void main(String[] args) throws Exception {
        SalariedWorker test=new SalariedWorker();
       // Worker worker=new Worker();
        System.out.println("Salary of Hourly based Emp: \n");
        test.calculateSalaryAndName();
        //test.toString();
        System.out.println();
System.out.println("Salary of Hourly based Emp: \n");
        HourlyWorker hourlyWorker=new HourlyWorker();
        hourlyWorker.calculateSalaryAndName();
        
        
    }
}

package ca.Sheridancollege.Muskan16;

public class Worker {
    private String name;
    private int salaryRate;



  public Worker(){
      
  }
  public Worker(String name,int salaryRate){
      this.name=name;
      this.salaryRate=salaryRate;
    
  }
   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name=name;
   }
   public int getsalaryRate(){
       return salaryRate;
   }
   public void setsalaryRate(int salaryRate){
       this.salaryRate=salaryRate;
   }
  
   public String toString()
   {
       System.out.println("Name:"+getName()+"\n"+"salaryRate:"+this.salaryRate);
      return "Name:"+getName()+"\n"+"salaryRate:"+this.salaryRate;
   }

}
  package ca.Sheridancollege.Muskan16;

public class SalariedWorker extends Worker{
   
    int rateSalariedBased=30;
   
    int salaryofSalariedEmp;
  
    public void calculateSalaryAndName(){
        setName("Muksan");
        getName();
        salaryofSalariedEmp= rateSalariedBased*40;
    }
      
    @Override
   public String toString()
   {
       System.out.println("Name:"+getName()+"\n"+"salaryRate:"+this.salaryofSalariedEmp);
      return "Name:"+getName()+"\n"+"salaryRate:"+this.salaryofSalariedEmp;
   }
  
}

        package ca.Sheridancollege.Muskan16;

public class HourlyWorker extends Worker {

    int numberOfHoursPerWeek=35;
    int  salaryPerHour=15;
    int salaryofHourlyEmp;
    
    public void calculateSalaryAndName(){
        setName("Muksan");
        getName();
        salaryofHourlyEmp = salaryPerHour*numberOfHoursPerWeek;
    }
       @Override
       public String toString()
       {
           System.out.println("Name:"+getName()+"\n"+"salaryRate:"+this.salaryofHourlyEmp);
          return "Name:"+getName()+"\n"+"salaryRate:"+this.salaryofHourlyEmp;
       }
}
