<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<!doctype html>
<html lang="pt-br">

<head>
    <title>Cadastro Cliente</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
        integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <link rel="stylesheet" href="../../assets/CSS/Cadastro.css">
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
                            <a class="nav-link active" aria-current="page" href="Cadastro.jsp">Cadastro</a>
                            <a class="nav-link" href="../destino/Destinopg.01.jsp">Destino</a>
                            <a class="nav-link" href="../promocoes/Promocoes.jsp">Promoções</a>
				            <a class="nav-link" href="../voos/Voos.jsp">Voos</a>
				            <a class="nav-link" href="../hoteis/Hoteis.jsp">Hotéis</a>
				            <a class="nav-link" href="../pagamento/PagamentoD01.jsp">Pagamento</a>
				            <a class="nav-link" href="../passagem/Passagem.jsp">Passagem</a>
				            <a class="nav-link" href="../contato/Contato.jsp">Contato</a>
				            <a class="nav-link" href="../sobre/Sobre.jsp">Sobre</a>
                        </div>
                    </div>
                </div>
            </nav>
        </header>
        <!-- FIM BARRA DE NAVEGAÇÃO -->
        <!-- INÍCIO DO CADASTRO -->
        <main class="container d-flex m-2 justify-content-center flex-column">
            <div class="container">
                <h1>Cadastro Cliente</h1>
                <form action="">
                    <!--Nome-->
                    <div class="mb-3">
                        <label for="nome" class="form-label">Nome:</label>
                        <input type="text" name="nome" id="nome" class="form-control" required placeholder="Nome:">
                    </div>
                    <!--RG-->
                    <div class="mb-3">
                        <label for="rg" class="form-label">RG:</label>
                        <input type="text" name="rg" id="rg" class="form-control" required
                            placeholder="Ex:17.438.081-1">
                    </div>
                    <!--CPF-->
                    <div class="mb-3">
                        <label for="cpf" class="form-label">CPF:</label>
                        <input type="text" name="cpf" id="cpf" class="form-control" required
                            placeholder="Ex:147.851.070-65">
                    </div>
                    <!--Data de Nascimento-->
                    <div class="mb-3">
                        <label for="data" class="form-label">Data de Nascimento:</label>
                        <input type="date" name="data" id="data" class="form-control" required>
                    </div>
                    <!--Endereço-->
                    <div class="mb-3">
                        <label for="endereco" class="form-label">Endereço</label>
                        <input type="text" class="form-control" id="endereco" placeholder="Rua, Bairro, Cidade"
                            required>
                        <div class="invalid-feedback">
                            Por favor, digite seu endereço.
                        </div>
                    </div>
                    <!--Complemento-->
                    <div class="mb-3">
                        <label for="complemento" class="form-label">Complemento<span
                                class="text-muted">(Opcional)</span></label>
                        <input type="text" class="form-control" id="complemento"
                            placeholder="Apartamento ou Numero da Casa">
                    </div>
                    <div class="row g-3">
                        <!--CEP-->
                        <div class="col-md-3">
                            <label for="cep" class="form-label">CEP</label>
                            <input type="text" class="form-control" id="cep" placeholder="00000-000" required>
                            <div class="invalid-feedback">
                                CEP necessário.
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
                    </div>
                    <!--Email-->
                    <div class="mb-3">
                        <label for="email" class="form-label">Email:</label>
                        <input type="email" name="email" id="email" class="form-control" required placeholder="Email:">
                    </div>
                    <!--Telefone-->
                    <div class="mb-3">
                        <label for="tel" class="form-label">Telefone:</label>
                        <input type="tel" name="tel" id="tel" class="form-control" maxlength="11" required
                            placeholder="Ex: 11912345678">
                    </div>
                   
                    <!--Button enviar-->
                    <div class="m-1">
                        <input type="submit" class="btn btn-primary " value="Enviar">
                        <input type="reset" class="btn btn-primary" value="Limpar">
                    </div>
                </form>
            </div>
        </main>
    </div>
    <!-- FIM DO CADASTRO -->
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