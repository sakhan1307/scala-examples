

object ArrayTest {
  def main(args: Array[String]) {
    
    // Arrays
    val fruits = new Array[String](3);
    fruits(0) = "Apple";
    fruits(1) = "Orange";
    fruits(2) = "Strawberry";

    fruits.foreach { x => println(x) }
    println("---------------------------")
    for (fruit <- fruits) {
      println(fruit);
    }
    
    for (
      fruit <- fruits if (fruit.startsWith("A"))
    ) println("-->starts with A="+fruit);

    //variable define
    var a: String = "hi"
    val b: String = "ho"
    def c: String = "hy"
    println(a, b, c)

    println("------------------------")
    a = "Di"

    println(a, b, c)
    
    
  // List
    val frts = "Apple" :: ("Orange" :: ("Strawberry" :: Nil));

    for (frt <- frts) {
      println(frt);
    }
    
    println("frts.head : " + frts.head);
    println("frts.tail : " + frts.tail);
    
    // Range
    println(1 to 5);
    println(1 until 5);
    println(1 to 20 by 5);
    
     for (
      i <- 1 to 20 
        if i % 2 == 0 
        if i%3 ==0
        ) println(i);
    
     // Tuple
    var fruitTuple = ("name" -> "Apple","name1"->"orage");
    
    println("key="+fruitTuple)
    
    fruitTuple.productIterator.foreach { x => println(x) }
    
    println("name = "+fruitTuple._1)
    println("name1 = "+fruitTuple._2)
    
    var tuple = (1,"John",100.00);
    println(tuple._2);
    
    // if else
    val number = 0;
    
    if(number > 0)
      println("positive number");
    else if(number < 0)
      println("negative number");
    else
      println("zero");
    
    // match
      val num = 20;
    
    num match {
      case 10 => println("nummber is 10");
      case _ => println("number other than 10");
    }
    
    val check = (num % 2 == 0) match {
      case true => "Even";
      case false => "Odd";
    }
    
    println(check);
    
    // Option and None
    val numerator = 10;
    val denominator = 1;
    
    val ratio = if(denominator == 0) None else Option(numerator/denominator);
    
    println(ratio);
    
    val nameAgeMap = Map("Alice" -> 20, "Bob" -> 25, "Chris" -> 30);
   
    println("Age of Alice : " + nameAgeMap.get("Alice").getOrElse("Not present"));    
    println("Age of John : " + nameAgeMap.get("John").getOrElse("Not present"));
  
    //nested loop
    
      for {
      i <- 1 to 2 
      j <- 1 to 3
    } println(s"($i,$j)");
    
   
    
    val fruitsList = List("Apple", "Banana", "Orange", "Pineapple", "Peach");
 
    // Yielding for Loop
    
     val filteredFruits = for {
      fruit <- fruitsList if(fruit.startsWith("P"))
    } yield(fruit);
    
    for(x <- filteredFruits)
      println(x);
    
    
     //value bind
    for {
      fruit <- fruitsList 
      fruitUpper = fruit.toUpperCase()
    } println(fruitUpper);
    
    //try catch finally
    
     try {
      var arr = Array(1, 2, 3)
      println(arr(3));
    } catch {
       case a: java.lang.ArrayIndexOutOfBoundsException => println("ArrayIndexOutOfBoundsException");
      case e : java.lang.Exception => println("Exception");
      
     // case e : java.lang.Exception => println(e.printStackTrace())
      
    }finally
       println("Code in finally will always execute");
    

     val result = try {
      Integer.parseInt("Hello");
    } catch {
      case _ => 0;
      }
    println(result);
    
    //functions
    
    println(f1)
    println(f2)
    println(f3)
    println("Square of 5 = " + square(5));
    
    // nested function
    println("Max of 5,7,9 = " + max(5,7,9))
    
    // first class function
    val doubleValue = doubler();
    println("Double of 2 = " + doubleValue(2))
    
    // partially applied function
    
    val partialAdd = add(5,_:Int)
    println("partially add with 5 ="+partialAdd(10))
    
    // curied function
    println("add1(2)(3) = " + add1(2)(3));
    println("add2(2)(3) = " + add2(2)(3));
    
      //class 
   val somebody = new Person("John Doe")
  println(somebody.name)
  println(somebody.greet)
  
  //interpolation
     val name = "John";
     println(s"Hello $name");
     println(f"Hello $name%.4s");
     
     //Object is singleton
     Greeting.greet;
  }
  
  def f1 = "Hello World!"
  def f2() = "Hello"  
  def f3:String = "Hello World!" 
  def square(i: Int)  = { i * i }
  
  def max(a:Int, b:Int, c:Int) = {
    def max(x:Int, y:Int)= if (x>y) x else y
    max(a,max(b,c))
  }
  
  def doubler() = (num: Int) => num * 2;
  
  def add = (x: Int, y: Int) => x + y
  
  def add1(x: Int)(y: Int) = x + y  
  def add2(x: Int) = (y: Int) => x + y
  
}