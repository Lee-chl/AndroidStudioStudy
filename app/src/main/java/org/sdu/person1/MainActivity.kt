package org.sdu.person1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.sdu.person1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var person:Person? = null

    enum class PersonType{
        PERSON,STUDENT
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.createPeronButton.setOnClickListener {
             makePerson(PersonType.PERSON)

        }

        binding.createStudentButton.setOnClickListener {
            makePerson(PersonType.STUDENT)
        }
        binding.walkButton.setOnClickListener {
            person?.walk()

            if(person is Student){
                val student = person as Student
                student.run(binding.output1)
            }
        }
    }

    fun makePerson(type:PersonType){
        val name = binding.input1.text.toString()
        val ageStr = binding.input2.text.toString()
        val address = binding.input3.text.toString()

        val age = ageStr.toInt()

        when(type){
            PersonType.PERSON -> {
                person = Person(name,age,address)
                binding.output2.setImageResource(R.drawable.person)
                binding.output1.text = "사람 객체 만들었다! : ${person!!.name}"
            }
            PersonType.STUDENT->{
                person = Student(name,age,address)
                binding.output1.text = "학생 객체 만들었다! : ${person!!.name}"
                binding.output2.setImageResource(R.drawable.student)
            }
            else ->{
                println("알 수 없는 타입입니다. $type")
            }
        }

    }
}