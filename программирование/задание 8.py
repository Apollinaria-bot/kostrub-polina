def swap_first_last(arr):
  arr[0], arr[-1] = arr[-1], arr[0]
  return arr

def делится_на_цифры(n):
  for digit in str(n):
    if int(digit) == 0 or n % int(digit) != 0:
      return False
  return True

n = int(input("Введите натуральное число n: "))

числа = []
for i in range(1, n + 1):
  if делится_на_цифры(i):
    числа.append(i)

print("Числа, делящиеся на свои цифры:", числа)

m = int(input("Введите длину массива m: "))
a = []
print("Введите элементы массива:")
for i in range(m):
  a.append(int(input()))

print("Исходный массив:", a)

a = swap_first_last(a)

print("Измененный массив:", a)
