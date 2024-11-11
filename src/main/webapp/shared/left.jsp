<%-- 
    Document   : Left
    Created on : Sep 28, 2023, 12:08:09 PM
    Author     : KHOACNTT
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.ChuDe"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="card mb-3">
    <%
        ArrayList<ChuDe> dsChuDe = (ArrayList<ChuDe>) request.getAttribute("dsChuDe");
    %>
    <h3 class="card-header">Category</h3>  
    <ul class="list-group list-group-flush">
        <%
            if (dsChuDe != null) {
                for (ChuDe chude : dsChuDe) {
        %>
        <li class="list-group-item"> <a href="san-pham?macd=<%= chude.getMacd()%>" class="text-decoration-none"> <i class="bi bi-arrow-right-circle"></i><%= chude.getTencd()%></a> </li>
            <%}
                }
            %>
    </ul>   
</div>
