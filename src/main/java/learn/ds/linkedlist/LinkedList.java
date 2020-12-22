package learn.ds.linkedlist;


/*
 * Here i am writing the linked list program to store the three number in list
 * */
public class LinkedList {

	Node head; // head of list 
	  
    /* Linked list Node.  This inner class is made static so that 
       main() can access it */
    static class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } // Constructor 
    } 
    
    
    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args) {
		/* start with empty linked list */
    	LinkedList llist = new LinkedList() ;
    	System.out.println(llist.head);
    	
    	/*create first node and check*/
    	Node head = new Node(41);
    	
    	
    	
    	
    	
    	llist.head = head ;
    //	llist.head.next = second; // Link first node with the second node 
   // 	second.next = third ;
    	
    	/*
    	 * So far you have created three node contain the value 41,22,27 resp.
    	 * 
    	 * Now you have node def of linked list is that linked list contains the node
    	 * 
    	 * we have node ready lets put/store it in the list.
    	 * 
    	 * how will you do that ? -> link the node
    	 * meaning?
    	 * simple consider you have only one node  and print it
    	 * */
    	System.out.println("First element/data of node "+llist.head.data);//->41
    	System.out.println("First reference of node "+llist.head.next); //->null
    	
		/*
		 * So if you see above list contain only one node with one data and one null reference 
		 * lets add one more node and link it to fist node 
		 * 
		 * How will you do that ? -> Very simple
		 * right now our right now our first node reference is empty so assign it second node reference.
		 * so first node reference will have second node reference instead of null.
		 * and second node reference is by default null so our list will become member of two element.
		 * let add and print it
		 * 
		 */
    	// first create second node 
    	Node second = new Node(22);
    	llist.head.next = second; // Link first node with the second node
    	// link second node with first
    	llist.head.next= second; // Great you did it, you have linked second element to first
    	
    	// Now print the fist node and fist node reference, 
    	// this time you won't see null in first node reference ofcource you find it in second node
    	System.out.println("First element/data of node "+llist.head.data);//->41
    	System.out.println("First reference of node "+llist.head.next); //->object hash value (learn.ds.linkedlist.LinkedList$Node@15db9742)
    	// meaning is now fisrt node contain the reference of second node
    	System.out.println(llist.head.next.data); // 22
    	System.out.println(llist.head.next.next); // null, Why ? because we have linked second node to first and there is no link further meaning no third element 
    	
    	// So what are you waiting for link third node
    	// create third node 
    	Node third = new Node(27);
    	// That it
    	// Now link third node to second node, How will you di it?
    	second.next = third ;
    	// linked :)
    	// Now first node contain the reference of second node and second node contains reference of third 
    	// and third not linked yet so it contain null 
    	// to confirm print it this time you won't find null in second node reference 
    	System.out.println(head.data); // 41
    	System.out.println(head.next); // second object hash value
    	System.out.println(second.data); // 22
    	System.out.println(second.next); // third object hash value
    	System.out.println(third.data); // 27 
    	System.out.println(third.next); // null 
    	
    	// So for we have created the three element and linked it. 
    	// we don't have utility methods yet to traverse linked list
    	// so what are you waiting for let create some utility methods to add, remove and traverse element
    	
    	
	}
}
