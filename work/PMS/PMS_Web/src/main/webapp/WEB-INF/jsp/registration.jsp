<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<style>
.lg-btn {
  width: 20%;
}

</style>
</head>
<body>
  
     
      <form:form method="POST" action="Registered.do" modelAttribute="registartion" autocomplete="off">
        <table width="100%" border="0">
          <tr>
            <td><div class="form-control">
                
                <label>
                  <p>
                     Name<small class="required"></small>
                  </p> <form:input path="Name" class="inputControl inptlogin"
                    required="autofocus" maxlength="50" id="firstname" /> </label>
              </div></td>
          </tr>
          
          <tr>
            <td><div class="form-control">
                
                <label>
                  <p>
                     email<small class="required"></small>
                  </p> <form:input path="email" class="inputControl inptlogin" 
                    required="autofocus" maxlength="50" id="emailId" /> </label>
              </div></td>
          </tr>
          
          <tr>
            <td><div class="form-control">
                
                <label>
                  <p>
                     Password<small class="required"></small>
                  </p> <form:input path="password" class="inputControl inptlogin" 
                    required="autofocus" maxlength="50" id="password" /> </label>
              </div></td>
          </tr>
          <tr>
            <td><div class="form-control">
                
                <label>
                  <p>
                     Address<small class="required"></small>
                  </p> <form:input path="Address" class="inputControl inptlogin" 
                    required="autofocus" maxlength="50" id="address" /> </label>
              </div></td>
          </tr>   
          <tr>
            <td><div class="form-control">
                
                <label>
                  <p>
                     city<small class="required"></small>
                  </p> <form:input path="City" class="inputControl inptlogin" 
                    required="autofocus" maxlength="50" id="city" /> </label>
              </div></td>
          </tr>
          <tr>
            <td colspan="2"><input type="submit" value="Submit" class="btn lg-btn"  /></td>
          </tr>
        </table>
      </form:form>
    </div>
  </div>
  
</body>
</html>