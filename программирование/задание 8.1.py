def swap_first_last(arr):
  arr[0], arr[-1] = arr[-1], arr[0]
  return arr

m = int(input("Введите длину массива m: "))
a = []
print("Введите элементы массива:")
for i in range(m):
  a.append(int(input()))

print("Исходный массив:", a)

a = swap_first_last(a)

print("Измененный массив:", a)
