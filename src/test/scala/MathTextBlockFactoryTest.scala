import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

import scala.collection.immutable.Seq

class MathTextBlockFactoryTest extends AnyFlatSpec with should.Matchers {

  "toString" should "work" in {
    val mathTextBlockFactory = new MathTextBlockFactory(
      9, 15, 15)

    println(mathTextBlockFactory.textBlock().toString)
  }

}
