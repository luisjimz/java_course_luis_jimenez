<html>
  <head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  </head>
  <body>
      <!-- no additional media querie or css is required -->
      <div class="container">
          <div class="row justify-content-center align-items-center" style="height:100vh">
              <div class="col-4">
                  <div class="card">
                      <div class="card-body">
                          <form method="post" autocomplete="off">
                              <font color="red">${errorMessage}</font>
                              <div class="form-group">
                                  <div>Email</div>
                                  <input type="text" class="form-control" name="email">
                              </div>
                              <div class="form-group">
                                  <div>Password</div>
                                  <input type="password" class="form-control" name="password">
                              </div>
                              <button type="submit" id="sendlogin" class="btn btn-primary">login</button>
                          </form>
                      </div>
                  </div>
              </div>
          </div>
      </div>
  </body>
</html>