import java.time.LocalDate;

public class StudentInformation {

  int studentId = 1;
  String studentName = "Rashed Karim";
  String studentAddress = "Dhaka";
  String collegeName = "Daffodil International University";
  String studentDOB = "01-01-1990";
  String studentEmail = "mail4rashed@gmail.com";
  String studentMobile = "01700000000";
  String studentBloodGroup = "A+";
  int studentAge = 30;
  LocalDate studentJoiningDate = LocalDate.now();
  


  public void studentName(){
    System.out.println("Student Name: " + studentName);
  }
  
}
