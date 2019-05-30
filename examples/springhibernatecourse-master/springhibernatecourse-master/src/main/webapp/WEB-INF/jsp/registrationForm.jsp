<html>
  <head>
    <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!------ Include the above in your HEAD tag ---------->
  </head>
  <header>
    <jsp:include page="includes/navbar.jsp"/>
  </header>
  <body>
    <div class="container">
      <form class="form-horizontal" action='' method="POST">
        <fieldset>
          <div id="legend">
            <legend class="">Register</legend>
          </div>
          <div class="control-group">
            <!-- studentname -->
            <label class="control-label" for="studentname">Name</label>
            <div class="controls">
              <input type="text" id="studentname" name="studentname" placeholder="" class="input-xlarge">
              <p class="help-block">Name can contain any letters or numbers, without spaces</p>
            </div>
          </div>

          <div class="control-group">
            <!-- studentname -->
            <label class="control-label" for="studentlastname">Last name</label>
            <div class="controls">
              <input type="text" id="studentlastname" name="studentlastname" placeholder="" class="input-xlarge">
              <p class="help-block">Last name can contain any letters or numbers, without spaces</p>
            </div>
          </div>

          <div class="control-group">
            <!-- E-mail -->
            <label class="control-label" for="email">E-mail</label>
            <div class="controls">
              <input type="text" id="email" name="email" placeholder="" class="input-xlarge">
              <p class="help-block">Please provide your E-mail</p>
            </div>
          </div>

          <div class="control-group">
            <!-- Age-->
            <label class="control-label" for="age">Age</label>
            <div class="controls">
              <input type="text" id="age" name="age" placeholder="" class="input-xlarge">
              <p class="help-block">Age should be a number between 17 and 99</p>
            </div>
          </div>

          <div class="control-group">
            <!-- Address-->
            <label class="control-label" for="address">Address</label>
            <div class="controls">
              <input type="text" id="addressId" name="addressId" placeholder="" class="input-xlarge">
              <p class="help-block">Address should be an integer number</p>
            </div>
          </div>

          <div class="control-group controls">
            <select class="form-control" id ="academicstatus" name = "academicstatus">
                <option value="REGULAR">Regular</option>
                <option value="REMOTE">Remote</option>
                <option value="EXTERNAL">External</option>
            </select>
          </div>

          <div class="control-group">
            <!-- Button -->
            <div class="controls">
              <button type="sumbit" class="btn btn-success">Register</button>
            </div>
          </div>

        </fieldset>
      </form>
    </div>
  </body>
</html>
