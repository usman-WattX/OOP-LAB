class Person{
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    public Person(){
        name = "";
        address = "";
        phoneNumber = "";
        email = "";
    }

    public Person(String n, String ad, String ph, String em){
        name = n;
        address = ad;
        phoneNumber = ph;
        email = em;
    }

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String ad) {
        address = ad;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String ph) {
        phoneNumber = ph;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String em) {
        email = em;
    }

    public void display(){
        System.out.println("Name:" + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}

class Student extends Person{
    private String status;

    public Student(){
        status = "";
    }

    public Student(String n, String ad, String ph, String em , String st){
        super(n, ad, ph, em);
        status = st;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String st) {
        status = st;
    }
    public void display(){
        super.display();
        System.out.println("Status: " + status);
    }
}

class Date{
    private int day;
    private int month;
    private int year;

    public Date(){
        day = 0;
        month = 0;
        year = 0;
    }

    public Date(int d, int mth, int yr){
        day = d;
        month = mth;
        year = yr;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int d) {
        day = d;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int mth) {
        month = mth;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int yr) {
        year = yr;
    }

    public void display(){
        System.out.println(day + "/" + month + "/" + year);
    }
}

class Employee extends Person{
    private String office;
    private double salary;
    private Date dateHired;

    public Employee(){
        office = "";
        salary = 0.0;
        dateHired = new Date();
    }

    public Employee(String n, String ad, String ph, String em , String off, double sl, Date dh){
        super(n, ad, ph, em);
        office = off;
        salary = sl;
        dateHired = dh;
    }

    public String getOffice() {
        return office;
    }
    public void setOffice(String off) {
        office = off;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double sl) {
        salary = sl;
    }
    public Date getDateHired() {
        return dateHired;
    }
    public void setDateHired(Date dh) {
        dateHired = dh;
    }

    public void display(){
        super.display();
        System.out.println("Office: " + office);
        System.out.println("Salary: " + salary);
        System.out.print("Hiring Date: ");
        dateHired.display();
        }
}

class Faculty extends Employee{
    private int officeHours;
    private String rank;

    public Faculty(){
        officeHours = 0;
        rank = "";
    }

    public Faculty(String n, String ad, String ph, String em , String off, double sl, Date dh, int offH, String rk){
        super(n, ad, ph, em, off, sl, dh); 
        officeHours = offH;
        rank = rk;
    }

    public int getOfficeHours() {
        return officeHours;
    }
    public void setOfficeHours(int offH) {
        officeHours = offH;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rk) {
        rank = rk;
    }

    public void display(){
        super.display();
        System.out.println("Office Hours: " + officeHours);
        System.out.println("Rank: " + rank);
    }
}

class Staff extends Employee{
    private String title;

    public Staff(){
        title = "";
    }

    public Staff(String n, String ad, String ph, String em , String off, double sl, Date dh, String tl){
        super(n, ad, ph, em, off, sl, dh);
        title = tl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String tl) {
        title = tl;
    }

    public void display(){
        super.display();
        System.out.println("Title: " + title);
    }
}

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Student,");
        Student s1 = new Student("DD", "ISB", "03004855280", "ddparty@gmail.com", "Enrolled");
        s1.display();

        System.out.println();
        System.out.println("Employee,");
        Date d1 = new Date(05,11, 2006);
        Employee e1 = new Employee("DD", "ISB", "03004855280", "ddparty@gmail.com", "BOOM Office", 155000, d1);
        e1.display();
        
        System.out.println();
        System.out.println("Faculty,");
        Faculty f1 = new Faculty("DD", "ISB", "03004855280", "ddparty@gmail.com","BOOM Office", 155000.0, d1, 5, "Junior");
        f1.display();

        System.out.println();
        System.out.println("Faculty,");
        Staff st1 = new Staff("DD", "ISB", "03004855280", "ddparty@gmail.com","Paris", 155000, d1, "Intern");
        st1.display();
    }
}
