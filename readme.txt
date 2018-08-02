I have implemented this method in Person.java. There were many ways to do this,

1. Collections.sort() with Comparable: I would have to implement the compareTo method and passed in a comparator to Collections.sort()

2. List interface sort() where the Comparator.comparing() method accepts a method reference which serves as the basis of the comparison

3. Stream interface sorted(): This would let me return a new list instead of modifying the original list. The last 2 are probably the best because they are easier to code, debug and read.
