public class Person {
  private String firstName;
  private String lastName;

  public Person(String first, String last){
      firstName = first;
      lastName = last;
  }
  public String GetFirstName(){
      return firstName;
  }
  public String GetLastName(){
      return lastName;
  }
}
