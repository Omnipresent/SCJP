Exam Watch
==========

* Spaces sort before characters, uppercase sorts before lower case
  + ">ff<, > f<, >f <, >FF<" when sorted becomes "> f<, >FF<, >f <, >f<"
* difference in "compilation fails", "compiles without error" and "compiles without warnings" and "compiles with warnings"
* When using legacy (non-type safe) collections - watch out for unboxing problems! if you declare a non-generic collection, the get() method ALWAYS returns a reference of type java.lang.Object. 
Remember that unboxing cant convert a plain old Object to a primitive, even if that Object refence refers to an Integer (or some other wrapped primitive) on the heap. 
Unboxing converts only from a wrapper class reference (like an Integer or a Long) to a primitive.


      List test = new ArrayList();
      test.add(43);
      int x = (Integer) test.get(0) //must cast!!
      List<Integer> test2 = new ArrayList<Integer>();
      test2.add(343);
      int x2 = test2.get(0);

* test
