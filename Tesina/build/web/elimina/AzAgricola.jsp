<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<html>
    <head>
        <title>Elimina</title>
        <link rel="icon" href="../images/Aggiungi.png" type="image/jpg" />
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
        <meta name="description" content="" />
        <meta name="keywords" content="" />
        <link rel="stylesheet" href="../assets/css/main.css" />
    </head>
    <body class="is-preload" onload="getGTerreno()">
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
                <li><a href="../Visualizza.jsp">Visualizza</a></li>
                <li><a href="#" onclick="logout()">Logout</a></li>
            </ul>
        </nav>


        <!--Grid-->    
        <div class="container">
            <div class="row">
                <h2>simple GRID</h2>
            </div>
            <div class="row">
                <h3 class="text-center text-primary">Persons</h3>
                <div class="col-md-12">
                    <table class="table table-hover" id="worked">
                        <thead>
                            <tr>
                                <th>Ragione sociale</th>
                                <th>Conduzione terra</th>
                                <th>Anno</th>
                                <th>Quota</th>
                                <th>Mappale</th>
                                <th><button type="button" class="btn btn-blue" onclick="indietro()">Indietro</button></th>
                            </tr>
                        </thead>
                        <tbody id="body">
                            
                        </tbody>
                        <tfoot>
                            <td><input class="form-control" type="text" name="nome" id="RSociale_c"></td>
                            <td><button type="button" class="btn btn-blue" onclick="eliminaGTerreno()">Elimina Azienda</button></td>
                        </tfoot>
                    </table>
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
            function indietro(){
                window.location.href = "../Elimina.jsp";
            }
            
            function logout(){
                $.ajax({
                    type: 'POST',
                    url: "${pageContext.request.contextPath}/LogoutServlet",
                    data: "logout=true",
                    success: function (risposta){
                        window.location.href = "../Login.jsp";
                    },
                    error: function () {
                        alert("Chiamata fallita!!!");
                    }
                });
            }
            
            function getGTerreno(){
                $.ajax({
                    type: 'GET',
                    url: "${pageContext.request.contextPath}/DeleteAzAgricolaServlet",
                    data: "",
                    success: function (risposta){
                        var html = "";
                        for(i in risposta.gTerreno){
                            html += "<td id=\"RSociale\">"+risposta.gTerreno[i].RagioneSociale+"</td>"
                                    + "<td>"+risposta.gTerreno[i].conduzioneterra+"</td>"
                                    + "<td>"+risposta.gestisce[i].anno+"</td>"
                                    + "<td>"+risposta.gestisce[i].quota+"</td>"
                                    + "<td id=\"ID\">"+risposta.gestisce[i].ID_Mappale+"</td>"
                                    + "<td><button type=\"button\" class=\"btn btn-blue\" onclick=\"elimina()\">Elimina</button></td>";
                        }
                        document.getElementById("body").innerHTML = html;
                    },
                    error: function () {
                        alert("Chiamata fallita!!!");
                    }
                });
            }
            
            function elimina(){
                
                RSociale = document.getElementById("RSociale").innerText;
                ID = document.getElementById("ID").innerText;

                $.ajax({
                    type: 'POST',
                    url: "${pageContext.request.contextPath}/DeleteAzAgricolaServlet",
                    data: "RSociale="+RSociale+"&ID="+ID+"&tipo=tutto",
                    success: function (risposta){
                        window.location.href = "Proprietario.jsp";
                    },
                    error: function () {
                        alert("Chiamata fallita!!!");
                    }
                });
            }
            
            function eliminaGTerreno(){
                
                if(confirm("Confermi di voler eliminare l'azienda agricola?\n Potrai eliminarla solo se non compare nella tabella qui presente")){
                    
                    RSociale = document.getElementById("RSociale_c").value;

                    $.ajax({
                        type: 'POST',
                        url: "${pageContext.request.contextPath}/DeleteAzAgricolaServlet",
                        data: "RSociale="+RSociale+"&tipo=azienda",
                        success: function (risposta){
                            window.location.href = "Proprietario.jsp";
                        },
                        error: function () {
                            alert("Chiamata fallita!!!");
                        }
                    });
                }
            }
        </script>
    </body>
</html>