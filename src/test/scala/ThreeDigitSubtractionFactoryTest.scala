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

  "SimpleSubtraction" should "work" in {


    val f = new TeenSubtractionFactory()

    val textGrid = new TextGrid(5, 6, f.textBlock)


    println("Ben")
    println()
    println(textGrid)
  }


  "OneDigitAdd" should "work" in {


    val f = new OneDigitAddFactory()

    val rows = 4
    val columns = 4

    val textGrid = new TextGrid(4, 4, f.textBlock)


    println("Katie")
    println()
    println(textGrid)
  }

}
