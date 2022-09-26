<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!doctype html>
<html lang="pt-br">

<head>
    <title>Hotéis</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
        integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <link rel="stylesheet" href="../../assets/CSS/Hoteis.css">
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
				            <a class="nav-link active" aria-current="page" href="Hoteis.jsp">Hotéis</a>
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
        <!-- INÍCIO DO BANNER -->
        <div class="position-relative overflow-hidden md-1 md-1">
            <img src=" ../../assets/IMG/Hotel.jpg" style="height: 700px; width: 100%;">
        </div>
        <!-- FIM DO BANNER -->
        <!--INÍCIO DA ÁREA DE HOTÉIS -->
        <main>
            <div class="container">
                <div class="row mb-2">
                    <div class="col-md-6">
                        <div
                            class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
                            <div class="col p-4 d-flex flex-column position-static">
                                <strong class="d-inline-block mb-2 text-primary">Alberta, Canadá</strong>
                                <h3 class="mb-0">The Ritz-Carlton Hotel</h3>
                                <p class="card-text mb-auto">O The Ritz-Carlton é uma hospedagem cinco estrelas no
                                    centro de Toronto, próximo de diversos pontos turísticos. No local, você encontra
                                    sauna, salão de beleza, centro de spa, espaço kids e lareira ao ar livre. Os quartos
                                    são equipados com muito luxo e contam com uma bela vista da cidade, além de
                                    disponibilizarem muito mais.</p>
                            </div>
                            <div class="container">
                                <div class="text-success">
                                    <strong>Diárias a partir de R$932,00</strong>
                                    <a class="float-end btn btn-warning btn btn-outline-light m-1"
                                        href="../pagamento/PagamentoD01.jsp" role="button">Finalizar Comprar</a>
                                </div>
                            </div>
                            <div class="d-lg-block">
                                <img src=" ../../assets/IMG/Canadá.jpg" width="100%" height="250">
                                </img>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div
                            class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
                            <div class="col p-4 d-flex flex-column position-static">
                                <strong class="d-inline-block mb-2 text-primary">Santorini, Grécia</strong>
                                <h3 class="mb-0">Katikies Garden Hotel</h3>
                                <p class="card-text mb-auto">Um dos principais cartões postais da Grécia, é uma parada
                                    indispensável em seu roteiro pelo país. O Katikies Garden Hotel fica localizado nos
                                    rochedos de Oia e possui dois excelentes restaurantes com vista para a caldeira. O
                                    hotel presenteia os hóspedes com vinho e frutas nos quartos privativos na chegada.
                                </p>
                            </div>
                            <div class="container">
                                <div class="text-success">
                                    <strong>Diárias a partir de R$1.100,00</strong>
                                    <a class="float-end btn btn-warning btn btn-outline-light m-1"
                                        href="../pagamento/PagamentoD01.jsp" role="button">Finalizar Comprar</a>
                                </div>
                            </div>
                            <div class="d-lg-block">
                                <img src=" ../../assets/IMG/Grécia.jpg" width="100%" height="250">
                                </img>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div
                            class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
                            <div class="col p-4 d-flex flex-column position-static">
                                <strong class="d-inline-block mb-2 text-primary">Roma, Itália</strong>
                                <h3 class="mb-0">The Wesley Rome Hotel</h3>
                                <p class="card-text mb-auto">As regiões perto da Fonte de Trevi, do Coliseu, do Fórum
                                    Romano, Fórum Imperial e da Villa Borghese, da Piazza Spagna e da Piazza Navona.
                                    Estão próximo de tudo, literalmente! São inúmeros os sítios arqueológicos
                                    localizados no centro histórico de Roma, como o Foro Romano e o
                                    Coliseu (que representa o símbolo da cidade).</p>
                            </div>
                            <div class="container">
                                <div class="text-success">
                                    <strong>Diárias a partir de R$700,00</strong>
                                    <a class="float-end btn btn-warning btn btn-outline-light m-1"
                                        href="../pagamento/PagamentoD01.jsp" role="button">Finalizar Comprar</a>
                                </div>
                            </div>
                            <div class="d-lg-block">
                                <img src=" ../../assets/IMG/Italia.jpg" width="100%" height="250">
                                </img>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div
                            class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
                            <div class="col p-4 d-flex flex-column position-static">
                                <strong class="d-inline-block mb-2 text-primary">Ilhas Maldivas, Ásia
                                    Meridional</strong>
                                <h3 class="mb-0">Gili Lankanfushi Maldives Hotel</h3>
                                <p class="card-text mb-auto">Pensou em um destino capa de revista, super-romântico, com
                                    algumas das praias mais fabulosas do planeta, com aquele azul turquesa de doer nos
                                    olhos, com alguns dos hotéis mais incríveis do mundo: pode ter certeza que esse
                                    destino é as Maldivas, essas ilhas possuem um território com 26 atóis.</p>
                            </div>
                            <div class="container">
                                <div class="text-success">
                                    <strong>Diárias a partir de R$1.200,00</strong>
                                    <a class="float-end btn btn-warning btn btn-outline-light m-1"
                                        href="../pagamento/PagamentoD01.jsp" role="button">Finalizar Comprar</a>
                                </div>
                            </div>
                            <div class="d-lg-block">
                                <img src=" ../../assets/IMG/Ilhas Maldivas.jpg" width="100%" height="250">
                                </img>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div
                            class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
                            <div class="col p-4 d-flex flex-column position-static">
                                <strong class="d-inline-block mb-2 text-primary">Paris, França</strong>
                                <h3 class="mb-0">Mayfair Paris Hotel</h3>
                                <p class="card-text mb-auto">Uma opção que mistura o clássico e o moderno num prédio
                                    clássico de estilo haussmaniano. Os quartos são super charmosos, bem decorados e
                                    totalmente equipados. A localização é ótima, com metrôs próximos e, além disso, o
                                    hotel fica a apenas dois minutos a pé do Jardim das Tulherias. É possível desfrutar
                                    de um bom café da manhã na hospedagem.</p>
                            </div>
                            <div class="container">
                                <div class="text-success">
                                    <strong>Diárias a partir de R$992,00</strong>
                                    <a class="float-end btn btn-warning btn btn-outline-light m-1"
                                        href="../pagamento/PagamentoD01.jsp" role="button">Finalizar Comprar</a>
                                </div>
                            </div>
                            <div class="d-lg-block">
                                <img src=" ../../assets/IMG/França.H.jpg" width="100%" height="250">
                                </img>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div
                            class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
                            <div class="col p-4 d-flex flex-column position-static">
                                <strong class="d-inline-block mb-2 text-primary">Machu Picchu, Peru</strong>
                                <h3 class="mb-0">Sumaq Machu Picchu Hotel</h3>
                                <p class="card-text mb-auto">A grande maioria das hospedagens para o Santuário Histórico
                                    fica num vilarejo conhecido como Machu Picchu Pueblo, ou Aguas Calientes. Para quem
                                    preza pelo máximo conforto, o Sumaq Machu Picchu Hotel é uma das melhores escolhas
                                    para se hospedar na viagem para as ruínas incas, possui frigobar, televisão com serviço de streaming.</p>
                            </div>
                            <div class="container">
                                <div class="text-success">
                                    <strong>Diárias a partir de R$2.348,00</strong>
                                    <a class="float-end btn btn-warning btn btn-outline-light m-1"
                                        href="../pagamento/PagamentoD01.jsp" role="button">Finalizar Comprar</a>
                                </div>
                            </div>
                            <div class="d-lg-block">
                                <img src=" ../../assets/IMG/Peru.jpg" width="100%" height="250">
                                </img>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div
                            class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
                            <div class="col p-4 d-flex flex-column position-static">
                                <strong class="d-inline-block mb-2 text-primary">Fernando de Noronha, Brasil</strong>
                                <h3 class="mb-0">Pousada Corveta</h3>
                                <p class="card-text mb-auto">Muito bem avaliada, a nota dos hóspedes que já passaram
                                    pela Pousada Corveta não deixa dúvidas quanto a qualidade da hospedagem. As
                                    instalações são novas e aconchegantes, exalando charme e modernidade desde a parte
                                    externa do local. Esta pousada é daquele tipo que dá atenção aos detalhes, agradando
                                    os visitantes com mimos como sobremesas no quarto.</p>
                            </div>
                            <div class="container">
                                <div class="text-success">
                                    <strong>Diárias a partir de R$542,00</strong>
                                    <a class="float-end btn btn-warning btn btn-outline-light m-1"
                                        href="../pagamento/PagamentoD01.jsp" role="button">Finalizar Comprar</a>
                                </div>
                            </div>
                            <div class="d-lg-block">
                                <img src=" ../../assets/IMG/FN.jpg" width="100%" height="250">
                                </img>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div
                            class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
                            <div class="col p-4 d-flex flex-column position-static">
                                <strong class="d-inline-block mb-2 text-primary">Rio de Janeiro, Brasil</strong>
                                <h3 class="mb-0">Arena Leme Hotel</h3>
                                <p class="card-text mb-auto">Começando com o Arena Leme Hotel a poucos metros da praia,
                                    esta hospedagem oferece instalações sofisticadas a um preço acessível. Inclui buffet
                                    de café da manhã na diária e suas acomodações são aconchegantes, pet-friendly e bem
                                    decoradas, equipadas com mesa para trabalhar e vista para o mar, no
                                    hotel é possível usufruir de uma piscina na cobertura.</p>
                            </div>
                            <div class="container">
                                <div class="text-success">
                                    <strong>Diárias a partir de R$150,00</strong>
                                    <a class="float-end btn btn-warning btn btn-outline-light m-1"
                                        href="../pagamento/PagamentoD01.jsp" role="button">Finalizar Comprar</a>
                                </div>
                            </div>
                            <div class="d-lg-block">
                                <img src=" ../../assets/IMG/RJ.H.jpg" width="100%" height="250">
                                </img>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div
                            class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
                            <div class="col p-4 d-flex flex-column position-static">
                                <strong class="d-inline-block mb-2 text-primary">São Paulo, Brasil</strong>
                                <h3 class="mb-0">Pousada Bahia Bella</h3>
                                <p class="card-text mb-auto">A Pousada Bahia Bella, ainda que esteja a menos de 100
                                    metros da Segunda Praia, consegue manter um clima reservado e silencioso em meio à
                                    natureza. Oferece quartos com vista para o mar ou para o jardim, piscina com
                                    hidromassagem e um delicioso buffet de café da manhã com vista da piscina.</p>
                            </div>
                            <div class="container">
                                <div class="text-success">
                                    <strong>Diárias a partir de R$230,00</strong>
                                    <a class="float-end btn btn-warning btn btn-outline-light m-1"
                                        href="../pagamento/PagamentoD01.jsp" role="button">Finalizar Comprar</a>
                                </div>
                            </div>
                            <div class="d-lg-block">
                                <img src=" ../../assets/IMG/SP.jpg" width="100%" height="250">
                                </img>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div
                            class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
                            <div class="col p-4 d-flex flex-column position-static">
                                <strong class="d-inline-block mb-2 text-primary">Fujinomiya, Shizuoka, Japão</strong>
                                <h3 class="mb-0">Fujinomiya Fujikyu Hotel</h3>
                                <p class="card-text mb-auto">A capital do país, Tóquio, é uma metrópole imensa, cheia de
                                    atrativos por todos os cantos. Por lá vale a pena passear por bairros emblemáticos,
                                    como Harajuku, e experimentar a culinária tradicional japonesa em alguns
                                    restaurantes, no restante do país existem cenários diversos.</p>
                            </div>
                            <div class="container">
                                <div class="text-success">
                                    <strong>Diárias a partir de R$343,00</strong>
                                    <a class="float-end btn btn-warning btn btn-outline-light m-1"
                                        href="../pagamento/PagamentoD01.jsp" role="button">Finalizar Comprar</a>
                                </div>
                            </div>
                            <div class="d-lg-block">
                                <img src=" ../../assets/IMG/Japão.H.jpg" width="100%" height="250">
                                </img>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div
                            class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
                            <div class="col p-4 d-flex flex-column position-static">
                                <strong class="d-inline-block mb-2 text-primary">Londres, Inglaterra</strong>
                                <h3 class="mb-0">L'oscar Londres Hotel</h3>
                                <p class="card-text mb-auto">O L'oscar Londres, como você pode conferir nas fotos, é
                                    puro luxo. E está situado na região de Covent Garden, onde você encontra com
                                    facilidade lojas, bares e restaurantes, além dos incríveis teatros. O local serve um
                                    excelente café da manhã à la carte. As acomodações contam com ar-condicionado,
                                    frigobar, wi-fi, televisão, secador de cabelo, toalhas e roupas de cama.</p>
                            </div>
                            <div class="container">
                                <div class="text-success">
                                    <strong>Diárias a partir de R$286,00</strong>
                                    <a class="float-end btn btn-warning btn btn-outline-light m-1"
                                        href="../pagamento/PagamentoD01.jsp" role="button">Finalizar Comprar</a>
                                </div>
                            </div>
                            <div class="d-lg-block">
                                <img src=" ../../assets/IMG/Inglaterra.H.jpg" width="100%" height="250">
                                </img>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div
                            class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
                            <div class="col p-4 d-flex flex-column position-static">
                                <strong class="d-inline-block mb-2 text-primary">Madrid, Espanha</strong>
                                <h3 class="mb-0">Safestay Madrid</h3>
                                <p class="card-text mb-auto">O Safestay Madrid tem sido destaque entre a rede
                                    hoteleira do mundo desde sua inauguração. Com arquitetura suntuosa e
                                    uma decoração clássica, que remete ao que há de mais luxuoso entre as construções do
                                    segundo império espanhol, o hotel encanta do início ao fim da estadia. Os quartos
                                    são incríveis e proporcionam conforto máximo, com camas amplas e enxoval Trousseau.
                                </p>
                            </div>
                            <div class="container">
                                <div class="text-success">
                                    <strong>Diárias a partir de R$686,00</strong>
                                    <a class="float-end btn btn-warning btn btn-outline-light m-1"
                                        href="../pagamento/PagamentoD01.jsp" role="button">Finalizar Comprar</a>
                                </div>
                            </div>
                            <div class="d-lg-block">
                                <img src=" ../../assets/IMG/Espanha.H.jpg" width="100%" height="250">
                                </img>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div
                            class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
                            <div class="col p-4 d-flex flex-column position-static">
                                <strong class="d-inline-block mb-2 text-primary">Chichén-Itzá, Yuc., Mexico</strong>
                                <h3 class="mb-0">Canopy By Hilton Cancun La Isla</h3>
                                <p class="card-text mb-auto">O Canopy By Hilton Cancun La Isla é um ótimo exemplo do que
                                    os hotéis em Cancun podem oferecer. Essa acomodação cinco estrelas dispõe de
                                    restaurante, academia, parquinho infantil, centro de spa e bar. Um destaque positivo
                                    dessa hospedagem são suas instalações para PcD, como recursos em braile e orientação
                                    auditiva, o café continental é muito elogiado pelos turistas.</p>
                            </div>
                            <div class="container">
                                <div class="text-success">
                                    <strong>Diárias a partir de R$958,00</strong>
                                    <a class="float-end btn btn-warning btn btn-outline-light m-1"
                                        href="../pagamento/PagamentoD01.jsp" role="button">Finalizar Comprar</a>
                                </div>
                            </div>
                            <div class="d-lg-block">
                                <img src=" ../../assets/IMG/México.H.jpg" width="100%" height="250">
                                </img>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div
                            class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
                            <div class="col p-4 d-flex flex-column position-static">
                                <strong class="d-inline-block mb-2 text-primary">Dublin, Irlanda</strong>
                                <h3 class="mb-0">The Marker Hotel</h3>
                                <p class="card-text mb-auto">O The Marker Hotel é uma super hospedagem cinco estrelas
                                    que dispõe de piscina coberta, sauna, centro de spa e academia. Há também um bar e
                                    um restaurante que serve pratos típicos da Irlanda. Sua localização é próxima de
                                    duas estações de trem. Os quartos são equipados com ar-condicionado, máquina de
                                    café, frigobar, secador de cabelo e televisão.</p>
                            </div>
                            <div class="container">
                                <div class="text-success">
                                    <strong>Diárias a partir de R$751,00</strong>
                                    <a class="float-end btn btn-warning btn btn-outline-light m-1"
                                        href="../pagamento/PagamentoD01.jsp" role="button">Finalizar Comprar</a>
                                </div>
                            </div>
                            <div class="d-lg-block">
                                <img src=" ../../assets/IMG/Irlanda.H.jpg" width="100%" height="250">
                                </img>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <!-- FIM DA ÁREA DE HOTÉIS -->
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