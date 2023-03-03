<!DOCTYPE html>
<html>
<title>Student Form</title>
<body>
<form action="sub.php" method="POST">
	<h3 align=center>Student Registration Form</h3>
	<table>
		<tr>
			<td>
				Last Name :
			</td>
			<td>
				<input type="text" name="lname" placeholder="Last Name" required>
			</td>
		</tr>
		<br>
		<tr>
			<td>
				First Name :
			</td>
			<td>
				<input type="text" name="fname" placeholder="First Name" required>
			</td>
		</tr>
		
		<tr>
			<td>
				Middle Name :
			</td>
			<td>
				<input type="text" name="mname" placeholder="Middle Name" required>
			</td>
		</tr>
		
		<tr>
			<td>
				Birthday :
			</td>
			<td>
				<input type="Date" name="bday" required>
			</td>
		</tr>
		
		<tr>
			<td>
				Gender :
			</td>
			<td>
				<input type="text" name="gender" required>			
			</td>
		</tr>
		
		<tr>
			<td>
				Address :
			</td>
			<td>
				<textarea rows="3" cols="22" name="address" placeholder="Street/Barangay/City/ Province" required></textarea>
			</td>
		</tr>
		
		<tr>
			<td>
				Email :
			</td>
			<td>
				<input type="Email" name="email" required placeholder="name@gmail.com">
			</td>
		</tr>
		
		<tr>
			<td>
			<br>
			<input type="Submit" style="position:relative;left:160%">
			<input type="Reset" style="position:relative;left:157%">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>