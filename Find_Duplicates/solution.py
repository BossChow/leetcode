#!/usr/bin/env python
# encoding: utf-8

class Solution(object):
    def findDuplicates(self, nums):
        for num in nums:
            index = abs(num) - 1
            if nums[index] < 0:
                nums[index] = 0
            else:
                nums[index] = -nums[index]

        result_list = []
        for index in xrange(len(nums)):
            if nums[index] == 0:
                result_list.append(index + 1)

        return result_list

if __name__ == "__main__":
    solution = Solution()
    input_list = [4, 3, 2, 7, 8, 2, 3, 1]
    print "Input List:", input_list
    result_list = solution.findDuplicates(input_list)
    print "Result List:", result_list

