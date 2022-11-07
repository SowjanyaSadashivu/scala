object Conditions{
  def main(args: Array[String]){

    val x = 20
    val y = 30
    println(if (x != 20) "x == 20" else "x != 20")
    println(if (x == 20 && y == 20) "hello" else "world")
    println(if (x == 20 || y == 20) "hello" else "world")
  }
}