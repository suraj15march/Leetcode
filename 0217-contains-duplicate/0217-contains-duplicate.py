class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        abc = {}
        for it in nums:
            if abc.get(it) :
                return True
            abc[it] = 1
        return False