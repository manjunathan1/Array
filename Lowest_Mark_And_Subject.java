class Lowest_Mark_And_Subject{
public static void main(String[]args){
int marks[]={97,83,96,93,99};
String subject[]={"Tamil","English","Maths","Science","social science"};
int lowest=marks[0];
String sub=subject[0];
for(int i=0; i<marks.length;i++){
if(lowest>marks[i]){
lowest=marks[i];
sub=subject[i];
}}
System.out.println(lowest +" "+ sub);
}}


