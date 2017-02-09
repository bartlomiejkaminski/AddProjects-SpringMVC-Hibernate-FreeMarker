<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0"/>
  <title>Zapisy na projekty</title>

  <!-- CSS  -->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link href="/projects/resources/css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
  <link href="/projects/resources/css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
</head>
<body>
  <nav class="light-blue lighten-1" role="navigation">
    <div class="nav-wrapper container"><a id="logo-container" href="/projects/index" class="brand-logo">AddProjects</a>
      <ul class="right hide-on-med-and-down">
       <li><a href="/projects/listprojects">Lista projektów</a></li>
        <li><a href="/projects/addproject">Dodaj projekt</a></li>
        <li><a href="/projects/addperson">Dołącz do projektu</a></li>
      </ul>

      <ul id="nav-mobile" class="side-nav">
        <li><a href="#">Menu</a></li>
      </ul>
      <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
    </div>
  </nav>
  <div class="section no-pad-bot center" id="index-banner">
    
  <h3 class="materialize-red-text"> Dodaj projekt </h3>
  </div>
<br/>

  <div class="container center">

<form class="form-style-6" action="/projects/addproject/add" method="POST">
<input type="text" name="content" placeholder="Tytul projektu" />
<br/>
<input type="text" id="name" name="name" placeholder="Imie" />
<input type="text" name="surname" placeholder="Nazwisko" />
<input type="number" name="index" placeholder="Nr indeksu" />
<input type="submit" value="Dodaj" />
</form>
  
    <br><br>
  </div>

  <footer class="page-footer orange">
    <div class="container">
      <div class="row">
        <div class="col l6 s12">
          <h5 class="white-text">AddProjects</h5>
          <p class="grey-text text-lighten-4">Aplikacja testowa. Zostały wykorzystane technologie takie jak Spring MVC, Hibernate, FreeMarker oraz Materialize</p>


        </div>
        <div class="col l3 s12">
          <h5 class="white-text">Opcje</h5>
          <ul>
            <li><a class="white-text" href="#!">Start</a></li>
            <li><a class="white-text" href="#!">Lista projektów</a></li>
            <li><a class="white-text" href="#!">Dodaj projekt</a></li>
            <li><a class="white-text" href="#!">Dołącz do projektu</a></li>
          </ul>
        </div>
        <div class="col l3 s12">
          <h5 class="white-text">Inne</h5>
          <ul>
            <li><a class="white-text" href="#!">O mnie</a></li>
            <li><a class="white-text" href="#!">Kontakt</a></li>
          </ul>
        </div>
      </div>
    </div>
    <div class="footer-copyright">
      <div class="container">
      Autor: <a class="orange-text text-lighten-3" href="http://projava.pl">Bartłomiej Kamiński</a>
      </div>
    </div>
  </footer>


  <!--  Scripts-->
  <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <script src="/projects/resources/js/materialize.js"></script>
  <script src="/projects/resources/js/init.js"></script>

  </body>
  
</html>
