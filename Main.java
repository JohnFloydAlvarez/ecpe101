public class Main {

  public static void main(String[] ags){
    Person one = new Person("Jasper", "Santos");
    Person two = new Person("Renz", "Layco");
    Person three = new Person("Miguel", "Angeles");
    Person four = new Person("Brian", "Parreno");
    Person five = new Person("Jhoana", "Juguan");

    System.out.println(one.GerFirstName() +  " " + one.GetLastName());
    System.out.println(two.GerFirstName() +  " " + two.GetLastName());
    System.out.println(three.GerFirstName() +  " " + three.GetLastName());
    System.out.println(four.GerFirstName() +  " " + four.GetLastName());
    System.out.println(five.GerFirstName() +  " " + five.GetLastName());
  
  }
}
