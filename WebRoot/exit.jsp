<%@ page contentType="text/html;charset=gb2312"%>
<% 
  session.invalidate(); 
  response.sendRedirect("index.jsp");
%>