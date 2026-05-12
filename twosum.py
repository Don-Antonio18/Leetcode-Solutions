# Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
# You may assume that each input would have exactly one solution, and you may not use the same element twice.


nums = [3,2,4]
target = 6

def twoSum(nums, target):

    l = len(nums)
    
    for i in range(l):
        found = False
        for j in range(i + 1, l):
            if not found:
                if nums[j] + nums[i] == target:
                    found = True
                    return [i, j]

if __name__ == "__main__":
    print(twoSum(nums, target))
