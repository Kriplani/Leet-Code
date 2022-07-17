class Solution {
    public int fillCups(int[] amount) {
        
        
         
        PriorityQueue<Integer> pQueue=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int v:amount)
        {
            if(v!=0)
            {
                pQueue.add(v);
            }
        }
    
        int count=0;
        while(pQueue.size()>1)
            
        {
            int x=pQueue.remove();
            int y=pQueue.remove();
            
            x--;
            y--;
            count++;
             if(x!=0)
             {
                 pQueue.add(x);
             }
            
             if(y!=0)
             {
                 pQueue.add(y);
             }
            
        }
        
        if(pQueue.size()==1)
        {
            count+=pQueue.remove();
        }
        
        return count;
    }
}