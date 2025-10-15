#!/bin/bash +x

var1=$1
var2=$2
path=$3

echo "var1 is $var1"
echo  "var2 is $var2"

var3="${var1} ${var2}"
echo "var3 is $var3"

var3_str_length=${#var3}
if [ $var3_str_length -gt 5 ]
then
    echo "Pass completely"
    sh ${path}/maven_test/src/main/prod.sh
else
  echo "Fail"
  exit 1
fi