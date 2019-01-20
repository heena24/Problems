class GfG
{
    void deleteNode(Node del)
    {
         Node delNext = del.next;
         del.data = delNext.data;
         
         del.next = delNext.next;
         
         delNext.next = null;
    }
    
  class Node
  {
	  int data ;
	  Node next;
	  Node(int d)
	  {
		  data = d;
		  next = null;
	  }
  }
}
