case class TextBlock(strings: Seq[String]) {

  val width: Int = strings.head.length
  val height: Int = strings.length

  // all strings must be the same length
  if (strings.size > 1)
    strings.tail.foreach(s => assert(s.length == width))


  def appendHorizontally(that: TextBlock): TextBlock = {
    assert(this.height == that.height)
    val stringTuples: Seq[(String, String)] = this.strings zip that.strings
    val newStrings: Seq[String] = stringTuples.map(stringTuple => stringTuple._1 + stringTuple._2)
    TextBlock(newStrings)
  }

  override def toString: String = {
    if (strings.size == 1)
      strings.head
    else
      strings.head + '\n' + TextBlock(strings.tail).toString
  }
}

object TextBlock {
  def appendHorizontally(textBlocks: Seq[TextBlock]): TextBlock = {
    if  (textBlocks.size == 1)
      textBlocks.head
    else
      textBlocks.head.appendHorizontally(
        TextBlock.appendHorizontally(textBlocks.tail))
  }
}
