<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<html>
    <head>
        <title>Homepage</title>
        <link rel="icon" href="images/Homepage.png" type="image/jpg" />
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
                <li><a href="Visualizza.jsp">Visualizza</a></li>
                <li><a href="#" onclick="logout()">Logout</a></li>
            </ul>
        </nav>

        <!-- Banner -->
        <section id="banner">
            <div class="inner">
                <h1>GATTI BORTOLO E FIGLI S.S</h1>
                <p>A responsive business oriented template with a video background
                    <br />
                    designed by <a href="https://templated.co/">TEMPLATED</a> and released under the Creative Commons License.</p>
            </div>
            <video autoplay loop muted playsinline src="images/banner.mp4"></video>
        </section>

        <!-- Highlights -->
        <section class="wrapper">
            <div class="inner">
                <header class="special">
                    <h2>Sem turpis amet semper</h2>
                    <p>In arcu accumsan arcu adipiscing accumsan orci ac. Felis id enim aliquet. Accumsan ac integer lobortis commodo ornare aliquet accumsan erat tempus amet porttitor.</p>
                </header>
                <div class="highlights">
                    <section>
                        <div class="content">
                            <header>
                                <a href="#" class="icon fa-vcard-o"><span class="label">Icon</span></a>
                                <h3>Feugiat consequat</h3>
                            </header>
                            <p>Nunc lacinia ante nunc ac lobortis ipsum. Interdum adipiscing gravida odio porttitor sem non mi integer non faucibus.</p>
                        </div>
                    </section>
                    <section>
                        <div class="content">
                            <header>
                                <a href="#" class="icon fa-files-o"><span class="label">Icon</span></a>
                                <h3>Ante sem integer</h3>
                            </header>
                            <p>Nunc lacinia ante nunc ac lobortis ipsum. Interdum adipiscing gravida odio porttitor sem non mi integer non faucibus.</p>
                        </div>
                    </section>
                    <section>
                        <div class="content">
                            <header>
                                <a href="#" class="icon fa-floppy-o"><span class="label">Icon</span></a>
                                <h3>Ipsum consequat</h3>
                            </header>
                            <p>Nunc lacinia ante nunc ac lobortis ipsum. Interdum adipiscing gravida odio porttitor sem non mi integer non faucibus.</p>
                        </div>
                    </section>
                    <section>
                        <div class="content">
                            <header>
                                <a href="#" class="icon fa-line-chart"><span class="label">Icon</span></a>
                                <h3>Interdum gravida</h3>
                            </header>
                            <p>Nunc lacinia ante nunc ac lobortis ipsum. Interdum adipiscing gravida odio porttitor sem non mi integer non faucibus.</p>
                        </div>
                    </section>
                    <section>
                        <div class="content">
                            <header>
                                <a href="#" class="icon fa-paper-plane-o"><span class="label">Icon</span></a>
                                <h3>Faucibus consequat</h3>
                            </header>
                            <p>Nunc lacinia ante nunc ac lobortis ipsum. Interdum adipiscing gravida odio porttitor sem non mi integer non faucibus.</p>
                        </div>
                    </section>
                    <section>
                        <div class="content">
                            <header>
                                <a href="#" class="icon fa-qrcode"><span class="label">Icon</span></a>
                                <h3>Accumsan viverra</h3>
                            </header>
                            <p>Nunc lacinia ante nunc ac lobortis ipsum. Interdum adipiscing gravida odio porttitor sem non mi integer non faucibus.</p>
                        </div>
                    </section>
                </div>
            </div>
        </section>

        <!-- CTA -->
        <section id="cta" class="wrapper">
            <div class="inner">
                <h2>Curabitur ullamcorper ultricies</h2>
                <p>Nunc lacinia ante nunc ac lobortis. Interdum adipiscing gravida odio porttitor sem non mi integer non faucibus ornare mi ut ante amet placerat aliquet. Volutpat eu sed ante lacinia sapien lorem accumsan varius montes viverra nibh in adipiscing. Lorem ipsum dolor vestibulum ante ipsum primis in faucibus vestibulum. Blandit adipiscing eu felis iaculis volutpat ac adipiscing sed feugiat eu faucibus. Integer ac sed amet praesent. Nunc lacinia ante nunc ac gravida.</p>
            </div>
        </section>

        <!-- Testimonials -->
        <section class="wrapper">
            <div class="inner">
                <header class="special">
                    <h2>Faucibus consequat lorem</h2>
                    <p>In arcu accumsan arcu adipiscing accumsan orci ac. Felis id enim aliquet. Accumsan ac integer lobortis commodo ornare aliquet accumsan erat tempus amet porttitor.</p>
                </header>

            </div>
        </section>

        <!-- Footer -->
        <footer id="footer">
            <div class="inner">
                <div class="content">
                    <section>
                        <h3>Informazioni Azienda</h3>
                        <p>Nunc lacinia ante nunc ac lobortis. Interdum adipiscing gravida odio porttitor sem non mi integer non faucibus ornare mi ut ante amet placerat aliquet. Volutpat eu sed ante lacinia sapien lorem accumsan varius montes viverra nibh in adipiscing. Lorem ipsum dolor vestibulum ante ipsum primis in faucibus vestibulum. Blandit adipiscing eu felis iaculis volutpat ac adipiscing sed feugiat eu faucibus. Integer ac sed amet praesent. Nunc lacinia ante nunc ac gravida.</p>
                    </section>
                    <section>
                        <h4>Azioni Database</h4>
                        <ul class="alt">
                            <li><a href="Aggiungi.jsp">Aggiungi</a></li>
                            <li><a href="Elimina.jsp">Elimina</a></li>
                            <li><a href="Modifica.jsp">Modifica</a></li>
                            <li><a href="Visualizza.jsp">Visualizza</a></li>
                        </ul>
                    </section>
                    <section>
                        <h4>Social Network</h4>
                        <ul class="plain">
                            <li><a href="#"><i class="icon fa-twitter">&nbsp;</i>Twitter</a></li>
                            <li><a href="#"><i class="icon fa-facebook">&nbsp;</i>Facebook</a></li>
                            <li><a href="#"><i class="icon fa-instagram">&nbsp;</i>Instagram</a></li>
                            <li><a href="#"><i class="icon fa-github">&nbsp;</i>Github</a></li>
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