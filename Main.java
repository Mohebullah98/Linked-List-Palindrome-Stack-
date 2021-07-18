import java.util.*;
class Main {
  public static boolean isPalindrome(LinkedListNode head){
    LinkedListNode fast = head;
    LinkedListNode slow = head;
    Stack<Integer> s = new Stack<Integer>();
    while(fast!=null && fast.next!=null){//when fast reaches the end,Slow will be halfway through the list.
      s.push(Character.getNumericValue(slow.data));// first half of list will be on stack
      slow=slow.next;
      fast=fast.next.next;
    }
    if(fast!=null) slow=slow.next; //if Length is odd, then the middle element should be skipped
  
  while(slow!=null){ //compare 2nd half of list with 1st half. If the second half matches first half in reverse, then we have a palindrome
    int top = s.pop();
    if(Character.getNumericValue(slow.data)!=top) return false;
    slow=slow.next;
  }
  return true;
}
  public static void main(String[] args) {
    LinkedListNode T = new LinkedListNode('T');
    LinkedListNode A = new LinkedListNode('A');
    LinkedListNode C = new LinkedListNode('C');
    LinkedListNode O = new LinkedListNode('O');
    LinkedListNode C2= new LinkedListNode('C');
    LinkedListNode A2= new LinkedListNode('A');
    LinkedListNode T2= new LinkedListNode('T');
    T.next=A;A.next=C;C.next=O;O.next=C2;C2.next=A2;A2.next=T2;T2.next=null;
    System.out.print(isPalindrome(T));
  }
}