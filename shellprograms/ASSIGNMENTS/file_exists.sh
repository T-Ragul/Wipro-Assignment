#!/bin/bash

read -p  "Enter the File Name:" filename
if [ -e $filename ]
then
 echo "file exists"
else
 echo "file not found"
fi

#Output:
#Enter the File Name:odd_even.sh
#file exists
#Enter the File Name:Ragul.sh
#file not found

