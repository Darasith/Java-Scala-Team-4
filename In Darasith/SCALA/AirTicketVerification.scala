package enterinput

object AirTicketVerification {
  def main (args:Array[String]): Unit ={
    var num = scala.io.StdIn.readInt()
    var res = num / 10
    var res2 = num % 10
    var total = res % 7
    println(res2==total)
  }
}


