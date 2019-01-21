class HeightOfTree
{
  int height(Node node) 
    {
         if(node == null)
         {
            return 0;
         }
         
         int lh = height(node.left);
         int rh = height(node.right);
         
         int max = max(lh, rh) + 1;
         return max;
    }   
    
    int max(int a, int b)
    {
        return (a > b ? a : b);
    }

}
