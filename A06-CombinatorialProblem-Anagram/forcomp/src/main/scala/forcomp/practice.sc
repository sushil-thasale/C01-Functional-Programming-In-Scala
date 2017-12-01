import scala.collection.immutable.SortedMap

"hello".groupBy(identity).mapValues(_.size).toList

val x = List(('z', 10), ('a', 20))
val sortedX = SortedMap[Char, Int]() ++ x
sortedX.contains('d')



