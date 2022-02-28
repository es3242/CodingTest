time = int(input())

A = int(time/300)
B = int((time%300)/60)
C = int(((time%300)%60)/10)

if time%10 != 0:
    print(-1)
else:
    print(A, B, C)