object five {
	
	def reverse(list: List[Int]) = {
		list.reverse
	}

	def main(args: Array[String]) = {
		val list = List(1,2,3,4,5,6,7)
		println(reverse(list))
	}

}