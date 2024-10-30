a = [0]*10
s = 0
m = 1
for i in range(10):
    a[i] = float(input('Введите число '))
    s += a[i]
    m *= a[i]
print(a)
print('Сумма = ',s)
print('Произведение = ',m)
