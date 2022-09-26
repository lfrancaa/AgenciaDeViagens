<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!doctype html>
<html lang="pt-br">

<head>
    <title>Voos</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
        integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <link rel="stylesheet" href="../../assets/CSS/Voos.css"> 
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
				            <a class="nav-link active" aria-current="page" href="Voos.jsp">Voos</a>
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
        <!-- INÍCIO DO BANNER -->
        <div class="position-relative overflow-hidden md-1 md-1">
            <img src="../../assets/IMG/Aeroporto.jpg" style="height: 700px; width: 100%;">
        </div>
        <!-- FIM DO BANNER -->
        <!-- INÍCIO DA ÁREA DE VOO -->
        <main class="container d-flex justify-content-center flex-column p-3">

            <thead class="table  table-striped">
                <div class="xd">
                    <table class="table">
                        <thead class="table table-dark table-striped">
                            <tr>
                                <th class="col">Linha Aérea</th>
                                <td class="col">Origem</td>
                                <td class="col">Destino</td>
                                <td class="col">Partida</td>
                                <td class="col">Chegada</td>
                                <td class="col">Paradas</td>
                                <td class="col">Preço</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><img src="../../assets/IMG/AZUL-AIRLINES.png" width="120px" height="45px"></td>
                                <td>Rio de Janeiro</td>
                                <td>Alberta, Canadá</td>
                                <td>07:10 10/08/22</td>
                                <td>17:10 10/08/22</td>
                                <td>1</td>
                                <td>R$5.277,00</td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="p-1">
                        <a class="btn btn-warning text-light m-1" href="../pagamento/PagamentoD01.jsp"
                            role="button">Finalizar Comprar</a>
                        <a class="btn btn-primary m-1" href="../hoteis/Hoteis.jsp" role="button">Seguir para a Área
                            de
                            Hospedagem</a>
                    </div>
                    <table class="table">
                        <thead class="table table-dark table-striped">
                            <tr>
                                <th class="col">Linha Aérea</th>
                                <td class="col">Origem</td>
                                <td class="col">Destino</td>
                                <td class="col">Partida</td>
                                <td class="col">Chegada</td>
                                <td class="col">Paradas</td>
                                <td class="col">Preço</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><img src="../../assets/IMG/LATAM.png" width="120px" height="45px"></td>
                                <td>Rio de Janeiro</td>
                                <td>Santorini, Grécia</td>
                                <td>12:00 08/08/22</td>
                                <td>04:00 10/08/22</td>
                                <td>4</td>
                                <td>R$6.007,00</td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="p-1">
                        <a class="btn btn-warning text-light m-1" href="../pagamento/PagamentoD01.jsp"
                            role="button">Finalizar Comprar</a>
                        <a class="btn btn-primary m-1" href="../hoteis/Hoteis.jsp" role="button">Seguir para a Área
                            de
                            Hospedagem</a>
                    </div>
                    <table class="table">
                        <thead class="table table-dark table-striped">
                            <tr>
                                <th class="col">Linha Aérea</th>
                                <td class="col">Origem</td>
                                <td class="col">Destino</td>
                                <td class="col">Partida</td>
                                <td class="col">Chegada</td>
                                <td class="col">Paradas</td>
                                <td class="col">Preço</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><img src="../../assets/IMG/AZUL-AIRLINES.png" width="120px" height="45px"></td>
                                <td>São Paulo(GRU)</td>
                                <td>Roma, Itália</td>
                                <td>10:00 13/07/22</td>
                                <td>21:16 13/07/22</td>
                                <td>3</td>
                                <td>R$7.956,00</td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="p-1">
                        <a class="btn btn-warning text-light m-1" href="../pagamento/PagamentoD01.jsp"
                            role="button">Finalizar Comprar</a>
                        <a class="btn btn-primary m-1" href="../hoteis/Hoteis.jsp" role="button">Seguir para a Área
                            de
                            Hospedagem</a>
                    </div>
                    <table class="table">
                        <thead class="table table-dark table-striped">
                            <tr>
                                <th class="col">Linha Aérea</th>
                                <td class="col">Origem</td>
                                <td class="col">Destino</td>
                                <td class="col">Partida</td>
                                <td class="col">Chegada</td>
                                <td class="col">Paradas</td>
                                <td class="col">Preço</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><img src="../../assets/IMG/GOL.png" width="120px" height="45px"></td>
                                <td>Rio de Janeiro</td>
                                <td>Ilhas Maldivas, Ásia</td>
                                <td>10:00 09/10/22</td>
                                <td>02:00 10/10/22</td>
                                <td>1</td>
                                <td>R$9.418,00</td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="p-1">
                        <a class="btn btn-warning text-light m-1" href="../pagamento/PagamentoD01.jsp"
                            role="button">Finalizar Comprar</a>
                        <a class="btn btn-primary m-1" href="../hoteis/Hoteis.jsp" role="button">Seguir para a Área
                            de
                            Hospedagem</a>
                    </div>
                    <table class="table">
                        <thead class="table table-dark table-striped">
                            <tr>
                                <th class="col">Linha Aérea</th>
                                <td class="col">Origem</td>
                                <td class="col">Destino</td>
                                <td class="col">Partida</td>
                                <td class="col">Chegada</td>
                                <td class="col">Paradas</td>
                                <td class="col">Preço</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><img src="../../assets/IMG/LATAM.png" width="120px" height="45px"></td>
                                <td>São Paulo(GRU)</td>
                                <td>Paris, França</td>
                                <td>09:10 12/10/22</td>
                                <td>20:10 12/10/22</td>
                                <td>2</td>
                                <td>R$3.592,00</td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="p-1">
                        <a class="btn btn-warning text-light m-1" href="../pagamento/PagamentoD01.jsp"
                            role="button">Finalizar Comprar</a>
                        <a class="btn btn-primary m-1" href="../hoteis/Hoteis.jsp" role="button">Seguir para a Área
                            de
                            Hospedagem</a>
                    </div>
                    <table class="table">
                        <thead class="table table-dark table-striped">
                            <tr>
                                <th class="col">Linha Aérea</th>
                                <td class="col">Origem</td>
                                <td class="col">Destino</td>
                                <td class="col">Partida</td>
                                <td class="col">Chegada</td>
                                <td class="col">Paradas</td>
                                <td class="col">Preço</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><img src="../../assets/IMG/GOL.png" width="120px" height="45px"></td>
                                <td>São Paulo(GRU)</td>
                                <td>Machu Picchu, Peru</td>
                                <td>13:10 12/10/22</td>
                                <td>22:10 12/10/22</td>
                                <td>2</td>
                                <td>R$1.634,00</td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="p-1">
                        <a class="btn btn-warning text-light m-1" href="../pagamento/PagamentoD01.jsp"
                            role="button">Finalizar Comprar</a>
                        <a class="btn btn-primary m-1" href="../hoteis/Hoteis.jsp" role="button">Seguir para a Área
                            de
                            Hospedagem</a>
                    </div>
                    <table class="table">
                        <thead class="table table-dark table-striped">
                            <tr>
                                <th class="col">Linha Aérea</th>
                                <td class="col">Origem</td>
                                <td class="col">Destino</td>
                                <td class="col">Partida</td>
                                <td class="col">Chegada</td>
                                <td class="col">Paradas</td>
                                <td class="col">Preço</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><img src="../../assets/IMG/GOL.png" width="120px" height="45px"></td>
                                <td>São Paulo(GRU)</td>
                                <td>Fernando de Noronha, Brasil</td>
                                <td>10:00 13/07/22</td>
                                <td>14:00 13/07/22</td>
                                <td>1</td>
                                <td>R$1.375,00</td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="p-1">
                        <a class="btn btn-warning text-light m-1" href="../pagamento/PagamentoD01.jsp"
                            role="button">Finalizar Comprar</a>
                        <a class="btn btn-primary m-1" href="../hoteis/Hoteis.jsp" role="button">Seguir para a Área
                            de
                            Hospedagem</a>
                    </div>
                    <table class="table">
                        <thead class="table table-dark table-striped">
                            <tr>
                                <th class="col">Linha Aérea</th>
                                <td class="col">Origem</td>
                                <td class="col">Destino</td>
                                <td class="col">Partida</td>
                                <td class="col">Chegada</td>
                                <td class="col">Paradas</td>
                                <td class="col">Preço</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><img src="../../assets/IMG/LATAM.png" width="120px" height="45px"></td>
                                <td>São Paulo(GRU)</td>
                                <td>Rio de Janeiro</td>
                                <td>15:10 12/10/22</td>
                                <td>16:10 12/10/22</td>
                                <td>1</td>
                                <td>R$913,00</td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="p-1">
                        <a class="btn btn-warning text-light m-1" href="../pagamento/PagamentoD01.jsp"
                            role="button">Finalizar Comprar</a>
                        <a class="btn btn-primary m-1" href="../hoteis/Hoteis.jsp" role="button">Seguir para a Área
                            de
                            Hospedagem</a>
                    </div>
                    <table class="table">
                        <thead class="table table-dark table-striped">
                            <tr>
                                <th class="col">Linha Aérea</th>
                                <td class="col">Origem</td>
                                <td class="col">Destino</td>
                                <td class="col">Partida</td>
                                <td class="col">Chegada</td>
                                <td class="col">Paradas</td>
                                <td class="col">Preço</td>
                            </tr>
                        </thead>
                        <tr>
                            <td><img src="../../assets/IMG/LATAM.png" width="120px" height="45px"></td>
                            <td>Rio de Janeiro</td>
                            <td>São Paulo(GRU)</td>
                            <td>15:10 10/08/22</td>
                            <td>16:10 10/08/22</td>
                            <td>1</td>
                            <td>R$913,00</td>
                        </tr>
                        </tbody>
                    </table>
                    <div class="p-1">
                        <a class="btn btn-warning text-light m-1" href="../pagamento/PagamentoD01.jsp"
                            role="button">Finalizar Comprar</a>
                        <a class="btn btn-primary m-1" href="../hoteis/Hoteis.jsp" role="button">Seguir para a Área
                            de
                            Hospedagem</a>
                    </div>
                    <table class="table">
                        <thead class="table table-dark table-striped">
                            <tr>
                                <th class="col">Linha Aérea</th>
                                <td class="col">Origem</td>
                                <td class="col">Destino</td>
                                <td class="col">Partida</td>
                                <td class="col">Chegada</td>
                                <td class="col">Paradas</td>
                                <td class="col">Preço</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><img src="../../assets/IMG/AZUL-AIRLINES.png" width="120px" height="45px"></td>
                                <td>São Paulo(GRU)</td>
                                <td>Fujinomiya, Japão</td>
                                <td>10:00 12/07/22</td>
                                <td>10:00 13/07/22</td>
                                <td>4</td>
                                <td>R$13.010,00</td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="p-1">
                        <a class="btn btn-warning text-light m-1" href="../pagamento/PagamentoD01.jsp"
                            role="button">Finalizar Comprar</a>
                        <a class="btn btn-primary m-1" href="../hoteis/Hoteis.jsp" role="button">Seguir para a Área
                            de
                            Hospedagem</a>
                    </div>
                    <table class="table">
                        <thead class="table table-dark table-striped">
                            <tr>
                                <th class="col">Linha Aérea</th>
                                <td class="col">Origem</td>
                                <td class="col">Destino</td>
                                <td class="col">Partida</td>
                                <td class="col">Chegada</td>
                                <td class="col">Paradas</td>
                                <td class="col">Preço</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><img src="../../assets/IMG/GOL.png" width="120px" height="45px"></td>
                                <td>Rio de Janeiro</td>
                                <td>Londres, Inglaterra</td>
                                <td>10:00 12/10/22</td>
                                <td>21:00 12/10/22</td>
                                <td>2</td>
                                <td>R$6.459,00</td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="p-1">
                        <a class="btn btn-warning text-light m-1" href="../pagamento/PagamentoD01.jsp"
                            role="button">Finalizar Comprar</a>
                        <a class="btn btn-primary m-1" href="../hoteis/Hoteis.jsp" role="button">Seguir para a Área
                            de
                            Hospedagem</a>
                    </div>
                    <table class="table">
                        <thead class="table table-dark table-striped">
                            <tr>
                                <th class="col">Linha Aérea</th>
                                <td class="col">Origem</td>
                                <td class="col">Destino</td>
                                <td class="col">Partida</td>
                                <td class="col">Chegada</td>
                                <td class="col">Paradas</td>
                                <td class="col">Preço</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><img src="../../assets/IMG/LATAM.png" width="120px" height="45px"></td>
                                <td>São Paulo(GRU)</td>
                                <td>Madrid, Espanha)</td>
                                <td>08:00 10/08/22</td>
                                <td>18:00 10/08/22</td>
                                <td>3</td>
                                <td>R$8.708,00</td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="p-1">
                        <a class="btn btn-warning text-light m-1" href="../pagamento/PagamentoD01.jsp"
                            role="button">Finalizar Comprar</a>
                        <a class="btn btn-primary m-1" href="../hoteis/Hoteis.jsp" role="button">Seguir para a Área
                            de
                            Hospedagem</a>
                    </div>
                    <table class="table">
                        <thead class="table table-dark table-striped">
                            <tr>
                                <th class="col">Linha Aérea</th>
                                <td class="col">Origem</td>
                                <td class="col">Destino</td>
                                <td class="col">Partida</td>
                                <td class="col">Chegada</td>
                                <td class="col">Paradas</td>
                                <td class="col">Preço</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><img src="../../assets/IMG/AZUL-AIRLINES.png" width="120px" height="45px"></td>
                                <td>Rio de Janeiro</td>
                                <td>Chichén-Itzá, Mexico</td>
                                <td>12:10 13/07/22</td>
                                <td>23:10 13/07/22</td>
                                <td>2</td>
                                <td>R$5.623,00</td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="p-1">
                        <a class="btn btn-warning text-light m-1" href="../pagamento/PagamentoD01.jsp"
                            role="button">Finalizar Comprar</a>
                        <a class="btn btn-primary m-1" href="../hoteis/Hoteis.jsp" role="button">Seguir para a Área
                            de
                            Hospedagem</a>
                    </div>
                    <table class="table">
                        <thead class="table table-dark table-striped">
                            <tr>
                                <th class="col">Linha Aérea</th>
                                <td class="col">Origem</td>
                                <td class="col">Destino</td>
                                <td class="col">Partida</td>
                                <td class="col">Chegada</td>
                                <td class="col">Paradas</td>
                                <td class="col">Preço</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><img src="../../assets/IMG/GOL.png" width="120px" height="45px"></td>
                                <td>São Paulo(GRU)</td>
                                <td>Bangkokl, Tailândia</td>
                                <td>08:00 12/10/22</td>
                                <td>20:00 12/10/22</td>
                                <td>4</td>
                                <td>R$10.029,00</td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="p-1">
                        <a class="btn btn-warning text-light m-1" href="../pagamento/PagamentoD01.jsp"
                            role="button">Finalizar Comprar</a>
                        <a class="btn btn-primary m-1" href="../hoteis/Hoteis.jsp" role="button">Seguir para a Área
                            de
                            Hospedagem</a>
                    </div>
                    <table class="table">
                        <thead class="table table-dark table-striped">
                            <tr>
                                <th class="col">Linha Aérea</th>
                                <td class="col">Origem</td>
                                <td class="col">Destino</td>
                                <td class="col">Partida</td>
                                <td class="col">Chegada</td>
                                <td class="col">Paradas</td>
                                <td class="col">Preço</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><img src="../../assets/IMG/LATAM.png" width="120px" height="45px"></td>
                                <td>Rio de Janeiro</td>
                                <td>Dublin, Irlanda</td>
                                <td>13:10 12/10/22</td>
                                <td>23:10 12/10/22</td>
                                <td>2</td>
                                <td>R$7.253,00</td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="p-1">
                        <a class="btn btn-warning text-light m-1" href="../pagamento/PagamentoD01.jsp"
                            role="button">Finalizar Comprar</a>
                        <a class="btn btn-primary m-1" href="../hoteis/Hoteis.jsp" role="button">Seguir para a Área
                            de
                            Hospedagem</a>
                    </div>
                </div>
        </main>
        <!-- FIM DA ÁREA DE VOO -->
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