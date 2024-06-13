#!/bin/bash
sum()
{
 a=$1
 b=$2
 result=$(($a+$b))
 echo "$result"
} 

sum 2 3

read -p "enter first parameter" arg1
read -p "enter second parameter" arg2

sum $arg1 $arg2

#fun return

sub()
{
 a=$1
 b=$2
 result=$(($a-$b))
 return $result
}

sub 10 5
res=$?
echo "$res"
