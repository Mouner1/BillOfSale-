/*
 * This page was created by Mouner Dabjan
 * On September 20
 * To calculate the Bill of Sale
*/

package bill.of.sale;

/**
 *
 * @author modab5310
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double purchase= 12.49;
        double given= 20.00;
        double HST= .13; 
        
        //algorithm for calculating the Bill of Sale
        
        double taxes= purchase*HST;
        double total= taxes+purchase;
        double change= given- total;
        
        System.out.println("The taxes are" + taxes);
        System.out.println("The total is"+ total);
        System.out.println("The change is" + change);
    }
    
}
