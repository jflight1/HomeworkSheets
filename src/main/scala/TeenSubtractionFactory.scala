import scala.util.Random

class TeenSubtractionFactory {

  private val random = new Random

  def textBlock(): TextBlock = {
    val a = randomInt(10, 18);
    val b = randomInt(a-9, 9);

    val strings = Seq(
      "" + a,
      "- " + b,
      "---"
    )
    new PaddedTextBlock(9, 5, 2, 1, strings)
  }

  private def randomInt(low: Int, high: Int, highInclusive: Boolean = true) = {
    low + random.nextInt(high - low + (if (highInclusive) 1 else 0))
  }


}
