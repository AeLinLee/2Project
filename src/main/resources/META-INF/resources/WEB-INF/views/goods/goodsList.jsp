
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
  <div class="row">
  <c:forEach var="dto" items="${goodsList}">
    <div class="col border border-dark m-4 w-10">
      <a href="goodsRetrieve?gCode=${dto.gCode}">
       <div class="image-container">
		<img src="images/items/${dto.gImage}.png" class="product-image">
		 </div>
	  </a>
       <div class="mt-4 fs-6">${dto.gName}</div>
       <div class="mt-2 fs-6">${dto.gContent}</div>
       <div class="mt-2 fs-6">${dto.gPrice}</div>
    </div>
    </c:forEach>
  </div>
</div>
