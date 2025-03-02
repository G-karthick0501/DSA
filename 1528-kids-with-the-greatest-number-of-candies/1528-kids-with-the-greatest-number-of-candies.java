class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max=candies[0];
        for(int i=0;i<candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }

        ArrayList<Boolean> ans=new ArrayList<>();

        for(int i=0;i<candies.length;i++){
            candies[i]+=extraCandies;
            if(candies[i]>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }

            // if(max<=candies[i]){
            //     max=candies[i];
            // }
        
        }

        return ans;


         


        
    }
}