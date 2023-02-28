class SecondLowest{
public static void main(String[]args){
int height[]={175,170,171,174,180};
int first=height[0];
int second=height[0];
for(int i=1;i<height.length;i++){
if(height[i]<first){
second=first;
first=height[i];
System.out.println(first);
System.out.println(second);
}
else if(height[i]>second){
second=height[i];
}
}
}}

