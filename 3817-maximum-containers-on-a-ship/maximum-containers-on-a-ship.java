class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int space = n*n;
        int i = 1;
        int container = 0;
        while(i<=space){
            
            if(w*i<=maxWeight){
                container++;
            }
            i++;

        }
        return container;
        

    }
}