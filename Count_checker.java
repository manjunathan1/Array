class Count_checker{
public static void main(String[]args){
int[]marks={77,83,96,93,99};
int count=0;
for(int i=0; i<marks.length; i++){
if(marks[i]>90){
System.out.println(marks[i]);
count++;
}
System.out.println(count);
}
}
}
