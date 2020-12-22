package learn.ds.linkedlist;
/*
Date : 22/12/2020
Topic Linked LIst Data Structure 


Like arrays, Linked List is a linear data structure. Unlike arrays, linked list elements are not stored at a contiguous location; 
the elements are linked using pointers. 

linkedlist Advantages over arrays
1) Dynamic size
2) Ease of insertion/deletion

Drawbacks:
1) Random access is not allowed. We have to access elements sequentially starting from the first node. So we cannot do binary search with linked lists efficiently with its default implementation. Read about it here.
2) Extra memory space for a pointer is required with each element of the list.
3) Not cache friendly. Since array elements are contiguous locations, there is locality of reference which is not there in case of linked lists.

 */