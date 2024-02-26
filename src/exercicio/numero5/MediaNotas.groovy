package exercicio.numero5

/*
Escreva um programa que solicite ao usuário três notas e calcule a média delas.
 */

print "Digite a primeira nota: "
nota1 = Double.parseDouble(System.in.newReader().readLine())

print "Digite a segunda nota: "
nota2 = Double.parseDouble(System.in.newReader().readLine())

print "Digite a terceira nota: "
nota3 = Double.parseDouble(System.in.newReader().readLine())

media = (nota1 + nota2 + nota3) / 3

println "A média das notas é: $media"