class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        abc = {}
        for it in nums:
            if it in abc :
                return True
            abc[it] = 1
        return False