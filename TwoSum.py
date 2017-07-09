class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        for i in range(0,len(nums)):
            diff = target - nums[i]

            temp = nums[:i] + nums[i+1 :]
            if diff in temp:


                return[i, temp.index(diff) + 1]
        
