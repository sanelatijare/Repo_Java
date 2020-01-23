public class Restaurant {


        private String name;
        private int guestCapacity;
        private int guestCount;
        private int newGuest;
        private int removeGuest;



        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGuestCapacity() {
            return guestCapacity;
        }

        public void setGuestCapacity(int guestCapacity) {
            this.guestCapacity = guestCapacity;
        }

        public int getGuestCount() {
            return guestCount += newGuest -= removeGuest;
        }

        public void setNewGuest(int newGuest){
            this.newGuest = newGuest;
        }

        public int getAvailableSeat(){
            return guestCapacity -= guestCount;
        }
        public void setRemoveGuest(int removeGuest){
            this.removeGuest = removeGuest;
        }

        public void printSummary() {
            System.out.println("Name: " + name);
            System.out.println("GuestCapacity: " + guestCapacity);
            System.out.println("GuestCount: " + guestCount);

        }}




/*
    Create a restaurant class with attribute name, guestCapacity, guestCount
 * 1. Create a method that tells user if the seats are available
         * 2. Create a method that seatsParty
         * 3. Create a method that removesParty
         * 4. Create a method that allows host open for services by passing restaurant name/guestCapacity
// * 5. Create a method that printsRestaurantSummary
*/



