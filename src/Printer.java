import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.print.*;

//public class Printer {


 /*   public int PrintPages;
    public int TonerLevel;
    public int pagesInPrinter;
    public boolean isPrintBothSides;
public int tonerInPrinter;


    public int PrintPages(int PrintPages) {
        if (PrintPages <= pagesInPrinter && TonerLevel <= tonerInPrinter) {
        }
                return pagesInPrinter = pagesInPrinter - PrintPages;

    }



 //   public int getPagesInPrinter() {

 //   }




    public boolean isPrintBothSides(int PrintPages) {
       boolean isPrintBothSides =true;
       if (PrintPages %2 ==0 );


    }

    public void setPrintBothSides(boolean printBothSides) {
        isPrintBothSides = printBothSides;
    }
    public void getTonerLevel(int tonerLevel) {
        TonerLevel -= PrintPages;
    }
    public void setTonerLevel(int TonerLevel){
        this.TonerLevel = TonerLevel;{
        }
        System.out.println("Set toner Level <=100");
    }
}

*/


        /**
         * calculate pages and toner required to print based on user-input
         * if( pagesNeeds <= pagesInPrinter and tonerNeeds <= tonerInPrinter) {
         *  pagesInPrinter = pagesInPrinter - pagesNeeds
         *  tonerInPrinter = tonerInPrinter - tonerNeeds
         *  }
         */

     /**
      * public class HelloWorldPrinter implements Printable, ActionListener {
      *
      * int pagesToPrint;
      *
      * int userTonerLevel;
      *
      * boolean isPrintBothSides;
      *
      *
      *         public static void main(String args[]) {
      *         System.out.println(“Enter number of pages”);
      *         pagesToPrint = Value entered by user;
      *
      *         System.out.println (“Enter Toner level”);
      *         userTonerLevel = Value entered by user;
      *
      *          System.out.println (“Print on both sides? Yes or No”);
      *          If(User said Yes)
      *          {
      *            isPrintBothSides = true;
      *          }else{
      *            isPrintBothSides = false;
      *          }
      *
        if(userPrintPages <=100)
        {
            if(userTonerLevel=>0 and userTonerLevel<=100)
            {
                If(isPrintBothSides)
                {
                    PrinterJob job = PrinterJob.getPrinterJob();
                    job.print();
                    for(i=0; i<= pagesToPrint; i++)
                    {
                        userTonerLevel= userTonerLevel-1;
                    }
                    System.out.println(“Current Tonerlevel is :”+ userTonerLevel);
                    if(userTonerLevel<1)
                    {
                        System.out.println(“Low Toner, Please add more toner”);
                    }
                    System.out.println(“Number of pages printed:”+job.getNumberofPagesPrintedBothSides(pagesToPrint));
                }else{
                PrinterJob job = PrinterJob.getPrinterJob();
                job.print();
                for(i=0; i<= pagesToPrint; i++)
                {
                    userTonerLevel= userTonerLevel-1;
                }
                System.out.println(“Current Tonerlevel is :”+ userTonerLevel);
                if(userTonerLevel<1)
                {
                    System.out.println(“Low Toner, Please add more toner”);
                }
                System.out.println(“Number of pages printed:”+job.getNumberofPagesPrintedOneSide(pagesToPrint));

            }}
        */



      /*  System.out.println("Enter Toner level");

        userTonerlevel = Value entered by user;

        System.out.println (“Enter Toner level”);
        userTonerLevel = Value entered by user;


        System.out.println (“Print on both sides? Yes or No”);
        If(User said Yes)
        {
            isPrintBothSides = true;
        }else{
            isPrintBothSides = false;
        }


        if(pagesToPrint <=100)
        {
            if(userTonerLevel=>0 and userTonerLevel<=100)
            {
                If(isPrintBothSides)
                {
                    PrinterJob job = PrinterJob.getPrinterJob();
                    job.print();
                    for(i=0; i<= pagesToPrint; i++)
                    {
                        userTonerLevel= userTonerLevel-1;
                    }
                    System.out.println(“Current Tonerlevel is :”+ userTonerLevel);
                    if(userTonerLevel<1)
                    {
                        System.out.println(“Low Toner, Please add more toner”);
                    }
                    System.out.println(“Number of pages printed:”+job.getNumberofPagesPrintedBothSides(pagesToPrint));
                }else{
                PrinterJob job = PrinterJob.getPrinterJob();
                job.print();
                for(i=0; i<= pagesToPrint; i++)
                {
                    userTonerLevel= userTonerLevel-1;
                }
                System.out.println(“Current Tonerlevel is :”+ userTonerLevel);
                if(userTonerLevel<1)
                {
                    System.out.println(“Low Toner, Please add more toner”);
                }
                System.out.println(“Number of pages printed:”+job.getNumberofPagesPrintedOneSide(pagesToPrint));



                }else{
             /* Let user know Toner should be between 0 and 100 */
            /*System.out.println (“Only Toner between 0 and 100 is valid”)
                    System.exit(0);
                    }else{
                    *//* Let user know only 100 pages or less can be printed *//*
                    System.out.println (“Only 100 pages or less is valid”)
                    System.exit(0);
                    }*/

    // number of pages printed both sides, if pages to print to print is even number; actual pages printed is half of pages to print. Else if pages to print is Odd number, reduce it by 1 and then divide it by 2 and add 1 back
    // pages to print is 6
     //   Actual pages printed = 6/2 = 3
       // Example – pages to print is 7
      //  Actual pages printed = 6/2 +1 = 3+1 = 4

    // nt getNumberofPagesPrintedSingleSide(pagesToPrint){
         /* Write code to get number of pages printed single side, actual pages printed is equal to user entered pages to print

/*================================================================================================
 Build a printer
        * User can set toner level range between 0 to 100 (toner level cannot be greater than 100)
        * User should be able to see number of page printed
        * User should be able to print both sided (Note: in that case printed page should calculated correctly)
        * User can view current toner level at anytime
        * single page == single toner level; (Example: Toner = 100, printed page = 20, updated toner = 80)
        * If toner reaches < 1, then print "Low Toner, Please add more toner"
/*/
       // Max pages can be printed == 100;