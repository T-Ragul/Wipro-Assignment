#!/bin/bash
count()
{
 filename=$1
 if [ -e $filename ]
  then
   echo "file is present"
   line=$(wc -l < "$filename")
   echo "Number of lines present in the $filename file is $line"
   words=$(wc -w < "$filename")
   echo "Number of Words present in the $filename  file is $words"
  else
   echo "file is not present"
 fi
}
count "file_exists.sh"
count "odd_even.sh"

#Output
#file is present
#Number of lines present in the file_exists.sh file is 16
#Number of Words present in the file_exists.sh  file is 37
#file is present
#Number of lines present in the odd_even.sh file is 17
#Number of Words present in the odd_even.sh  file is 48

