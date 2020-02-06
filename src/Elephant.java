public class Elephant extends Animal {

    private int trunk;
    private int tusk;


    public Elephant(String name, int size, int weight,String color,int trunk,int tusk) {
        super(name, size, weight,color);
        this.trunk = trunk;
        this.tusk = tusk;

    }

        public void play() {
            System.out.println("elephant is playing");
        }
        @Override
        public void eat() {
            System.out.println("Elephant eats bananas and tree branches ");
        }
        @Override
        public void move(int speed) {
            System.out.println("Child class move is called");
            moveLegs();
            super.move(speed);
        }
        private void moveLegs() {
            System.out.println("Local method move legs is called");
        }

public void sound(){
    System.out.println("Elephant is trumpeting");
}
    public void roam(){
        System.out.println("Cat roams during night time");
    }

    public void Cateat(){
        System.out.println("Cat eats meats and fish");
    }


    }

