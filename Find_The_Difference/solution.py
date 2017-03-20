#!/usr/bin/env python
# encoding: utf-8

import operator

class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """

        for i, letter in enumerate(t):
            if i < len(s) and letter == s[i]:
                continue
            else:
                return letter

    def findTheDifference2(self, s, t):
        """
        1. chr(i): 将数值(0 <= i < 256)转换为字符并返回
        2. reduce(function, sequence): 先把sequence中的第一个值和第二个值当参数传给function,
        再把function的返回值和第三个值当参数传给function, 然后只返回一个结果
        3. map(function, iterable, ...): 将function作用于iterable中的每个item, 返回结果列表
        """

        return chr(reduce(operator.xor, map(ord, s + t)))

if __name__ == "__main__":
    solution = Solution()
    print solution.findTheDifference2("abcd", "abcde")
