/*holds all numbers 0-99 (100 slots)

*/
int []arr = new int[100]; //new array w 100 slots
arr[0] = 1;

//make a loop to fill an array
for(int i = 0; i < arr.length; i++){
  arr[i] = i*2;
  print(arr[i]);
}
