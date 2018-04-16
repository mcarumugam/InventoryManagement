<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<title>Inventory</title>
</head>

<body>
	<s:actionerror />
	<s:actionmessage />
	<s:form action="add.action" method="post">
		<table border="1" align="center">
			<tr>
				<td>Product Id</td>
				<td><input type="text" name="productId" required="required" />
					<br /></td>
			</tr>
			<tr>
				<td>Product Name</td>
				<td><input type="text" name="name" required="required" /> <br /></td>
			</tr>
			<tr>
				<td>Product Des</td>
				<td><input type="text" name="desc" required="required" /> <br /></td>
			</tr>
			<tr>
				<td>Related Prod</td>
				<td><input type="text" name="relatedProd" required="required" />
					<br /></td>
			</tr>
			<!-- <tr>
				<td>Image</td>
				<td><s:form action="fileUpload" method="post"
						enctype="multipart/form-data">
						<s:file name="image" />
						<s:submit value="Upload" align="center" />
					</s:form></td>
			</tr> -->
			<tr>
				<td></td>
				<td><input type="submit" value="Submit" /></td>
			</tr>

		</table>
	</s:form>
	<table border="1" align="center">
		<tr border="1">
			<td>Product ID</td>
			<td>Product Name</td>
			<td>Product Desc</td>
			<td>Related Prod</td>
			<td>Product Image</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<s:iterator value="inventoryList">
			<tr>
				<td><s:property value="productId" /></td>
				<td><s:property value="name" /></td>
				<td><s:property value="desc" /></td>
				<td><s:property value="relatedProd" /></td>
				<td><s:property value="image" /></td>
				<td><s:form action="edit.action" method="post">
						<s:hidden name="id">
							<td><input type="submit" value="Edit" /></td>
						</s:hidden></td>
				</s:form>
				<td><s:form action="delete.action" method="post">
						<s:hidden name="id">
							<td><input type="submit" value="Delete" /></td>
							</s:hidden>
						</td>
				</s:form>
			</tr>
		</s:iterator>
	</table> 
</body>
</html>