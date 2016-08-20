package datastructure;
import java.util.LinkedList;
import java.util.ListIterator;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

			    LinkedList<String> linkedList = new LinkedList<String>();
				linkedList.add("Paypal");
				linkedList.add("Google");
				linkedList.add("Yahoo");
				linkedList.add("IBM");
				linkedList.add("Facebook");

        System.out.println("\n Peek Approach: ==========");
                String x = linkedList.peek();
                System.out.print(x);

                System.out.print("\n"+linkedList);

        System.out.println("\n Poll Approach: ==========");

                System.out.println("Head element of the list:" + linkedList.poll());

                System.out.println("\nLinkedList:" + linkedList);


               	// ListIterator approach
        System.out.println("\n ListIterator Approach: ==========");
				ListIterator<String> listIterator = linkedList.listIterator();
				while (listIterator.hasNext()) {
					System.out.println(listIterator.next());
				}

				System.out.println("\nLoop Approach: ==========");
				// Traditional for loop approach
				for (int i = 0; i < linkedList.size(); i++) {
					System.out.println(linkedList.get(i));
				}

				}

		}



