class Main {
  public static boolean isPalindrome(LinkedListNode head){
    LinkedListNode fast = head;
    LinkedListNode slow = head;
    Stack<Integer> s = new Stack<Integer>();
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next;
    }
    if(fast!=null) slow=slow.next;
  }
  public static void main(String[] args) {
    
  }
}