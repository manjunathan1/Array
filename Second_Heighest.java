class Second_Heighest{
public static void main(String[]args){
int height[]={175,170,171,174,180};
int first=0, second=0;
for(int i=0;i<height.length-1;i++){
if(first<height[i]){
second=first;
first=height[i];
System.out.println(first);
System.out.println(second);
}
else if(height[i]>second){
second=height[i];
}
}
}
}
