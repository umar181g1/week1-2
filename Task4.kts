fun main (){
    val namakota = arrayOf("jakarta","jakarta","Padang","Solo","Padang","Bandung","Padang","Malang","Bali")

    for (i in namakota.toSet()){
        println("$1 : ${namakota.count{it == i}}")
    }
}