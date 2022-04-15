fun main(args: Array<String>) {

    val list1 = ArrayList<String>()
    list1.add("a")

    val list2 = ArrayList<String>()
    list2.add("b")

    val list3 =ArrayList<String>()
    list3.add("c")

    val list4 = ArrayList<String>()
    list4.add("d")
    list4.add("e")
    list4.add("f")

    val joined = ArrayList<String>()

    joined.addAll(list1)
    joined.addAll(list2)
    joined.addAll(list4)


    // join two lists using union
    //val joined = ListUtils.union(list1, list2)

    println("list1: $list1")
    println("list2: $list2")
    println("joined: $joined")

}