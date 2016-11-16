/**
 * <p>The class Order List Contains my two usecases. Void Item & ViewWaitingOrder
 * Void Item will give the user the ability to void an item after after the order
 * has been placed. ViewWaitingOrder allows the User to view all incoming orders
 * that need to be fulfilled.
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
public class Order_List {
    /**
     * This method uses aggregation to invoke the delete method from the Item Class.
     * Then it well be used to delete items after the order has been placed.
     * @param item key used to find item that must be deleted
     *@return will not return a value
     */
    public String VoidItem(Item item) {

    }

    /**
     * Will Display the list of items in each order from an array list.
     * Invokes the items added in the item class and is placed in the array.
     * @param order  list of the items in order.
     *@return Will return an array list of orders that are added into the system
     *
     */
    public String ViewWaitingOrder(Item order ){

    }

}
