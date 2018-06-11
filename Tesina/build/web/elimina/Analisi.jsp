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





    <body class="is-preload" onload="getAnalisi()">

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
            <div class="row">
                <h2>simple GRID</h2>
            </div>
            <div class="row">
                <h3 class="text-center text-primary">Persons</h3>
                <div class="col-md-12">
                    <table class="table table-hover" id="worked">
                        <thead>
                            <tr>
                                <th>Nome del campo</th>
                                <th>Data analisi</th>
                                <th>Allegato PDF</th>
                                <th>S.O.</th>
                                <th>N totale</th>
                                <th>P2o5</th>
                                <th>K2O</th>
                                <th>C/n</th>
                                <th>Sabbia</th>
                                <th>Limo</th>
                                <th>Argilla</th>
                                <th><button type="button" class="btn btn-blue" onclick="indietro()">Indietro</button></th>
                            </tr>
                        </thead>
                        <tbody id="body">
                            
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
            
            function getAnalisi(){
                $.ajax({
                    type: 'GET',
                    url: "${pageContext.request.contextPath}/DeleteAnalisiServlet",
                    data: "",
                    success: function (risposta){
                        var html = "";
                        for(i in risposta.analisi){
                            html += "<td>"+risposta.analizzato[i].nome+"</td>"
                                    + "<td>"+risposta.analizzato[i].data+"</td>"
                                    + "<td>"+risposta.analisi[i].allegatPDF+"</td>"
                                    + "<td>"+risposta.analisi[i].SO+"</td>"
                                    + "<td>"+risposta.analisi[i].Ntot+"</td>"
                                    + "<td>"+risposta.analisi[i].P2o5+"</td>"
                                    + "<td>"+risposta.analisi[i].K2O+"</td>"
                                    + "<td>"+risposta.analisi[i].CN+"</td>"
                                    + "<td>"+risposta.analisi[i].sabbia+"</td>"
                                    + "<td>"+risposta.analisi[i].limo+"</td>"
                                    + "<td>"+risposta.analisi[i].argilla+"</td>"
                                    + "<td><button type=\"button\" value="+risposta.analisi[i].ID_Analisi+"class=\"btn btn-blue\" onclick=\"elimina(this.value)\">Aggiungi</button></td>";
                        }
                    },
                    error: function () {
                        alert("Chiamata fallita!!!");
                    }
                });
            }
            
            function elimina(){
                
            }
        </script>
    </body>
</html>