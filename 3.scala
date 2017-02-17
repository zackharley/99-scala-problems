object three {

	def nth(i: Int, list: List[Int]) = {
		list(i)
	}

	def main(args: Array[String]) = {
		val list = List(10, 12, 42, 3, 14)
		println(nth(2, list))
	}

}