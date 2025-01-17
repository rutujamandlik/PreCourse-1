// Time Complexity :  O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
 

// Your code here along with comments explaining your approach

class Stack {
	// Please read sample.java file before starting.
	// Kindly include Time and Space complexity at top of each file
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX]; // Maximum size of Stack

	boolean isEmpty() { //TC: O(1)
		// Write your code here

		return top < 0;

	}

	Stack() {
		// Initialize your constructor
		top = -1;
	}

	boolean push(int x) { //TC: O(1)
		// Check for stack Overflow
		// Write your code here
		if (top > MAX - 1) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			top++;
			a[top] = x;
			return true;
		}

	}

	int pop() { //TC: O(1)
		// If empty return 0 and print " Stack Underflow"
		// Write your code here
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;

		} else {

			return a[top--];

		}

	}

	int peek() { //TC: O(1)
		// Write your code here
		return a[top];
	}
}

// Driver code 
class Main {
	public static void main(String args[]) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " Popped from stack");
	}
}