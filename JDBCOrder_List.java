/**
 * <p>The class JDBCOrder List Contains my two usecases. Void Item & ViewWaitingOrder
 * Void Item will give the user the ability to void an item after the order
 * has been placed. ViewWaitingOrder allows the User to view all incoming orders
 * that need to be fulfilled.The Order_List (bridge) class will invoke the methods in JDBCOrder_List
 *
 * @author Brian Recuero
 * @version 1.0 Build 1 Nov, 11, 2016
 *
 */

/**
 * Has several different methods
 *Void Item,OrderList
 *
 */
public class JDBCOrder_List {
    /**
     * This method uses aggregation to invoke the void method from the order_List class.
     * Then it well be used to void items after the order has been placed.
     * @param Empty
     *@return will returns true if there are items to void and false if empty
     */
    public boolean VoidItem() {

    }

    /**
     * Will Display the list of items in each order from an array list.
     * Invokes the items added in the ViewWaitingOrder method in the Order_list class
     * @param Empty
     * @return Will return an array list of orders that are added into the system
     *
     */
    public order[] ViewWaitingOrder(){

    }
    /**
    * This method will used to add a new order to the OrderList
    * @param Order order will be the Order that is being added
    * @return will return a boolean value, if true the order has been successfully sent, 
    * if false the order could not be sent
    */
    public boolean SendOrder(Order order) {

    }

}
