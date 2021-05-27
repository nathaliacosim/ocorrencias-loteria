// Brincando com mapas de listas
// Apenas um estudo de múltiplas ocorrencias em uma lista
// Milionvy é um jogo ficticio criado pela autora do código

Object mapaConcursos = [:]
mapaConcursos = [
    [12, 13, 25, 37, 39, 41],
    [23, 24, 26, 44, 49, 60],
    [3, 19, 25, 44, 46, 57],
    [4, 15, 30, 36, 39, 48],
    [7, 31, 37, 42, 44, 56],
    [4, 9, 17, 19, 37, 60],
    [4, 7, 13, 25, 36, 58],
    [5, 23, 29, 34, 53, 60],
    [4, 27, 33, 35, 38, 41],
    [1, 17, 28, 37, 44, 50],
    [20, 33, 42, 44, 51, 56],
    [6, 14, 24, 34, 39, 58],
    [5, 15, 19, 26, 34, 50],
    [1, 45, 51, 53, 57, 60]
]

Object listaSimples = []
mapaConcursos.each(){ line ->
    line.each(){
        listaSimples.add(it)
    }
}

println "-- Números com diversas ocorrências nos ultimos jogos do Milhãovy --"
for(i = 0; i <= 60; i++){
    if(listaSimples.count(i) > 1
     && listaSimples.count(i) < 12){
        println "O n° " + i + " foi encontrado: " + listaSimples.count(i) + " vezes;"
    }
}

// Desenvolvido por Nathalia Cosim