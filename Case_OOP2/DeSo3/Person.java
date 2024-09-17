package Case_OOP2.DeSo3;

import java.io.Serializable;

public class Person implements Serializable {
    private String personID;
    private String personName;
    private String dateOfBrithday;

    public Person(){

    }

    public Person(String personID, String personName, String dateOfBrithday) {
        this.personID = personID;
        this.personName = personName;
        this.dateOfBrithday = dateOfBrithday;
    }

    public void setPersonID(String personID){
        this.personID = personID;
    }
    public String getPersonID(){
        return personID;
    }

    public void setPersonName(String personName){
        this.personName = personName;
    }
    public String getPersonName(){
        return personName;
    }

    public void setDateOfBrithday(String dateOfBrithday){
        this.dateOfBrithday = dateOfBrithday;
    }
    public String getDateOfBrithday(){
        return dateOfBrithday;
    }

    @Override
    public String toString(){
        return "ID: " + personID + ", Ten: "+ personName + ", Ngay sinh: "+dateOfBrithday;
    }
}

