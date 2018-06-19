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
                <div class="col-md-12">
                    <table class="table table-hover" id="worked">
                        <thead>
                            <tr>
                                <th>Varieta</th>
                                <th>Coltura</th>
                                <th>Maturazione 1/3</th>
                                <th>Maturazione 1/2</th>
                                <th>Maturazione 2/3</th>
                                <th>p/m^2</th>
                                <th>Note maturazione</th>
                                <th>Note semina</th>
                                <th>Data seminazione (yyyy/mm/gg)</th>
                                <th>Campo seminato</th>
                                <th><button type="button" class="btn btn-blue" onclick="indietro()">Indietro</button></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><input class="form-control" type="text" id="varieta"></td>
                                <td><input class="form-control" type="text" id="coltura"></td>
                                <td><input class="form-control" type="text" id="maturazione1_3"></td>
                                <td><input class="form-control" type="text" id="maturazione1_2"></td>
                                <td><input class="form-control" type="text" id="maturazione2_3"></td>
                                <td><input class="form-control" type="text" id="p_m2"></td>
                                <td><textarea class="form-control" rows="1" id="Nmaturazione"></textarea></td>
                                <td><textarea class="form-control" rows="1" id="Nsemina"></textarea></td>
                                <td><input class="form-control" type="text" id="data" placeholder="yyyy/mm/gg"></td>
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
                
                varieta = document.getElementById('varieta').value;
                coltura = document.getElementById('coltura').value;
                m1_3 = document.getElementById('maturazione1_3').value;
                m1_2 = document.getElementById('maturazione1_2').value;
                m2_3 = document.getElementById('maturazione2_3').value;
                pm2 = document.getElementById('p_m2').value;
                nmat = document.getElementById('Nmaturazione').value;
                nsem = document.getElementById('Nsemina').value;
                data = document.getElementById('data').value;
                campo = document.getElementById('campo').value;
                
                if(varieta === ""){
                    alert("Inserire tutti i campi");
                }else{
                    if(coltura === ""){
                        alert("Inserire tutti i campi");
                    }else{
                        if(m1_3 === ""){
                            alert("Inserire tutti i campi");
                        }else{
                            if(m1_2 === ""){
                                alert("Inserire tutti i campi");
                            }else{
                                if(m2_3 === ""){
                                    alert("Inserire tutti i campi");
                                }else{
                                    if(pm2 === ""){
                                        alert("Inserire tutti i campi");
                                    }else{
                                        if(nmat === ""){
                                            alert("Inserire tutti i campi");
                                        }else{
                                            if(nsem === ""){
                                                alert("Inserire tutti i campi");
                                            }else{
                                                if(data === ""){
                                                    alert("Inserire tutti i campi");
                                                }else{
                                                    if(campo === ""){
                                                        alert("Inserire tutti i campi");
                                                    }else{
                                                        $.ajax({
                                                            type: 'POST',
                                                            url: "${pageContext.request.contextPath}/AddSemicaServlet",
                                                            data: "varieta="+varieta+"&coltura="+coltura+"&m1_3="+m1_3+"&m1_2="+m1_2+"&m2_3="+m2_3+"&pm2="+pm2+"&nmat="+nmat+"&nsem="+nsem+"&data="+data+"&campo="+campo,
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
                    }
                }
            }
        </script>
    </body>
</html>