class Time (val hours: Int, val minutes: Int) {

  def this(h: Int) { this(h,0) }

  if(hours < 0 || hours > 24 && minutes < 0 || minutes >= 60)
    throw  new IllegalArgumentException

  override def toString: String = f"${hours}:${minutes}%02d"

  def - (other: Time) = hours * 60 + minutes - other.hours * 60 - other.minutes
  def < (other: Time) = this - other < 0

}

object Time {
  def apply(h:Int, m: Int)  = new Time(h,m)
}

Time(12, 0) < Time(12, 30)
