object L4 {
  def profit(price: Double, attend: Int): Double = {
    val attendeeCost = 3
    val performanceCost = 500

    val profit1 = (price * attend) - ((attend * attendeeCost) + performanceCost)
    val profit2 = ((price - 5) * (attend + 20)) - (((attend + 20) * attendeeCost) + performanceCost)

    val (maxProfit, maxPrice) = if (profit1 < profit2) {
      (profit2, price - 5)
    } else {
      (profit1, price)
    }

    val profit3 = ((maxPrice + 5) * (attend - 20)) - (((attend - 20) * attendeeCost) + performanceCost)

    if (profit3 > maxProfit) maxPrice + 5 else maxPrice
  }

  def main(args: Array[String]): Unit = {
    println(f"The best ticket price for maximum profit is Rs.${profit(15.0, 120)}%.2f")
  }
}
