<%-- 
    Document   : Left
    Created on : Sep 28, 2023, 12:08:09 PM
    Author     : KHOACNTT
--%>

<%@page import="model.NhaXuatBan"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.ChuDe"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="card mb-3">
    <%
        // ArrayList<ChuDe> dsChuDe = (ArrayList<ChuDe>) request.getAttribute("dsChuDe");
        ArrayList<NhaXuatBan> dsNhaXuatBan = (ArrayList<NhaXuatBan>)request.getAttribute("dsNhaXuatBan");
    %>
    <h3 class="card-header">Category</h3>  
    <ul class="list-group list-group-flush">
        <%
            //if (dsChuDe != null) {
               // for (ChuDe chude : dsChuDe) {
            if(dsNhaXuatBan != null) {
               for (NhaXuatBan nxb : dsNhaXuatBan) {

        %>
        <li class="list-group-item"> <a href="san-pham?manxb=<%= nxb.getManxb()%>" class="text-decoration-none"> <i class="bi bi-arrow-right-circle"></i><%= nxb.getTennxb()%></a> </li>
            <%}
                }
            %>
    </ul>   
</div>
