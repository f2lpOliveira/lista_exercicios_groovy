package exercicio.numero4

/*
Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit. Solicite ao usuário a temperatura em Celsius.
 */

print "Digite a temperatura em graus Celcius: "
temperaturaCelcius = Double.parseDouble(System.in.newReader().readLine())

temperaturaFahrenheit = (temperaturaCelcius.toDouble() * 9 / 5) + 32

println "A temperatura em Fahrenheit é: $temperaturaFahrenheit"