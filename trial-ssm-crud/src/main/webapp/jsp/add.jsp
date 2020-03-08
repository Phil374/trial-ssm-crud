<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form >
		<div>
			<label >username</label>
			<div >
				<input type="text" name="userName" 
					id="empName_add_input" placeholder="userName">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">email</label>
			<div class="col-sm-10">
				<input type="text" name="email" class="form-control"
					id="email_add_input" placeholder="email@atguigu.com"> <span
					class="help-block"></span>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">gender</label>
			<div class="col-sm-10">
				<label class="radio-inline"> <input type="radio"
					name="gender" id="gender1_add_input" value="M" checked="checked">
					男
				</label> <label class="radio-inline"> <input type="radio"
					name="gender" id="gender2_add_input" value="F"> 女
				</label>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">deptName</label>
			<div class="col-sm-4">
				<!-- 部门提交部门id即可 -->
				<select class="form-control" name="dId">
				</select>
			</div>
		</div>
	</form>
</body>
</html>