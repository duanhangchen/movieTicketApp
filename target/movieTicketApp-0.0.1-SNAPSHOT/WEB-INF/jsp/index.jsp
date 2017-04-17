<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1 class="ui block header">
    Buy Movie Tickets\
</h1>

<br>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="carousel slide multi-item-carousel" id="theCarousel">
                <div class="carousel-inner">
                    <div class="item active">
                        <div class="col-xs-4">
                            <a href="#1"><img
                                    src="http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/183502/Fifty%20Shades%20Darker.jpg"
                                    class="img-responsive"></a>
                            <div class="movie-details">
                                <p class="movie-name"><strong>Fifty Shades Darker</strong></p>
                                <p class="text-muted release-date"><em>Fri, Mar 3</em></p>
                            </div>
                        </div>

                    </div>
                    <div class="item">
                        <div class="col-xs-4">
                            <a href="#1"><img
                                    src="http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/191368/legobatmanmovie-posterart.jpg"
                                    class="img-responsive"></a>
                            <div class="movie-details">
                                <p class="movie-name"><strong>lego batman movie</strong></p>
                                <p class="text-muted release-date"><em>Fri, Mar 3</em></p>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <div class="col-xs-4">
                            <a href="#1"><img
                                    src="http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196665/Get%20Out.jpg"
                                    class="img-responsive"></a>
                            <div class="movie-details">
                                <p class="movie-name"><strong>Get Out</strong></p>
                                <p class="text-muted release-date"><em>Fri, Mar 3</em></p>
                            </div>
                        </div>

                    </div>
                    <div class="item">
                        <div class="col-xs-4">
                            <a href="#1"><img
                                    src="http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196708/ROCKDOG_1Sht_Payoff_VF.jpg"
                                    class="img-responsive"></a>
                            <div class="movie-details">
                                <p class="movie-name"><strong>ROCK DOG</strong></p>
                                <p class="text-muted release-date"><em>Fri, Mar 3</em></p>
                            </div>
                        </div>

                    </div>
                    <div class="item">
                        <div class="col-xs-4">
                            <a href="#1"><img
                                    src="http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/192068/HiddenFigures.jpg"
                                    class="img-responsive"></a>
                            <div class="movie-details">
                                <p class="movie-name"><strong>Hidden Figures</strong></p>
                                <p class="text-muted release-date"><em>Fri, Mar 3</em></p>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <div class="col-xs-4">
                            <a href="#1"><img
                                    src="http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196271/FIST-FIGHT_Tsr_1Sht.jpg"
                                    class="img-responsive"></a>
                            <div class="movie-details">
                                <p class="movie-name"><strong>FIST-FIGHT</strong></p>
                                <p class="text-muted release-date"><em>Fri, Mar 3</em></p>
                            </div>
                        </div>
                    </div>
                    <!-- add  more items here -->
                    <!-- Example item start:  -->

                    <div class="item">
                        <div class="col-xs-4">
                            <a href="#1"><img
                                    src="http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/198127/FIN09_TheShack_1Sht_Payoff_.jpg"
                                    class="img-responsive"></a>
                            <div class="movie-details">
                                <p class="movie-name"><strong>THE SHACK</strong></p>
                                <p class="text-muted release-date"><em>Fri, Mar 3</em></p>
                            </div>
                        </div>

                    </div>

                    <!--  Example item end -->
                </div>
                <a class="left carousel-control" href="#theCarousel" data-slide="prev"><i
                        class="glyphicon glyphicon-chevron-left"></i></a>
                <a class="right carousel-control" href="#theCarousel" data-slide="next"><i
                        class="glyphicon glyphicon-chevron-right"></i></a>
            </div>
        </div>
    </div>
</div>

<br>
<br>

<div class="container">
    <br>
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
            <li data-target="#myCarousel" data-slide-to="3"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <img src="/resources/img/hero_ExclusiveFeaturette_TheBelkoExperiment_Video.jpg" alt="Chania" width="460" height="345">
            </div>

            <div class="item">
                <img src="/resources/img/hero_Infographic_BestPictureNominees.jpg" alt="Chania" width="460" height="345">
            </div>

            <div class="item">
                <img src="/resources/img/hero_Interview_KongSkullIsand_JordonVogt.jpg" alt="Flower" width="460" height="345">
            </div>

            <div class="item">
                <img src="/resources/img/hero_Junket_GetOut_Video.jpg" alt="Flower" width="460" height="345">
            </div>
        </div>

        <!-- Left and right controls -->
        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>
<br>
<br>
<br>
<img src="https://images.fandango.com/images/spotlight/fd_50SD_1680x350_homestrip_v3.jpg"
     alt="Fandango 50 Shades Darker Movie Free Gift" class="offer-tout-img">
<h1 class="ui block header">
    Coming Soon
</h1>
<div class="ui six column grid stackable doubling container">

    <div class="column">
        <div class="ui segments">
            <div class="ui segments">
                <div class="blur">
                    <b><img src="http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196708/ROCKDOG_1Sht_Payoff_VF.jpg"
                            class="ui fluid bordered image"></b>
                </div>
            </div>
            <div class="ui secondary segment center aligned">
                <a>Rock Dog</a>
            </div>
        </div>
    </div>

    <div class="column">
        <div class="ui segments">
            <div class="ui segments">
                <div class="blur">
                    <b><img src="http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/183587/The%20Great%20Wall.jpg"
                            class="ui fluid bordered image"></b>
                </div>
            </div>
            <div class="ui secondary segment center aligned">
                <a>The Great Wall</a>
            </div>
        </div>
    </div>

    <div class="column">
        <div class="ui segments">
            <div class="ui segments">
                <div class="blur">
                    <b><img src="http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/184016/COLLIDE_POSTER_2_24_17.jpg"
                            class="ui fluid bordered image"></b>
                </div>
            </div>
            <div class="ui secondary segment center aligned">
                <a>Collide</a>
            </div>
        </div>
    </div>

    <div class="column">
        <div class="ui segments">
            <div class="ui segments">
                <div class="blur">
                    <b><img src="http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196901/Logan_48x70ForFandango_sRGB.jpg"
                            class="ui fluid bordered image"></b>
                </div>
            </div>
            <div class="ui secondary segment center aligned">
                <a>Logan</a>
            </div>
        </div>
    </div>

    <div class="column">
        <div class="ui segments">
            <div class="ui segments">
                <div class="blur">
                    <b><img src="http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/196665/Get%20Out.jpg"
                            class="ui fluid bordered image"></b>
                </div>
            </div>
            <div class="ui secondary segment center aligned">
                <a>Get Out</a>
            </div>
        </div>
    </div>

    <div class="column">
        <div class="ui segments">
            <div class="ui segments">
                <div class="blur">
                    <b><img src="http://images.fandango.com/ImageRenderer/200/0/redesign/static/img/default_poster.png/0/images/masterrepository/Fandango/191368/legobatmanmovie-posterart.jpg"
                            class="ui fluid bordered image"></b>
                </div>
            </div>
            <div class="ui secondary segment center aligned">
                <a>The Lego Batman Movie</a>
            </div>
        </div>
    </div>


</div>
