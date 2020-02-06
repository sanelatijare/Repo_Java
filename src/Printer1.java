import java.sql.SQLOutput;

public class Printer1 {


    int pagesPrinted = 0;

    int tonerLevel = 0;
    int maxPages = 100;



    public void setPagesPrinted(int pagesPrinted){
        this.pagesPrinted =pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        if (tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            System.out.println("Toner level above limit");
        }
    }


    public int getPagesPrinted() {
        return pagesPrinted;


    }

    public void Print(int numPages, boolean isDoubleSided) {
        System.out.println("Printing page");

        if (isDoubleSided == true) {
            pagesPrinted = pagesPrinted + (numPages * 2);
            tonerLevel = tonerLevel - (numPages * 2);


        } else {
            //single sided

            pagesPrinted = pagesPrinted + numPages;
            tonerLevel = tonerLevel - numPages;

        }


        if (tonerLevel < 1) {
            System.out.println("Low toner level, please add more toner");
        }
        if (pagesPrinted > 100) {
            System.out.println("Maximum limit reached");
        }

    }
}







