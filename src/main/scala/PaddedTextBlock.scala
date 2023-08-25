class PaddedTextBlock(width: Int, height: Int, rightPadding: Int, topPadding: Int, strings: Seq[String])
  extends TextBlock(PaddedTextBlock.toStrings(width, height, rightPadding, topPadding, strings))

object PaddedTextBlock {
  def toStrings(width: Int, height: Int, rightPadding: Int, topPadding: Int, strings: Seq[String])
  : Seq[String] = {

    assert(strings.size + topPadding <= height)

    // convert each string to width
    val newStrings: Seq[String] = strings.map(s => {
      assert(s.length + rightPadding <= width)
      val sRight = " " * rightPadding
      val sLeft = " " * (width - s.length - rightPadding)
      sLeft + s + sRight
    })

    val empty: String = " " * width
    val top = Seq.fill(topPadding)(empty)
    val bottom = Seq.fill(height - strings.size - topPadding)(empty)

    top ++ newStrings ++ bottom
  }
}
