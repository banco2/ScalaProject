/**
 * Created by user on 1/11/2016.
 */
import scala.io.StdIn.{readLine}


object AreaTriangle {
  def main (args: Array[String]) {

    var base = 0
    var height = 0
    var area = 0.0
    print("Enter base: ")
    base = readLine.toInt
    print("Enter height: ")
    height = readLine.toInt

    area = 1.0 * base * height / 2
    println(f"The area of the Triangle is $area")


  }


}