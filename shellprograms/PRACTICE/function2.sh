#!/bin/bash
sum()
{
 echo "inside function"
 return 5
}
sum
result=$?
echo "$result"

greet1()
{
 a=$1
 echo "value of a $a"
 c=$@
 echo "value of c  $c"
 
}

greet1 1
greet1 1 2 
greet1 1 2 3 
greet1 1 2 3 4 


