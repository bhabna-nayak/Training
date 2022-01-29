<%@ page import="java.util.*" %>
 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
 
<html>
    <head>
    </head>
    <body>
        <table width="700px"
               >
            <tr>
                <td colspan=4> Product Details</td>
            </tr>
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>Cost</td>
                <td>Quantity</td>
            </tr>
            <%
                int count = 0;
                
                if (request.getAttribute("piList") != null) {
                    ArrayList al = (ArrayList) request.getAttribute("piList");
                    System.out.println(al);
                    Iterator itr = al.iterator();
                    while (itr.hasNext()) {
 
                        if ((count % 2) == 0) {
                            
                        }
                        count++;
                        ArrayList pList = (ArrayList) itr.next();
            %>
            <tr>
                <td><%=pList.get(0)%></td>
                <td><%=pList.get(1)%></td>
                <td><%=pList.get(2)%></td>
                <td><%=pList.get(3)%></td>
            </tr>
            <%
                    }
                }
                if (count == 0) {
            %>
            <tr>
                <td colspan=4> No Record Found..</td>
            </tr>
            <%            }
            %>
        </table>
    </body>
</html>