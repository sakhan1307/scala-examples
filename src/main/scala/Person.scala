

class Person (val name:String, val department:String){
   def this(name:String){
    this(name,"IT");
  }
  def greet:String = "Hello "+name
}