#!/bin/bash

display()
{
path=$1
  if [ -d $path ]
   then
    echo "This is the correct directory $path"
    for file in "$path/*"
    do
     if [ -f $file ]
      then
       echo "$file"
      fi
    done
  else
   echo "Directory Not found"
fi 
}
display "/home/rps/Desktop/shellprograms"
