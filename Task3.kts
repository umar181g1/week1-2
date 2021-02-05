fun main (){
    val data = arrayOf("udacoding,tempat 2,tempat 3,tempat 4 ,tempat 5")
    arrayLisString(data)
}

fun arrayLisString(listArray: Array<String>){
    for(i in listArray){
        if (i == "udacoding") println("$i : nah ini tempat belajar koding yang keren")
        else(print(i))
    }
}