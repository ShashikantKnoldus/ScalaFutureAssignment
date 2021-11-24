package edu
import java.nio.file.{FileSystems, Files}
import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.jdk.CollectionConverters.IteratorHasAsScala
import scala.language.postfixOps
class futureExample(path:String){
  def contantOfDirectory(path:String):Future[List[String]]=Future{
    Thread.sleep(1000)
    val temp = FileSystems.getDefault.getPath(path)
    if(temp.toFile.isDirectory || temp.toFile.exists()) {
      List(Files.walk(temp).iterator().asScala.foreach(println).toString)
    }
    else{
      List("This path is invalid")
    }
  }
  val receivedPath: List[String] = Await.result(contantOfDirectory(path) ,1 second)
}
