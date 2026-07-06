// class Solution {
//     public int[] finalPrices(int[] prices) {
//         Stack<Integer> stack = new Stack();
//         int n = prices.length;
//         int[] ans = new int[n];
//         for(int i=n-1; i>=0; i--){
//             if(stack.isEmpty()) ans[i] = prices[i];
            
//             else if(stack.peek() > prices[i]) {
//                 while(!stack.isEmpty() && stack.peek()>prices[i]) stack.pop();
//                 if(stack.isEmpty()) ans[i] = prices[i];
//                 else ans[i] = prices[i]-stack.peek();
//             }
//             else ans[i] = prices[i]-stack.peek();
//             stack.push(prices[i]);
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i] = prices[i];
            for(int j=i+1;j<n;j++)
            {
                if(prices[j] <= prices[i])
                {
                    ans[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        
        return ans;
    }
}