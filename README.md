# Kotlin Collection Modification Bug
This repository demonstrates an uncommon code error in Kotlin related to the `removeIf` and `removeAll` methods when used with mutable collections.  The bug arises from modifying a collection while iterating over it, leading to unexpected results or `ConcurrentModificationException`.  The `bug.kt` file shows the problem.  The `bugSolution.kt` file provides a solution using an iterator or creating a new list.

## Bug Description:
The `removeIf` and `removeAll` methods in Kotlin modify the underlying collection while iterating.  If the modification changes the size or structure of the collection during iteration, the iteration might skip elements or throw a `ConcurrentModificationException` in some cases. This is particularly common when iterating with methods that modify the collection during their execution.

## Solution:
The solution involves either using an iterator to safely remove elements from a collection or creating a new collection and copying only elements that fulfill the condition to avoid in-place modification during iteration.