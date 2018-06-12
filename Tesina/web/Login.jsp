<html>
    <head>
        <title>Login</title>
        <link rel="icon" href="images/Login.png" type="image/jpg" />
        <link rel="stylesheet" href="assets/css/login.css" />
        <link rel="stylesheet" href="assets/css/main.css" />
    </head>
    <body>



        <div class="login-page">
            <center><img id="imgg" src="images/Loginn.png"></center>
            <center><h1 id="h11">Login</h1></center>
            <div class="form">


                <form class="login-form" action="${pageContext.request.contextPath}/LoginServlet" method="POST">
                    <input type="text" placeholder="Nome utente" name="nome"/>
                    <input type="password" placeholder="Password" name="password"/>
                    <button id="buttonn">ACCEDI</button>
                </form>

            </div>
        </div>


        <!-- Scripts -->
        <script src="assets/js/login.js"></script>

    </body>
</html>