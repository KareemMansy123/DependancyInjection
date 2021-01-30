package info.info.dependancyinjection

import android.app.Application

class MainApplication : Application() {
    companion object {
        private val classOne = testClass_one()
        private val classTwo = testClass_two()
        val classThree = testClass_three(classOne, classTwo)
    }

}