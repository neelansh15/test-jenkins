def helu() {
    println "Hello World from Groovy! YAY"
}

return [
    helu: this.&helu,
]