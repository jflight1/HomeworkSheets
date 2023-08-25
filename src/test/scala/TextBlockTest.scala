import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class TextBlockTest extends AnyFlatSpec with should.Matchers {

  "toString" should "work" in {
    val a = "abcd"

    val tb = new TextBlock(Seq(a, a, a))

    tb.toString should be("abcd\nabcd\nabcd")
    println(tb.toString)
  }

  "appendHorizontally" should "work" in {
    val tb1 = new TextBlock(Seq("aaaa", "aaaa", "aaaa"))
    val tb2 = new TextBlock(Seq("bbbb", "bbbb", "bbbb"))

    val tb3 = tb1.appendHorizontally(tb2)
    tb3.toString should be("aaaabbbb\naaaabbbb\naaaabbbb")
    println(tb3.toString)
  }

  "TextBlock.appendHorizontally" should "work" in {
    val tb1 = new TextBlock(Seq("aaaa", "aaaa", "aaaa"))
    val tb2 = new TextBlock(Seq("bbb", "bbb", "bbb"))
    val tb3 = new TextBlock(Seq("cccc", "cccc", "cccc"))

    val tb4 = TextBlock.appendHorizontally(Seq(tb1, tb2, tb3))
    tb4.toString should be("aaaabbbcccc\naaaabbbcccc\naaaabbbcccc")
    println(tb4.toString)
  }

  "TextBlock.appendVertically" should "work" in {
    val tb1 = new TextBlock(Seq("aaaa", "aaaa", "aaaa"))
    val tb2 = new TextBlock(Seq("bbbb", "bbbb"))
    val tb3 = new TextBlock(Seq("cccc", "cccc", "cccc"))

    val tb4 = TextBlock.appendVertically(Seq(tb1, tb2, tb3))
    tb4.toString should be("aaaa\naaaa\naaaa\nbbbb\nbbbb\ncccc\ncccc\ncccc")
    println(tb4.toString)
  }

  "TextBlock" should "throw" in {

    a[AssertionError] should be thrownBy {
      new TextBlock(Seq("aaa", "b"))
    }

    a[AssertionError] should be thrownBy {
      val tb1 = new TextBlock(Seq("aaaa", "aaaa", "aaaa"))
      val tb2 = new TextBlock(Seq("bbb", "bbb"))
      tb1.appendHorizontally(tb2)
    }

    a[AssertionError] should be thrownBy {
      val tb1 = new TextBlock(Seq("aaaa", "aaaa", "aaaa"))
      val tb2 = new TextBlock(Seq("bbb", "bbb", "bbb"))
      tb1.appendVertically(tb2)
    }
  }

}
