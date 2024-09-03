class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        ls = []
        n = len(nums)
        for i in range(n+1):
            ls.append(False)
        for it in nums:
            ls[it] = True
        for i in range(n+1):
            if ls[i] is False:
                return i