<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!doctype html>
<html lang="pt-br">

<head>
    <title>Passagem</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
        integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <link rel="stylesheet" href="../../assets/CSS/Passagem.css"> 
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
				            <a class="nav-link" href="../pagamento/PagamentoD01.jsp">Pagamento</a>
				            <a class="nav-link active" aria-current="page" href="Passagem.jsp">Passagem</a>
                            <a class="nav-link" href="../contato/Contato.jsp">Contato</a>               
				            <a class="nav-link" href="../sobre/Sobre.jsp">Sobre</a>
                        </div>
                    </div>
                </div>
            </nav>
        </header>
        <!-- FIM BARRA DE NAVEGAÇÃO -->
        <!-- INÍCIO DA ÁREA DE EMBARQUE -->
        <main>
            <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="../../assets/IMG/passagem.jpg" class="d-block w-100"
                            style="height: 1000px; object-fit: cover;" alt="...">
                        <div class="container">
                            <div class="carousel-caption col-auto p-lg-5 mx-auto my-5 text-white">
                                <div class="row mb-2  p-1">
                                    <div class="container col-md-6">
                                        <div
                                            class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
                                            <div class="col p-4 d-flex flex-column position-static">
                                                <h1 class="text-white">Cartão de Embarque</h1>
                                                <form action="">
                                                    <!--Nome-->
                                                    <div class="mb-3">
                                                        <label for="nome" class="form-label text-white">Nome:</label>
                                                        <input type="text" name="nome" id="nome" class="form-control"
                                                            required placeholder="Nome:">
                                                    </div>
                                                    <!--Horário da Viagem-->
                                                    <div class="mb-3">
                                                        <label for="hora" class="form-label text-white">Horário da
                                                            Viagem:</label>
                                                        <input type="time" name="hora" id="data" class="form-control">
                                                    </div>
                                                    <!--Local de Origem-->
                                                    <div class="mb-3">
                                                        <label for="origem" class="form-label text-white">Local de
                                                            Origem:</label>
                                                        <select class="form-select" aria-label="Default select example">
                                                            <option selected>Escolha um Estado:</option>
                                                            <option value="1">Rio de Janeiro</option>
                                                            <option value="2">São Paulo</option>
                                                        </select>
                                                    </div>
                                                    <!--Local do Destino-->
                                                    <div class="mb-3">
                                                        <label for="destino" class="form-label text-white">Local do
                                                            Destino:</label>
                                                        <select class="form-select" aria-label="Default select example">
                                                            <option selected>Escolha um Destino:</option>
                                                            <option value="1">Alberta, Canadá</option>
                                                            <option value="2">Bangkokl, Tailândia</option>
                                                            <option value="3">Chichén-Itzá, Yuc., Mexico</option>
                                                            <option value="4">Dublin, Irlanda</option>
                                                            <option value="5">Fernando de Noronha, Brasil</option>
                                                            <option value="6">Fujinomiya, Shizuoka, Japão</option>
                                                            <option value="7">Ilhas Maldivas, Ásia Meridional</option>
                                                            <option value="8">Kruger Park, África do Sul</option>
                                                            <option value="9">Lagos, Portugal</option>
                                                            <option value="10">Londres, Inglaterra</option>
                                                            <option value="11">Machu Picchu, Peru</option>
                                                            <option value="12">Madri, Espanha</option>
                                                            <option value="13">Patagônia, Chile</option>
                                                            <option value="14">Rio de Janeiro, Brasil</option>
                                                            <option value="15">Roma, Itália</option>
                                                            <option value="16">São Paulo, Brasil</option>
                                                            <option value="17">Santorini, Grecia</option>
                                                            <option value="18">Torre Eiffel, Paris</option>
                                                        </select>
                                                    </div>
                                                    <!--Data de Ida-->
                                                    <div class="mb-3">
                                                        <label for="data" class="form-label text-white">Data de Ida da
                                                            Viagem:</label>
                                                        <input type="date" name="data" id="data" class="form-control">
                                                    </div>
                                                    <!--Data de Volta-->
                                                    <div class="mb-3">
                                                        <label for="data" class="form-label text-white">Data de Volta da
                                                            Viagem:</label>
                                                        <input type="date" name="data" id="data" class="form-control">
                                                    </div>
                                                    <a class="btn btn-primary btn-lg m-1"
                                                        href="../agradecimento/Agradecimento.jsp" role="button">Confirme!</a>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <!-- FIM DA ÁREA DE EMBARQUE -->
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