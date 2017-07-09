class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        indx = []
        count = 0
        length = len(nums)
        for i in range(0, len(nums)-1):


            if nums[i] == nums[i+1]:
                count += 1
                indx.append(i)
        d = 0
        for x in indx:
            del nums[x-d]
            d+=1

        return length - count    
