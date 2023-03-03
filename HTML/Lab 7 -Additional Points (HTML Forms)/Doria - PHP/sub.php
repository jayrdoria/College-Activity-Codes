<?php
$a=$_POST["lname"];
$b=$_POST["fname"];
$c=$_POST["mname"];
$d=$_POST["bday"];
$e=$_POST["gender"];
$f=$_POST["address"];
$g=$_POST["email"];
$servername = "localhost";
$username="root";
$password="";
$dbname="mydatabase";

$conn = new mysqli($servername,$username,$password,$dbname);

if ($conn->connect_error)
{
	die ("Connection Failed: ".$conn->connect_error);
}
echo "Connected Successfully";
$sql = "INSERT INTO students (lname,fname,mname,bday,gender,address,email) VALUES("$a","$b","$c","$d","$e","$f","$g")";

if ($conn->query($sql)) === TRUE){
	echo "New Record created successfully";
}
else{
	echo "Error: ".$sql."<br>".$conn->error;
}
$conn->close();
?>