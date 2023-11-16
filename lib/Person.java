package lib;

public class Person {
  private int id;
  private String name;
  private int age;
  private String gender;

  /* Constructor is a special kind of method which is called / invoked automatically 
  // when an object created or instanciated
  it is usually used to initialize the intance variable
  Types of constructor:
  1. Default constructor
  2. Parameterized constructor
  */ 

  public Person(){
    System.out.println("a new person is constructed..");
  }

  public Person(int id, String name, int age, String gender) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public int getId() {
    return this.id;
  }
  public void setId(int id) {
    if (id > 0)
      this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "Person [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
  } 
}
