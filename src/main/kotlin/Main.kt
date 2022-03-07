fun main() {

try {
 val josivan= Cliente("Josivan","Rua sla", "99999-9999")

    while(true){
        println("  MENU  ")
        println("1-Adicione os itens")
        println("2-Remova os itens")
        println("3-Mostre os itens")
        println("Digite qualquer outro valor para sair")
        var opc = 0

        while(true){
        println("Digite a opção desejada ")
            try{
                opc=readLine()!!.toInt()
                break
            }catch(e:Exception){
                println("Valor inválido")
            }
        }

        when(opc){
1 -> println("Digite o item a ser adicionado: ")
                var item = 0
            Cliente.addCompra(item)

    2->    println("Digite o item a ser removido: ")
                val item = readLine()!!
            cliente.removeCompra(item)

            3-> cliente.listaCompras

            else-> break
            }
    }

}catch(e:Exception){
    println(e.message)
}
}

/*
Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão e
pelo menos mais duas opções de construtores conforme sua percepção, com os atributos:
nome (String), endereço (String), telefone (String), listaDeCompras
(mutableListOf<Strings>()).
A classe precisará de métodos para adicionar, remover e listar os itens do atributo
listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja
vazio, jogue uma exceção. Ao instanciar a classe cliente na função main(), não
 esquecer de colocar dentro de um bloco try catch.
 */