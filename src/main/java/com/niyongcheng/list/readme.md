A List is a collection which maintains an ordering for its elements. 
Every element in the List has an index. 
Each element can thus be accessed by its index, with the first index being zero. Normally, Lists allow duplicate elements, 
as compared to Sets, where elements have to be unique.

//
ArrayList is not thread safety, in multi thread, use Vector or CopyOnWriteArrayList;
Default size of ArrayList is 10; if it size can't meet the element, it will increase to its 1.5 times

//expectedModCount = modCount


LinkedList的本质是双向链表。
(01) LinkedList继承于AbstractSequentialList，并且实现了Dequeue接口。
(02) LinkedList包含两个重要的成员：header 和 size。
　　header是双向链表的表头，它是双向链表节点所对应的类Entry的实例。Entry中包含成员变量： previous, next, element。其中，previous是该节点的上一个节点，next是该节点的下一个节点，element是该节点所包含的值。
　　size是双向链表中节点的个数。

LinkedList是如何实现List的这些接口的，如何将“双向链表和索引值联系起来的”？
    实际原理非常简单，它就是通过一个计数索引值来实现的。例如，当我们调用get(int location)时，首先会比较“location”和“双向链表长度的1/2”；若前者大，则从链表头开始往后查找，直到location位置；否则，从链表末尾开始先前查找，直到location位置。
   这就是“双线链表和索引值联系起来”的方法。