package oop_00000128606_keishaarialai.week05

fun main(){
    val ListMatkul: List<MataKuliah> = listOf(
            Wajib(),
            Elective()
    )

    println("Banyak tipe Matkul: $ListMatkul")
    //panggil method untuk anak-anak -> si set_matkul()
    for(mtkul in ListMatkul){
        mtkul.set_matkul(3)

        //cara 1 memanggil  method berbeda untuk all anak class
        if(mtkul is Wajib) {
            mtkul.ada_seminar()
        } else if(mtkul is Elective) {
            mtkul.ada_praktek()
        }

        //cara 2 memanggil method berbeda untuk all anak class
        when(mtkul){
            is Wajib -> {
                print("Wajib dari when: ")
                mtkul.ada_seminar()
            }
            is Elective -> {
                print("Elective dari when: ")
                mtkul.ada_praktek()
                //print untuk membedakan saja, tdk harus dipakai
            }
        }
    }


//    val wjb = Wajib()
//    wjb.set_matkul(3)
//
//    val elc = Elective()
//    elc.set_matkul(2)
}