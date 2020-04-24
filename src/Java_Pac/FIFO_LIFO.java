package Java_Pac;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FIFO_LIFO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>(); 

        Stack<Integer> stack = new Stack<Integer>();
        
        for (int i = 0; i < 5; i++) 
        {
        	
        
            q.add(i); 
        }
        for (int i = 0; i < 5; i++) { 
            stack.push(i); 
        } 
        
        System.out.println("Elements of queue :" + q); 
  
        
        int removedele = q.remove(); 
        System.out.println("removed element:" + removedele); 
  
        System.out.println(q); 
  int size = q.size(); 
        System.out.println("Size of queue :" + size); 
        System.out.println("Elements of Stack :" + stack); 
        int removedele1 = stack.remove(3); 
        System.out.println("removed element :" + removedele1); 
  
        System.out.println(stack); 
  int size1 = stack.size(); 
        System.out.println("Size of stack:" + size1);

	}

}

/*Output :
	Elements of queue :[0, 1, 2, 3, 4]
			removed element:0
			[1, 2, 3, 4]
			Size of queue :4
			Elements of Stack :[0, 1, 2, 3, 4]
			removed element :3
			[0, 1, 2, 4]
			Size of stack:4*/

