<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Visualizza</title>
        <link rel="icon" href="image/Visualizza.png" type="image/jpg" />
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
        <meta name="description" content="" />
        <meta name="keywords" content="" />
        <link rel="stylesheet" href="assets/css/main.css" />
    </head>
    <body class="is-preload">
        <%
            if (session.getAttribute("online") == null) {
                response.sendRedirect("Login.jsp");
            }
        %> 
        <!-- Header -->
        <header id="header">
            <a class="logo" href="Homepage.jsp">Homepage</a>
            <nav>
                <a href="#menu">Menu</a>
            </nav>
        </header>

        <!-- Nav -->
        <nav id="menu">
            <ul class="links">
                <li><a href="Aggiungi.jsp">Aggiungi</a></li>
                <li><a href="Elimina.jsp">Elimina</a></li>
                <li><a href="Modifica.jsp">Modifica</a></li>
                <li><a href="visualizza/campo.jsp">Visualizza</a></li>
                <li><a href="#" onclick="logout()">Logout</a></li>
            </ul>
        </nav>


        <!--Grid-->    
        <div class="container">
            <div class="row">
                <h2>Visualizzazione dei mappali</h2>
            </div>
            <div class="row">
                <h3 class="text-center text-primary"></h3>
                <div class="col-md-12">
                    <table class="table table-hover" id="worked">
                        <thead>
                            <tr>
                                <th>ID mappale</th>
                                <th>Comune</th>
                                <th>Superficie</th>
                                <th>Reddito Agrario</th>
                                <th>Reddito Domenicale</th>
                                <th>Foglio</th>
                                <th>Inquinamento</th>
                                <th>Ragione sociale azienda liquami</th>
                            </tr>
                        </thead>
                        <tbody id="body">
                            <c:forEach items="${mappali}" var="map">
                                <tr>
                                    <td>${map.ID_Mappale}</td>
                                    <td>${map.comune}</td>
                                    <td>${map.sup_catastale}</td>
                                    <td>${map.redditoAgrario}</td>
                                    <td>${map.redditoDomenicale}</td>
                                    <td>${map.foglio}</td>
                                    <td>Diossina: ${map.diossina}<br/>PCB: ${map.PCB}<br/>Metalli: ${map.metalli}</td>
                                    <td>${map.ragioneSociale}</td>
                                    <td>
                                        <form action="${pageContext.request.contextPath}/seePossiedeServlet" method="POST">
                                            <button type="submit" class="btn btn-blue" name="mappale" value="${map.ID_Mappale}">Proprietari</button>
                                        </form>
                                    </td>
                                    <td>
                                        <form action="${pageContext.request.contextPath}/seeAzLiquamiServlet" method="POST">
                                            <button type="submit" class="btn btn-blue" name="mappale" value="${map.ID_Mappale}">Azienda Liquami</button>
                                        </form>
                                    </td>
                                    <td>
                                        <form action="${pageContext.request.contextPath}/seeGestisceServlet" method="POST">
                                            <button type="submit" class="btn btn-blue" name="mappale" value="${map.ID_Mappale}">Azienda agricole</button>
                                        </form>
                                    </td>
                                    <td>
                                        <form action="${pageContext.request.contextPath}/seePianificaServlet" method="POST">
                                            <button type="submit" class="btn btn-blue" name="mappale" value="${map.ID_Mappale}">Pianificazioni</button>
                                        </form>
                                    </td>
                                    <td><button type="button" class="btn btn-blue" onclick="visualizza()">Campi</button></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>


        <!--Buttons-->
        <script src="https://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href='https://fonts.googleapis.com/css?family=Montserrat:700' rel='stylesheet' type='text/css'>

        <!-- Scripts -->
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/browser.min.js"></script>
        <script src="assets/js/breakpoints.min.js"></script>
        <script src="assets/js/util.js"></script>
        <script src="assets/js/main.js"></script>
        <script src="assets/js/grid.js"></script>
        <script type="text/javascript">
            function indietro(){
                window.location.href = "Elimina.jsp";
            }
            
            function logout(){
                $.ajax({
                    type: 'POST',
                    url: "${pageContext.request.contextPath}/LogoutServlet",
                    data: "logout=true",
                    success: function (risposta){
                        window.location.href = "Login.jsp";
                    },
                    error: function () {
                        alert("Chiamata fallita!!!");
                    }
                });
            }
            
            function visualizza(){
                window.location.href = "visualizza/campo.jsp";
            }
        </script>
    </body>
</html>