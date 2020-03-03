class Time (h: Integer, m: Integer) {
  private val minutesSinceMidnight = 0
  def hours = minutesSinceMidnight / 60
  def minutes = minutesSinceMidnight % 60


  def this(h: Int) = this(h, 0)
  if (h > 23 || h < 0 && m < 0 && m > 59)
    throw  new IllegalArgumentException("Illegal time defined")
  def before(other: Time): Boolean = minutesSinceMidnight < other.minutesSinceMidnight
  override def toString: String = f"${h}:${m}%02d"
}

val night = new Time(22, 0)
val morning = new Time(9, 0)

morning.before(night)

night.before(morning)

val noon = new Time(12)

//////////// uniform access

