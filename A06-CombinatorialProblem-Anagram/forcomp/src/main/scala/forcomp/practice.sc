"hello".groupBy(identity).mapValues(_.size).toList

//def wordOccurrences(w: String): List[(Char, Int)] =
//  w.groupBy(_._1).map()

