<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <title>Вхід для адміністраторів</title>
    <link rel="stylesheet" href="style.css" media="screen">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
    <meta name="theme-color" content="#478ac9">
<body>
<body data-path-to-root="/" data-include-products="false" class="u-body u-xl-mode" data-lang="ua"><header class="u-clearfix u-header u-header" id="sec-fefd"><div class="u-clearfix u-sheet u-sheet-1">
    <a href="#" class="u-image u-logo u-image-1">
        <img src="/img/default-logo.png" class="u-logo-image u-logo-image-1">
    </a>
    <nav class="u-menu u-menu-one-level u-offcanvas u-menu-1">
        <div class="menu-collapse" style="font-size: 1rem; letter-spacing: 0px;">
            <a class="u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="#">
                <svg class="u-svg-link" viewBox="0 0 24 24"><use xlink:href="#menu-hamburger"></use></svg>
                <svg class="u-svg-content" version="1.1" id="menu-hamburger" viewBox="0 0 16 16" x="0px" y="0px" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns="http://www.w3.org/2000/svg"><g><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
                </g></svg>
            </a>
        </div>
        <div class="u-custom-menu u-nav-container">
            <ul class="u-nav u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="index.jsp" style="padding: 10px 20px;">Головна</a>
            </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="login.jsp" style="padding: 10px 20px;">Вхід Для Адміністрації</a>
            </li></ul>
        </div>
        <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
                <div class="u-inner-container-layout u-sidenav-overflow">
                    <div class="u-menu-close"></div>
                    <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="index.jsp">Головна</a>
                    </li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="login.jsp">Вхід Для Адміністрації</a>
                    </li></ul>
                </div>
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
        </div>
    </nav>
</div></header>
<section class="u-carousel u-slide u-block-5f0b-1" id="carousel_8d59" data-interval="5000" data-u-ride="carousel">
    <div class="u-carousel-inner" role="listbox">
        <div class="u-active u-carousel-item u-clearfix u-image u-section-1-1" data-image-width="1980" data-image-height="1200">
            <div class="data-layout-selected u-clearfix u-expanded-width u-layout-wrap u-layout-wrap-1">
                <div class="u-layout">
                    <div class="u-layout-row">
                        <div class="u-align-center u-container-style u-layout-cell u-shape-rectangle u-size-25 u-layout-cell-1">
                            <div class="u-container-layout u-valign-middle u-container-layout-1">
                                <h6 class="u-text u-text-1">Вхід</h6>
                                <form action="login" method="post">
                                    <label for="username">Логін:</label><br>
                                    <input type="text" id="username" name="username"><br>
                                    <label for="password">Пароль:</label><br>
                                    <input type="password" id="password" name="password"><br><br>
                                    <input class="u-active-palette-4-base u-align-center u-black u-border-none u-btn u-btn-round u-button-style u-hover-palette-4-base u-radius-2 u-text-active-white u-text-hover-white u-btn-1" type="submit" value="Увійти">
                                    <a  class="u-active-palette-4-base u-align-center u-black u-border-none u-btn u-btn-round u-button-style u-hover-palette-4-base u-radius-2 u-text-active-white u-text-hover-white u-btn-1" href="index.jsp">Повернутися назад</a>
                                </form>
                            </div>
                        </div>
                        <div class="u-container-style u-image u-layout-cell u-size-35 u-image-1" data-image-width="1241" data-image-height="1080">
                            <div class="u-container-layout u-container-layout-2"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>



<footer class="u-align-center u-clearfix u-footer u-grey-80 u-footer" id="sec-0eaa"><div class="u-clearfix u-sheet u-sheet-1">
    <p class="u-small-text u-text u-text-variant u-text-1">New Tank - Playboi Carti</p>
</div></footer>
</body>
</html>
