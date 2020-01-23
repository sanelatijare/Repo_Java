public class Restaurant1 {


        private String name;
        private int guestCapacity;
        private int guestCount;

        public Restaurant1(String name, int guestCapacity) {
            this.name = name;
            this.guestCapacity = guestCapacity;
        }
        public boolean isSeatAvailable(int partySize) {
            int seatsLeft = guestCapacity - guestCount;
            return partySize <= seatsLeft;
        }
        public void seatParty(int partySize) {
            guestCount = guestCount + partySize;
        }
        public void removeParty(int partySize) {
            guestCount = guestCount - partySize;
        }
        public void printRestaurantSummary(){
            System.out.println("Name: " + name + " Guest Capacity: " + guestCapacity + " GuestCount: " + guestCount);
        }}

/*}

    Restaurant restaurant = new Restaurant("cafe", 20);
        restaurant.printRestaurantSummary();
                restaurant.seatParty(15);
                System.out.println(restaurant.isSeatAvailable(7));
                //After 20 min wait
                restaurant.removeParty(3);
                System.out.println(restaurant.isSeatAvailable(7));
                restaurant.seatParty(7);
      */          /*   restaurant.printRestaurantSummary();     */

