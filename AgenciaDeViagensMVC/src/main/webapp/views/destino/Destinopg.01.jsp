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
                            <img src="../../assets/IMG/Canadá.png" height="400px" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Alberta, Canadá</h5>
                                <p class="card-text">Quem visita o Canadá aproveita o melhor das cidades que unem
                                    modernidade e harmonia com a natureza.
                                </p>
                                <p>
                                    Programe-se para conhecer Toronto, Vancouver, Quebec, Ottawa e Montreal, entre
                                    muitas outras regiões que oferecem roteiros de compras, aventura, cultura e muita
                                    diversão durante viagens de lazer ou de intercâmbio. Não deixe de conhecer pontos
                                    turísticos como a Catedral de Notre-Dame, em Montreal, o cânion Sainte-Anne e os
                                    diversos castelos concentrados em Quebec, e a famosa CN Tower, em Toronto, cidade
                                    famosa também pelos vários museus e parques belíssimos. Confira os ótimos preços e
                                    garanta agora seu pacote de viagem!
                                </p>
                            </div>
                            <div class="card-footer">
                                <a class="w-100 btn btn-primary"
                                    href="../voos/Voos.jsp" role="button">Seguir para a Área de Embarque</a><br>
                                <small class="text-muted">(Modelo de Demonstração)</small>
                                <li class="list-group-item d-flex justify-content-between bg-light">
                                    <div class="text-success">
                                        <h6 class="my-0">Passagem</h6>
                                    </div>
                                    <span class="text-success"><strong>R$6.866,00</strong></span>
                                </li>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card h-100">
                            <img src="../../assets/IMG/Santorini, Greece.png" height="400px" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Santorini, Grécia</h5>
                                <p class="card-text">Uma das ilhas mais famosas da Grécia, Santorini é conhecida por
                                    conta das casas brancas à beira mar, das igrejas de cúpula azul, das apertadas
                                    vielas decoradas com flores coloridas e, claro, das praias paradisíacas.
                                </p>
                                <p>
                                    Por lá você poderá experimentar pratos gregos em cafés ou restaurantes, ir a
                                    tavernas e apreciar um pôr do sol incrível na Europa. Visite também as praias
                                    exóticas Red Beach e White Beach, ótimas para curtir o verão. Inclua também no seu
                                    roteiro Mykonos, ilha igualmente fantástica.
                                </p>
                            </div>
                            <div class="card-footer">
                                <a class="w-100 btn btn-primary" href="../voos/Voos.jsp" role="button">Seguir
                                    para a Área Embarque</a>
                                <small class="text-muted">(Modelo de Demonstração)</small>
                                <li class="list-group-item d-flex justify-content-between bg-light">
                                    <div class="text-success">
                                        <h6 class="my-0">Passagem</h6>
                                    </div>
                                    <span class="text-success"><strong>R$5.352,00</strong></span>
                                </li>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card h-100">
                            <img src="../../assets/IMG/Roma-Destino.jpg" height="400px" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Roma, Itália.</h5>
                                <p class="card-text">Inúmeras construções seculares fazem com que Roma seja um
                                    verdadeiro museu a céu aberto, como o Coliseu, o Palácio Vitoriano, a Fontana di
                                    Trevi e muitas outras.
                                </p>
                                <p>
                                    Duas atrações são imperdíveis na cidade. A Basílica de São Pedro é considerada a
                                    maior igreja do mundo e abriga a escultura Pietà, de Michelangelo, enquanto o
                                    Vaticano possui museus com vastas coleções de artes e a Capela Sistina com os
                                    afrescos de Michelangelo em seu teto. Reserve hoje mesmo suas passagens aéreas para
                                    Roma e embarque para em uma viagem de história e cultura.
                                </p>
                            </div>
                            <div class="card-footer">
                                <a class="w-100 btn btn-primary" href="../voos/Voos.jsp" role="button">Seguir
                                    para a Área Embarque</a>
                                <small class="text-muted">(Modelo de Demonstração)</small>
                                <li class="list-group-item d-flex justify-content-between bg-light">
                                    <div class="text-success">
                                        <h6 class="my-0">Passagem</h6>
                                    </div>
                                    <span class="text-success"><strong>R$6.381,00</strong></span>
                                </li>
                            </div>
                        </div>
                    </div>
            </section>
            <section>
                <div class="row row-cols-1 row-cols-md-3 g-4">
                    <div class="col">
                        <div class="card h-100">
                            <img src="../../assets/IMG/Maldivas.png" height="400px" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Ilhas Maldivas, Ásia Meridional.</h5>
                                <p class="card-text">
                                    Com praias de mar azul e quente, o arquipélago das Maldivas é composto por mais de
                                    mil ilhas e fica localizado no Oceano Índico. A capital Male tem excelente
                                    infraestrutura e possui boas opções de mobilidade entre os atóis, como Kurumba,
                                    Bandos e Furana.
                                </p>
                                <p>
                                    Aproveite para praticar mergulho, stand-up paddle, passear de
                                    caiaque e de bike. A culinária asiática e tailandesa é um dos pontos altos da viagem
                                    para as Maldivas, oferecendo uma experiência gastronômica muito interessante.
                                </p>
                            </div>
                            <div class="card-footer">
                                <a class="w-100 btn btn-primary"
                                    href="../voos/Voos.jsp" role="button">Seguir para a Área de Embarque</a>
                                <small class="text-muted">(Modelo de Demonstração)</small>
                                <li class="list-group-item d-flex justify-content-between bg-light">
                                    <div class="text-success">
                                        <h6 class="my-0">Passagem</h6>
                                    </div>
                                    <span class="text-success"><strong>R$7.277,00</strong></span>
                                </li>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card h-100">
                            <img src="../../assets/IMG/Paris-Destino.jpg" height="400px" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Paris, França.</h5>
                                <p class="card-text">Um dos destinos mais românticos do mundo, Paris atrai muitos
                                    turistas por conta de seus museus, gastronomia ímpar, monumentos importantes e por
                                    todas as histórias que cercam a capital da França.</p>
                                <p>
                                    Entre os cartões-postais mais importantes que você verá estão a Torre Eiffel, o
                                    Museu do Louvre, o Arco do Triunfo
                                    e a Catedral de Notre-Dame. Aproveite também para ver espetáculos na Ópera Garnier e
                                    shows de cabarés no Moulin Rouge, além de experimentar pratos deliciosos em
                                    restaurantes consagrados.
                                </p>
                            </div>
                            <div class="card-footer">
                                <a class="w-100 btn btn-primary"
                                    href="../voos/Voos.jsp" role="button">Seguir para a Área de Embarque</a>
                                <small class="text-muted">(Modelo de Demonstração)</small>
                                <li class="list-group-item d-flex justify-content-between bg-light">
                                    <div class="text-success">
                                        <h6 class="my-0">Passagem</h6>
                                    </div>
                                    <span class="text-success"><strong>R$7.487,00</strong></span>
                                </li>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card h-100">
                            <img src="../../assets/IMG/Machu -Destino.jpg" height="400px" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">Machu Picchu, Peru.</h5>
                                <p class="card-text"> Mística e fascinante. Machu Picchu proporciona um mergulho na
                                    época da civilização inca com seus monumentos de pedra sobre uma montanha e a
                                    espetacular vista do Rio Urubamba, que contorna o Valle Sagrado, com terras férteis
                                    e vilarejos típicos entre Cusco e Aguas Calientes.
                                </p>
                                <p>
                                    A região, cercada por vales, fica a mais de 2 mil metros acima do nível do mar e se
                                    tornou um dos destinos mais procurado nas Américas entre os apaixonados por
                                    aventura. Com visual inesquecível, a viagem rende passeios de trem, trilhas e visita
                                    a templos milenares.
                                </p>
                            </div>
                            <div class="card-footer">
                                <a class="w-100 btn btn-primary" href="../voos/Voos.jsp" role="button">Seguir
                                    para a Área Embarque</a>
                                <small class="text-muted">(Modelo de Demonstração)</small>
                                <li class="list-group-item d-flex justify-content-between bg-light">
                                    <div class="text-success">
                                        <h6 class="my-0">Passagem</h6>
                                    </div>
                                    <span class="text-success"><strong>R$3.112,00</strong></span>
                                </li>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- FIM DA ÁREA DE DESTINO -->
                <!-- INÍCIO DA ÁREA DE MUDANÇA DE PÁGINA -->
                <div class="container">
                    <ul class="pagination justify-content-center">
                        <li class="page-item disabled">
                            <a class="page-link">Anterior</a>
                        </li>
                        <li class="page-item active"><a class="page-link" href="Destinopg.01.jsp">1</a></li>
                        <li class="page-item" aria-current="page">
                            <a class="page-link" href="Destinopg.02.jsp">2</a>
                        </li>
                        <li class="page-item">
                            <a class="page-link" href="Destinopg.02.jsp">Próximo</a>
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