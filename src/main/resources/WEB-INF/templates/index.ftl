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
    <div class="nav-wrapper container cen"><a id="logo-container" href="#" class="brand-logo">AddProjects</a>
    </div>
  </nav>
  <div class="section no-pad-bot" id="index-banner">
    <div class="container">
      <br><br>
      <h1 class="header center orange-text">Zapisy na projekty</h1>
      <div class="row center">
        <h5 class="header col s12 light">Dodaj projekt lub dołącz do istniejącego</h5>
      </div>
      <div class="row center">
        <a href="/projects/listprojects" id="download-button" class="btn-large waves-effect waves-light orange">Start</a>
      </div>
      <br>

    </div>
  </div>


  <div class="container">
    <div class="section">

      <!--   Icon Section   -->
      <div align="center" class="row">

        <div class="col s12">
          <div class="icon-block">
            <h5 class="center">AddProjects</h5>

            <p class="center light">Aplikacja służy do tworzenia listy projektów oraz osób chcących pracować w danych tematach. Użytkownik może stworzyć zarówno własny temat jak i dopisać się do istniejącego.</p>
          </div>
        </div>
      </div>
    </div>
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
