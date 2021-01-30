package info.info.dependancyinjection

class testClass_three(val classOne: testClass_one, val classTwo: testClass_two) {
    fun do_some_thing(){
        classOne.classOne()
        classTwo.classTwo()
    }
}