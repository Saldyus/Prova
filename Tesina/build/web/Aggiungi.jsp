<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<html>
    <head>
        <title>Aggiungi</title>
        <link rel="icon" href="image/Aggiungi.png" type="image/jpg" />
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
        <meta name="description" content="" />
        <meta name="keywords" content="" />
        <link rel="stylesheet" href="assets/css/main.css" />
        <link rel="stylesheet" href="assets/css/button.css" />
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

        <!--Buttons-->
        <a href="aggiungi/Mappale.jsp" class="boton">
            <div class="botontext">Mappale</div>
            <div class="botontext">Mappale</div>
        </a>
        <a href="aggiungi/AzAgricolaLiquami.jsp" class="boton" style="left: 425px;">
            <div class="botontext">Azienda agricola liquami</div>
            <div class="botontext">Azienda agricola liquami</div>
        </a>
        <a href="aggiungi/AzAgricola.jsp" class="boton" style="left: 725px;">
            <div class="botontext">Azienda agricola</div>
            <div class="botontext">Azienda agricola</div>
        </a>
        <a href="aggiungi/Pianificazione.jsp" class="boton" style="left: 1025px;">
            <div class="botontext">Pianificazione</div>
            <div class="botontext">Pianificazione</div>
        </a>
        <a href="aggiungi/Campo.jsp" class="boton" style="top: 175px;">
            <div class="botontext">campo</div>
            <div class="botontext">campo</div>
        </a>
        <a href="aggiungi/Analisi.jsp" class="boton" style="left:425px; top: 175px;">
            <div class="botontext">analisi</div>
            <div class="botontext">analisi</div>
        </a>
        <a href="aggiungi/Raccolto.jsp" class="boton" style="left:725px; top: 175px;">
            <div class="botontext">raccolti</div>
            <div class="botontext">raccolti</div>
        </a>
        <a href="aggiungi/Semina.jsp" class="boton" style="left:1025px; top: 175px;">
            <div class="botontext">semina</div>
            <div class="botontext">semina</div>
        </a>
        <a href="aggiungi/Lavorazione.jsp" class="boton" style="top: 300px;">
            <div class="botontext">lavorazioni</div>
            <div class="botontext">lavorazioni</div>
        </a>
        <a href="aggiungi/TrattamentoFitofarmaco.jsp" class="boton" style="left:425px; top: 300px;">
            <div class="botontext">trattamento fitofarmaci</div>
            <div class="botontext">trattamento fitofarmaci</div>
        </a>
        <a href="aggiungi/Concimazione.jsp" class="boton" style="left:725px; top: 300px;">
            <div class="botontext">concimazioni</div>
            <div class="botontext">concimazioni</div>
        </a>
        <a href="aggiungi/TitConcimazioneOrganica.jsp" class="boton" style="left:1025px; top: 300px;">
            <div class="botontext">tit. concimazioni organica</div>
            <div class="botontext">tit. concimazioni organica</div>
        </a>
        <a href="aggiungi/Proprietario.jsp" class="boton" style="top: 425px;">
            <div class="botontext">Proprietario mappale</div>
            <div class="botontext">Proprietario mappale</div>
        </a>
        <a href="aggiungi/Prodotto.jsp" class="boton" style="left:425px; top: 425px;">
            <div class="botontext">prodotti</div>
            <div class="botontext">prodotti</div>
        </a>
        <a href="aggiungi/Dosaggio.jsp" class="boton" style="left:725px; top: 425px;">
            <div class="botontext">dosaggi</div>
            <div class="botontext">dosaggi</div>
        </a>
        <a href="aggiungi/DescrizioneProdotto.jsp" class="boton" style="left:1025px; top: 425px;">
            <div class="botontext">descrizione prodotti</div>
            <div class="botontext">descrizione prodotti</div>
        </a>

        <!-- Scripts -->
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/browser.min.js"></script>
        <script src="assets/js/breakpoints.min.js"></script>
        <script src="assets/js/util.js"></script>
        <script src="assets/js/main.js"></script>
        <script src="assets/js/button.js"></script>
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