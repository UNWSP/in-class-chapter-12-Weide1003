package ch7;

public class GoTooFar {
public static void main(String[ ] args) {
int[] iLoveNumbers = {1,2,3,4,5};
try
{
for(int i=0; i<=5; i++){
System.out.print(iLoveNumbers[i] +"");
}
}
catch (ArrayIndexOutOfBoundsException Exception){
System.out.println("Now you've gone too far >.>");
}
}
}
