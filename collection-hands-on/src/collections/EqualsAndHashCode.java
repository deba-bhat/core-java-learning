package collections;

import java.util.Date;
import java.util.Objects;

public class EqualsAndHashCode {
    public static void main(String[] args) {

       Person p1 = new Person("foo","bar",12, new Date());
       Person p2 = new Person("foo","bar",12, new Date());
       System.out.println(p1.equals(p2));
       System.out.println(p1.hashCode() == p2.hashCode());
    }
}

class Person{

    private  String firstName;
    private  String lastName;
    private  int age;
    private Date lastModifiedDate;

    public Person(String firstName, String lastName, int age, Date lastModifiedDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public boolean equals(Object obj){

        if(obj == this){
            return true;
        }

        if(obj == null || this.getClass() != obj.getClass()){

            return false;
        }
        Person other = (Person) obj;

        return this.age == other.age &&
                Objects.equals(this.firstName,other.firstName) &&
                Objects.equals(this.lastName,other.lastName);
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.firstName,this.lastName,this.age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}