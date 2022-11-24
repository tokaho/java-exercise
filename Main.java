abstract class Phoenix{
    public int price;
}

class Cock extends Phoenix{
    static int price=5;
}

class Hen extends Phoenix{
    static int price=3;
}

class ThreeChicken extends Phoenix{
    static int price=1;
}


class Question1 {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                for(int k=0;k<100;k++){
                    if(i*Cock.price+j*Hen.price+k*ThreeChicken.price==100 && i+j+3*k==100){
                        System.out.printf("you can buy %d Cock %d Hen %d Chicken",i,j,3*k);
                        return;
                    }
                }
            }
        }
    }
}

//--------------------------------------------------------------------------------------------------------------
abstract class MovingFloor{
    public String name;
    public int price;
}

class Car extends MovingFloor{
    public Car(){
        super.name="car";
        super.price=500;
    }
}

class Bus extends MovingFloor{
    public Bus(){
        super.name="Bus";
        super.price=300;
    }
}

class Train extends MovingFloor{
    public Train(){
        super.name="Train";
        super.price=400;
    }
}

class Plane extends MovingFloor{
    public Plane(){
        super.name="Plane";
        super.price=1000;
    }
}


class Question2 {
    public static void main(String[] args) {
        MovingFloor avaFloor[]={new Car(), new Bus(), new Train(), new Plane()};
        for(MovingFloor x : avaFloor){
            if(x.price<=500){
                System.out.printf("i go to school by %s",x.name);
                break;
            }
        }
    }
}