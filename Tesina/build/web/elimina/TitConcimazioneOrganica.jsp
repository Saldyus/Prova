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
                                <th>Nome concime</th>
                                <th>Titolo N</th>
                                <th>Titolo P</th>
                                <th>Titolo K</th>
                                <th>Data</th>
                                <th>PDF Analisi</th>
                                <th><button type="button" class="btn btn-blue" onclick="indietro()">Indietro</button></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><input class="form-control" type="text" id="concime"></td>
                                <td><input class="form-control" type="text" id="titoloN"></td>
                                <td><input class="form-control" type="text" id="titoloP"></td>
                                <td><input class="form-control" type="text" id="titoloK"></td>
                                <td><input class="form-control" type="text" id="data"></td>
                                <td><input class="form-control" type="text" id="pdf"></td>
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
                window.location.href = "../Aggiungi.html";
            }
            
            function aggiungi(){
                
                concime = document.getElementById('concime').value;
                titoloN = document.getElementById('titoloN').value;
                titoloP = document.getElementById('titoloP').value;
                titoloK = document.getElementById('titoloK').value;
                data = document.getElementById('data').value;
                pdf = document.getElementById('pdf').value;
                
                if(concime === ""){
                    alert("Inserire tutti i campi");
                }else{
                    if(titoloN === ""){
                        alert("Inserire tutti i campi");
                    }else{
                        if(titoloP === ""){
                            alert("Inserire tutti i campi");
                        }else{
                            if(titoloK === ""){
                                alert("Inserire tutti i campi");
                            }else{
                                if(data === ""){
                                    alert("Inserire tutti i campi");
                                }else{
                                    if(pdf === ""){
                                        alert("Inserire tutti i campi");
                                    }else{
                                        $.ajax({
                                            type: 'POST',
                                            url: "${pageContext.request.contextPath}/AddTitOrganicaServlet",
                                            data: "concime="+concime+"&titoloN="+titoloN+"&titoloP="+titoloP+"&titoloK="+titoloK+"&data="+data+"&pdf="+pdf,
                                            success: function (risposta){
                                                window.location.href = "../Aggiungi.html";
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
        </script>
    </body>
</html>