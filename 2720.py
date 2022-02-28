T = int(input())

for i in range(T):
    C = int(input())
    Quarter = int(C/25)
    Dime = int((C%25)/10)
    Nickel = int(((C%25)%10)/5)
    Penny = int((((C%25)%10)%5)/1)
    print(Quarter, Dime, Nickel, Penny)
