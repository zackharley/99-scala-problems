object six {

	def isPalindrome(list: List[Int]) : Boolean = {
		list == list.reverse
	}

	def main(args: Array[String]) = {
		val listOne = List(1,2,3,4,5)
		val listTwo = List(1,2,3,2,1)
		println(isPalindrome(listOne))
		println(isPalindrome(listTwo))
	}

}