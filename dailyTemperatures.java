class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];

        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                int prevIdx = st.pop();
                ans[prevIdx] = i - prevIdx;
            }
            st.push(i);
        }
        return ans;
    }
}
