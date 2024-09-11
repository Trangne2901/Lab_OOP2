package Case_OOP2.DeSo3;

public class Student extends Person{
    private double markAGV;

    public Student(String personID, String personName, String dateOfBrithday, double markAGV){
        super(personID, personName, dateOfBrithday);
        this.markAGV = markAGV;
    }

    public double getMarkAGV() {
        return markAGV;
    }

    public void setMarkAGV(double markAGV) {
        this.markAGV = markAGV;
    }
    @Override
    public String toString(){
        return super.toString() + ", Diem trung binh: " + markAGV;
    }
}
