import forcomp.Anagrams.subtract

import scala.collection.immutable.SortedMap

"hello".groupBy(identity).mapValues(_.size).toList

val x = List(('z', 10), ('a', 20))
val sortedX = SortedMap[Char, Int]() ++ x
sortedX.contains('d')

val lard = List(('a', 1), ('d', 1), ('l', 1), ('r', 1))
val r = List(('r', 1))
val lad = List(('a', 1), ('d', 1), ('l', 1))
subtract(r, r)

