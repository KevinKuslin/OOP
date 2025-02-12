import java.util.Scanner; 

public class Method{

    public static void main(String[] args){
        Vehicle vehicle1 = new Vehicle(10, "Chevrolet", "Camaro"); 
        vehicle1.engineStart(); 
        
        Square s = new Square(4); 
        s.calcArea(); 
        s.calcCircum(); 

        // Method method = new Method(); 

        printData(s); 
        // method.printData(s); 
        System.out.println("Input new side value: "); 
        Scanner sc = new Scanner(System.in); 
        int side = sc.nextInt(); 
        sc.nextLine(); 
        changeSquare(s, side); 
        printData(s); 
        sc.close(); 

        Person person = new Person("Kevin"); 
        System.out.println(person.getName());
        person.setName("Balmond"); 
        System.out.println(person.getName()); 
    }

    public static void changeSquare(Square s, int val){
        s.side = val; 
        s.calcArea(); 
        s.calcCircum(); 
    }

    public static void printData(Square s){
        System.out.println("Area: " + s.area);  
        System.out.println("Circumference: " + s.circumference); 
    }

}

class Square{
    public int side; 
    public int area; 
    public int circumference; 

    public Square(int side){
        this.side = side; 
    }

    public void calcArea(){
        this.area = side*side; 
        System.out.println(area);
    }

    public void calcCircum(){
        this.circumference = side*4; 
        System.out.println(circumference);  
    }
}

class Vehicle{
    public int numTires; 
    public String brand; 
    public String vType; 
    protected boolean isStarted; 

    public Vehicle(int numTires, String brand, String vType){
        this.numTires = numTires; 
        this.brand = brand; 
        this.vType = vType; 
        isStarted = false; 
    }

    public void engineStart(){
        System.out.println(vType + " Engine Started!"); 
        this.isStarted  = true; 
    }

    public void move(){
        if(isStarted){
            System.out.println(vType + " is Moving!"); 
        }
        else{
            engineStart(); 
            System.out.println(vType + " is Moving!"); 
        }
    }
}

class Person{
    private String name; 

    public Person(String name){
        this.name = name; 
    }

    public String getName(){
        return name; 
    }

    public void setName(String name){
        this.name = name;
    }
}