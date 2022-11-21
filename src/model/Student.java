package model;

public class Student{
    public String names;
    public int age;
    public String gender;
    public String idNo;

    public Student(){
        names="temp";
        age=0;
        gender="temp";
        idNo="temp";
    }

    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getIdNo() {
        return idNo;
    }
    public String getNames() {
        return names;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
    public void setNames(String names) {
        this.names = names;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getAge());
        System.out.println(s1.getIdNo());
        System.out.println(s1.getNames());
        System.out.println(s1.getGender());
    }

}