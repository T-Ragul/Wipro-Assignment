#!/bin/bash
num1=3
num2=5
result=$num1+$num2
echo "addition of two numbers is $result"
addresult=$(($num1+$num2))
echo "Add Result is $addresult"
subresult=$(($num1-$num2))
echo "Sub Result is $subresult"
compare=$(($num1>$num2))
echo "Compare Result is $compare"
