<!DOCTYPE html>
<html>

<head>

</head>

<!DOCTYPE html>
<html>

<head>

</head>

<body>

<form   method="POST" action="<?php echo $_SERVER['PHP_SELF'];?>">
  <label for="value">USD TO BDT</label><br>
  <br><br>
  <select name="from" id="currency">
  <option value="USD">USD</option>
  <option value="BDT">BDT</option>
  </select>
  <br><br>
  <select name="to" id="currency">
  <option value="USD">USD</option>
  <option value="BDT">BDT</option>
  </select>
  <br><br>
  <input type="text" id="value" name="value" value="">  <br><br>

  <input type="submit" value="Submit">
</form> 

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
  $value = $_REQUEST['value'];
  $from = $_REQUEST['from'];
  $to = $_REQUEST['to'];

  $data = file_get_contents("http://localhost:8081/task2_rest_war_exploded/hello/currency/rate/from/" . $from ."/to/" . $to);
  $data = json_decode($data);
  echo "Result" . ($data->rate * $value);
}
?>
</body>
</html>