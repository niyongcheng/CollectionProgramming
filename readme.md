#knowledge about the JAVA collection
Java Collection include: set,linkedlist,queue,stack,array,map etc
all those under java.util.*

import interface:
Collection->List,Set
Map

1: List is one sequeue queue, have index of each element.
    have linkedList,ArrayList,Vector and Stack
2: Set is one collection which doesn't include duplicated element;
    have hashSet and treeSet; 
    HashSet use HashMap to implement while treeSet use TreeMap to implement.
    the interesting thing like that hashSet is one HashMap like this
    
    private transient HashMap<E,Object> map;
    Element will used in HashMap key, the value is each key is one dummpy object like this
    // Dummy value to associate with an Object in the backing Map
    private static final Object PRESENT = new Object();
    
    from the Add method, you can see that, element is the key, PRESENT is the value
    public boolean add(E e) {
            return map.put(e, PRESENT)==null;
    }

Map is one Key-Value set, AbstractMap is one Abstract class which had implemented most api in Map interface.
HashMap,TreeMap,WeekHashMap all inheritance from AbstractMap.    

for the Until, Iterator is one traverse item in Collection;
ListIterator is special for List;
Enumeration is also for traverse, but has less function thant Iterator;

Arrays and Collections are both Util class for operation array and collection.
