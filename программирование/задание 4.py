def stairway(n):
    for i in range(1,n+1):
        print("".join(str(x)
for x in range(1,i+1)))
        
n=int(input("Введите число n: "))
stairway(n)
