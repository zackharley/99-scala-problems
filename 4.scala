object four {

	def length(list: List[Int]) : Int = {
		var count = 0
		list.foreach((item) => count += 1)
		count
	}

	def main(args: Array[String]) = {
		val list = List(1,2,3,4,5,6,7)
		println(length(list))
	}

}