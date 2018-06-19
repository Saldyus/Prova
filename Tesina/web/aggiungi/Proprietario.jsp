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
            <div >
                <h2><center>Aggiungi un nuovo proprietario</center></h2>
            </div>
            <div class="row">
                <h3 class="text-center text-primary">Proprietario</h3>
                <div class="col-md-12">
                    <table class="table table-hover" id="worked">
                        <thead>
                            <tr>
                                <th>Nome proprietario</th>
                                <th>Mappale</th>
                                <th>Quota</th>
                                <th>Anno</th>
                                <th><button type="button" class="btn btn-blue" onclick="indietro()">Indietro</button></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><input class="form-control" type="text" name="nome" id="nome"></td>
                                <td><input class="form-control" type="text" name="mappale" id="mappale"></td>
                                <td><input class="form-control" type="text" name="quota" id="quota"></td>
                                <td><input class="form-control" type="text" name="anno" id="anno"></td>
                            </tr>
                        </tbody>
                        <tfoot>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td><button type="button" class="btn btn-blue" onclick="aggiungi()">Aggiungi</button></td>
                            </tr>
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
        <script src="../assets/js/grid.js"></script>
        <script type="text/javascript">
            function indietro(){
                window.location.href = "../Aggiungi.jsp";
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
            
            function aggiungi(){
                
                nome = document.getElementById('nome').value;
                anno = document.getElementById('anno').value;
                ID = document.getElementById('mappale').value;
                quota = document.getElementById('quota').value;
                
                if(nome === ""){
                    alert("Aggiungere tutti i campi");
                }else{
                    if(anno === ""){
                        alert("Aggiungere tutti i campi");
                    }else{
                        if(ID === ""){
                            alert("Aggiungere tutti i campi");
                        }else{
                            if(quota === ""){
                                alert("Aggiungere tutti i campi");
                            }else{
                                $.ajax({
                                    type: 'POST',
                                    url: "${pageContext.request.contextPath}/AddProprietarioServlet",
                                    data: "nome="+nome+"&mappale="+ID+"&quota="+quota+"&anno="+anno,
                                    success: function (risposta){
                                        window.location.href = "../Aggiungi.jsp";
                                    },
                                    error: function () {
                                        alert("Chiamata fallita!!!");
                                    }
                                });
                            }
                        }
                    }
                }
            }
        </script>

    </body>
</html>