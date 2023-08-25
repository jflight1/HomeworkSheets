class TextGrid(val textBlocks: Seq[Seq[TextBlock]]) {


  override def toString: String = {

    val verticalTextBlocks: Seq[TextBlock] = textBlocks
      .map(horizontalTextBlocks => TextBlock.appendHorizontally(horizontalTextBlocks))

    val oneTextBlock = TextBlock.appendVertically(verticalTextBlocks)
    oneTextBlock.toString
  }
}
