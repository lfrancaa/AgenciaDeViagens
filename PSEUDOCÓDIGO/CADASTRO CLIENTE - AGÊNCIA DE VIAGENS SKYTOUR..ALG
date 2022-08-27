Algoritmo "Cadastro Cliente - Agência de Viagens SKYTOUR."
Var
   nome, email, sexo, dataNascimento, cidade, estado, telefone: vetor[1..15] de caracter
   i, c: inteiro
   opcao, opcao2, cons: caracter
Inicio
   escreval("======================================")
   escreval("       Seja Bem vindo a SKYTOUR!      ")
   escreval("======================================")
   escreval("Deseja começar?")
   escreval("Digite sim ou não.")
   leia(opcao)
   c <- 1
   //ÁREA DE CADASTRO
   escreval("======================================")
   escreval("          ÁREA PARA CADASTRO!         ")
   escreval("======================================")
   se (opcao = "sim") entao
      para i de 1 ate 15 faca
         se c = 1 entao
            escreval("Digite o seu Nome: ")
            leia(nome[i])
            escreval("Digite o seu Email: ")
            leia(email[i])
            escreval("Digite o seu sexo: ")
            leia(sexo[i])
            escreval("Digite sua Data de Nascimento: ")
            leia(dataNascimento[i])
            escreval("Digite a sua Cidade: ")
            leia(cidade[i])
            escreval("Digite o seu Estado: ")
            leia(estado[i])
            escreval("Digite o seu Telefone: ")
            leia(telefone[i])
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
   escreval("          ÁREA PARA CONSULTA!         ")
   escreval("======================================")
   escreval("Deseja fazer consulta?")
   escreval("Digite sim ou não.")
   leia(opcao2)
   se (opcao2 = "sim") entao
      escreval("Diga o nome do cliente para consulta:")
      leia(cons)
      para i de 1 ate 15 faca
         se nome[i] = cons entao
            escreval("Consulta:")
            escreval("Nome: ",nome[i]," - Email: ",email[i]," - Sexo: ",sexo[i]," - Data de Nascimento: ",dataNascimento[i]," - Cidade: ",cidade[i]," - Estado: ",estado[i]," - Telefone: ",telefone[i])
         fimse
      fimpara
   senao
      escreval("Fim do Programa!")
   fimse
Fimalgoritmo