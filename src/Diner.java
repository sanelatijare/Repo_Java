public class Diner {

        public static void main(String[] args) {

            Restaurant Diner = new Restaurant();


            Diner.setName("Diner");
            Diner.setGuestCapacity(40);
            Diner.setNewGuest(20);
            Diner.setRemoveGuest(2);
            System.out.println("Guest count is " + Diner.getGuestCount());
            System.out.println("Number of available seats is  " + Diner.getAvailableSeat());
            Diner.printSummary();
        }
    }

