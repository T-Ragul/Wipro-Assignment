#!/bin/bash
names=("Ragul" "Rajan" "wipro" "Java")
echo "${names[0]}"
echo "${names[1]}"
echo "${names[@]}"
echo "${#names[@]}"

#for loop
for names in "${names[@]}"
 do
  echo "Names are $names"
 done
