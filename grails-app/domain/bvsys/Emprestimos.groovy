package bvsys

class Emprestimos {

    String codigo
    int quantidade
    String observacoes
    Date DatadeObtencao
    Date dataDeDevolucao


    static belongsTo = [Utentes: Utentes, produto: Livros]
    static hasMany = [estados: EstadoEmprestimo, detalhes: DetalheEmprestimo]

    static constraints = {
        codigo nullable: true
        custo nullable: false
    }
}
