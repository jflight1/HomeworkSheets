import scala.util.Random

class OneDigitAddFactory {

  private val random = new Random

  def textBlock(): TextBlock = {
    val a = randomInt(1, 9);

    val b = randomInt(1, Math.min(13-a, 9));

    val strings = Seq(
      "" + a,
      "+ " + b,
      "---"
    )
    new PaddedTextBlock(9, 5, 2, 1, strings)
  }

  private def randomInt(low: Int, high: Int, highInclusive: Boolean = true) = {
    low + random.nextInt(high - low + (if (highInclusive) 1 else 0))
  }


}
