const alunos = ['João', 'Juliana', 'Caio', 'Ana']
const medias = [10, 8, 7.5, 9]

// console.log(alunos[0], medias[0])
// console.log(alunos[1], medias[1])
const lista = [alunos, medias]
console.log(
  `A aluna da posição 1 é:  ${lista[0][1]}.
  A nota do aluno(a) é: ${lista[1][1]}.`
)