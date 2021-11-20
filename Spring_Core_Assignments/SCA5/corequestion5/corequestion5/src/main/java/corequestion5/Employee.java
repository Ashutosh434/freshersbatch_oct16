package corequestion5;

import javax.inject.Inject;

//Create a POJO class Employee which has a 
//Address Object reference as instance variable
public class Employee {

private String name;
private int age;

@Inject
private Address address;

public Employee() {

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

public Address getAddress() {
return address;
}

public void setAddress(Address address) {
this.address = address;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", address=" + address + "]";
}

}

