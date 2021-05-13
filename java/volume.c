#include<stdio.h>
#define PI 3.14159
int main(void)
{ 
 float radius;
 printf("Enter radius:");
 scanf("%f", &radius);
printf("volume is : %f \n\n", (4.0/3.0)*radius*radius*radius*PI);
return 0;
}