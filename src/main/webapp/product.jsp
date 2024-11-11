<%@page import="java.util.ArrayList"%>
<%@page import="model.Sach"%>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Nhúng các phần header.jsp và nav.jsp -->
<jsp:include page="shared/header.jsp" />
<jsp:include page="shared/nav.jsp" />

<section class="bg-body-secondary text-center">
    <div class="container">
        <h1 class="jumbotron-heading text-muted">Book Store</h1>
        <p class="lead text-muted mb-0">CHUYÊN CUNG CẤP SÁCH ONLINE TẠI VIỆT NAM</p>
    </div>
</section>

<div class="container" id="main-content">
    <div class="row">
        <div class="col-sm-3">
            <jsp:include page="shared/left.jsp" />             
        </div>
        <div class="col-sm-9">          
            <div class="row">
                <div class="col-sm-12">
                    <div class="row">
                        <%
                            DecimalFormat fmt = new DecimalFormat("#,##0 vnđ");
                            ArrayList<Sach> dsSach = (ArrayList<Sach>) request.getAttribute("dsSach");
                            if (dsSach != null && !dsSach.isEmpty()) {
                                for (Sach sach : dsSach) {
                        %>
                                    <div class="col-12 col-md-6 col-lg-4">
                                        <div class="card mb-2">
                                            <div class="card-header">
                                                <%= sach.getTensach() %>
                                            </div>
                                            <div class="card-body">
                                                <img class="card-img" src="assets/images/products/<%= sach.getHinh() %>" alt="Card image cap">                         
                                            </div>
                                            <div class="card-footer">
                                                <div class="row">
                                                    <div class="col">
                                                        <p class="btn btn-danger btn-block"><%= fmt.format(sach.getDongia()) %></p>
                                                    </div>
                                                    <div class="col text-end">
                                                        <a href="#" class="btn btn-success btn-block">Add to cart</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>              
                                    </div>
                        <%
                                }
                            } else {
                        %>
                                <div class="text-danger">Không có sản phẩm nào</div>
                        <%
                            }
                        %>
                    </div>   
                </div>
            </div>              
        </div>
    </div>
</div>    

</div><!-- /.container -->

<!-- Nhúng phần footer.jsp -->
<jsp:include page="shared/footer.jsp" />
