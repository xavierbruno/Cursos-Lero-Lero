<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
  <html>
  	<jsp:include page="includes/head.jsp" />
  <body>
    <header class="top-fixed">

     	<jsp:include page="includes/navbar.jsp" />	
      </header>
     
      <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
          <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
          <li data-target="#myCarousel" data-slide-to="1"></li>
          <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>
        
        <!-- Wrapper for slides -->
        <div class="carousel-inner wrapper">
          <div class="item active">
            <img class="slide-home" src="resources/images/slide1.jpg" alt="Los Angeles">
          </div>
          
          <div class="item">
            <img class="slide-home" src="resources/images/slide4.jpg" alt="Chicago">
          </div>
          
          <div class="item">
            <img class="slide-home" src="resources/images/slide3.jpg" alt="New York">
          </div>
        </div>
        
        <!-- Left and right controls -->
        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
          <span class="glyphicon glyphicon-chevron-left"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" data-slide="next">
          <span class="glyphicon glyphicon-chevron-right"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>
    
      
      <section class="section-cursos" id="cursos" class="pb-5">
        <div class="container">
          <h5 class="section-cursos-title h1">Cursos</h5>
          <div class="row">
            <!-- Team member -->
            <div class="col-xs-12 col-sm-6 col-md-4">
              <div class="image-flip" ontouchstart="this.classList.toggle('hover');">
                <div class="mainflip">
                  <div class="frontside">
                    <div class="card">
                      <div class="card-body text-center">
                        <p><img class=" img-fluid" src="resources/images/mysql.png" alt="card image"></p>
                        <h4 class="card-title">MySQL</h4>
                        <p class="card-text">Esse curso vai do básico ao avançado em MySQL, saiba se tem turma clicando no botão.</p>
                        <a href="#" class="btn btn-primary btn-sm"><i class="fa fa-plus"></i></a>
                      </div>
                    </div>
                  </div>
                  <div class="backside">
                    <div class="card">
                      <div class="card-body text-center">
                        <h4 class="card-title mt-5">TURMAS</h4>
                        <p class="card-text mt-5">Instrutor: Gabriel</p>
                        <p class="card-text mt-5">Carga Horária: 20h</p>
                        <p class="card-text">Data de início: 14/03/2020</p>
                        <p class="card-text">Data de início: 30/07/2020</p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <!-- ./Team member -->
            <!-- Team member -->
            <div class="col-xs-12 col-sm-6 col-md-4">
              <div class="image-flip" ontouchstart="this.classList.toggle('hover');">
                <div class="mainflip">
                  <div class="frontside">
                    <div class="card">
                      <div class="card-body text-center">
                        <p><img class=" img-fluid" src="resources/images/js.png" alt="card image"></p>
                        <h4 class="card-title">Javascript</h4>
                        <p class="card-text">Esse curso vai do básico ao avançado em Javascript, saiba se tem turma clicando no botão.</p>
                        <a href="#" class="btn btn-primary btn-sm"><i class="fa fa-plus"></i></a>
                      </div>
                    </div>
                  </div>
                  <div class="backside">
                    <div class="card">
                      <div class="card-body text-center mt-4">
                        <h4 class="card-title">TURMAS</h4>
                        <p class="card-text mt-5">Instrutor: Felipe</p>
                        <p class="card-text mt-5">Carga Horária: 20h</p>
                        <p class="card-text">Data de início: 14/03/2020</p>
                        <p class="card-text">Data de início: 30/07/2020</p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <!-- ./Team member -->
            <!-- Team member -->
            <div class="col-xs-12 col-sm-6 col-md-4">
              <div class="image-flip" ontouchstart="this.classList.toggle('hover');">
                <div class="mainflip">
                  <div class="frontside">
                    <div class="card">
                      <div class="card-body text-center">
                        <p><img class=" img-fluid" src="resources/images/html.webp" alt="card image"></p>
                        <h4 class="card-title">HTML5</h4>
                        <p class="card-text">Esse curso vai do básico ao avançado em HTML5, saiba se tem turma clicando no botão.</p>
                        <a href="#" class="btn btn-primary btn-sm"><i class="fa fa-plus"></i></a>
                      </div>
                    </div>
                  </div>
                  <div class="backside">
                    <div class="card">
                      <div class="card-body text-center mt-4">
                        <h4 class="card-title">TURMAS</h4>
                        <p class="card-text mt-5">Instrutor: Marcelo</p>
                        <p class="card-text mt-5">Carga Horária: 20h</p>
                        <p class="card-text">Data de início: 14/03/2020</p>
                        <p class="card-text">Data de início: 30/07/2020</p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <!-- ./Team member -->
            <!-- Team member -->
            <div class="col-xs-12 col-sm-6 col-md-4">
              <div class="image-flip" ontouchstart="this.classList.toggle('hover');">
                <div class="mainflip">
                  <div class="frontside">
                    <div class="card">
                      <div class="card-body text-center">
                        <p><img class=" img-fluid" src="resources/images/css.png" alt="card image"></p>
                        <h4 class="card-title">CSS3</h4>
                        <p class="card-text">Esse curso vai do básico ao avançado em CSS3, saiba se tem turma clicando no botão.</p>
                        <a href="#" class="btn btn-primary btn-sm"><i class="fa fa-plus"></i></a>
                      </div>
                    </div>
                  </div>
                  <div class="backside">
                    <div class="card">
                      <div class="card-body text-center mt-4">
                        <h4 class="card-title">TURMAS</h4>
                        <p class="card-text mt-5">Instrutor: Luan</p>
                        <p class="card-text mt-5">Carga Horária: 20h</p>
                        <p class="card-text">Data de início: 14/03/2020</p>
                        <p class="card-text">Data de início: 30/07/2020</p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <!-- ./Team member -->
            <!-- Team member -->
            <div class="col-xs-12 col-sm-6 col-md-4">
              <div class="image-flip" ontouchstart="this.classList.toggle('hover');">
                <div class="mainflip">
                  <div class="frontside">
                    <div class="card">
                      <div class="card-body text-center">
                        <p><img class=" img-fluid" src="resources/images/servlet.png" alt="card image"></p>
                        <h4 class="card-title">Servlet</h4>
                        <p class="card-text">Esse curso vai do básico ao avançado em Servlet, saiba se tem turma clicando no botão.</p>
                        <a href="#" class="btn btn-primary btn-sm"><i class="fa fa-plus"></i></a>
                      </div>
                    </div>
                  </div>
                  <div class="backside">
                    <div class="card">
                      <div class="card-body text-center mt-4">
                        <h4 class="card-title">TURMAS</h4>
                        <p class="card-text mt-5">Instrutor: Patrick</p>
                        <p class="card-text mt-5">Carga Horária: 20h</p>
                        <p class="card-text">Data de início: 14/03/2020</p>
                        <p class="card-text">Data de início: 30/07/2020</p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <!-- ./Team member -->
            <!-- Team member -->
            <div class="col-xs-12 col-sm-6 col-md-4">
              <div class="image-flip" ontouchstart="this.classList.toggle('hover');">
                <div class="mainflip">
                  <div class="frontside">
                    <div class="card">
                      <div class="card-body text-center">
                        <p><img class=" img-fluid" src="resources/images/react.png" alt="card image"></p>
                        <h4 class="card-title">React</h4>
                        <p class="card-text">Esse curso vai do básico ao avançado em React, saiba se tem turma clicando no botão.</p>
                        <a href="#" class="btn btn-primary btn-sm"><i class="fa fa-plus"></i></a>
                      </div>
                    </div>
                  </div>
                  <div class="backside">
                    <div class="card">
                      <div class="card-body text-center mt-4">
                        <h4 class="card-title">TURMAS</h4>
                        <p class="card-text mt-5">Instrutor: Tiago</p>
                        <p class="card-text mt-5">Carga Horária: 20h</p>
                        <p class="card-text">Data de início: 14/03/2020</p>
                        <p class="card-text">Data de início: 30/07/2020</p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <!-- ./Team member -->
          </div>
        </div>
      </section>
      	<jsp:include page="includes/footer.jsp" />
      </body>
      
      </html>
      