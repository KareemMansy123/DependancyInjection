package info.info.dependancyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val classOne = testClass_one()
    private val classTwo = testClass_two()
    private val classThree = testClass_three(classOne, classTwo)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        classThree.do_some_thing()
    }
}