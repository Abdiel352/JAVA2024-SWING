/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AddressBookDisplay;

/**
 *
 * @author Aluno
 */
public class Person {
    private int addressID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    public Person(){
    }
    public Person(int id, String first, String last, String emailAddress, String phone){
        setAddressID(id);
        setFirstName(first);
        setLastName(last);
        setEmail(email);
        setPhoneNumber(phone);
    }
    public void setAddressID(int id){
        addressID = id;
    }
    public int getAddressID(){
        return addressID;
    }
    public void setFirstName(String first){
        firstName = first;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String last){
        lastName = last;
    }
    public String getLastName(){
        return lastName;
    }
    public void setEmail(String emailAddress){
        email = emailAddress;
    }
    public String getEmail(){
        return email;
    }
    public void setPhoneNumber(String phone){
        phoneNumber = phone;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
}
