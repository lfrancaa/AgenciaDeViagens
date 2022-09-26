<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<!doctype html>
<html lang="pt-br">

<head>
    <title>Destino</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
        integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <link rel="stylesheet" href="../../assets/CSS/Destino.css">
</head>

<body>
    <div class="home">
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
                            <a class="nav-link active" aria-current="page" href="Destinopg.01.jsp">Destino</a>
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
        <!-- INÍCIO DA ÁREA DE DESTINO -->
        <main class="container">
            <section>
                <div class="row row-cols-1 row-cols-md-3 g-4">
                    <div class="col">
                        <div class="card h-100">
                            <img src="../../assets/IMG/Fernando de Noronha, Pernambuco.jpg" height="400px" class="card-img-top"
                                alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Fernando de Noronha, Brasil</h5>
                                <p class="card-text">Um dos destinos mais procurados no Brasil, a Ilha de Fernando de
                                    Noronha é um lugar que supre qualquer expectativa e deixa os visitantes
                                    completamente encantados.
                                </p>
                                <p>
                                    Paisagens que deslumbram, praias banhadas por águas cristalinas, mergulhos que são
                                    desejados por pessoas do mundo inteiro é um paraíso para os mergulhadores e
                                    santuário da vida marinha. Visitado por golfinhos, Fernando de Noronha encanta
                                    gerações e possui alguns dos cartões-postais mais famosos do Brasil.
                                </p>
                            </div>
                            <div class="card-footer">
                                <a class="w-100 btn btn-primary" href="../voos/Voos.jsp" role="button">Seguir
                                    para a Área de Embarque</a>
                                <small class="text-muted">(Modelo de Demonstração)</small>
                                <li class="list-group-item d-flex justify-content-between bg-light">
                                    <div class="text-success">
                                        <h6 class="my-0">Passagem</h6>
                                    </div>
                                    <span class="text-success"><strong>R$1.300,00</strong></span>
                                </li>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card h-100">
                            <img src="../../assets/IMG/RJ, Brasil.jpg" height="400px" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Rio de Janeiro, Brasil</h5>
                                <p class="card-text">Dono de algumas das praias mais famosas do Brasil e de vistas
                                    espetaculares – graças ao caprichoso encontro de mar, montanhas e Mata Atlântica –,
                                    o Rio de Janeiro continua lindo como sempre. A Cidade Maravilhosa conquista não só
                                    pelas belezas naturais, mas por unir, de um jeito todo próprio, a vibração de uma
                                    capital cosmopolita à cultura praiana.
                                </p>
                                <p>
                                    O Rio tem de tudo: natureza de cartão-postal,
                                    extensas praias para tomar banho de mar e ver a vida passar – caminhando pelo
                                    calçadão de Copacabana ou de bobeira sob um guarda-sol –, bares cheios de
                                    personalidade e um cenário gastronômico dos mais diversos.
                                </p>
                            </div>
                            <div class="card-footer">
                                <a class="w-100 btn btn-primary" href="../voos/Voos.jsp" role="button">Seguir
                                    para a Área de Embarque</a>
                                <small class="text-muted">(Modelo de Demonstração)</small>
                                <li class="list-group-item d-flex justify-content-between bg-light">
                                    <div class="text-success">
                                        <h6 class="my-0">Passagem</h6>
                                    </div>
                                    <span class="text-success"><strong>R$1.150,00</strong></span>
                                </li>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card h-100">
                            <img src="../../assets/IMG/São Paulo, Brasil.jpg" height="400px" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">São Paulo, Brasil</h5>
                                <p class="card-text">São Paulo é o maior destino turístico do Brasil e recebe cerca de
                                    15 milhões de turistas todos os anos. A capital paulistana dispõe de atrações
                                    culturais, históricas, esportivas, educacionais, lugares para curtir e relaxar, se
                                    divertir em família, viajar sozinho ou até mesmo como lua de mel para casais.
                                </p>
                                <p>Assim também são as cidades do interior paulista. Cada uma esbanjando charme e
                                    diversidade à sua maneira. Por isso, se a viagem está destinada às cidades do
                                    Circuito das Águas, do Litoral Norte, do Litoral Sul, da Baixada Santista, do Vale
                                    do Paraíba ou da Região de Barretos, a diversão está garantida.
                                </p>
                            </div>
                            <div class="card-footer">
                                <a class="w-100 btn btn-primary" href="../voos/Voos.jsp" role="button">Seguir
                                    para a Área de Embarque</a>
                                <small class="text-muted">(Modelo de Demonstração)</small>
                                <li class="list-group-item d-flex justify-content-between bg-light">
                                    <div class="text-success">
                                        <h6 class="my-0">Passagem</h6>
                                    </div>
                                    <span class="text-success"><strong>R$1.000,00</strong></span>
                                </li>
                            </div>
                        </div>
                    </div>
            </section>
            <section>
                <div class="row row-cols-1 row-cols-md-3 g-4">
                    <div class="col">
                        <div class="card h-100">
                            <img src="../../assets/IMG/Lagos, Portugal.jpg" height="400px" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Lagos, Portugal</h5>
                                <p class="card-text">Portugal é um destino muito procurado pelos brasileiros,
                                    principalmente para aqueles que pretendem fazer sua primeira viagem à Europa. Talvez
                                    pela facilidade da língua e claro, as inúmeras cidades e atrações turísticas que o
                                    pais oferece.
                                </p>
                                <p>
                                    Cidades, praias ou vinícolas, todos esses pontos valem a pena conhecer em qualquer
                                    época em sua visita ao país. Portugal é um destino com praias, construções
                                    históricas, culinária saborosa e vinhos mundialmente famosos.
                                </p>
                            </div>
                            <div class="card-footer">
                                <a class="w-100 btn bg-secondary border border border-3 text-white page-item disabled"
                                    role="button">Esgotado</a><br>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card h-100">
                            <img src="../../assets/IMG/Patagonia, Chile.jpg" height="400px" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Patagônia, Chile</h5>
                                <p class="card-text">A viagem já começa tirando suspiros ao sobrevoar a bela Cordilheira
                                    dos Andes, que fica ainda mais magnífica quando coberta pela neve do inverno. E as
                                    atrações e passeios são o que não faltam neste país belo e diverso.
                                </p>
                                <p>
                                    Destino repleto de atrações históricas e deliciosa gastronomia, o
                                    Chile é um dos países mais visitados da América do Sul. Por lá você e a sua família
                                    conhecerão ricos museus em Santiago, experimentarão saborosos frutos do mar em
                                    restaurantes badalados, terão a oportunidade de conhecer o impressionante deserto
                                    do Atacama e ainda irão curtir as praias de Viña del Mar.
                                </p>
                            </div>
                            <div class="card-footer">
                                <a class="w-100 btn bg-secondary border border border-3 text-white page-item disabled"
                                    role="button">Esgotado</a><br>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card h-100">
                            <img src="../../assets/IMG/Africa.jpg" height="400px" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Kruger Park, África do Sul.</h5>
                                <p class="card-text">A primeira impressão que se tem ao ouvir falar de um país africano
                                    é de um destino cheio de exotismo, vida selvagem e natureza. Porém isso é apenas o
                                    começo do que se pode desfrutar durante sua visita.
                                </p>
                                <p>
                                    Dona de uma rica fauna e flora, clima tropical à brasileira, país de dois oceanos
                                    (Atlântico e Índico), três capitais (Pretória, a administrativa, Cidade do Cabo, a
                                    legislativa e Bloemfontein, a judiciária), serpenteada por um litoral paradisíaco
                                    quase sempre contornado por uma cadeia de montanhas e, obviamente, detentora dos Big
                                    Five: leão, leopardo, elefante, hipopótamo e rinoceronte.
                                </p>
                            </div>
                            <div class="card-footer">
                                <a class="w-100 btn bg-secondary border border border-3 text-white page-item disabled"
                                    role="button">Esgotado</a><br>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- FIM DA ÁREA DE DESTINO -->
                <!-- INÍCIO DA ÁREA DE MUDANÇA DE PÁGINA -->
                <div class="container">
                    <ul class="pagination justify-content-center">
                        <li class="page-item enable">
                            <a class="page-link" href="Destinopg.01.jsp" tabindex="-1"
                                aria-disabled="true">Anterior</a>
                        </li>
                        <li class="page-item"><a class="page-link" href="Destinopg.01.jsp">1</a></li>
                        <li class="page-item active" aria-current="page">
                            <a class="page-link" href="Destinopg.02.jsp">2</a>
                        </li>
                        <li class="page-item disabled">
                            <a class="page-link">Próximo</a>
                        </li>
                    </ul>
                </div>
            </section>
        </main>
        <!-- FIM DA ÁREA DE MUDANÇA DE PÁGINA -->
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