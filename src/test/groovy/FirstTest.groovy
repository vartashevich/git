import org.junit.Test

/**
 * Created on 11.12.2018
 *
 * @author Yuri Kudryavtsev
 *         skype: yuri.kudryavtsev.indeed
 *         email: ykudryavtsev@maxilect.com
 */

class FirstTest {
    @Test
    void myFirstTest() {
        printHello("Yuri Kudryavtsev")
        printHello("Viktor Pavlov")
        printHello("Vasya Pupkin")
    }

    static printHello(String userName) {
        println("Hello, " + userName + "!")
    }
}
