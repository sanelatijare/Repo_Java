public class Animal {


    private String name;
    private int size;
    private int weight;
    private String color;

    public Animal(String name, int size, int weight,String color) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.color = color;
    }
    public void eat() {
        System.out.println("Eat from Parent class is called (ANIMAL)");
    }
    public void move(int speed){
        System.out.println("Animal is moving at speed: " + speed);
    }
    public String getName() {
        return name;
    }
}
