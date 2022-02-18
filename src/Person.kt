import kotlin.random.Random

data class PersonAuth(val email: String, val password: String)

fun authPerson(personAuth: PersonAuth) : Boolean = Random.nextBoolean()