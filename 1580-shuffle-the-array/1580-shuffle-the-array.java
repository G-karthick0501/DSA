class Solution {
    public int[] shuffle(int[] nums, int n) {


        int[] ans=new int[2*n];
        //all even of ans we put nums one by one till n;
        //all odd of ans we put nums from n to 2n-1

        for(int i=0;i<n;i++){
            
            ans[2*i]=nums[i];
        }

        int a=1;

        for(int i=n;i<2*n;i++){

            ans[a]=nums[i];
            a=a+2;
        }
        return ans;

        
    }
}