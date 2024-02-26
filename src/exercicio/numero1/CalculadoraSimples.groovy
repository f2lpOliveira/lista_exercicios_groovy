package exercicio.numero1

/*
Escreva um programa que solicite ao usuário dois números e uma operação (adição, subtração, multiplicação ou divisão) e exiba o resultado.
*/

print "Digite o primeiro número: "
num1 = Double.parseDouble(System.in.newReader().readLine())

print "Digite o segundo número: "
num2 = Double.parseDouble(System.in.newReader().readLine())

print "Digite a operação (+, -, *, /): "
operacao = System.in.newReader().readLine()

switch (operacao){
    case "+":
        println "Resultado: ${num1 + num2}"
        break
    case "-":
        println "Resultado: ${num1 - num2}"
        break
    case "*":
        println "Resultado: ${num1 * num2}"
        break
    case "/":
        if(num2 != 0) {
            println "Resultado: ${num1 / num2}"
        } else {
            println "Operação inválida! Divisão por zero."
        }
        break
    default:
        println "Operação inválida!"
}