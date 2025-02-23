# BinarySearch
Binary Search is an efficient searching algorithm that works on sorted arrays. It follows a divide-and-conquer approach, reducing the search space by half in each step.

# How Binary Search Works:
1)Find the middle element (mid):
mid = low + ( high − low )/2
2)Compare mid with the target:
If arr[mid] == target, return mid (element found).
If arr[mid] < target, search in the right half (low = mid + 1).
If arr[mid] > target, search in the left half (high = mid - 1).
3)Repeat this process until low > high, meaning the element is not found.
