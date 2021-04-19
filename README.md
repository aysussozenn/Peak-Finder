# Peak-Finder
Implement the 2-D peak finder and explain the asymptotic complexity of the algorithm.

First I found the maximum element in the middle column. Then I compared it
with neighbor elements in the same row. Finally, I found the maximum element
of the column on that side where the element is larger, so I only worked halfway
through the list each time.
For dividing 2 I have O(logn)
For checking every elements in a column O(n) so the complexity is O(nlogn).
