object one {

	def findLastElement(list: List[Int]) = {
		list.last
	}

	def main(args: Array[String]) = {
		val list = List(1, 2, 3, 42)
		println(findLastElement(list))
	}

}