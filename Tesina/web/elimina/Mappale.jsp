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
                                <th>ID Mapple</th>
                                <th>Comune</th>
                                <th>Superficie catastale</th>
                                <th>Reddito Agrario</th>
                                <th>Reddito Domenicale</th>
                                <th>Foglio</th>
                                <th>R. Sociale Azienda Liquami</th>
                                <th></th>
                                <th><button type="button" class="btn btn-blue" onclick="indietro()">Indietro</button></th>
                            </tr>
                        </thead>
                        <tbody>
                            
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
                window.location.href = "../Aggiungi.html";
            }
            
            function aggiungi(){
                
                comune = document.getElementById('comune').value;
                scatastale = document.getElementById('scatastale').value;
                ID = document.getElementById('mappale').value;
                ragrario = document.getElementById('ragrario').value;
                rdomenicale = document.getElementById('rdomenicale').value;
                rsociale = document.getElementById('rsociale').value;
                PCB = document.getElementById('PCB').checked;
                Metalli = document.getElementById('Metalli').checked;
                Diossina = document.getElementById('Diossina').checked;
                foglio = document.getElementById('foglio').value;
                
                if(comune === ""){
                    alert("Inserire tutti i campi");
                }else{
                    if(scatastale === ""){
                        alert("Inserire tutti i campi");
                    }else{
                        if(ID === ""){
                            alert("Inserire tutti i campi");
                        }else{
                            if(ragrario === ""){
                                alert("Inserire tutti i campi");
                            }else{
                                if(rdomenicale === ""){
                                    alert("Inserire tutti i campi");
                                }else{
                                    if(rsociale === ""){
                                        alert("Inserire tutti i campi");
                                    }else{
                                        if(foglio === ""){
                                            alert("Inserire tutti i campi");
                                        }else{
                                            $.ajax({
                                                type: 'POST',
                                                url: "${pageContext.request.contextPath}/AddMappaleServlet",
                                                data: "comune="+comune+"&scatastale="+scatastale+"&ID="+ID+"&rdomenicale="+rdomenicale+"&rsociale="+rsociale+"&PCB="+PCB+"&Metalli="+Metalli+"&Diossina="+Diossina+"&ragrario="+ragrario+"&foglio="+foglio,
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
            }
        </script>

    </body>
</html>