fun main() {
    val personRegister = PersonRegister("Ilya","google@google.by", "bestHash")
    val personAuth = PersonAuth(personRegister.name, personRegister.password)
    authPerson(personAuth)
    changePersonPassword(personAuth.email, "md5Hash")
}