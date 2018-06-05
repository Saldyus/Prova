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
                        <tbody>
                            <tr>
                                <td><input class="form-control" type="text" id="campo"></td>
                                <td><input class="form-control" type="text" id="data"></td>
                                <td><input class="form-control" type="text" id="PDF"></td>
                                <td><input class="form-control" type="text" id="SO"></td>
                                <td><input class="form-control" type="text" id="Ntot"></td>
                                <td><input class="form-control" type="text" id="P2o5"></td>
                                <td><input class="form-control" type="text" id="K2O"></td>
                                <td><input class="form-control" type="text" id="CN"></td>
                                <td><input class="form-control" type="text" id="Sabbia"></td>
                                <td><input class="form-control" type="text" id="Limo"></td>
                                <td><input class="form-control" type="text" id="Argilla"></td>
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
                
                campo = document.getElementById('v').value;
                data = document.getElementById('data').value;
                pdf = document.getElementById('PDF').value;
                SO = document.getElementById('SO').value;
                Ntot = document.getElementById('Ntot').value;
                P2o5 = document.getElementById('P2o5').value;
                K2O = document.getElementById('K2O').value;
                CN = document.getElementById('Cn').value;
                Sabbia = document.getElementById('Sabbia').value;
                Limo = document.getElementById('Limo').value;
                Argila = document.getElementById('Argila').value;
                
                if(campo === ""){
                    alert("Inserire tutti i campi");
                }else{
                    if(data === ""){
                        alert("Inserire tutti i campi");
                    }else{
                        if(pdf === ""){
                            alert("Inserire tutti i campi");
                        }else{
                            if(SO === ""){
                                alert("Inserire tutti i campi");
                            }else{
                                if(Ntot === ""){
                                    alert("Inserire tutti i campi");
                                }else{
                                    if(P2o5 === ""){
                                        alert("Inserire tutti i campi");
                                    }else{
                                        if(K2O === ""){
                                            alert("Inserire tutti i campi");
                                        }else{
                                            if(CN === ""){
                                                alert("Inserire tutti i campi");
                                            }else{
                                                if(Sabbia === ""){
                                                    alert("Inserire tutti i campi");
                                                }else{
                                                    if(Limo === ""){
                                                        alert("Inserire tutti i campi");
                                                    }else{
                                                        if(Argila === ""){
                                                            alert("Inserire tutti i campi");
                                                        }else{
                                                            $.ajax({
                                                                type: 'POST',
                                                                url: "${pageContext.request.contextPath}/AddAnalisiServlet",
                                                                data: "campo="+campo+"&data="+data+"&pdf="+pdf+"&SO="+SO+"&Ntot="+Ntot+"&P2o5="+P2o5+"&K2O="+K2O+"&CN="+CN+"&sabbia="+Sabbia+"&limo="+Limo+"&argila="+Argila,
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
                        }
                    }
                }
            }
        </script>
    </body>
</html>