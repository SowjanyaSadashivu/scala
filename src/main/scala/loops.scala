object Loops{
  def main(args: Array[String]): Unit ={
    var x = 0
    //++ or -- is not allowed in scala
    //while loop
    while(x<10){
      println(x)
      x+=1
    }

    //do while loop
    var y = 0
    do{
      println(y + 10)
      y += 1
    }
    while (y < 10)

    //for loop

    for(a <- 0 until 5){ //print 0 to 4
      println(a)
    }

    for(a <- 0 to 5){ //print 0 to 5
      println(a)
    }

    for (a <- 1.to(5)){ //applying to() on int here
      println(a)
    }

    for(a <- 0 until 2; j <- 3 to 4){
      println("a * b" , (a * j))
    }

    val lists = List(1, 2, 3, 4)
    for (i <- lists){
      println(i)
    }

    //for loop for filters
    for(i <- lists; if i < 3){
      println(i)
    }

    //for loop as expression
    //use yield
    //use {} instead of ()

    val result = for {i <- lists; if i < 3} yield { i * i }
    println(result)
  }
}