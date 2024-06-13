#!/bin/bash

for i in  {1..100};
do
 echo -n "Enter The Number and 0 To Exit :"
 read num
 if [ "$num" == 0 ];
 then 
  echo "Exited"
  break
  elif [ $((num % 2)) == 0 ];
  then
   echo "$num is Even"
  else
   echo "$num is Odd"
 fi
done

#Output
#Enter The Number and 0 To Exit :1
#1 is Odd
#Enter The Number and 0 To Exit :2
#2 is Even
#Enter The Number and 0 To Exit :3
#3 is Odd
#Enter The Number and 0 To Exit :5
#5 is Odd
#Enter The Number and 0 To Exit :6
#6 is Even
#Enter The Number and 0 To Exit :0
#Exited

