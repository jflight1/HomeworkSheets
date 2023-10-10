import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ThreeDigitSubtractionFactoryTest extends AnyFlatSpec with should.Matchers {

  "ThreeDigitSubtractionFactoryTest" should "work" in {


    val threeDigitSubtractionFactory = new ThreeDigitSubtractionFactory()

    val textGrid = new TextGrid(3, 4, threeDigitSubtractionFactory.textBlock)


    println("Ben")
    println()
    println(textGrid)
  }

}
