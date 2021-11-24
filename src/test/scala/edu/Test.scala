package edu
import org.scalatest.flatspec.AnyFlatSpec
class Test extends AnyFlatSpec {
  // Test case-1

  val obj= new futureExample("./src")
  "If you give path of directory which is  present" should "return the path" in{
    assert(obj.receivedPath== List("()"))
  }

  //Test case-2

  val obj2 = new futureExample("./sr")
  "If you give path of directory which is not present   " should "return"in{
    assert(obj2.receivedPath==List("This path is invalid"))
  }

  //Test case-3

  val obj3= new futureExample("")
  "If path field is empty" should "return"in{
    assert(obj3.receivedPath==List("This path is invalid"))
  }
}
