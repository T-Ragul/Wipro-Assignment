#!/bin/bash

greet()
{
 echo "Hello Function"
}

greet

#fun parameter

sum()
{
 a=$2
 b=$5
 res=$(($a+$b))
 echo "$res"
}

sum 5 3
