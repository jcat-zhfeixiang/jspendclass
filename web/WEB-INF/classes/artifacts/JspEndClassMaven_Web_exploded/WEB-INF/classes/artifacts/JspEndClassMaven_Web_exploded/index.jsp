<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

    <title>Miller - Identity</title>


    <link rel="stylesheet" type="text/css" href="assets/css/plugins.css">
    <link rel="stylesheet" type="text/css" href="assets/css/main.css">


</head>


<body>


<!-- PRELOADER -->
<div class="preloader">

    <div class="spinner"></div>

</div>
<!-- /PRELOADER -->


<!-- IMAGE CONTAINER -->
<div class="image-container">

    <div class="background-img"></div>

</div>
<!-- /IMAGE CONTAINER -->


<!-- CONTENT AREA -->
<div class="content-area">


    <!-- CONTENT AREA INNER -->
    <div class="content-area-inner">


        <!-- INTRO -->
        <section id="intro">


            <!-- CONTAINER MID -->
            <div class="container-mid">


                <!-- ANIMATION CONTAINER -->
                <div class="animation-container animation-fade-down" data-animation-delay="0">

                    <h1>I’m J·Cat,</h1>

                </div>
                <!-- /ANIMATION CONTAINER -->


                <!-- ANIMATION CONTAINER -->
                <div class="animation-container animation-fade-left" data-animation-delay="300">

                    <p class="subline">自我介绍</p>

                </div>
                <!-- /ANIMATION CONTAINER -->


                <!-- ANIMATION CONTAINER -->
                <div class="animation-container animation-fade-up" data-animation-delay="600">

                    <a href="#about" class="smooth-scroll">About More<i class="fa fa-angle-down" aria-hidden="true"></i></a>

                </div>
                <!-- /ANIMATION CONTAINER -->


            </div>
            <!-- /CONTAINER MID -->


        </section>
        <!-- /INTRO -->


        <!-- ABOUT -->
        <section id="about">


            <h3 class="headline scroll-animated-from-right">我的个人信息</h3>

            <p class="scroll-animated-from-right">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam semper
                faucibus eros, quis imperdiet sapien. Nam sodales nec risus nec interdum. Proin lobortis, ex condimentum
                ultricies eleifend, nisl nunc sollicitudin odio, eget egestas est turpis et metus. In non ligula quis
                mauris rutrum porta.</p>

            <p class="scroll-animated-from-right">Duis consectetur massa sit amet nibh rhoncus, at pharetra ligula
                aliquet. Ut ac velit vestibulum, eleifend diam ut, malesuada nisi. Sed vel felis vitae diam luctus
                commodo. Nunc ipsum est, vulputate id orci ac, luctus consectetur sapien.</p>


        </section>
        <!-- /ABOUT -->

        <!-- SERVICE -->
        <section id="service">

            <h3 class="headline scroll-animated-from-right">我的一些工作</h3>
            <!-- SERVICE LIST -->
            <ul class="services-list">
                <a href="">
                    <li class="scroll-animated-from-right"><i class="fa fa-pencil-square-o" aria-hidden="true"></i>博客</li>
                </a>
            </ul>
            <!-- /SERVICE LIST -->
        </section>
        <!-- /SERVICE -->

        <!-- CONTACT -->
        <section id="contact">

            <h3 class="headline scroll-animated-from-right">留言</h3>

            <!-- CONTACT LIST -->
            <ul class="contact-list">

                <li class="scroll-animated-from-right"><i class="fa fa-envelope-o" aria-hidden="true"></i>867303159@qq.com
                </li>

            </ul>
            <!-- /CONTACT LIST -->

            <!-- CONTACT FORM -->
            <form id="contact-form" action="/contact" method="POST">

                <input id="contact-form-name" type="text" name="name" class="form-control scroll-animated-from-right"
                       placeholder="* 你的名字">

                <input id="contact-form-email" type="text" name="email" class="form-control scroll-animated-from-right"
                       placeholder="* 你的邮箱">

                <!-- PHANTOM ELEMENT ( HONEYPOT CAPTCHA FOR SECURITY ) -->
                <div class="fhp-input"><input id="contact-form-company" type="text" name="company" class="form-control">
                </div>
                <!-- /PHANTOM ELEMENT ( HONEYPOT CAPTCHA FOR SECURITY ) -->

                <textarea id="contact-form-message" name="message" class="form-control scroll-animated-from-right"
                          placeholder="* 消息"></textarea>

                <button type="submit" class="form-control scroll-animated-from-right">发送邮件</button>

                <div class="success-message">* 邮件发送成功</div>

            </form>
            <!-- /CONTACT FORM -->

        </section>
        <!-- /CONTACT -->

        <!-- FOOTER -->
        <section id="footer">
            <p class="scroll-animated-from-right">© 2017 Your Brand | Design Template Foundation - More Templates | <a
                    href="">后台管理</a></p>
        </section>
        <!-- /FOOTER -->

    </div>
    <!-- /CONTENT AREA INNER -->

</div>
<!-- /CONTENT AREA -->

<!-- JAVASCRIPTS -->
<script type="text/javascript" src="assets/js/plugins.js"></script>
<script type="text/javascript" src="assets/js/main.js"></script>


</body>


</html>