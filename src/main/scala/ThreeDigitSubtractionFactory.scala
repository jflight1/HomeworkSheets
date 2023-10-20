import scala.util.Random

class ThreeDigitSubtractionFactory {

  private val random = new Random

  def textBlock(): TextBlock = {
    val n1: Seq[Int] = Seq(
      randomInt(2, 9),
      randomInt(0, 9),
      randomInt(0, 9)
    );

    val n2: Seq[Int] = Seq(
      randomInt(1, n1.head - 1),
      randomInt(0, 9),
      randomInt(0, 9)
    );

    def seqToString(n: Seq[Int]): String = {
      "" + n.head + " " + n(1) + " " + n(2);
    }

    val strings = Seq(
      seqToString(n1),
      "- " + seqToString(n2),
      "-------"
    )
    new PaddedTextBlock(12, 5, 2, 1, strings)
  }

  private def randomInt(low: Int, high: Int, highInclusive: Boolean = true) = {
    low + random.nextInt(high - low + (if (highInclusive) 1 else 0))
  }


}
