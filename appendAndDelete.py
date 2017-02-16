import sys
s = input().strip()
t = input().strip()
k = int(input().strip())

ls=len(s)
lt=len(t)

lim= ls if(ls<lt) else lt
i=0

while(i<lim):
    if(s[i]==t[i]):
        i+=1
    else:
        break

ls1=ls-i;
lt1=lt-i;
total=k-(ls1+lt1)
if(k>=(ls1+lt1)):
    if(i==0):
        print("Yes")
    elif((k-ls)>=lt):
        print("Yes")
    elif(s==t):
        print("Yes")
    elif(total%2==0):
        print("Yes")
    else:
        print("No")
else:
    print("No")

