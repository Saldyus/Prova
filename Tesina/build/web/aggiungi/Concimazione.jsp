<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<html>
    <head>
        <title>Aggiungi</title>
        <link rel="icon" href="../images/Aggiungi.png" type="image/jpg" />
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
                <div class="col-md-12">
                    <table class="table table-hover" id="worked">
                        <thead>
                            <tr>
                                <th>Tipo Concimazione</th>
                                <th>Quantit? usata ton</th>
                                <th>Supericie ha</th>
                                <th>Concime</th>
                                <th>Data</th>
                                <th>Note</th>
                                <th>Campo</th>
                                <th><button type="button" class="btn btn-blue" onclick="indietro()">Indietro</button></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><input class="form-control" type="text" id="tipo"></td>
                                <td><input class="form-control" type="text" id="qta"></td>
                                <td><input class="form-control" type="text" id="superficie"></td>
                                <td><input class="form-control" type="text" id="concime"></td>
                                <td><input class="form-control" type="text" id="data"></td>
                                <td><input class="form-control" type="text" id="note"></td>
                                <td><input class="form-control" type="text" id="campo"></td>
                            </tr>
                        </tbody>
                        <tfoot>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
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
            function aggiungi(){
                
                tipo = document.getElementById('tipo').value;
                qta = document.getElementById('qta').value;
                superficie = document.getElementById('superficie').value;
                concime = document.getElementById('concime').value;
                data = document.getElementById('data').value;
                note = document.getElementById('note').value;
                campo = document.getElementById('campo').value;
                
                if(tipo === ""){
                    alert("Inserire tutti i campi");
                }else{
                    if(qta === ""){
                        alert("Inserire tutti i campi");
                    }else{
                        if(superficie === ""){
                            alert("Inserire tutti i campi");
                        }else{
                            if(concime === ""){
                                alert("Inserire tutti i campi");
                            }else{
                                if(data === ""){
                                    alert("Inserire tutti i campi");
                                }else{
                                    if(note === ""){
                                        alert("Inserire tutti i campi");
                                    }else{
                                        if(campo === ""){
                                            alert("Inserire tutti i campi");
                                        }else{
                                            $.ajax({
                                                type: 'POST',
                                                url: "${pageContext.request.contextPath}/AddConcimazioneServlet",
                                                data: "tipo="+tipo+"&qta="+qta+"&superficie="+superficie+"&concime="+concime+"&data="+data+"&note="+note+"&campo="+campo,
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
                    }
                }
            }
        </script>
    </body>
</html>