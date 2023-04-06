// #include<iostream>
// using namespace std ;
// int main()
// {
//     float b,h,a;
//     cout<<"enter base and height";
//     cin>>b>>h;
//     a=(b*h)/2;
//     cout<<"area is"<<a;
//     return 0;
// }

a=0
b=1
if n<0:
    print("incorrect input")
elif n==0:
    return a
elif n==1:
    return b
else:
    for i in range(1,n):
        c=a+b
        a=b 
        b=c
    return b
print(fibonacci(9))    
