def pascal(col: Int, row: Int): Int =
  if (col<0 || row<0) 0
  else if (col==0 || (row==col)) 1
  else pascal(col-1, row-1) + pascal(col, row-1)

pascal(0,2)
pascal(1,2)
pascal(1,3)

def balance(chars: List[Char]): Boolean =
  balanceHelper(chars, 0, 0)

def balanceHelper(chars: List[Char], count: Int, start: Int): Boolean =
  if (start==chars.length) count==0
  else if (count<0) false
  else if (chars(start)=='(') balanceHelper(chars, count+1, start+1)
  else if (chars(start)==')') balanceHelper(chars, count-1, start+1)
  else balanceHelper(chars, count, start+1)

balance(":-)".toList)

def countChange(money: Int, coins: List[Int]): Int =
  if (money==0 || coins.isEmpty) 0
  else countChangeHelper(money, coins.sorted, 0)

def countChangeHelper(money: Int, coins: List[Int], start: Int): Int =
  if (money==0) 1
  else {
    var count = 0
    for (i <- start to coins.length-1) {
      if (coins(i) <= money)
        count += countChangeHelper(money-coins(i), coins, i)
    }
    count
  }

countChange(10, List(1,2))