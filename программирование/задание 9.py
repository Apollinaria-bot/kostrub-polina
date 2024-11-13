def divide_row_by_diagonal(matrix, k):
  n = len(matrix)
  if 0 <= k < n:
    diagonal_element = matrix[k][k]
    if diagonal_element != 0:
      for j in range(n):
        matrix[k][j] /= diagonal_element
    else:
      print("Ошибка: диагональный элемент равен 0")
  else:
    print("Ошибка: неверный номер строки")
  return matrix

def transpose(matrix):
  n = len(matrix)
  transposed_matrix = [[0 for _ in range(n)] for _ in range(n)]
  for i in range(n):
    for j in range(n):
      transposed_matrix[j][i] = matrix[i][j]
  return transposed_matrix

n = int(input("Введите порядок матрицы n: "))
matrix = []
print("Введите элементы матрицы:")
for i in range(n):
  row = list(map(int, input().split()))
  matrix.append(row)

k = int(input("Введите номер строки k: "))

matrix = divide_row_by_diagonal(matrix, k)

print("Матрица после деления строки на диагональный элемент:")
for row in matrix:
  print(row)

transposed_matrix = transpose(matrix)

print("Транспонированная матрица:")
for row in transposed_matrix:
  print(row)
