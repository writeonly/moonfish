package pl.scalare.asap

//object Main extends App {
//
//  def isWorkingDay(d: WeekDay) = !(d == Sat || d == Sun)
//
//  import WeekDay._
//
//  object WeekDay extends Enumeration {
//    type WeekDay = Value
//    val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value
//  }
//
//  WeekDay.values filter isWorkingDay foreach println
//
//}

//object a extends App {
//  object WeekDay2 extends Enumeration("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat") {
//    type WeekDay2 = Value
//    val Sun, Mon, Tue, Wed, Thu, Fri, Sat = Value
//  }
//  import WeekDay2._
//
//  WeekDay2.valueOf("Wed") // returns Some(Wed)
//  WeekDay2.Fri.toString // returns
//}