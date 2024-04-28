<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="es-mx">
    <head>
        <meta charset=UTF-8>
        <title>Java EE Demo</title>
    </head>
    <body>
        <h2>Hello World!</h2>
        <h3>Lic. Informática</h3>
        <h4>Tecnologias web I</h4>

        <!-- <a href="DemoServelt">Demo Servelt</a> -->

        <form method="get" action="DemoServelt">
            <label for="nombre">Nombre</label><br><br>
            <input type="text" name="nombre"/><br><br>
            <label for="apellido">Apellido</label><br><br>
            <input type="text" name="apellido"/>
            <input type="submit"/>
            
        </form>

        

        <h2>C A L C U L A D O R A</h2>

        

        <button onclick="window.location.href='Calculadora'" class="spacing">Ir a la Calculadora</button>


    </body>
</html>
