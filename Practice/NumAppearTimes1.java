// 三位数位数次数统计1
public class NumAppearTimes1{
  public static void main(String[] args){
    int[] total = new int[10]; // 动态创建数组，存储0~9出现的次数。
    int hundreads,tens,units;  // 定义三位数的百位，十位，个位。
    for(int i=0;i<100;i++){
      int temp = (int) (899 * Math.random() + 100);
      hundreads=(temp/100)%10;
      tens=(temp/10)%10;
      units=temp%10;
      System.out.println(temp+  " " +hundreads+" "+ tens+ " "+ units);
      for(int j=0;j<total.length;j++){
        if(hundreads==j)
          ++total[j];
        if(tens==j)
          ++total[j];
        if(units==j)
          ++total[j];
      }
    }
    for(int k = 0; k < total.length; k++){ // 打印
      System.out.println(k + " " + total[k]);
    }
  }
}