#include<stdio.h>
int main(int argc, char const *argv[])
{
    int income;
    printf("Enter the Income :");
    scanf(" %d",&income);

    if(income<=100000){
        printf("No Tax");
    }else if(150000>=income>100000){
        int tax = income/10;
        printf("The Tax is : %d",tax);
    }else if(150000<income<=250000){
        int tax = 5000+income*2/10;
        printf("The tax is :%d",tax);
    }else{
        int tax = 25000+income*3/10;
        printf("The Tax is :%d",tax);
    }
    
    return 0;
}
