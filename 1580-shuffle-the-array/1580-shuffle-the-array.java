class Solution {
    public int[] shuffle(int[] nums, int n) {


        int[] ans=new int[2*n];
        //all even of ans we put nums one by one till n;
        //all odd of ans we put nums from n to 2n-1

        int x=0;//even ptr
        int y=n;//odd ptr

        int f=0;

        for(int i=0;i<n;i++){
     
            ans[f]=nums[x];

            f++;

            ans[f]=nums[y];

            x++;
            y++;

            f++;
            
        }

        
        return ans;

        
    }
}