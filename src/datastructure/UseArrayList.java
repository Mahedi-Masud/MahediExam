package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class UseArrayList {

			/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		public static void main(String[] args) {

			List names = new ArrayList();


			names.add("Eve");
			names.add("Anna");
			names.add("Tonny");
			names.add("Steve");


			//Method #1 : Iterate using for loop
			System.out.println("Using for loop");
			for (int i = 0; i < names.size(); i++) {
				System.out.println(names.get(i));
			}

			//Method #2 : Iterate using advanced for loop
			System.out.println("Using Advanced for loop");
			for (Object name : names) {
				System.out.println(name);
			}

			//Method #3 : Iterate using advanced for loop
			System.out.println("Using Iterator");
			Iterator iterator = names.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

			//Method #4 : Iterate using while loop
			System.out.println("Using while  loop");
			int index = 0 ;
			while (names.size()> index) {
				System.out.println(names.get(index));
				index++ ;
			}
		}
	}
