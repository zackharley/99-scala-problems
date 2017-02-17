object two {

	def findPenultimate(list: List[Int]) = {
		list.reverse.tail.head
	}

	def main(args: Array[String]) = {
		val list = List(12, 86, 99, 42, 89)
		println(findPenultimate(list))
	}
}