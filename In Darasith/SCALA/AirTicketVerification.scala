package enterinput
// take the total airticket number and take out the last digit, if the remaining is divisible by 7 then the ticket number is verified.
object AirTicketVerification {
  def main (args:Array[String]): Unit ={
    var num = scala.io.StdIn.readInt()
    var res = num / 10
    var res2 = num % 10
    var total = res % 7
    println(res2==total)
  }
}


