package datastructure;

import java.util.Stack;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.Vector;
import sun.misc.MetaIndex;
import sun.misc.SharedSecrets;
import sun.misc.URLClassPath;
import sun.misc.VM;
import sun.net.www.ParseUtil;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
			// creating stack
			Stack st = new Stack();

			// populating stack
			st.push("Java");
			st.push("Source");
			st.push("code");
			st.push("is");
			st.push("here");

			// removing top object
			System.out.println("Removed object is: "+st.pop());

			// elements after remove
			System.out.println("Elements after remove: "+st);

		System.out.println("Added object is: "+st.push("This"));

		// elements after push
		System.out.println("Elements after added: "+st);


		System.out.println("Lets pop 2 elements from the stack");
		int count = 0;
		while(!st.isEmpty() && count<2) {
			System.out.println("Popped " + st.pop());
			count++;
		}
			System.out.println("Popped object is: " +count);
			System.out.println("Elements after Popped: "+st);
		}

	}


