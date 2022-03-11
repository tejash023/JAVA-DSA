public class Test {
  
  private String name;
  private int rollno;
  String subject;

  //getters
  public int getRollnumber(){
    return rollno;
  }
  
  public String getName(){
    return name;
  }
  
  //setters
  public void setRollnumber(int num){
    if(num < 0){
      return;
    }
    rollno = num;
  }

  public void setName(String naam){
    if(naam.length() <= 5){
      return;
    }
    name = naam;
  }
}
