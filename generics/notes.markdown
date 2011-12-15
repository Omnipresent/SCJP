##Chapter 7 - Generics

##Overriding hashCode() and equals() (Objective 6.2)
_6.2 Distinguish between correct and incorrect overrides of corresponding hashCode and equals methods, and eplain the difference between == and equals method_

### Methods of Class Object Covered on the Exam
Method                  | Description
-----------------       | ---------------------
boolean equals (obj)    | Decides whether two objects are meaningfully equivalent
void finalize ()        | Called by garbage collector when garbage collector sees that the object cannot be referenced
int hashCode ()         | Returns a hashcode int value for an object, so that the object can be used in Collection classes that use hasing, including hastable, hashmap and hashset
final void notify ()    | Wakes up a thread that is waiting for this object's lock.
final void notifyAll()  | Wakes up all the threads that are waiting for this object's lock.
final void wait()       | Causes the current thread to wait until another thread calls notify() or notifyAll on this object()
String toString()       | Returns a "text representation" of the object

###equals() hashcode Key Points 

* If you want objects of your class to be used as keys for a hashtable (or elements in any datastructure that uses equivalency for searching), then you must override equals()
* If instanceof test is failed then ClassCastException is thrown
* equals() hashCode() and toString() are all **public**
* Overridden = when argument is same. Overloaded = when the argument is changed
* HashCode that returns same value for everything is ineffecient but still legal hashcode
* don't use transient variables in hashCode() or equals() because they a deserialized object will have default value when brought back to life

###HashCode Contract
Condition                     | Required                    | Not Required (But Allowed)
----------------------------- |---------------------------- |----------------------------
x.equals(y) == true           |x.hashCode() == y.hashCode() |
x.hashCode() == y.hashCode()  |                             | x.equals(y) == true
x.equals(y) == false          |                             | no HashCode() requirements
x.hashCode() != y.hashCode()  |x.equals(y) == false

##Collections (Exam Objective 6.1)
  _6.1 Given a scenario, determine which collection classes and/or interfaces should be used to properly implement that design, including the use of Comparable interface._

###Key Interfaces for the exam
  * collection   |        Set          |  SortedSet
  * List         |        Map          |  SortedMap
  * Queue        |        NavigableSet |  NavigableMap

###Key Concrete implementation classes
Maps            | Sets          | Lists       | Queues      | Utilities
----------------|---------------|-------------|-------------|------------
HashMap         | HashSet       |ArrayList    |PriorityQueue|Collections
Hashtable       | LinkedHashSet |Vector       |             |Arrays
TreeMap         | TreeSet       |LinkedList   |             |
LinkedHashMap   |               |             |             |

###Key Points
* None of the Map related classes and interfaces extend from Collection
* _Collection_ is java.util.Collection interface from which Set, List, and Queue extend. There aren't any direct implementations of Collection
* _Collections_ is the java.util.Collections class that holds a pile of _static_ utility methods for use with collections
* _Collections_ come in four basic flavors
* implementation class can be unsorted and unordered, ordered but unsorted, or both ordered and sorted. can never be sorted and unordered
* Remember the difference in interface vs. a concrete implementation class

###List Interface
* List cares about the index. One thing Lists have that non-list don't is index.
* All three list implementations are orderd by index position

**ArrayList** 

* Fast iteration and fast random access
* ordered but not sorted
* Choose it over LinkedList when you need fast iteration but aren't as likely to be doing a lot of insertion and deletion

**Vector**

* Methods are synchronized 
* Use ArrayList instead of Vector because synchronized methods add a performance hit
* If you need thread safety then there are utility methods in Collections class that can help

**LinkedList**

* Elements are double-linked to one another
* Easy choice for implementing a stack or a queue
* May iterate more slowly than an ArrayList but its good when you need fast insertion and deletion

###Set Interface
* cares about uniqueness
* equals() determines whether two objects are identical

**HashSet**

* unsorted and unordered. 
* uses hashcode of the object being inserted. so more efficient hashCode() the better access performance you'll get
* Use it when you don't want duplicates and don't care about order when you iterate through it
* Must override hashCode()

**LinkedHashSet**

* Ordered version of HashSet. 
* Use it when elements need to be retrieved in the same order as they were inserted
* Must override hashCode()

**TreeSet**

* One of two sorted collections (other being TreeMap)
* Gurantees that the elements will be in ascending order, according to natural order
* you can construct a TreeSet with a constructor that lets you give the collection your own rules for what the order should be by using Comparable or Comparator
* TreeSet implements NavigableSet

###Map Interface
* cares about unique identifiers
* relies on equals() to determine whether two keys are same or different

**HashMap**

* unsorted, unordered map
* Use it when you need a Map and don't care about the order. 
* order is based on key's hashcode.
* allows one null key and multiple null values in a collection

**HashTable**

* has synchronized methods
* Doesn't let you have anything thats null

**LinkedHashMap**

* Maintains insertion order. 
* Slower than HashMap for adding and removing, but faster iteration

**TreeMap**

* Sorted Map
* custom sort order can be defined by Comparable or Comparator
* Implements NavigableMap

###Queue Interface
* Designed to hold a list of todo's
* FIFO (first in first out)

**_Priority Queue_**

* Priority in priority out
* ordered either by naturla ordering or according to a Comparator

## Using the Collections Framework (Objectives 6.3 and 6.5)
_6.3_ Write code that uses NavigableSet and NavigableMap interfaces_

_6.5_ Use capabilitis in the java.util package to write code to manipulate a list by sorting, performing a binary search, or converting the list to an array.Use Comparator and Comparable_

### Comparing Comparable to Comparator

java.lang.Comparable                                      | java.util.Comparator
----------------------------------------------------------| --------------------------------------------------------------
int objOne.compareto(objTwo)                              | int compare (objOne, objTwo)
negative if objOne < objTwo                               | Same as Comparable
zero     if objOne == objTwo                              |
positive if objOne > onjTwo                               |
Class whose instances need to be sorted must be modified  | Build a separate class
Only one sort sequence can be created                     | Many sort sequences can be created
Used by String, Wrapper classes, Date, Calendar           | Meant to be implemented to sort instances of third-party classes

### Sorting with the Arrays Class
* Primitives are always sorted based on natural order
* Don't be fooled by questions that try to sort a primitive array using Comparator. Primitive arrays can not be sorted by Comparator
* sort() for both collections and Arrays are static methods. They alter the objects they are sorting, instead of returning a different sorted object

### Searching Arrays and Collections
* Searches are performed using binarySearch()
* successful searches return int index of the element being searched
* unsuccessful searches return an int index that represents the insertion point. Insertion point is in negative (-(insertion point)-1)
* collection/array being searched must be sorted before searching it.
* if the collection/array to be searched was sorted in natural order, it must be searched in natural order. (by NOT sending a Comparator as an argument to binarySearch()
* if the collection/array was sorted using a Comparator, then the same comparator must be used as argument in binarySearch()
  1. **Searching an array or collection that hasn't been sorted**
  2. **Using comparator in either the sort or the searc, but not both**

### Converting Arrays to Lists to Arrays
* couple methods that allow converting arrays to Lists, and Lists to arrays. 
* List and Set classes have toArray() and Arrays class has asList()
* Arrays.asList() = copies array into a list. When you update one of them, the other gets updated automatically. Look at MapTest.java

### Using Maps
* Remember that anything put as a key needs to have equals method overridden. Enums override equals() and hashCode()
* Remember that once instance of a class has been made a key, next time it uses that referece. doesn't matter what you pass in as a consutrctor param. Look at MapTest.java

### Navigation TreeSets and TreeMaps
* In java5 you had to use headSet() and tailSet(), but in java6 you can use lower and higher. 
* NavigableMap and NavigableSet have lower() floor() higher() ceiling(). lower < but floor gt=to
* descendingSet and descendingKeyMap return stuff in descending order

### Backed Collections
* when you create a submap, adding a key-value pair to either the original map or partial copy, the new entries are automagically added in the other collection
* When you create a submap by defining a range, it follows that rule when partial copy is created and also what can be added to the map from there on
* out of range stuff can still be added to original but not to submap
* Importnant Backed Collection methods for TreeSet and TreeMap
* Invoking pollFirstXxx() on the copy CAN remove an entry from both collections (tail or sub) if an element is in both, however, invoking it on originla will remove only the entry from original

### Key Methods in Arrays
Method                            | Description 
--------------------------------- | --------------------------------------------------
asList(T[])                       | Convert an array to a list and bind them
binarySearch(Object[], key)       | Search a sorted array for a value and return an index or insertion point
binarySEarch(T[],key,Comparator)  | Search a Comparator sorted array for a value
equals(Object[], Object[])        | Compare two arrays to see if their contents are equal
sort(Object[])                    | sort by natural order
sort(T[], Comparator)             | sort by Comparator

### Key Methods in Collections
Method                                  | Description 
--------------------------------------  | --------------------------------------------------
binarySearch(List, key, comparator)     | search a sorted list for a given value, return an index or insertion point
reverse(List)                           | Reverse the order of the list 
reverseOrder(), reverseOrder(Comparator)| return a Comparator that sorts the reverse of the current
sort(List), sort(List, Comparator)      | Sort a list by natural or Comparator

Generic Types
=============

_6.3 Write code that uses the generic versions of the Collections API, in particular the Set,
List, and Map interfaces and implementation classes. Recognize the limitations of the nongeneric
Collections API and how to refactor code to use the generic versions._
_6.4 Develop code that makes proper use of type parameters in class/interface declarations,
instance variables, method arguments, and return types; and write generic methods or
methods that make use of wildcard types and understand the similarities and differences
between these two approaches. Write code that uses the NavigableSet and NavigableMap
interfaces._

* if it is not `? super <classname>` then the method can not ADD to the list


    public void addAnimal(List <? extends Animal> animals) {
      animals.add(new Dog()); //ERROR
    }

    public void addAnimal(List <? super Dog> animals) {
      animals.add(new Dog()); //Fine
    }
