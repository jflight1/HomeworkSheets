import scala.util.Random

class MathTextBlockFactory(val highArg: Int, val highSum: Int, val highSubtractArg: Int) {

  private val random = new Random

  def textBlock(): TextBlock = {
    val plus = randomInt(0, 1) == 0
    val args: (Int, Int) = if (plus) {
      val arg1 = randomInt(0, highArg)
      val arg2 = randomInt(0, highSum - highArg)
      (arg1, arg2)
    }
    else {
      val arg1 = randomInt(1, highSubtractArg)
      val arg2 = randomInt(0, arg1)
      (arg1, arg2)
    }

    val strings = Seq(
      args._1.toString,
      (if (plus) "+" else "-") + " " + args._2,
      "---"
    )
    new PaddedTextBlock(7, 5, 2, 2, strings)
  }

  private def randomInt(low: Int, high: Int, highInclusive: Boolean = true) = {
    low + random.nextInt(high - low + (if (highInclusive) 1 else 0))
  }


}
