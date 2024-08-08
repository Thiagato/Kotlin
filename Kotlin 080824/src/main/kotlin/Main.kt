fun main() {
    println("Hello World!")

//    exemploFor1()
//    exemploFor2()
//    exemploFor3()
//    ifTernario()
//    whenKotlin()
//    whenKotlin2()

//    exercicio1()
      exercicio2()
}
fun exemploFor1(){
    //fori padrão crescente
    for (i in 1..10){
        println("valor do contador: $i")
    }
}

fun exemploFor2(){
    //fori padrão decrescente
    for (i in 10 downTo 1){
        println("valor do contador decrescente: $i")
    }
}

fun exemploFor3(){
    //mostrar apenas impares
    // com o step ele vai contando em 2 em 2
    for (i in 1 .. 15 step 2){
        println("Só os impares: $i")
    }
}

fun ifTernario(){
    var a = 10
    var b = 30
    var max = if(a>b) a else b
    println("o maior valor é $max")
}

fun whenKotlin(){
    var a = 10

    when(a){
        1 -> println("A variavel vale 1")
        10 -> println("A variavel vale 10")
        else -> println("a variavel n vale nenhum dos dois")
    }
    //similar a switch case
}

fun whenKotlin2(){
    var x = 10

    when{
        x % 2 == 0 -> println("x é par")
        x % 2 != 0 -> println("X é impar")
        else -> println("x é 0")
    }

}

fun exercicio1(){
    //calcular media

    println("informe a nota da primeira prova")
    var n1 = readln().toFloat()

    println("informe a nota da primeira prova")
    var n2 = readln().toFloat()

    println("informe a nota da primeira prova")
    var n3 = readln().toFloat()

    var media = (n1+n2+n3) / 3

    var mediaFormatada = String.format("%.2f", media)

    if(media >= 7){
        println("Aprovado com media $mediaFormatada")
    } else
        println("Reprovado com sucesso $mediaFormatada")
}

fun exercicio2(){
    //par ou impar

    println("digite o valor")
    var valor = readln().toInt()

    when{
        valor % 2 == 0 -> println("$valor é par")
        valor % 2 != 0 -> println("$valor é impar")
        else -> println("nem tem numero")
    }
}

fun exercicio3(){

}

fun exercicio7(){
    //contar vogais numa palavra

    println("digite a palavra")
    var palavra = readln()

    var quantVogais = 0
    var quantConsoantes = 0


    for (letra in palavra){
        if (letra.lowercaseChar() in "aeiou"){
            quantVogais++
    } else {
        quantConsoantes++
    }
    println("Existem $quantVogais vogais e $quantConsoantes consoantes")
    }
}

