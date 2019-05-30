<html>
  <head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  </head>
  <header>
    <jsp:include page="includes/navbar.jsp"/>
  </header>
  <body>
    <section class="jumbotron text-center">
      <div class="container">
        <h1 class="jumbotron-heading">Welcome Mexicourse!</h1>
        <p class="lead text-muted">These are the actions currently available, feel free to choose one and play a little.</p>
        <p>
          <a href="/studentRegistration" class="btn btn-primary my-2">Register student</a>
          <a href="/students" class="btn btn-secondary my-2">View students</a>
        </p>
      </div>
    </section>
  </body>
</html>