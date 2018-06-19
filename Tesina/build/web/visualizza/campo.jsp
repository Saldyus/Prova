<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<html>
    <head>
        <title>Visualizza</title>
        <link rel="icon" href="../image/Visualizza.png" type="image/jpg" />
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
        <meta name="description" content="" />
        <meta name="keywords" content="" />
        <link rel="stylesheet" href="../assets/css/main.css" />
    </head>
    <body class="is-preload" onload="getCampo()">
        <%
            if (session.getAttribute("online") == null) {
                response.sendRedirect("../Login.jsp");
            }
        %> 
        <!-- Header -->
        <header id="header">
            <a class="logo" href="../Homepage.jsp">Homepage</a>
            <nav>
                <a href="#menu">Menu</a>
            </nav>
        </header>

        <!-- Nav -->
        <nav id="menu">
            <ul class="links">
                <li><a href="../Aggiungi.jsp">Aggiungi</a></li>
                <li><a href="../Elimina.jsp">Elimina</a></li>
                <li><a href="../Modifica.jsp">Modifica</a></li>
                <li><a href="campo.jsp">Visualizza</a></li>
                <li><a href="#" onclick="logout()">Logout</a></li>
            </ul>
        </nav>


        <!--Grid-->    
        <div class="container">
            <div class="row">
                <h2>Visualizzazione di tutti i campi</h2>
            </div>
            <div class="row">
                <h3 class="text-center text-primary"></h3>
                <div class="col-md-12">
                    <form action="${pageContext.request.contextPath}/SeeFormanoServlet" method="POST">
                        <table class="table table-hover" id="worked">
                            <thead>
                                <tr>
                                    <th>Nome del campo</th>
                                    <th>Zona</th>
                                    <th>UPA</th>
                                    <th>Superficie</th>
                                </tr>
                            </thead>
                            <tbody id="body">

                            </tbody>
                        </table>
                    </form>
                </div>
            </div>
        </div>


        <!--Buttons-->
        <script src="https://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href='https://fonts.googleapis.com/css?family=Montserrat:700' rel='stylesheet' type='text/css'>

        <!-- Scripts -->
        <script src="../assets/js/jquery.min.js"></script>
        <script src="../assets/js/browser.min.js"></script>
        <script src="../assets/js/breakpoints.min.js"></script>
        <script src="../assets/js/util.js"></script>
        <script src="../assets/js/main.js"></script>
        <script src="../assets/js/grid.js"></script>?
        <script type="text/javascript">
                    function indietro() {
                        window.location.href = "../Elimina.jsp";
                    }

                    function mappale(nome) {
                        $.ajax({
                            type: 'POST',
                            url: "${pageContext.request.contextPath}/SeeFormanoServlet",
                            data: "nome=" + nome,
                            success: function (risposta) {

                            },
                            error: function () {
                                alert("Chiamata fallita!!!");
                            }
                        });
                    }

                    function logout() {
                        $.ajax({
                            type: 'POST',
                            url: "${pageContext.request.contextPath}/LogoutServlet",
                            data: "logout=true",
                            success: function (risposta) {
                                window.location.href = "../Login.jsp";
                            },
                            error: function () {
                                alert("Chiamata fallita!!!");
                            }
                        });
                    }

                    function getCampo() {
                        $.ajax({
                            type: "GET",
                            url: "${pageContext.request.contextPath}/SeeCampoServlet",
                            data: "",
                            success: function (risposta) {
                                var html = "";
                                var i = 0;
                                for (i in risposta.campi) {
                                    html += "<td>" + risposta.campi[i].nome + "</td>"
                                            + "<td>" + risposta.campi[i].zona + "</td>"
                                            + "<td>" + risposta.campi[i].UPA + "</td>"
                                            + "<td>" + risposta.campi[i].superficie + "</td>"
                                            + "<td><button type=\"submit\" class=\"btn btn-blue\" name=\"" + risposta.campi[i].nome + "\">Mappali</button></td>"
                                            + "<td><button type=\"button\" class=\"btn btn-blue\" onclick=\"concimazioni('" + risposta.campi[i].nome + "')\">Concimazioni</button></td>"
                                            + "<td><button type=\"button\" class=\"btn btn-blue\" onclick=\"trfit('" + risposta.campi[i].nome + "')\">Trattamenti Fitofarmaci</button></td>"
                                            + "<td><button type=\"button\" class=\"btn btn-blue\" onclick=\"lavorazioni('" + risposta.campi[i].nome + "')\">Lavorazioni</button></td>"
                                            + "<td><button type=\"button\" class=\"btn btn-blue\" onclick=\"seminazioni('" + risposta.campi[i].nome + "')\">Seminazioni</button></td>"
                                            + "<td><button type=\"button\" class=\"btn btn-blue\" onclick=\"analisi('" + risposta.campi[i].nome + "')\">Analisi</button></td>"
                                            + "<td><button type=\"button\" class=\"btn btn-blue\" onclick=\"raccolti('" + risposta.campi[i].nome + "')\">Raccolti</button></td>";
                                }
                                document.getElementById("body").innerHTML = html;
                            },
                            error: function () {
                                alert("Chiamata fallita!!!");
                            }
                        });
                    }
        </script>
    </body>
</html>