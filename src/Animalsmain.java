public class Animalsmain {

    public static void main(String[] args) {

      Animal [] animals = new Animal[2];
     // animals [0] = new Cat();
      animals [1] = new Elephant("Dumbo",20, 5000, "Grey",6,2);

      for (int i =0; i < animals.length;i++)


          animals [i].eat();



      //  Elephant dumbo = new Elephant("Dumbo",20,5000,"Gray",6,2);
      // dumbo.move(5);
      // dumbo.sound();
      // dumbo.eat();


    }
}
