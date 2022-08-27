Algoritmo "Cadastro Destino - Agência de Viagens SKYTOUR."
Var
   nomePassageiro, documentacao, localPartida, localDestino, dataIda, dataVolta: vetor[1..15] de caracter
   i, c: inteiro
   opcao, opcao2, cons: caracter
Inicio
   escreval("======================================")
   escreval("       Seja Bem vindo a SKYTOUR!      ")
   escreval("======================================")
   escreval("Deseja começar?")
   escreval("Digite sim ou não")
   leia(opcao)
   c <- 1
   //ÁREA DE CADASTRO
   escreval("======================================")
   escreval("     ÁREA PARA CADASTRO DE DESTINO!   ")
   escreval("======================================")
   se (opcao = "sim") entao
      para i de 1 ate 15 faca
         se c = 1 entao
            escreval("Digite o Nome do Passageiro:")
            leia(nomePassageiro[i])
            escreval("Documentação CPF/RG/CNH: ")
            leia(documentacao[i])
            escreval("Qual o local de Partida: ")
            leia(localPartida[i])
            escreval("Qual o Destino Final: ")
            leia(localDestino[i])
            escreval("Data de Ida: ")
            leia(dataIda[i])
            escreval("Data de Volta: ")
            leia(dataVolta[i])
            escreval("Deseja continuar? Digite [1] sim ou [2] não.")
            leia(c)
         fimse
      fimpara
   senao
      se(opcao = "não") entao
         escreval("Fim do Cadastro!")
      senao
         escreval("Opção inválida!")
      fimse
   fimse
   //ÁREA PARA CONSULTA
   escreval("======================================")
   escreval("     ÁREA PARA CONSULTA DE DESTINO!   ")
   escreval("======================================")
   escreval("Deseja fazer consulta?")
   escreval("Digite sim ou não.")
   leia(opcao2)
   se (opcao2 = "sim") entao
      escreval("Diga o nome do passageiro para consulta:")
      leia(cons)
      para i de 1 ate 15 faca
         se nomePassageiro[i] = cons entao
            escreval("Consulta:")
            escreval("Nome do Passageiro: ",nomePassageiro[i]," - Documentação: ",documentacao[i]," - Local de Partida: ",localPartida[i]," - Local de Destino: ",localDestino[i]," - Data de Ida: ",dataIda[i]," - Data de Volta: ",dataVolta[i])
         fimse
      fimpara
   senao
      escreval("Fim do Programa!")
   fimse
Fimalgoritmo