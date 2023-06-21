<?php

// define variables with different data types
$var1 = "42";  // string
$var2 = 3.14;  // float
$var3 = true;  // boolean
$var4 = 10;    // integer

// Typecast variables to different data types
$var1_int = (int) $var1;  // cast to integer
$var2_string = (string) $var2;  // cast to string
$var3_int = (int) $var3;  // cast to integer
$var4_float = (float) $var4;  // cast to float

// Output the typecasted variables
echo "Typecasted variables:\n";
echo "\$var1 as integer: " . $var1_int . "\n";
echo "\$var2 as string: " . $var2_string . "\n";
echo "\$var3 as integer: " . $var3_int . "\n";
echo "\$var4 as float: " . $var4_float . "\n";
?>