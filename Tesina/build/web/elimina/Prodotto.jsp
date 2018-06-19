<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<html>
    <head>
        <title>Aggiungi</title>
        <link rel="icon" href="../image/Aggiungi.png" type="image/jpg" />
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
        <meta name="description" content="" />
        <meta name="keywords" content="" />
        <link rel="stylesheet" href="../assets/css/main.css" />
    </head>
    <body class="is-preload">
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
                <form id="frame">
                    <select id="prodotto" onchange="addProdotto()">
                        <option value="0">--- Decidere cosa fare ---</option>
                        <option value="1">Nuovo prodotto</option>
                        <option value="2">Nuova quantit? di un prodotto</option>
                    </select>
                </form>
                <div class="col-md-12" id="table">
                    
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
        <script src="../assets/js/grid.js"></script>
        <script type="text/javascript">
            function addProdotto(){
                val = $("#prodotto").val();
                
                html = "";
                
                if(val == 0){
                    
                }else{
                    if(val == 1){
                        html += "<table class=\"table table-hover\" id=\"worked\">"
                        +"<thead>"
                        +"<tr>"
                        +"<th>Nome prodotto</th>"
                        +"<th>Tipo prodotto</th>"
                        +"<th>Titolo N</th>"
                        +"<th>Titolo P</th>"
                        +"<th>Titolo K</th>"
                        +"<th>Note</th>"
                        +"<th>Nome Prodotto Descrizione</th>"
                        +"<th>Ragione sociale Azienda</th>"
                        +"<th>DDT</th>"
                        +"<th>Data di acquisto</th>"
                        +"<th>l/kg acquistati</th>"
                        +"<th><button type=\"button\" class=\"btn btn-blue\" onclick=\"indietro()\">Indietro</button></th>"
                        +"</tr>"
                        +"</thead>"
                        +"<tbody>"
                        +"<tr>"
                        +"<td><input class=\"form-control\" type=\"text\" id=\"nome\"></td>"
                        +"<td><input class=\"form-control\" type=\"text\" id=\"tipo\"></td>"
                        +"<td><input class=\"form-control\" type=\"text\" id=\"titoloN\"></td>"
                        +"<td><input class=\"form-control\" type=\"text\" id=\"titoloP\"></td>"
                        +"<td><input class=\"form-control\" type=\"text\" id=\"titoloK\"></td>"
                        +"<td><input class=\"form-control\" type=\"text\" id=\"note\"></td>"
                        +"<td><input class=\"form-control\" type=\"text\" id=\"ndes\"></td>"
                        +"<td><input class=\"form-control\" type=\"text\" id=\"ragione\"></td>"
                        +"<td><input class=\"form-control\" type=\"text\" id=\"ddt\"></td>"
                        +"<td><input class=\"form-control\" type=\"text\" id=\"data\"></td>"
                        +"<td><input class=\"form-control\" type=\"text\" id=\"lkg\"></td>"
                        +"</tr>"
                        +"</tbody>"
                        +"<tfoot>"
                        +"<tr>"
                        +"<td></td>"
                        +"<td></td>"
                        +"<td></td>"
                        +"<td></td>"
                        +"<td></td>"
                        +"<td></td>"
                        +"<td></td>"
                        +"<td></td>"
                        +"<td></td>"
                        +"<td></td>"
                        +"<td></td>"
                        +"<td><button type=\"button\" class=\"btn btn-blue\" onclick=\"aggiungiProdotto()\">Aggiungi</button></td>"
                        +"</tr>"
                        +"</tfoot>"
                        +"</table>";
                    }else{
                        html += "<table class=\"table table-hover\" id=\"worked\">"
                        +"<thead>"
                        +"<tr>"
                        +"<th>Ragione sociale Azienda</th>"
                        +"<th>Nome prodotto</th>"
                        +"<th>DDT</th>"
                        +"<th>Data di acquisto</th>"
                        +"<th>l/kg acquistati</th>"
                        +"<th><button type=\"button\" class=\"btn btn-blue\" onclick=\"indietro()\">Indietro</button></th>"
                        +"</tr>"
                        +"</thead>"
                        +"<tbody>"
                        +"<tr>"
                        +"<td><input class=\"form-control\" type=\"text\" id=\"ragione\"></td>"
                        +"<td><input class=\"form-control\" type=\"text\" id=\"nome\"></td>"
                        +"<td><input class=\"form-control\" type=\"text\" id=\"ddt\"></td>"
                        +"<td><input class=\"form-control\" type=\"text\" id=\"data\"></td>"
                        +"<td><input class=\"form-control\" type=\"text\" id=\"lkg\"></td>"
                        +"</tr>"
                        +"</tbody>"
                        +"<tfoot>"
                        +"<tr>"
                        +"<td></td>"
                        +"<td></td>"
                        +"<td></td>"
                        +"<td></td>"
                        +"<td></td>"
                        +"<td><button type=\"button\" class=\"btn btn-blue\" onclick=\"aggiungiOrdine()\">Aggiungi</button></td>"
                        +"</tr>"
                        +"</tfoot>"
                        +"</table>";
                    }
                }
                document.getElementById("table").innerHTML = html;
            }
    
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
            
            function aggiungiProdotto(){
                
            }
            
            function aggiungiOrdine(){
                
            }
        </script>
    </body>
</html>