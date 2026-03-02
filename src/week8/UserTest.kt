package week8

class UserTest {

    object DatabaseMock {
        fun findUser(id: Int ): UserProfile? {
            return if (id == 1) UserProfile("TestUser", "test@test.com") else null

        }
    }

    fun runMockUnitTest() {
        println("\n=== RUNING UNIT TEST ===")
        val testUser = DatabaseMock.findUser(1)

        val initial = testUser!!.name.substring(0, 1)

        check(initial == "T") { "Test failed! Initial is wrong." }
        println("Test passed: Initial is T")
    }
}