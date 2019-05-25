<%-- 
    Document   : Demo
    Created on : Jan 17, 2019, 6:38:41 PM
    Author     : guerson.maldonado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DEMO PAGE</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%!
            String s_num1;
        %>
        <form action="Demo.jsp" method="POST">
            <div class="form-group">
                <label for="txt_nombre">Ingrese un Numero</label>
                <input type="text" name="txt_num1"/>
                
            </div>
            <div class="form-group text-center">
                <button type="submit" class="btn btn-primary">Enviar datos</button>
                <%s_num1 = request.getParameter("txt_num1");%>
            </div>
        </form>
    </body>
</html>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	uddi.Figuras_Service service = new uddi.Figuras_Service();
	uddi.Figuras port = service.getFigurasPort();
	 // TODO initialize WS operation arguments here
	double lado1 = Double.parseDouble(s_num1);
	// TODO process result here
	java.lang.Double result = port.cuadrado(lado1);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
