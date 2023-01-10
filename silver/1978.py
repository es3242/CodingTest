def findSosu(num):
    if num <= 1: return False
    for i in range(num):
        if ((i+1)==1)|((i+1)==num): 
            continue
        if (int(num/(i+1)))*(i+1) == num: 
            return False
    return True

times = int(input())
arr = list(map(int, input().split()))

cnt = 0
for j in range(times):
    if findSosu(arr[j]):
        cnt +=1
print(cnt)
    
