<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<html>
    <head>
        <title>Homepage</title>
        <link rel="icon" href="image/HOMEPAGE.png" type="image/jpg" />
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
        <meta name="description" content="" />
        <meta name="keywords" content="" />
        <link rel="stylesheet" href="assets/css/main.css" />
    </head>
    <body class="is-preload">
        <%
            if (session.getAttribute("online") == null) {
                response.sendRedirect("Login.jsp");
            }
        %>   
        <!-- Header -->
        <header id="header">
            <a class="logo" href="Homepage.jsp">Homepage</a>
            <nav>
                <a href="#menu">Menu</a>
            </nav>
        </header>

        <!-- Nav -->
        <nav id="menu">
            <ul class="links">
                <li><a href="Aggiungi.jsp">Aggiungi</a></li>
                <li><a href="Elimina.jsp">Elimina</a></li>
                <li><a href="Modifica.jsp">Modifica</a></li>
                <li><a href="visualizza/campo.jsp">Visualizza</a></li>
                <li><a href="#" onclick="logout()">Logout</a></li>
            </ul>
        </nav>

        <!-- Banner -->
        <section id="banner">
            <div class="inner">
                <h1>GATTI BORTOLO E FIGLI S.S</h1>
                <p>9, Via Coler - 25020 Flero (BS)
   <br>030 2640173</p>
            </div>
            <video autoplay loop muted playsinline src="image/VIDEOO.MOV"></video>
        </section>

        <!-- Highlights -->
        <section class="wrapper">
            <div class="inner">
                <header class="special">
                    <h2>SPECIALIZZAZIONI</h2>
                    <p>Gatti Bortolo & Figli  S.S. e' un'azienda agricola che svolge diverse attivita' in settori differenti quali:</p>
                </header>
                <div class="highlights">
                    <section>
                        <div class="content">
                            <header>
                                <a><img src="image/BOVINI.jpg"></a>
                                <h3>ALLEVAMENTO BOVINI</h3>
                            </header>
                            <p>Recentemente raggiunto il passaggio dall' allevamento di manzi a quelli di carne 
			    piu' pregiata. Arrivano in allevamento all'eta' di 6 mesi per poi, dopo 6 mesi, essere portati al macello. </p>
                        </div>
                    </section>
                    <section>
                        <div class="content">
                            <header>
                                <a><img src="image/SUINI.jpg"></a>
                                <h3>ALLEVAMENTO SUINI</h3>
                            </header>
                            <p>Quasi 8000 suini sono i capi totali presenti nell'allevamento i quali, 9
			    mesi dopo essere stati qui, vengono trasferiti nei macelli piu' rinomati del Nord Italia
			    al fine di ottenere poi, a lavoro finito, prodotti come il prosciutto di Parma o il San Daniele..</p>
                        </div>
                    </section>
                    <section>
                        <div class="content">
                            <header>
                                <a><img src="image/SEMINA.jpg"></a>
                                <h3>SEMINA</h3>
                            </header>
                            <p>Vengono utilizzate moltissime varianti di semente per coltivare i terreni e nutrire il 
			    bestiame, in modo da avere una resa sempre maggiore grazie anche alla rotazione delle
			    colture o a speciali colture che arricchiscono il terreno di sostanze nutrienti.</p>
                        </div>
                    </section>
                    <section>
                        <div class="content">
                            <header>
                                <a><img src="image/FOTOVOLTAICO.jpg"></a>
                                <h3>FOTOVOLTAICO</h3>
                            </header>
                            <p>Quasi 8000 metri quadrati di pannelli fotovoltaici ricoprono i tetti di alcuni dei capannoni dell'azienda
			    al fine di ottenere energia ellettrica rinnovabile sfruttando l'energia solare.</p>
			    
                        </div>
                    </section>
                    <section>
                        <div class="content">
                            <header>
                                
				<a><img src="image/BIOGAS.jpg"></a>
                                <h3>BIOGAS</h3>
                            </header>
                            <p>Una delle prime aziende bresciane a dotarsi di un impianto biogas che utilizza le biomasse quali liquame e 
			    scarti di produzione cerealicola al fine di produrre energia elettrica riutilizzabile.</p>
                        </div>
                    </section>
                    <section>
                        <div class="content">
                            <header>
                                <a><img src="image/LAVORAZIONI.jpg"></a>
                                <h3>LAVORAZIONI</h3>
                            </header>
                            <p>Lavorazioni sempre nuove e innovative effettuate anche grazie ad attrezzi di qualita' importati dall'estero
			    che rendono il terreno sempre piu' friabile e coltivabile. </p>
                        </div>
                    </section>
                </div>
            </div>
        </section>

        

        

        <!-- Footer -->
        <footer id="footer">
            <div class="inner">
                <div class="content">
                    <section>
                        <h3>Informazioni Azienda</h3>
                        <p>Gatti Bortolo & Figli  S.S. e' un'azienda agricola nel settore ormai da quasi 100 anni. 
Nel tempo si e' espansa notevolmente, e da un piccolo allevamento di suini e' diventata un allevamento di medie dimensioni che divide la sua produzione tra bovini e suini. 
Questo ha comportato anche un notevole aumento dei terreni da coltivare, per nutrire il bestiame, 
dei mezzi utilizzati per effettuare lavorazioni sempre diverse e piu dispendiose, e del personale necessario per
mantenere un'impresa di questo genere.
</p>
                    </section>
                    <section>
                        <h4>Azioni Database</h4>
                        <ul class="alt">
                            <li><a href="Aggiungi.jsp">Aggiungi</a></li>
                            <li><a href="Elimina.jsp">Elimina</a></li>
                            <li><a href="Modifica.jsp">Modifica</a></li>
                            <li><a href="visualizza/campo.jsp">Visualizza</a></li>
                            <li><a href="#" onclick="logout()">Logout</a></li>
                        </ul>
                    </section>
                    <section>
                        <h4>RECAPITI</h4>
                        <ul class="alt">
			<li>Indirizzo: &nbsp;<a href="https://www.google.it/maps/place/Via+Coler,+9,+25020+Flero+BS/@45.469051
			8,10.1685303,1
			7z/data=!3m1!4b1!4m5!3m4!1s0x478174de2c87b111:0x108a9dbf790055e7!8m2!3d45
			.4690481!4d10.170719">Via Coler, 9</a></li>
                            <li>Num. Telefonico:&nbsp;030 2640173</li>
                            <li>Mail:&nbsp;<a href="#">gattibortolo@gmail.com</a></li>
                            <li>Sito Web:&nbsp;<a href="#">www.gattibortolo.it</a></li>
                        </ul>
                    </section>
                </div>

            </div>
        </footer>

        <!-- Scripts -->
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/browser.min.js"></script>
        <script src="assets/js/breakpoints.min.js"></script>
        <script src="assets/js/util.js"></script>
        <script src="assets/js/main.js"></script>
        <script>
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
        </script>
    </body>
</html>