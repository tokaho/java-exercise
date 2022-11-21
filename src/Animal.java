public class Animal {
    public int age;
    public int weight;
    public Animal(){
        this.age=0;
        this.weight=0;
    }
    public void running(){
        System.out.println("running");
    }
    public void eating(){
        System.out.println("eating");
    }
    public int getAge(){
        return age;
    }
    public int getWeight() {
        return weight;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

}


