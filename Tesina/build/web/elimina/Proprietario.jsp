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





    <body class="is-preload" onload="getProprietari()">

        <!-- Header -->
        <header id="header">
            <a class="logo" href="../Homepage.html">Homepage</a>
            <nav>
                <a href="#menu">Menu</a>
            </nav>
        </header>

        <!-- Nav -->
        <nav id="menu">
            <ul class="links">
                <li><a href="../Aggiungi.html">Aggiungi</a></li>
                <li><a href="../Elimina.html">Elimina</a></li>
                <li><a href="../Modifica.html">Modifica</a></li>
                <li><a href="../Visualizza.html">Visualizza</a></li>
            </ul>
        </nav>


        <!--Grid-->    
        <div class="container">
            <div >
                <h2><center>Elimina un proprietario</center></h2>
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
                        <tbody id="body">
                            
                        </tbody>
                        <tfoot>
                            <td><input class="form-control" type="text" name="nome" id="nome_c"></td>
                            <td><button type="button" class="btn btn-blue" onclick="eliminaProprietario()">Elimina proprietario</button></td>
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
                window.location.href = "../Elimina.html";
            }
            
            function getProprietari(){
                $.ajax({
                    type: 'GET',
                    url: "${pageContext.request.contextPath}/DeleteProprietarioServlet",
                    data: "",
                    success: function (risposta){
                        var html = "";
                        for(i in risposta.possiede){
                            html += "<td id=\"nome\">"+risposta.possiede[i].nome+"</td>"
                                    + "<td id=\"ID\">"+risposta.possiede[i].ID_Mappale+"</td>"
                                    + "<td>"+risposta.possiede[i].anno+"</td>"
                                    + "<td>"+risposta.possiede[i].quota+"</td>"
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
                
                nome = document.getElementById("nome").innerText;
                ID = document.getElementById("ID").innerText;

                $.ajax({
                    type: 'POST',
                    url: "${pageContext.request.contextPath}/DeleteProprietarioServlet",
                    data: "nome="+nome+"&ID="+ID+"&tipo=tutto",
                    success: function (risposta){
                        window.location.href = "Proprietario.jsp";
                    },
                    error: function () {
                        alert("Chiamata fallita!!!");
                    }
                });
            }
            
            function eliminaProprietario(){
                
                if(confirm("Confermi di voler eliminare il prorietario?\n Potrai eliminarlo solo se non compare nella tabella qui presente")){
                    
                    nome = document.getElementById("nome_c").value;

                    $.ajax({
                        type: 'POST',
                        url: "${pageContext.request.contextPath}/DeleteProprietarioServlet",
                        data: "nome="+nome+"&tipo=proprietario",
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