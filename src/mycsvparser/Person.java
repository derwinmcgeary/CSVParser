/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycsvparser;

/**
 *
 * @author derwin
 */
public class Person {
private String name;
private String email;

public Person(String n, String e) {
this.name = n;
this.email = e;
}

public Person() {
}

public String getEmail() {
return email;
}

public String getName() {
return name;
}

public String toString() {
    return "Name: " + name + " Email: " + email;
}
}
