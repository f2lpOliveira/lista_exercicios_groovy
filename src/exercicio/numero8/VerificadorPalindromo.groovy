package exercicio.numero8

void verificaPalindromo () {

    print "Digite uma palavra: "
    palavra = System.in.newReader().readLine()

    palavraSemEspacos = palavra.replaceAll("\\s+", "").toLowerCase()

    palindromo = true
    i = 0
    j = palavraSemEspacos.length() - 1

    while (i < j) {
        if (palavraSemEspacos[i++] != palavraSemEspacos[j--]) {
            palindromo = false
            break
        }
    }

    if (palindromo) {
        println "$palavra é um palíndromo."
    } else {
        println "$palavra não é um palíndromo."
    }
}

verificaPalindromo()