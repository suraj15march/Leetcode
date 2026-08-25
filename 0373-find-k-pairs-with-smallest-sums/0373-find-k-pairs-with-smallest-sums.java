class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0) return ans;

        // Min-heap stores triplet: {sum, index_in_nums1, index_in_nums2}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        // Push initial elements (nums1[i], nums2[0]) up to min(nums1.length, k)
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            pq.offer(new int[]{nums1[i] + nums2[0], i, 0});
        }

        // Extract the smallest pairs until k is reached or heap is empty
        while (k > 0 && !pq.isEmpty()) {
            int[] curr = pq.poll();
            int i = curr[1];
            int j = curr[2];

            ans.add(List.of(nums1[i], nums2[j]));
            k--;

            // Push the next element in nums2 paired with nums1[i]
            if (j + 1 < nums2.length) {
                pq.offer(new int[]{nums1[i] + nums2[j + 1], i, j + 1});
            }
        }

        return ans;
    }
}