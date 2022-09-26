<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!doctype html>
<html lang="pt-br">

<head>
    <title>Pagamento</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
        integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <link rel="stylesheet" href="../../assets/CSS/Pagamento.css"> 
</head>

<body>
    <div class="section">
        <!-- INÍCIO BARRA DE NAVEGAÇÃO -->
        <header>
            <nav class="navbar navbar-expand-lg navbar-light bg-warning">
                <div class="container-fluid">
                    <div>
                        <img src="../../assets/IMG/Logo.png" width="250px" height="120px">
                    </div>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                        data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false"
                        aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <div class="navbar-nav">              
                            <a class="nav-link" href="../../Home.html">Home</a>
                            <a class="nav-link" href="../cadastro/Cadastro.jsp">Cadastro</a>
                            <a class="nav-link" href="../destino/Destinopg.01.jsp">Destino</a>
                            <a class="nav-link" href="../promocoes/Promocoes.jsp">Promoções</a>
				            <a class="nav-link" href="../voos/Voos.jsp">Voos</a>
				            <a class="nav-link" href="../hoteis/Hoteis.jsp">Hotéis</a>
				            <a class="nav-link active" aria-current="page" href="PagamentoD01.jsp">Pagamento</a>
				            <a class="nav-link" href="../passagem/Passagem.jsp">Passagem</a>
                            <a class="nav-link" href="../contato/Contato.jsp">Contato</a>               
				            <a class="nav-link" href="../sobre/Sobre.jsp">Sobre</a>
                        </div>
                    </div>
                </div>
            </nav>
        </header>
        <!-- FIM BARRA DE NAVEGAÇÃO -->
        <!-- INÍCIO DA ÁREA DE PAGAMENTO -->
        <div class="container">
            <main>
                <div class="py-5 text-center">
                    <img class="d-block mx-auto mb-4" src="../../assets/IMG/LogoNegativo.png" alt="" width="300px"
                        height="150px">
                    <h2>Por favor, verifique o Formulário!</h2>
                </div>
                <div class="row g-5">
                    <div class="col-md-5 col-lg-4 order-md-last">
                        <h4 class="d-flex justify-content-between align-items-center mb-3">
                            <span class="text-primary">Seu carrinho</span>
                        </h4>
                        <ul class="list-group mb-3">
                            <li class="list-group-item d-flex justify-content-between lh-sm">
                                <div>
                                    <h6 class="my-0"> Nenhum Produto Selecionado</h6>
                                </div>
                                <span class="text-muted"></span>
                            </li>
                            <li class="list-group-item d-flex justify-content-between bg-light">
                                <div class="text-success">
                                    <h6 class="my-0">Código promocional</h6>
                                </div>
                                <span class="text-success"></span>
                            </li>
                            <li class="list-group-item d-flex justify-content-between">
                                <span>Total (R$)</span>
                                <strong></strong>
                            </li>
                        </ul>
                        <form class="card p-2">
                            <div class="input-group">
                                <input type="text" class="form-control" required placeholder="Código promocional">
                                <button type="submit" class="btn btn-secondary">Resgatar</button>
                            </div>
                        </form>
                    </div>
                    <div class="col-md-7 col-lg-8">
                        <h4 class="mb-3">Dados Cadastrais</h4>
                        <form class="needs-validation" novalidate>
                            <div class="row g-3">
                                <div class="col-sm-6">
                                    <label for="primeiroNome" class="form-label">Primeiro Nome</label>
                                    <input type="text" class="form-control" id="primeiroNome"
                                        placeholder="Primeiro Nome" value="" required>
                                    <div class="invalid-feedback">
                                        É necessário nome válido.
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <label for="sobrenome" class="form-label">Sobrenome</label>
                                    <input type="text" class="form-control" id="sobrenome" placeholder="Sobrenome"
                                        value="" required>
                                    <div class="invalid-feedback">
                                        É necessário sobrenome válido.
                                    </div>
                                </div>
                                <div class="col-12">
                                    <label for="nomeUsuario" class="form-label">Nome de Usuário</label>
                                    <div class="input-group has-validation">
                                        <span class="input-group-text">@</span>
                                        <input type="text" class="form-control" id="nomeUsuario"
                                            placeholder="Nome de Usuário" required>
                                        <div class="invalid-feedback">
                                            Seu nome de usuário é necessário.
                                        </div>
                                    </div>
                                </div>
                                <div class="col-12">
                                    <label for="email" class="form-label">Email <span
                                            class="text-muted">(Opcional)</span></label>
                                    <input type="email" class="form-control" id="email" placeholder="nome@exemplo.com">
                                    <div class="invalid-feedback">
                                        Por favor, insira um endereço de e-mail válido para atualizações de envio.
                                    </div>
                                </div>
                                <div class="col-12">
                                    <label for="endereco" class="form-label">Endereço</label>
                                    <input type="text" class="form-control" id="endereco"
                                        placeholder="Rua, Bairro, Cidade, Município" required>
                                    <div class="invalid-feedback">
                                        Por favor, digite seu endereço.
                                    </div>
                                </div>
                                <div class="col-12">
                                    <label for="complemento" class="form-label">Complemento<span
                                            class="text-muted">(Opcional)</span></label>
                                    <input type="text" class="form-control" id="complemento"
                                        placeholder="Apartamento ou Numero da Casa">
                                </div>
                                <div class="col-md-5">
                                    <label for="país" class="form-label">País</label>
                                    <select class="form-select" id="país" required>
                                        <option value="">Escolher...</option>
                                        <option>Brasil</option>
                                        <option>Canadá</option>
                                        <option>Estados Unidos</option>
                                        <option>França</option>
                                        <option>Inglaterra</option>
                                    </select>
                                    <div class="invalid-feedback">
                                        Por favor, selecione um país válido.
                                    </div>
                                </div>
                               <!--Estado-->
                            <div class="col-md-4">
                                <label for="estado " class="form-label">Estado</label>
                                <select class="form-select" aria-label="Default select example">
                                    <option selected>Escolha um Estado:</option>
                                    <option value="AC">AC</option>
                                    <option value="AL">AL</option>
                                    <option value="AP">AP</option>
                                    <option value="AM">AM</option>
                                    <option value="BA">BA</option>
                                    <option value="CE">CE</option>
                                    <option value="ES">ES</option>
                                    <option value="GO">GO</option>
                                    <option value="MA">MA</option>
                                    <option value="MT">MT</option>
                                    <option value="MS">MS</option>
                                    <option value="MG">MG</option>
                                    <option value="PA">PA</option>
                                    <option value="PB">PB</option>
                                    <option value="PR">PR</option>
                                    <option value="PE">PE</option>
                                    <option value="PI">PI</option>
                                    <option value="RJ">RJ</option>
                                    <option value="RN">RN</option>
                                    <option value="RS">RS</option>
                                    <option value="RO">RO</option>
                                    <option value="RR">RR</option>
                                    <option value="SC">SC</option>
                                    <option value="SP">SP</option>
                                    <option value="SE">SE</option>
                                    <option value="TO">TO</option>
                                </select>
                            <div class="invalid-feedback">
                                Por favor, forneça um estado válido.
                            </div>
                        </div>
                                <div class="col-md-3">
                                    <label for="cep" class="form-label">CEP</label>
                                    <input type="text" class="form-control" id="cep" placeholder="00000-000" required>
                                    <div class="invalid-feedback">
                                        CEP necessário.
                                    </div>
                                </div>
                            </div>
                            <hr class="my-4">
                            <div class="form-check">
                                <input type="checkbox" class="form-check-input" id="salvar-info">
                                <label class="form-check-label" for="salvar-info">Salvar essas informações para a
                                    próxima vez.
                                </label>
                            </div>
                            <hr class="my-4">
                            <h4 class="mb-3">Pagamento</h4>
                            <div class="my-3">
                                <div class="form-check">
                                    <input id="credito" name="paymentMethod" type="radio" class="form-check-input"
                                        checked required>
                                    <label class="form-check-label" for="credito">Cartão de Crédito</label>
                                </div>
                                <div class="form-check">
                                    <input id="debito" name="paymentMethod" type="radio" class="form-check-input"
                                        required>
                                    <label class="form-check-label" for="debito">Cartão de Débito</label>
                                </div>
                                <div class="form-check">
                                    <input id="paypal" name="paymentMethod" type="radio" class="form-check-input"
                                        required>
                                    <label class="form-check-label" for="paypal">PayPal</label>
                                </div>
                            </div>
                            <div class="row gy-3">
                                <div class="col-md-6">
                                    <label for="cc-name" class="form-label">Nome no Cartão</label>
                                    <input type="text" class="form-control" id="cc-name" placeholder="" required>
                                    <small class="text-muted">Nome completo como exibido no cartão</small>
                                    <div class="invalid-feedback">
                                        Nome no cartão é necessário
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <label for="cc-number" class="form-label">Número do Cartão</label>
                                    <input type="text" class="form-control" id="cc-number" placeholder="" required>
                                    <div class="invalid-feedback">
                                        Número do cartão de crédito é necessário
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <label for="cc-expiracao" class="form-label">Expiração</label>
                                    <input type="text" class="form-control" id="cc-expiracao" placeholder="" required>
                                    <div class="invalid-feedback">
                                        Data de validade necessária
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <label for="cc-cvv" class="form-label">CVV</label>
                                    <input type="text" class="form-control" id="cc-cvv" placeholder="" required>
                                    <div class="invalid-feedback">
                                        Código de segurança necessário
                                    </div>
                                </div>
                            </div>
                            <hr class="my-4">
                            <input class="w-100 btn btn-primary btn-lg m-1" type="reset"
                                value="Limpar as Informações"></input>
                            <a class="w-100 btn btn-primary btn-lg m-1" href="../subPaginas/Passagem.html"
                                role="button">Confirme! Veja o seu Passaporte</a>
                        </form>
                    </div>
                </div>
            </main>
        </div>
        <!-- FIM DA ÁREA DE PAGAMENTO -->
        <!-- INÍCIO DO FOOTER -->
        <footer class="pt-4 my-md-0 pt-md-2 border-top bg-warning">
            <div class="row">
                <div class="col-6 m-lg-auto col-md">
                    <img src=" ../../assets/IMG/Logo (laranja).png" width="240px" height="140px">
                </div>
                <div class="col-6 col-md">
                    <h5 class="sky">SKYTOUR</h5>
                    <ul class="list-unstyled text-small">
                        <li class="mb-1"><a class="link-secondary text-decoration-none" href="../../Home.html">Home</a>
                        </li>
                        <li class="mb-1"><a class="link-secondary text-decoration-none"
                                href="../cadastro/Cadastro.jsp">Cadastro</a></li>
                        <li class="mb-1"><a class="link-secondary text-decoration-none"
                                href="../destino/Destinopg.01.jsp">Destino</a></li>
                        <li class="mb-1"><a class="link-secondary text-decoration-none"
                                href="../contato/Contato.jsp">Contato</a></li>
                        <li class="mb-1"><a class="link-secondary text-decoration-none"
                                href="../sobre/Sobre.jsp">Sobre</a></li>
                    </ul>
                </div>
                </div>
        </footer>
        <!-- FIM DO FOOTER -->
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js"
            integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk"
            crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js"
            integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy"
            crossorigin="anonymous"></script>
    </div>
</body>

</html>