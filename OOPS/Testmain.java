public class Testmain {
  public static void main(String[] args){

    Test s1 = new Test();
    Test s2 = new Test();
    // s1.name = "Tejashwa Raj Vardhan";
    //s1.rollno = 66;
    s1.setName("Tejashwa Raj Vardhan");
    s1.setRollnumber(100);
    s1.subject = "Maths and Science";

    //s2.name = "Varun";
    //s2.rollno = 54;
    s2.setName("Noel Siao");
    s2.setRollnumber(120);

    System.out.println(s1.getName() + " " + s1.getRollnumber());
    System.out.println(s2.getName() + " " + s2.getRollnumber());
  }
}
