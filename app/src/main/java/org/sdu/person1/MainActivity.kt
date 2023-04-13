package org.sdu.person1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.sdu.person1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.createPeronButton.setOnClickListener {
            val name = binding.input1.text.toString()
            val ageStr = binding.input2.text.toString()
            val address = binding.input3.text.toString()

            val age = ageStr.toInt()

            val person1 = Person(name,age,address)
            binding.output1.text = "사람 객체 만들었다! : ${person1.name}"
        }

        binding.createStudentButton.setOnClickListener {
            val name = binding.input1.text.toString()
            val ageStr = binding.input2.text.toString()
            val address = binding.input3.text.toString()

            val age = ageStr.toInt()

            val student1 = Student(name,age,address)
            binding.output1.text = "학생 객체 만들었다! : ${student1.name}"
        }
    }
}