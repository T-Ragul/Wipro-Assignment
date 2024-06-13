#!/bin/bash
read -p "enter num1" num1
read -p "enter num2" num2
read -p "enter num3" num3
if(($num1>$num2 & $num1>$num3))
then
 echo "num1 is greater"
elif(($num2>$num1 & $num2>$num3))
then
 echo "num2 is greater"
else
 echo "num3 is greater"
fi
