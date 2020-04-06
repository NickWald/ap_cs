public static void prefixMerge(Customemr[] list1, Customer[] list2, Customer[] result){
  int list1Location = 0;
  int list2Location = 0;

  for (int i = 0; i < r.length; i++) {
    if(list1[list1Location].compareCustomer(list2[list2Location]) < 0){
      result[i] = list[list1Location];
      list1Location++;
    }
    else if (list1[list1Location].compareCustomer(list2[list2Location]) > 0){
      result[i] = list[list2Location];
      list2Location++;
    }
    else{
      result[i] = list1[list1Location];
      list1Location++;
      list2Location++;
    }
  }
}
