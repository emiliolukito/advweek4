package com.ubaya.advweek4.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ubaya.advweek4.model.Student

class ListViewModel:ViewModel() {
    val studentsLD = MutableLiveData<List<Student>>()
    val studentLoadErrorLD = MutableLiveData<Boolean>()
    val loadingLD = MutableLiveData<Boolean>()

    fun refresh(){
        val student1 =
            Student("160718006","Emilio Lukito","2000/06/13","081330127585","http://dummyimage.com/100x70.jpg/dddddd/000000")
        val student2 =
            Student("160718015","Kristanto Margojoyo","1999/03/13","08358979624","http://dummyimage.com/100x70.bmp/cc0000/ffffff")
        val student3 =
            Student("160718044","Jason D","2000/02/05","0834561230","http://dummyimage.com/100x70.jpg/dddddd/000000")

        val studentList:ArrayList<Student> = arrayListOf(student1,student2,student3)
        studentsLD.value = studentList
        studentLoadErrorLD.value = false
        loadingLD.value = true
    }
}