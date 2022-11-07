object Functions{
  //create an object
  object Math{
    //method 1
    def Addition(x: Int, y: Int): Int = {
      return (x + y)
    }
    //take only one argument
    def Square(x:Int)= x * x
  }
  //method2
  //we can skip writing return keyword
  //last line is consider return statement
  def Subtract(x: Int, y: Int): Int = {
    x - y
  }

  //method 3
  def Multiply(x: Int, y: Int): Int = x * y

  def Divide(x: Int, y: Int) = x / y

  //default value for function
  def Defaults(x:Int = 10, y :Int = 20): Int ={
    return  x + y
  }

  //unit is equivalent to void
  def Prints(x: Int, y: Int): Unit ={
    println("Void type: ",x + y)
  }

  //operator as function name
  def **(x: Int) = x*x


  def main(args: Array[String]): Unit = {

    //anonymous function
    var add = (x: Int, y: Int) => x + y

    //using add method in math object
    println("Addition: ", Math.Addition(2, 5))
    println("Square: ", Math Square 3)
    //if method has one argument pass it with space
    println("Sub: ", Subtract(2, 3))
    println("Div: ", Divide(2, 4))
    println("Mul: ", Multiply(2, 3))

    //working with default values
    println("Passing no values: ", Defaults())
    println("Passing one parameter: ", Defaults(20)) //it goes to first parameter

    //void return type
    println(Prints(20, 70))

    //calling operators function
    println("Operator as function name", **(2))

    //calling anonymous function
    println("Anonymous function: ", add(30, 40))



  }
}