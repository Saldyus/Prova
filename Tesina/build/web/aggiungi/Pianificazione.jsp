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
                                <th>Mappale</th>
                                <th>Prima rotazione</th>
                                <th>Superficie prima rotazione</th>
                                <th>Seconda rotazione</th>
                                <th>Superficie seconda rotazione</th>
                                <th>Terza rotazione</th>
                                <th>Superficie terza rotazione</th>
                                <th>Anno</th>
                                <th><button type="button" class="btn btn-blue" onclick="indietro()">Indietro</button></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><input class="form-control" type="text" id="ID"></td>
                                <td><input class="form-control" type="text" id="rot1"></td>
                                <td><input class="form-control" type="text" id="sup_rot1"></td>
                                <td><input class="form-control" type="text" id="rot2"></td>
                                <td><input class="form-control" type="text" id="sup_rot2"></td>
                                <td><input class="form-control" type="text" id="rot3"></td>
                                <td><input class="form-control" type="text" id="sup_rot3"></td>
                                <td><input class="form-control" type="text" id="anno"></td>
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
                
                ID = document.getElementById('ID').value;
                rot1 = document.getElementById('rot1').value;
                sup_rot1 = document.getElementById('maturazione1_3').value;
                rot2 = document.getElementById('maturazione1_2').value;
                sup_rot2 = document.getElementById('maturazione2_3').value;
                rot3 = document.getElementById('p_m2').value;
                sup_rot3 = document.getElementById('Nmaturazione').value;
                anno = document.getElementById('anno').value;
                
                if(ID === ""){
                    alert("Inserire tutti i campi");
                }else{
                    if(rot1 === ""){
                        alert("Inserire tutti i campi");
                    }else{
                        if(sup_rot1 === ""){
                            alert("Inserire tutti i campi");
                        }else{
                            if(rot2 === ""){
                                alert("Inserire tutti i campi");
                            }else{
                                if(sup_rot2 === ""){
                                    alert("Inserire tutti i campi");
                                }else{
                                    if(rot3 === ""){
                                        alert("Inserire tutti i campi");
                                    }else{
                                        if(sup_rot3 === ""){
                                            alert("Inserire tutti i campi");
                                        }else{
                                            if(anno === ""){
                                                alert("Inserire tutti i campi");
                                            }else{
                                                $.ajax({
                                                    type: 'POST',
                                                    url: "${pageContext.request.contextPath}/AddPianificazioneServlet",
                                                    data: "ID="+ID+"&rot1="+rot1+"&sup_rot1="+sup_rot1+"&rot2="+rot2+"&sup_rot2="+sup_rot2+"&rot3="+rot3+"&sup_rot3="+sup_rot3+"&anno="+anno,
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
        </script>

    </body>
</html>