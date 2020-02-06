public class Epson {
    public static void main(String[] args) {

        Printer1 epsom   = new Printer1();

        epsom.getTonerLevel();
        epsom.setTonerLevel(100);
        epsom.getTonerLevel();
        System.out.println(epsom.getTonerLevel());
        epsom.Print(60,true);
        epsom.Print(2,false);
        System.out.println(epsom.getPagesPrinted());
       // epsom.getTonerLevel();
        System.out.println("toner level :"+ epsom.getTonerLevel());

    }
}
